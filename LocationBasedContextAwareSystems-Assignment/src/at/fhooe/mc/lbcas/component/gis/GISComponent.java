package at.fhooe.mc.lbcas.component.gis;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import at.fhooe.mc.lbcas.component.ComponentIF;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement;
import at.fhooe.mc.lbcas.component.contextmanagement.ContextSituation;
import at.fhooe.mc.lbcas.component.displaymessages.DisplayMessagesComponent;
import at.fhooe.mc.lbcas.contextruleparser.NodeError;
import at.fhooe.mc.lbcas.contextruleparser.RulesEntity;
import at.fhooe.mc.lbcas.contextruleparser.TreeNode;
import at.fhooe.mc.lbcas.entities.GeoObject;
import at.fhooe.mc.lbcas.entities.POIObject;
import at.fhooe.mc.lbcas.geo.GaussKruegerBMN;
import at.fhooe.mc.lbcas.geo.GeographischWGS84;
import at.fhooe.mc.lbcas.mapcolors.DrawingContextIF;
import at.fhooe.mc.lbcas.mediator.CASMediator;
import at.fhooe.mc.lbcas.mediator.MediatorIF;
import at.fhooe.mc.lbcas.reflectionapi.ClientController;
import at.fhooe.mc.lbcas.reflectionapi.ClientControllerIF;
import at.fhooe.mc.lbcas.server.DummyServer;
import at.fhooe.mc.lbcas.server.GEOServerInterface;
import at.fhooe.mc.lbcas.server.SDEServer;
import at.fhooe.mc.lbcas.server.SDEServerSerializedData;
import at.fhooe.mc.lbcas.utilities.ImageToBitmap;

/**
 * 
 * @author Shrikant Havale
 * 
 *         This component draws the GeoObjects on the map
 */
public class GISComponent extends JPanel implements ComponentIF, MouseListener,
		MouseMotionListener, ActionListener, KeyListener {

	/**
	 * default serial version id
	 */
	private static final long serialVersionUID = -3955506000009654571L;

	/**
	 * store a specific interaction start point
	 */
	private Point m_startPoint = null;

	/**
	 * store a specific interaction end point
	 */
	private Point m_stopPoint = null;

	/**
	 * The UI is in zoom mode
	 */
	public static final int ZOOM = 0;

	/**
	 * The UI is in drag/pan mode
	 */
	public static final int DRAG = 1;

	/**
	 * The UI is in select mode
	 */
	public static final int SELECT = 2;

	/**
	 * The UI is in undefined mode
	 */
	public static final int UNDEFINED = 666;

	/**
	 * member variable storing the current UI mode
	 */
	private int m_modus = ZOOM;

	/**
	 * store the current zoom rectangle
	 */
	private Rectangle m_zoomRectangle = null;

	/**
	 * create a panel for storing radio buttons
	 */
	private JPanel m_panelRadioButton = null;

	/**
	 * radio button to allow users to choose from Dummy Server or SDE Server
	 */
	private static JRadioButton m_dummyServerRadioButton = null;

	/**
	 * radio button for SDE server
	 */
	private static JRadioButton m_sdeServerRadioButton = null;

	/**
	 * grouping the radio button
	 */
	private ButtonGroup m_group = null;

	/**
	 * button to load the map
	 */
	private Button m_ldButton = new Button(
			Messages.getString("GISComponent.LoadButton")); //$NON-NLS-1$

	/**
	 * button to zoom to fit
	 */
	private Button m_ztfButton = new Button(
			Messages.getString("GISComponent.ZoomToFit")); //$NON-NLS-1$

	/**
	 * button to zoom in
	 */
	private Button m_zinButton = new Button("+"); //$NON-NLS-1$

	/**
	 * button to zoom out
	 */
	private Button m_zoutButton = new Button("-"); //$NON-NLS-1$

	/**
	 * button to navigate north
	 */
	private Button m_upButton = new Button("N"); //$NON-NLS-1$

	/**
	 * button to navigate south
	 */
	private Button m_downButton = new Button("S"); //$NON-NLS-1$

	/**
	 * button to navigate west
	 */
	private Button m_leftButton = new Button("W"); //$NON-NLS-1$

	/**
	 * button to navigate east
	 */
	private Button m_rightButton = new Button("E"); //$NON-NLS-1$

	/**
	 * button to identify point of interest
	 */
	private Button m_poiButton = new Button(
			Messages.getString("GISComponent.PointOfInterest")); //$NON-NLS-1$

	/**
	 * button to store
	 */
	private Button m_storeButton = new Button(
			Messages.getString("GISComponent.Store")); // not really needed //$NON-NLS-1$

	/**
	 * button to sticky
	 */
	private Button m_stickyButton = new Button(
			Messages.getString("GISComponent.Sticky")); // not really needed //$NON-NLS-1$

	/**
	 * text field indicating the scaling
	 */
	private TextField m_scale = new TextField(
			Messages.getString("GISComponent.ZoomTextContent")); //$NON-NLS-1$

	/**
	 * store the current sticky rectangle (boundary for loading objects)
	 */
	private Rectangle m_stickyRectangle = null;

	/**
	 * radio button for serialized data
	 */
	private static JRadioButton m_sdeServerSerialized;

	/**
	 * CAS mediator for communicating with other panels
	 */
	private static MediatorIF m_casMediator;

	/**
	 * drawing panel
	 */
	private DrawingPanel m_drawingPanel = new DrawingPanel();

	/**
	 * server connection interface
	 */
	private static GEOServerInterface m_geoServerInterface;

	/*
	 * (non-Javadoc)
	 * 
	 * @see at.fhooe.mc.lbcas.interfaces.ComponentIF#createPanel()
	 */
	@Override
	public JPanel createPanel() {

		this.setLayout(new BorderLayout());

		// button bar panel
		JPanel buttonBar = new JPanel();

		// add button bar to south
		this.add(buttonBar, BorderLayout.WEST);

		// set the layout of controlling panel
		buttonBar.setLayout(new BoxLayout(buttonBar, BoxLayout.Y_AXIS));

		// create the borders
		Border raisedbevel = BorderFactory.createRaisedBevelBorder();
		Border loweredbevel = BorderFactory.createLoweredBevelBorder();
		Border titledBorder = BorderFactory
				.createTitledBorder(
						raisedbevel,
						getPanelName(),
						TitledBorder.LEFT,
						TitledBorder.CENTER,
						new Font(
								Messages.getString("GISComponent.TitleFont"), Font.BOLD | Font.ITALIC, 12)); //$NON-NLS-1$
		this.setBorder(BorderFactory.createCompoundBorder(titledBorder,
				loweredbevel));

		// radio button panel
		m_panelRadioButton = new JPanel();
		m_panelRadioButton.setLayout(new GridLayout(3, 1));
		Border lineBorder = BorderFactory.createLineBorder(new Color(0, 0, 0),
				1, false);
		m_panelRadioButton.setBorder(lineBorder);

		// add the radio button to allow users to choose from Dummy Server or
		// SDE Server
		m_dummyServerRadioButton = new JRadioButton(
				Messages.getString("GISComponent.RadioButtonDummyServer")); //$NON-NLS-1$
		m_dummyServerRadioButton.setToolTipText(Messages
				.getString("GISComponent.RadioButtonDummyServerToolTip")); //$NON-NLS-1$
		m_panelRadioButton.add(m_dummyServerRadioButton);

		// radio button for SDE server
		m_sdeServerRadioButton = new JRadioButton(
				Messages.getString("GISComponent.RadioButtonSDEServer")); //$NON-NLS-1$
		m_sdeServerRadioButton.setToolTipText(Messages
				.getString("GISComponent.RadioButtonSDEServerToolTip")); //$NON-NLS-1$
		m_panelRadioButton.add(m_sdeServerRadioButton);

		// radio button for SDE server serialized
		m_sdeServerSerialized = new JRadioButton(
				Messages.getString("GISComponent.RadioButtonSDEServerSerialized")); //$NON-NLS-1$
		m_sdeServerSerialized
				.setToolTipText(Messages
						.getString("GISComponent.RadioButtonSDEServerSerializedToolTip")); //$NON-NLS-1$
		m_panelRadioButton.add(m_sdeServerSerialized);

		// add the panel radio button to bar
		buttonBar.add(m_panelRadioButton);

		// Group the buttons
		m_group = new ButtonGroup();
		m_group.add(m_dummyServerRadioButton);
		m_group.add(m_sdeServerRadioButton);
		m_group.add(m_sdeServerSerialized);

		// add the require buttons
		// panel to sticky and store button
		JPanel loadZoomButtonsPanel = new JPanel(new GridLayout(9, 1));
		loadZoomButtonsPanel.setBorder(lineBorder);
		loadZoomButtonsPanel.add(m_ldButton);
		loadZoomButtonsPanel.add(m_ztfButton);
		loadZoomButtonsPanel.add(m_zinButton);
		loadZoomButtonsPanel.add(m_zoutButton);

		// scroll panel
		JPanel scroll = new JPanel(new FlowLayout());
		scroll.add(m_leftButton);
		// up down button panel
		JPanel updownPanel = new JPanel(new GridLayout(2, 1));
		updownPanel.add(m_upButton);
		updownPanel.add(m_downButton);
		scroll.add(updownPanel);
		scroll.add(m_rightButton);

		// panel to sticky and store button
		loadZoomButtonsPanel.add(scroll);
		loadZoomButtonsPanel.add(m_scale);
		loadZoomButtonsPanel.add(m_poiButton);
		loadZoomButtonsPanel.add(m_storeButton);
		loadZoomButtonsPanel.add(m_stickyButton);
		buttonBar.add(loadZoomButtonsPanel);

		// listener for radio button
		m_dummyServerRadioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (((JRadioButton) e.getSource()).isSelected()) {
					getDisplayMessageComponent()
							.updateMessage(
									Messages.getString("GISComponent.RadioSelectionMessage")); //$NON-NLS-1$
				}
			}
		});

		// listener for radio button
		m_sdeServerRadioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (((JRadioButton) e.getSource()).isSelected()) {
					getDisplayMessageComponent()
							.updateMessage(
									Messages.getString("GISComponent.RadioSelectionMessage")); //$NON-NLS-1$
				}
			}
		});

		// listener for radio button
		m_sdeServerSerialized.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (((JRadioButton) e.getSource()).isSelected()) {
					getDisplayMessageComponent()
							.updateMessage(
									Messages.getString("GISComponent.RadioSelectionMessage")); //$NON-NLS-1$
				}
			}
		});

		// action listener for all button
		m_ldButton.setActionCommand("LoadMap"); //$NON-NLS-1$
		m_ldButton.addActionListener(this);
		m_ztfButton.setActionCommand("ZoomToFit"); //$NON-NLS-1$
		m_ztfButton.addActionListener(this);
		m_zinButton.setActionCommand("ZoomIn"); //$NON-NLS-1$
		m_zinButton.addActionListener(this);
		m_zoutButton.setActionCommand("ZoomOut"); //$NON-NLS-1$
		m_zoutButton.addActionListener(this);
		m_upButton.setActionCommand("MoveNorth"); //$NON-NLS-1$
		m_upButton.addActionListener(this);
		m_downButton.setActionCommand("MoveSouth"); //$NON-NLS-1$
		m_downButton.addActionListener(this);
		m_leftButton.setActionCommand("MoveWest"); //$NON-NLS-1$
		m_leftButton.addActionListener(this);
		m_rightButton.setActionCommand("MoveEast"); //$NON-NLS-1$
		m_rightButton.addActionListener(this);
		m_poiButton.setActionCommand("PointOfInterest"); //$NON-NLS-1$
		m_poiButton.addActionListener(this);
		m_storeButton.setActionCommand("Store"); //$NON-NLS-1$
		m_storeButton.addActionListener(this);
		m_stickyButton.setActionCommand("Sticky"); //$NON-NLS-1$
		m_stickyButton.addActionListener(this);
		m_scale.addKeyListener(this);

		// add drawing panel to center
		this.add(m_drawingPanel, BorderLayout.CENTER);

		// add mouse listener
		m_drawingPanel.addMouseListener(this);
		m_drawingPanel.addMouseMotionListener(this);

		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see at.fhooe.mc.lbcas.interfaces.ComponentIF#getPanelName()
	 */
	@Override
	public String getPanelName() {
		return Messages.getString("GISComponent.GISComponentHeading"); //$NON-NLS-1$
	}

	/**
	 * Get clip board string
	 * 
	 * @param _pt
	 * @return
	 */
	private String getClipboardString(Point _pt) {
		return _pt.x + " " + _pt.y; //$NON-NLS-1$
	}

	/**
	 * attach data to the current cliboard
	 */
	private void addToClipboard(String _text) {
		try {
			Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
			Transferable t = cb.getContents(this);
			String oldClip = (String) t
					.getTransferData(DataFlavor.stringFlavor);
			oldClip += "\n"; //$NON-NLS-1$
			copyToClipboard(oldClip + _text);
		} catch (Exception _e) {
			_e.printStackTrace();
		}
	} // addToClip

	/**
	 * copies data to the clipboard
	 */
	private void copyToClipboard(String _text) {
		try {
			Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
			// StringSelection ss = new StringSelection(toCopy);
			cb.setContents(new StringSelection(_text), new StringSelection(
					_text));
		} catch (java.security.AccessControlException sec_e) {
			System.out
					.println("Zugriff auf Clipboard nicht erlaubt.\nBITTE java.policy ANPASSEN."); //$NON-NLS-1$
		} catch (Exception _e) {
			_e.printStackTrace();
		}
	}

	/**
	 * moves the active zoom point to new position ... a new zoom rectangle is
	 * drawn, the old one is erased
	 * 
	 * @param _point
	 *            point to generate zoom rectangle
	 */
	private void generateZoomRect(Point _point) {
		if (m_startPoint != null) {
			Color col = new Color(Color.red.getRGB() ^ getBackground().getRGB());
			if (m_zoomRectangle != null)
				drawXORRectangle(m_zoomRectangle, col);
			m_zoomRectangle = new Rectangle(m_startPoint);
			m_zoomRectangle.add(_point);
			drawXORRectangle(m_zoomRectangle, col);
		}
	}

	/**
	 * Draws the rectangle in XOR mode onto the canvas with a distinct color
	 */
	private void drawXORRectangle(Rectangle _rect, Color _color) {
		if (_rect != null) {
			Graphics g = m_drawingPanel.getGraphics();
			g.setXORMode(_color);
			g.drawRect(_rect.x, _rect.y, _rect.width, _rect.height);
			g.setPaintMode();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.MouseMotionListener#mouseDragged(java.awt.event.MouseEvent
	 * )
	 */
	@Override
	public void mouseDragged(MouseEvent _event) {
		if (m_modus == ZOOM)
			generateZoomRect(_event.getPoint()); // draw the zoom rectangle
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.MouseMotionListener#mouseMoved(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseMoved(MouseEvent e) {
		// nothing to do here
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		// Nothing to do here
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
	 */
	@Override
	public void mousePressed(MouseEvent _event) {

		// if click count > 2 mode Select
		// if left mouse clicked(BUTTON1_MASK) mode Zoom
		// if right mouse clicked(BUTTON3_MASK) mode Drag

		if (m_drawingPanel.getGeoObjects() != null
				&& m_drawingPanel.getM_matrix() != null) {
			m_startPoint = _event.getPoint();
			if (_event.getClickCount() >= 2) {
				m_modus = SELECT;
			} else {
				switch (_event.getModifiers()) {
				case MouseEvent.BUTTON1_MASK: {
					m_modus = ZOOM;
					m_drawingPanel
							.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
				}
					break;
				case MouseEvent.BUTTON3_MASK: {
					m_modus = DRAG;
					m_drawingPanel.setCursor(new Cursor(Cursor.MOVE_CURSOR));
				}
					break;
				default: {
				}
				} // switch
			}
			if (_event.isControlDown())
				addToClipboard(getClipboardString(m_drawingPanel
						.getMapPoint(m_startPoint)));
			else
				copyToClipboard(getClipboardString(m_drawingPanel
						.getMapPoint(m_startPoint)));
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseReleased(MouseEvent _event) {

		if (m_drawingPanel.getGeoObjects() != null
				&& m_drawingPanel.getM_matrix() != null) {
			m_stopPoint = _event.getPoint();
			int delta = 6; // 6 dots as delta ... if distance is greater than a
			// drag
			// movement has been detected
			boolean zittern = false;
			Rectangle test = new Rectangle(m_startPoint.x - (delta >> 1),
					m_startPoint.y - (delta >> 1), delta, delta);
			if (!test.contains(m_stopPoint.x, m_stopPoint.y)) {
				zittern = true;
			}

			switch (m_modus) {
			case ZOOM: {
				if (zittern) { // a zoom rectangle has been defined
					Point p1 = m_drawingPanel.getMapPoint(m_startPoint);
					Point p2 = m_drawingPanel.getMapPoint(m_stopPoint);
					Rectangle mapBounds = new Rectangle(Integer.MAX_VALUE,
							Integer.MAX_VALUE, Integer.MIN_VALUE,
							Integer.MIN_VALUE);
					mapBounds.add(p1);
					mapBounds.add(p2);
					m_drawingPanel.zoomToFit(mapBounds);
					m_drawingPanel.repaint();
					int scale = m_drawingPanel.calculateScale();
					getM_scale()
							.setText(modifyScaleText(String.valueOf(scale)));
				}
			}
				break;
			case DRAG: {
				// a drag movement has been initiated
				int deltaX = -m_startPoint.x + m_stopPoint.x;
				int deltaY = -m_startPoint.y + m_stopPoint.y;
				m_drawingPanel.scrollHorizontal(deltaX);
				m_drawingPanel.scrollVertical(deltaY);
				m_drawingPanel.repaint();
			}
				break;
			case SELECT: {
				if (!zittern) {
					GeoObject[] select = m_drawingPanel
							.initSelection(m_stopPoint);
					if (select != null) {
						for (int i = 0; i < select.length; i++) {
							System.out.println(i + ". selected object --> " //$NON-NLS-1$
									+ select[i]);
						} // for i
					} // if select
				} // if zittern
			}
				break;
			} // switch
			m_drawingPanel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			m_zoomRectangle = null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseEntered(MouseEvent e) {
		// Nothing to do here
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseExited(MouseEvent e) {
		// Nothing to do here
	}

	/**
	 * This method gives the Display Message Component, which can be used to
	 * update text message.
	 * 
	 * @return
	 */
	private DisplayMessagesComponent getDisplayMessageComponent() {
		m_casMediator = CASMediator.getInstance();
		return (DisplayMessagesComponent) m_casMediator
				.getM_componentDisplayMessages();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent _event) {

		// as per the action commands for different buttons, accordingly
		// different action is performed

		switch (_event.getActionCommand()) {
		case "LoadMap": //$NON-NLS-1$
			loadData();
			break;
		case "ZoomToFit": //$NON-NLS-1$
			m_drawingPanel.zoomToFit();
			break;
		case "ZoomIn": //$NON-NLS-1$
			zoomIn();
			break;
		case "ZoomOut": //$NON-NLS-1$
			zoomOut();
			break;
		case "MoveNorth": //$NON-NLS-1$
			m_drawingPanel.scrollVertical(-20);
			break;
		case "MoveSouth": //$NON-NLS-1$
			m_drawingPanel.scrollVertical(20);
			break;
		case "MoveWest": //$NON-NLS-1$
			m_drawingPanel.scrollHorizontal(-20);
			break;
		case "MoveEast": //$NON-NLS-1$
			m_drawingPanel.scrollHorizontal(20);
			break;
		case "PointOfInterest": //$NON-NLS-1$
			m_drawingPanel.initPOI();
			break;
		case "Store": //$NON-NLS-1$
			storeImage();
			break;
		case "Sticky": //$NON-NLS-1$
			stickyButtonEvent();
			break;
		default:
			getDisplayMessageComponent().updateMessage(
					"Unknown button clicked ... event not handled");
			break;
		}

		// repaint the component panel
		m_drawingPanel.repaint();
	}

	/**
	 * zoom out functionality - method will be called after clicking on zoom out
	 * button
	 */
	private void zoomOut() {
		m_drawingPanel.zoom(1 / 1.2);
		int scale = m_drawingPanel.calculateScale();
		m_scale.setText(modifyScaleText(String.valueOf(scale)));

	}

	/**
	 * zoom in functionality - method will be called after clicking on zoom in
	 * button
	 */
	private void zoomIn() {
		m_drawingPanel.zoom(1.2);
		int scale = m_drawingPanel.calculateScale();
		m_scale.setText(modifyScaleText(String.valueOf(scale)));
	}

	/**
	 * modifies the content in the text field of scale
	 * 
	 * @param _scale
	 *            - new scale to be set
	 * @return updated scale in string format
	 */
	public String modifyScaleText(String _scale) {
		return "1 : " + _scale; //$NON-NLS-1$
	}

	/**
	 * Stores the current data visualized in the canvas in a predefined file
	 */
	private void storeImage() {

		try {
			String[] temp = ImageToBitmap.getImageTypes();
			for (int i = 0; i < temp.length; i++) {
				System.out.println(i + ". --> " + temp[i]); //$NON-NLS-1$
			} // for i

			BufferedImage image = ImageToBitmap.getImage(
					m_drawingPanel.getWidth(), m_drawingPanel.getHeight());
			Graphics g = image.getGraphics();
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, m_drawingPanel.getWidth(),
					m_drawingPanel.getHeight());

			m_drawingPanel.paint(g);

			g.dispose();

			String fileType = "png"; //$NON-NLS-1$
			FileOutputStream out = new FileOutputStream(new File("Test-II." //$NON-NLS-1$
					+ fileType));
			ImageToBitmap.storeImage(image, out,
					ImageToBitmap.getImageType(fileType));
			out.flush();
			out.close();
		} catch (Exception _e) {
			_e.printStackTrace();
		}
	}

	/**
	 * Sticky button event
	 */
	private void stickyButtonEvent() {
		if (m_stickyRectangle == null) {
			Rectangle rect = new Rectangle(0, 0, m_drawingPanel.getWidth(),
					m_drawingPanel.getHeight());
			m_stickyRectangle = m_drawingPanel.getMapRectangle(rect);
		} else {
			m_stickyRectangle = null;
		}
		m_drawingPanel.setGeoObjects(null);
		System.gc();
		if (m_dummyServerRadioButton.isSelected())
			loadDataDummyServer();
		else if (m_sdeServerRadioButton.isSelected())
			loadDataSDEServer();
		else if (m_sdeServerSerialized.isSelected())
			loadDataSDEServerSerialized();

	}

	/**
	 * This method checks the logic for which server to load the data based on
	 * the selection done
	 */
	private void loadData() {

		if (m_dummyServerRadioButton.isSelected()) {
			loadDataDummyServer();
		} else if (m_sdeServerRadioButton.isSelected()) {
			loadDataSDEServer();
		} else if (m_sdeServerSerialized.isSelected()) {
			loadDataSDEServerSerialized();
		} else {
			getDisplayMessageComponent().updateMessage(
					Messages.getString("GISComponent.ServerSelectionMessage")); //$NON-NLS-1$
		}

	}

	/**
	 * Loads the data from the SDE server ...
	 */
	private void loadDataSDEServer() {

		// vectors of GEO Objects
		Vector<GeoObject> objectContainer = null;

		// establish the connection
		boolean isConnectionEstablished = m_geoServerInterface
				.login(Messages.getString("GISComponent.SDEServerUsername"), //$NON-NLS-1$
						Messages.getString("GISComponent.SDEServerUser"), Messages.getString("GISComponent.SDEServerPassword")); //$NON-NLS-1$ //$NON-NLS-2$

		if (isConnectionEstablished) {
			getDisplayMessageComponent()
					.updateMessage(
							Messages.getString("GISComponent.SDEServerConnectionEstablished")); //$NON-NLS-1$

			// load the data from the server
			objectContainer = m_geoServerInterface.loadData();
		} else {
			getDisplayMessageComponent()
					.updateMessage(
							Messages.getString("GISComponent.DummyServerConnectionFailed")); //$NON-NLS-1$
			return;
		}

		if (objectContainer == null) {
			getDisplayMessageComponent()
					.updateMessage(
							Messages.getString("GISComponent.SDEServerErrorFetchingData")); //$NON-NLS-1$
		} else {

			getDisplayMessageComponent().updateMessage(
					Messages.getString("GISComponent.DataLoadedSuccess")); //$NON-NLS-1$
			m_drawingPanel.setGeoObjects(objectContainer);
		}

	}

	/**
	 * Loads the data from the Dummy server, this method should be used when you
	 * don't have access real to map
	 */
	private void loadDataDummyServer() {

		Vector<GeoObject> objectContainer = null;

		// login to the server
		boolean isLoggedIn = m_geoServerInterface
				.login(Messages.getString("GISComponent.DummyServerUsername"), Messages.getString("GISComponent.DummyServerPassword"), Messages.getString("GISComponent.DummServerPathPort")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

		if (isLoggedIn) {
			getDisplayMessageComponent()
					.updateMessage(
							Messages.getString("GISComponent.DummyServerConnectionSuccessful")); //$NON-NLS-1$
			// vectors of GEO Objects - load data
			objectContainer = m_geoServerInterface.loadData();
		} else {
			getDisplayMessageComponent()
					.updateMessage(
							Messages.getString("GISComponent.DummyServerConnectionFailed")); //$NON-NLS-1$
			return;
		}

		if (objectContainer == null) {
			getDisplayMessageComponent()
					.updateMessage(
							Messages.getString("GISComponent.DummyServerErrorFetchingData")); //$NON-NLS-1$
		} else {
			getDisplayMessageComponent().updateMessage(
					Messages.getString("GISComponent.DataLoadedSuccess")); //$NON-NLS-1$
			m_drawingPanel.setGeoObjects(objectContainer);
		}
	}

	/**
	 * loads the serialized data, but serialized objects should be present on
	 * hard drive
	 */
	private void loadDataSDEServerSerialized() {

		Vector<GeoObject> objectContainer = new Vector<>();

		// load the serialized object located on F Drive of the computer
		// hard disk
		getDisplayMessageComponent()
				.updateMessage(
						Messages.getString("GISComponent.SDEServerSerializedDataLoading")); //$NON-NLS-1$

		objectContainer = m_geoServerInterface.loadData();

		m_drawingPanel.setGeoObjects(objectContainer);

		getDisplayMessageComponent()
				.updateMessage(
						Messages.getString("GISComponent.SDEServerSerializedDataLoadedSuccess")); //$NON-NLS-1$

	}

	/**
	 * Scans the scale test
	 * 
	 * @param scale
	 *            accepts the scale
	 * @return int returns the integer
	 */
	private int scanScaleText(String _scale) {

		int index = _scale.indexOf(":"); //$NON-NLS-1$
		if (index != -1) {
			String tmp = (_scale.substring(index + 1, _scale.length())).trim();
			return Integer.parseInt(tmp);
		}
		return Integer.parseInt(_scale.trim());

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyPressed(KeyEvent _event) {
		if (_event.getKeyCode() == KeyEvent.VK_ENTER) {
			String scaleS = m_scale.getText();
			m_drawingPanel.zoomToScale(scanScaleText(scaleS));
			int scale = m_drawingPanel.calculateScale();
			m_scale.setText(modifyScaleText(String.valueOf(scale)));
			m_drawingPanel.repaint();
		} // if VK_ENTER

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		// nothing to do here
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyTyped(KeyEvent e) {
		// Nothing to do here
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void update(Observable _observable, Object _arg) {

		// update the GEO objects in the GIS component, this is for listening
		// POI objects from POI Component
		if (_observable instanceof GeoObjectObservable
				&& m_drawingPanel.getGeoObjects() != null)
			m_drawingPanel.getGeoObjects().addAll((Vector<GeoObject>) _arg);

		// for listening context elements, specifically position
		if (_observable instanceof ContextElementObservable
				&& m_drawingPanel.getGeoObjects() != null) {

			// cast to context element
			Vector<ContextElement> contextElements = (Vector<ContextElement>) _arg;

			for (ContextElement contextElement : contextElements) {

				if ("locationcontext".equals(contextElement.getContexttype())) {
					// create the Geographic coordinate
					GeographischWGS84 geographischWGS84 = new GeographischWGS84(
							contextElement.getLocationContextElement()
									.getGeographicalLocation().getLongitude(),
							contextElement.getLocationContextElement()
									.getGeographicalLocation().getLatitude());

					// create the Gauss Krueger Coordinate
					GaussKruegerBMN gaussKruegerBMNCorodinate = new GaussKruegerBMN(
							geographischWGS84);

					// capture the details in context element, gauss krueger
					// coordinates
					// are in cm, so divide them by 100 to get meters
					Point point = new Point(
							gaussKruegerBMNCorodinate.getRechts() / 100,
							gaussKruegerBMNCorodinate.getHoch() / 100);
					// check for the instance

					// convert the point , using to multiply point method
					point = m_drawingPanel.getM_matrix().multiply(point);

					// draws the image
					m_drawingPanel.getGraphics().drawImage(
							POIObject.getM_image(), point.x, point.y,
							new Panel());

					// create a POI object and add it to POI
					POIObject poiObject = new POIObject("", 9999, point);
					m_drawingPanel.getGeoObjects().addElement(poiObject);

				}
			}
		}

		// observable instance of ContextSituation
		if (_observable instanceof ContextSituationObservable) {

			// set the values from context situation and validate the tree
			setContextSituationValuesTreeAndValidate(_arg);
		}

	}

	private void setContextSituationValuesTreeAndValidate(Object _arg) {

		// cast to context situation
		ContextSituation contextSituation = (ContextSituation) _arg;

		// tree node rules map
		Map<String, Map<TreeNode, RulesEntity>> m_treeNodeRulesMap = CASMediator
				.getM_treeNodeRulesMap();

		// iterate through the tree node map rule
		for (String key : m_treeNodeRulesMap.keySet()) {

			for (TreeNode treeNode : m_treeNodeRulesMap.get(key).keySet()) {

				try {

					treeNode.setVariableParameters(contextSituation);
					Boolean result = (Boolean) treeNode.calculate();
					if (result) {
						adaptGISComponent(m_treeNodeRulesMap.get(key).get(
								treeNode));
					}

				} catch (NodeError e) {
					e.printStackTrace();
				}
			}
		}

	}

	@SuppressWarnings("all")
	private void adaptGISComponent(RulesEntity rulesEntity) {

		// create the client controller
		ClientControllerIF m_clientController = new ClientController();

		// interface package
		String m_componentInterfacePackage = "at.fhooe.mc.lbcas.component.ComponentIF";

		try {
			// get the class component
			Class<?> component = m_clientController.findModule(
					m_componentInterfacePackage,
					rulesEntity.getM_affectedComponent());

			if (component != null) {
				// create new object
				Object object = component.newInstance();

				// get the method name
				String methodName = rulesEntity.getM_methodName();

				// get the method parameter
				String methodParameterClass = rulesEntity.getM_parameterClass();

				if (methodParameterClass != "") {

					// find the parameter class
					Class<?> parameterClass = m_clientController
							.findClass(methodParameterClass);

					if (parameterClass != null) {

						Object parameterClassInstance = parameterClass
								.newInstance();

						Class<?>[] interfaces = parameterClass.getInterfaces();

						for (Class<?> tempClass : interfaces) {
							try {
								Method method = component.getDeclaredMethod(
										methodName, tempClass);
								method.invoke(object, parameterClassInstance);
								break;
							} catch (NoSuchMethodException e) {
								// Do Nothing
							}
						}
					}
				} else {

					// no parameter class array
					Class<?>[] noParams = {};

					try {
						Method method = component.getDeclaredMethod(methodName,
								noParams);
						method.invoke(object, noParams);
					} catch (NoSuchMethodException e) {
						// Do Nothing
					}

				}

			}
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

	}

	public void activateLanguage() {
		Locale.setDefault(Locale.GERMAN);
	}

	/**
	 * Set server method for loading the data from particular server. SDE
	 * Server, Dummy Server or Serialized Data
	 * 
	 * @param geoServerInterface
	 */
	public void setServer(GEOServerInterface _geoServerInterface) {
		if (_geoServerInterface instanceof SDEServer) {
			m_sdeServerRadioButton.setSelected(true);
		} else if (_geoServerInterface instanceof DummyServer) {
			m_dummyServerRadioButton.setSelected(true);
		} else if (_geoServerInterface instanceof SDEServerSerializedData) {
			m_sdeServerSerialized.setSelected(true);
		}
		m_geoServerInterface = _geoServerInterface;
	}

	/**
	 * 
	 * @param drawingContextIF
	 */
	public void activateDayNightMode(DrawingContextIF drawingContextIF) {
		DrawingPanel.setDrawingContextIF(drawingContextIF);
	}

	/**
	 * @param m_stickyRectangle
	 *            the m_stickyRectangle to set
	 */
	public void setM_stickyRectangle(Rectangle m_stickyRectangle) {
		this.m_stickyRectangle = m_stickyRectangle;
	}

	/**
	 * @return the m_panelRadioButton
	 */
	public JPanel getM_panelRadioButton() {
		return m_panelRadioButton;
	}

	/**
	 * @param m_panelRadioButton
	 *            the m_panelRadioButton to set
	 */
	public void setM_panelRadioButton(JPanel m_panelRadioButton) {
		this.m_panelRadioButton = m_panelRadioButton;
	}

	/**
	 * @return the m_dummyServerRadioButton
	 */
	public JRadioButton getM_dummyServerRadioButton() {
		return m_dummyServerRadioButton;
	}

	/**
	 * @param m_dummyServerRadioButton
	 *            the m_dummyServerRadioButton to set
	 */
	public void setM_dummyServerRadioButton(
			JRadioButton m_dummyServerRadioButton) {
		GISComponent.m_dummyServerRadioButton = m_dummyServerRadioButton;
	}

	/**
	 * @return the m_sdeServerRadioButton
	 */
	public JRadioButton getM_sdeServerRadioButton() {
		return m_sdeServerRadioButton;
	}

	/**
	 * @param m_sdeServerRadioButton
	 *            the m_sdeServerRadioButton to set
	 */
	public void setM_sdeServerRadioButton(JRadioButton m_sdeServerRadioButton) {
		GISComponent.m_sdeServerRadioButton = m_sdeServerRadioButton;
	}

	/**
	 * @return the m_group
	 */
	public ButtonGroup getM_group() {
		return m_group;
	}

	/**
	 * @param m_group
	 *            the m_group to set
	 */
	public void setM_group(ButtonGroup m_group) {
		this.m_group = m_group;
	}

	/**
	 * @return the m_ldButton
	 */
	public Button getM_ldButton() {
		return m_ldButton;
	}

	/**
	 * @param m_ldButton
	 *            the m_ldButton to set
	 */
	public void setM_ldButton(Button m_ldButton) {
		this.m_ldButton = m_ldButton;
	}

	/**
	 * @return the m_ztfButton
	 */
	public Button getM_ztfButton() {
		return m_ztfButton;
	}

	/**
	 * @param m_ztfButton
	 *            the m_ztfButton to set
	 */
	public void setM_ztfButton(Button m_ztfButton) {
		this.m_ztfButton = m_ztfButton;
	}

	/**
	 * @return the m_zinButton
	 */
	public Button getM_zinButton() {
		return m_zinButton;
	}

	/**
	 * @param m_zinButton
	 *            the m_zinButton to set
	 */
	public void setM_zinButton(Button m_zinButton) {
		this.m_zinButton = m_zinButton;
	}

	/**
	 * @return the m_zoutButton
	 */
	public Button getM_zoutButton() {
		return m_zoutButton;
	}

	/**
	 * @param m_zoutButton
	 *            the m_zoutButton to set
	 */
	public void setM_zoutButton(Button m_zoutButton) {
		this.m_zoutButton = m_zoutButton;
	}

	/**
	 * @return the m_upButton
	 */
	public Button getM_upButton() {
		return m_upButton;
	}

	/**
	 * @param m_upButton
	 *            the m_upButton to set
	 */
	public void setM_upButton(Button m_upButton) {
		this.m_upButton = m_upButton;
	}

	/**
	 * @return the m_downButton
	 */
	public Button getM_downButton() {
		return m_downButton;
	}

	/**
	 * @param m_downButton
	 *            the m_downButton to set
	 */
	public void setM_downButton(Button m_downButton) {
		this.m_downButton = m_downButton;
	}

	/**
	 * @return the m_leftButton
	 */
	public Button getM_leftButton() {
		return m_leftButton;
	}

	/**
	 * @param m_leftButton
	 *            the m_leftButton to set
	 */
	public void setM_leftButton(Button m_leftButton) {
		this.m_leftButton = m_leftButton;
	}

	/**
	 * @return the m_rightButton
	 */
	public Button getM_rightButton() {
		return m_rightButton;
	}

	/**
	 * @param m_rightButton
	 *            the m_rightButton to set
	 */
	public void setM_rightButton(Button m_rightButton) {
		this.m_rightButton = m_rightButton;
	}

	/**
	 * @return the m_poiButton
	 */
	public Button getM_poiButton() {
		return m_poiButton;
	}

	/**
	 * @param m_poiButton
	 *            the m_poiButton to set
	 */
	public void setM_poiButton(Button m_poiButton) {
		this.m_poiButton = m_poiButton;
	}

	/**
	 * @return the m_storeButton
	 */
	public Button getM_storeButton() {
		return m_storeButton;
	}

	/**
	 * @param m_storeButton
	 *            the m_storeButton to set
	 */
	public void setM_storeButton(Button m_storeButton) {
		this.m_storeButton = m_storeButton;
	}

	/**
	 * @return the m_stickyButton
	 */
	public Button getM_stickyButton() {
		return m_stickyButton;
	}

	/**
	 * @param m_stickyButton
	 *            the m_stickyButton to set
	 */
	public void setM_stickyButton(Button m_stickyButton) {
		this.m_stickyButton = m_stickyButton;
	}

	/**
	 * @return the m_scale
	 */
	public TextField getM_scale() {
		return m_scale;
	}

	/**
	 * @param m_scale
	 *            the m_scale to set
	 */
	public void setM_scale(TextField m_scale) {
		this.m_scale = m_scale;
	}

	/**
	 * @return the m_stickyRectangle
	 */
	public Rectangle getM_stickyRectangle() {
		return m_stickyRectangle;
	}

}