/*
 * SalesManagementView.java
 */

package salesmanagement;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.print.PrinterJob;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import javax.xml.ws.Action;

import modelbeans.AnswerOptionModel;
import modelbeans.QuestionInformationModel;
import modelbeans.QuestionModel;

import org.jdesktop.application.FrameView;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.TaskMonitor;

/**
 * The application's main frame.
 */
public class SalesManagementView extends FrameView {

	public SalesManagementView(SingleFrameApplication app) {
		super(app);

		initComponents();

		// This is the code for hiding mouse in grid panel
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// get the smallest valid cursor size
		Dimension dim = toolkit.getBestCursorSize(1, 1);
		// create a new image of that size with an alpha channel
		BufferedImage cursorImg = new BufferedImage(dim.width, dim.height,
				BufferedImage.TYPE_INT_ARGB);
		// get a Graphics2D object to draw to the image
		Graphics2D g2d = cursorImg.createGraphics();
		// set the background 'color' with 0 alpha and clear the image
		g2d.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
		g2d.clearRect(0, 0, dim.width, dim.height);
		// dispose the Graphics2D object
		g2d.dispose();
		// for hiding the mouse in application window
		Cursor hiddenCursor = toolkit.createCustomCursor(cursorImg, new Point(
				0, 0), "hiddenCursor");
		jPanel4.setCursor(hiddenCursor);
		// This is the code for hiding mouse in grid panel

		// allocate memory
		databaseReading = new DatabaseReading();
		questionInformationModel = new QuestionInformationModel();
		questionModel = new QuestionModel();
		answerOptionModel = new AnswerOptionModel();
		listVisitedCustomers = new ArrayList<JButton>();
		jButton39.setVisible(false);
		currentFocusCustomer = jButton34;
		loggedInUser = HelpForm.loggedInUser;

		// code for disabling tab event on each customer button
		jButton1.setFocusTraversalKeysEnabled(false);
		jButton2.setFocusTraversalKeysEnabled(false);
		jButton3.setFocusTraversalKeysEnabled(false);
		jButton411.setFocusTraversalKeysEnabled(false);
		jButton5.setFocusTraversalKeysEnabled(false);
		jButton6.setFocusTraversalKeysEnabled(false);
		jButton7.setFocusTraversalKeysEnabled(false);
		jButton8.setFocusTraversalKeysEnabled(false);
		jButton9.setFocusTraversalKeysEnabled(false);
		jButton10.setFocusTraversalKeysEnabled(false);
		jButton11.setFocusTraversalKeysEnabled(false);
		jButton12.setFocusTraversalKeysEnabled(false);
		jButton13.setFocusTraversalKeysEnabled(false);
		jButton14.setFocusTraversalKeysEnabled(false);
		jButton15.setFocusTraversalKeysEnabled(false);
		jButton16.setFocusTraversalKeysEnabled(false);
		jButton17.setFocusTraversalKeysEnabled(false);
		jButton18.setFocusTraversalKeysEnabled(false);
		jButton19.setFocusTraversalKeysEnabled(false);
		jButton20.setFocusTraversalKeysEnabled(false);
		jButton21.setFocusTraversalKeysEnabled(false);
		jButton22.setFocusTraversalKeysEnabled(false);
		jButton23.setFocusTraversalKeysEnabled(false);
		jButton24.setFocusTraversalKeysEnabled(false);
		jButton25.setFocusTraversalKeysEnabled(false);
		jButton26.setFocusTraversalKeysEnabled(false);
		jButton27.setFocusTraversalKeysEnabled(false);
		jButton28.setFocusTraversalKeysEnabled(false);
		jButton29.setFocusTraversalKeysEnabled(false);
		jButton30.setFocusTraversalKeysEnabled(false);
		jButton31.setFocusTraversalKeysEnabled(false);
		jButton32.setFocusTraversalKeysEnabled(false);
		jButton33.setFocusTraversalKeysEnabled(false);
		jButton34.setFocusTraversalKeysEnabled(false);
		jButton35.setFocusTraversalKeysEnabled(false);
		jButton36.setFocusTraversalKeysEnabled(false);
		jButton37.setFocusTraversalKeysEnabled(false);
		jButton38.setFocusTraversalKeysEnabled(false);
		jScrollPane1.setFocusTraversalKeysEnabled(false);
		jScrollPane2.setFocusTraversalKeysEnabled(false);
		jTable1.setFocusTraversalKeysEnabled(false);
		jTable2.setFocusTraversalKeysEnabled(false);

		// status bar initialization - message timeout, idle icon and busy
		// animation, etc
		ResourceMap resourceMap = getResourceMap();
		int messageTimeout = resourceMap.getInteger("StatusBar.messageTimeout");
		messageTimer = new Timer(messageTimeout, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				statusMessageLabel.setText("");
			}
		});
		messageTimer.setRepeats(false);
		int busyAnimationRate = resourceMap
				.getInteger("StatusBar.busyAnimationRate");
		for (int i = 0; i < busyIcons.length; i++) {
			busyIcons[i] = resourceMap
					.getIcon("StatusBar.busyIcons[" + i + "]");
		}
		busyIconTimer = new Timer(busyAnimationRate, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				busyIconIndex = (busyIconIndex + 1) % busyIcons.length;
				statusAnimationLabel.setIcon(busyIcons[busyIconIndex]);
			}
		});
		idleIcon = resourceMap.getIcon("StatusBar.idleIcon");
		statusAnimationLabel.setIcon(idleIcon);
		progressBar.setVisible(false);

		// connecting action tasks to status bar via TaskMonitor
		TaskMonitor taskMonitor = new TaskMonitor(getApplication().getContext());
		taskMonitor
				.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
					public void propertyChange(
							java.beans.PropertyChangeEvent evt) {
						String propertyName = evt.getPropertyName();
						if ("started".equals(propertyName)) {
							if (!busyIconTimer.isRunning()) {
								statusAnimationLabel.setIcon(busyIcons[0]);
								busyIconIndex = 0;
								busyIconTimer.start();
							}
							progressBar.setVisible(true);
							progressBar.setIndeterminate(true);
						} else if ("done".equals(propertyName)) {
							busyIconTimer.stop();
							statusAnimationLabel.setIcon(idleIcon);
							progressBar.setVisible(false);
							progressBar.setValue(0);
						} else if ("message".equals(propertyName)) {
							String text = (String) (evt.getNewValue());
							statusMessageLabel.setText((text == null) ? ""
									: text);
							messageTimer.restart();
						} else if ("progress".equals(propertyName)) {
							int value = (Integer) (evt.getNewValue());
							progressBar.setVisible(true);
							progressBar.setIndeterminate(false);
							progressBar.setValue(value);
						}
					}
				});
	}

	@Action
	public void showAboutBox() {
		if (aboutBox == null) {
			JFrame mainFrame = SalesManagementApp.getApplication()
					.getMainFrame();
			aboutBox = new SalesManagementAboutBox(mainFrame);
			aboutBox.setLocationRelativeTo(mainFrame);
		}
		SalesManagementApp.getApplication().show(aboutBox);
	}

	@Action
	public void showGameInstructionBox() {
		// call the main
		HelpFormDuringGame.main(null);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		mainPanel = new javax.swing.JPanel();
		jPanel1 = new PrintablePanel();
		jPanel2 = new PrintablePanel();
		jLabel1 = new javax.swing.JLabel();
		moneyEarned = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		timeSpent = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		ampmLabel = new javax.swing.JLabel();
		messageLabel = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jButton38 = new javax.swing.JButton();
		jButton39 = new javax.swing.JButton();
		jButton40 = new javax.swing.JButton();
		jPanel4 = new BackgroundPanel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jButton10 = new javax.swing.JButton();
		jButton11 = new javax.swing.JButton();
		jButton12 = new javax.swing.JButton();
		jButton13 = new javax.swing.JButton();
		jButton14 = new javax.swing.JButton();
		jButton15 = new javax.swing.JButton();
		jButton16 = new javax.swing.JButton();
		jButton17 = new javax.swing.JButton();
		jButton18 = new javax.swing.JButton();
		jButton19 = new javax.swing.JButton();
		jButton20 = new javax.swing.JButton();
		jButton21 = new javax.swing.JButton();
		jButton22 = new javax.swing.JButton();
		jButton23 = new javax.swing.JButton();
		jButton24 = new javax.swing.JButton();
		jButton25 = new javax.swing.JButton();
		jButton26 = new javax.swing.JButton();
		jButton27 = new javax.swing.JButton();
		jButton28 = new javax.swing.JButton();
		jButton29 = new javax.swing.JButton();
		jButton30 = new javax.swing.JButton();
		jButton31 = new javax.swing.JButton();
		jButton32 = new javax.swing.JButton();
		jButton33 = new javax.swing.JButton();
		jButton34 = new JButton();
		jButton35 = new javax.swing.JButton();
		jButton36 = new javax.swing.JButton();
		jButton37 = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		menuBar = new javax.swing.JMenuBar();
		javax.swing.JMenu fileMenu = new javax.swing.JMenu();
		javax.swing.JMenuItem exitMenuItem = new javax.swing.JMenuItem();
		javax.swing.JMenu helpMenu = new javax.swing.JMenu();
		helpContent = new javax.swing.JMenuItem();
		javax.swing.JMenuItem aboutMenuItem = new javax.swing.JMenuItem();
		statusPanel = new javax.swing.JPanel();
		javax.swing.JSeparator statusPanelSeparator = new javax.swing.JSeparator();
		statusMessageLabel = new javax.swing.JLabel();
		statusAnimationLabel = new javax.swing.JLabel();
		progressBar = new javax.swing.JProgressBar();
		jDialog1 = new javax.swing.JDialog();
		jPanel6 = new javax.swing.JPanel();
		jLabel14 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		jLabel19 = new javax.swing.JLabel();
		jLabel21 = new javax.swing.JLabel();
		jLabel22 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel23 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jPanel7 = new javax.swing.JPanel();
		jScrollPane41 = new javax.swing.JScrollPane();
		jTextPane2 = new javax.swing.JTextPane();
		jLabel181 = new javax.swing.JLabel();
		jLabel161 = new javax.swing.JLabel();
		jTextField11 = new javax.swing.JTextField();
		jLabel171 = new javax.swing.JLabel();
		jButton411 = new javax.swing.JButton();
		jFrame1 = new javax.swing.JFrame();
		jPanel8 = new javax.swing.JPanel();
		jLabel24 = new javax.swing.JLabel();
		jLabel25 = new javax.swing.JLabel();
		jLabel26 = new javax.swing.JLabel();
		jLabel27 = new javax.swing.JLabel();
		jLabel28 = new javax.swing.JLabel();
		jLabel29 = new javax.swing.JLabel();
		jLabel30 = new javax.swing.JLabel();
		jLabel31 = new javax.swing.JLabel();
		jLabel32 = new javax.swing.JLabel();
		jLabel33 = new javax.swing.JLabel();
		jLabel34 = new javax.swing.JLabel();
		jPanel9 = new javax.swing.JPanel();
		jScrollPane4 = new javax.swing.JScrollPane();
		jTextPane3 = new javax.swing.JTextPane();
		jLabel18 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel17 = new javax.swing.JLabel();
		jButton4 = new javax.swing.JButton();

		org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application
				.getInstance(salesmanagement.SalesManagementApp.class)
				.getContext().getResourceMap(SalesManagementView.class);
		mainPanel.setBackground(resourceMap.getColor("mainPanel.background")); // NOI18N
		mainPanel.setName("mainPanel"); // NOI18N
		mainPanel.setPreferredSize(new java.awt.Dimension(700, 700));

		jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
		jPanel1.setName("jPanel1"); // NOI18N

		jPanel2.setBackground(resourceMap.getColor("jPanel2.background")); // NOI18N
		jPanel2.setName("jPanel2"); // NOI18N

		jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
		jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
		jLabel1.setName("jLabel1"); // NOI18N

		moneyEarned.setFont(resourceMap.getFont("moneyEarned.font")); // NOI18N
		moneyEarned.setForeground(resourceMap
				.getColor("moneyEarned.foreground")); // NOI18N
		moneyEarned.setText(resourceMap.getString("moneyEarned.text")); // NOI18N
		moneyEarned.setName("moneyEarned"); // NOI18N

		jLabel3.setFont(resourceMap.getFont("jLabel3.font")); // NOI18N
		jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
		jLabel3.setName("jLabel3"); // NOI18N

		timeSpent.setFont(resourceMap.getFont("timeSpent.font")); // NOI18N
		timeSpent.setForeground(resourceMap.getColor("timeSpent.foreground")); // NOI18N
		timeSpent.setText(resourceMap.getString("timeSpent.text")); // NOI18N
		timeSpent.setName("timeSpent"); // NOI18N

		jScrollPane1.setBackground(resourceMap
				.getColor("jScrollPane1.background")); // NOI18N
		jScrollPane1.setName("jScrollPane1"); // NOI18N

		jTable1.setBackground(resourceMap.getColor("jTable1.background")); // NOI18N
		jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jTable1.setFont(resourceMap.getFont("jTable1.font")); // NOI18N
		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { "A", "4000" }, { "B", "3000" },
						{ "C", "6000" }, { "D", "2000" }, { "E", "2000" },
						{ "F", "8000" }, { "G", "4000" }, { "H", "6000" } },
				new String[] { "Customer", "Sales" }) {
			/**
					 * 
					 */
			private static final long serialVersionUID = 1L;
			boolean[] canEdit = new boolean[] { false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jTable1.setEnabled(false);
		jTable1.setName("jTable1"); // NOI18N
		jScrollPane1.setViewportView(jTable1);

		jScrollPane2.setBackground(resourceMap
				.getColor("jScrollPane2.background")); // NOI18N
		jScrollPane2.setName("jScrollPane2"); // NOI18N

		jTable2.setBackground(resourceMap.getColor("jTable2.background")); // NOI18N
		jTable2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jTable2.setFont(resourceMap.getFont("jTable2.font")); // NOI18N
		jTable2.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { "I", "1000" }, { "J", "1000" },
						{ "K", "10000" }, { "L", "12000" }, { "M", "8000" },
						{ "N", "9000" }, { "O", "8000" }, { "P", "10000" } },
				new String[] { "Customer", "Sales" }) {
			/**
					 * 
					 */
			private static final long serialVersionUID = 1L;
			boolean[] canEdit = new boolean[] { false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jTable2.setName("jTable2"); // NOI18N
		jScrollPane2.setViewportView(jTable2);

		ampmLabel.setFont(resourceMap.getFont("ampmLabel.font")); // NOI18N
		ampmLabel.setForeground(resourceMap.getColor("ampmLabel.foreground")); // NOI18N
		ampmLabel.setText(resourceMap.getString("ampmLabel.text")); // NOI18N
		ampmLabel.setName("ampmLabel"); // NOI18N

		messageLabel.setFont(resourceMap.getFont("messageLabel.font")); // NOI18N
		messageLabel.setForeground(resourceMap
				.getColor("messageLabel.foreground")); // NOI18N
		messageLabel.setName("messageLabel"); // NOI18N
		messageLabel.setPreferredSize(new java.awt.Dimension(400, 14));

		jLabel4.setFont(resourceMap.getFont("jLabel4.font")); // NOI18N
		jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
		jLabel4.setName("jLabel4"); // NOI18N

		jLabel5.setFont(resourceMap.getFont("jLabel5.font")); // NOI18N
		jLabel5.setForeground(resourceMap.getColor("jLabel5.foreground")); // NOI18N
		jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
		jLabel5.setName("jLabel5"); // NOI18N

		jLabel6.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
		jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
		jLabel6.setName("jLabel6"); // NOI18N

		jLabel7.setFont(resourceMap.getFont("jLabel7.font")); // NOI18N
		jLabel7.setForeground(resourceMap.getColor("jLabel7.foreground")); // NOI18N
		jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
		jLabel7.setName("jLabel7"); // NOI18N

		jButton38.setText(resourceMap.getString("jButton38.text")); // NOI18N
		jButton38.setName("jButton38"); // NOI18N
		jButton38.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton38MouseClicked(evt);
			}
		});
		jButton38.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton38KeyPressed(evt);
			}
		});

		jButton39.setText(resourceMap.getString("jButton39.text")); // NOI18N
		jButton39.setName("jButton39"); // NOI18N

		jButton40.setText(resourceMap.getString("jButton40.text")); // NOI18N
		jButton40.setName("jButton40"); // NOI18N
		jButton40.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton40MouseClicked(evt);
			}
		});
		jButton40.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton40KeyPressed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																messageLabel,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																558,
																Short.MAX_VALUE)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addGroup(
																								jPanel2Layout
																										.createSequentialGroup()
																										.addGroup(
																												jPanel2Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel1,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																71,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																jLabel6)
																														.addComponent(
																																jLabel4)
																														.addComponent(
																																jLabel3))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												jPanel2Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel7)
																														.addComponent(
																																jLabel5)
																														.addComponent(
																																moneyEarned,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																55,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addGroup(
																																jPanel2Layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				timeSpent,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				41,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(
																																				ampmLabel)))
																										.addGap(34,
																												34,
																												34)))
																		.addComponent(
																				jScrollPane1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				158,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jScrollPane2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				172,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton39,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				111,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton40,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				111,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(
																jButton38,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																111,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap()));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								30,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								moneyEarned,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								22,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								timeSpent,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								25,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								ampmLabel)
																						.addComponent(
																								jLabel3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								24,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGap(18,
																				18,
																				18)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel4)
																						.addComponent(
																								jLabel5))
																		.addGap(18,
																				18,
																				18)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel6)
																						.addComponent(
																								jLabel7))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				22,
																				Short.MAX_VALUE))
														.addGroup(
																jPanel2Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																		.addComponent(
																				jScrollPane2,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				0,
																				0,
																				Short.MAX_VALUE)
																		.addComponent(
																				jScrollPane1,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				181,
																				Short.MAX_VALUE)))
										.addGap(11, 11, 11)
										.addComponent(
												messageLabel,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												40,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(
												jButton38,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												32,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jButton39,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																32,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton40,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																32,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap()));

		jLabel4.setVisible(false);
		jLabel5.setVisible(false);
		jLabel6.setVisible(false);
		jLabel7.setVisible(false);
		jButton38.setVisible(false);
		jButton39.setVisible(false);
		jButton40.setVisible(false);

		jPanel4.setName("jPanel4"); // NOI18N
		jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER,
				30, 30));

		jButton1.setFont(resourceMap.getFont("jButton1.font")); // NOI18N
		jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
		jButton1.setName("jButton1"); // NOI18N
		jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton1MouseClicked(evt);
			}
		});
		jButton1.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				jButton1firstItemGainedFocus(evt);
			}
		});
		jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton1KeyPressed(evt);
			}
		});
		jPanel4.add(jButton1);

		jButton2.setFont(resourceMap.getFont("jButton2.font")); // NOI18N
		jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
		jButton2.setName("jButton2"); // NOI18N
		jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton2MouseClicked(evt);
			}
		});
		jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton2KeyPressed(evt);
			}
		});
		jPanel4.add(jButton2);

		jButton3.setFont(resourceMap.getFont("jButton3.font")); // NOI18N
		jButton3.setText(resourceMap.getString("jButton3.text")); // NOI18N
		jButton3.setName("jButton3"); // NOI18N
		jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton3MouseClicked(evt);
			}
		});
		jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton3KeyPressed(evt);
			}
		});
		jPanel4.add(jButton3);

		jButton5.setMaximumSize(new java.awt.Dimension(39, 23));
		jButton5.setName("jButton5"); // NOI18N
		jButton5.setPreferredSize(new java.awt.Dimension(39, 23));
		jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton5MouseClicked(evt);
			}
		});
		jButton5.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton5KeyPressed(evt);
			}
		});
		jPanel4.add(jButton5);

		jButton6.setFont(resourceMap.getFont("jButton6.font")); // NOI18N
		jButton6.setText(resourceMap.getString("jButton6.text")); // NOI18N
		jButton6.setName("jButton6"); // NOI18N
		jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton6MouseClicked(evt);
			}
		});
		jButton6.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton6KeyPressed(evt);
			}
		});
		jPanel4.add(jButton6);

		jButton7.setFont(resourceMap.getFont("jButton7.font")); // NOI18N
		jButton7.setText(resourceMap.getString("jButton7.text")); // NOI18N
		jButton7.setName("jButton7"); // NOI18N
		jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton7MouseClicked(evt);
			}
		});
		jButton7.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton7KeyPressed(evt);
			}
		});
		jPanel4.add(jButton7);

		jButton8.setName("jButton8"); // NOI18N
		jButton8.setPreferredSize(new java.awt.Dimension(39, 23));
		jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton8MouseClicked(evt);
			}
		});
		jButton8.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton8KeyPressed(evt);
			}
		});
		jPanel4.add(jButton8);

		jButton9.setName("jButton9"); // NOI18N
		jButton9.setPreferredSize(new java.awt.Dimension(39, 23));
		jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton9MouseClicked(evt);
			}
		});
		jButton9.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton9KeyPressed(evt);
			}
		});
		jPanel4.add(jButton9);

		jButton10.setName("jButton10"); // NOI18N
		jButton10.setPreferredSize(new java.awt.Dimension(39, 23));
		jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton10MouseClicked(evt);
			}
		});
		jButton10.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton10KeyPressed(evt);
			}
		});
		jPanel4.add(jButton10);

		jButton11.setFont(resourceMap.getFont("jButton11.font")); // NOI18N
		jButton11.setText(resourceMap.getString("jButton11.text")); // NOI18N
		jButton11.setName("jButton11"); // NOI18N
		jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton11MouseClicked(evt);
			}
		});
		jButton11.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton11KeyPressed(evt);
			}
		});
		jPanel4.add(jButton11);

		jButton12.setFont(resourceMap.getFont("jButton12.font")); // NOI18N
		jButton12.setText(resourceMap.getString("jButton12.text")); // NOI18N
		jButton12.setName("jButton12"); // NOI18N
		jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton12MouseClicked(evt);
			}
		});
		jButton12.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton12KeyPressed(evt);
			}
		});
		jPanel4.add(jButton12);

		jButton13.setName("jButton13"); // NOI18N
		jButton13.setPreferredSize(new java.awt.Dimension(39, 23));
		jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton13MouseClicked(evt);
			}
		});
		jButton13.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton13KeyPressed(evt);
			}
		});
		jPanel4.add(jButton13);

		jButton14.setFont(resourceMap.getFont("jButton14.font")); // NOI18N
		jButton14.setText(resourceMap.getString("jButton14.text")); // NOI18N
		jButton14.setName("jButton14"); // NOI18N
		jButton14.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton14KeyPressed(evt);
			}
		});
		jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton13MouseClicked(evt);
			}
		});
		jPanel4.add(jButton14);

		jButton15.setName("jButton15"); // NOI18N
		jButton15.setPreferredSize(new java.awt.Dimension(39, 23));
		jButton15.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton15KeyPressed(evt);
			}
		});
		jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton13MouseClicked(evt);
			}
		});
		jPanel4.add(jButton15);

		jButton16.setFont(resourceMap.getFont("jButton16.font")); // NOI18N
		jButton16.setText(resourceMap.getString("jButton16.text")); // NOI18N
		jButton16.setName("jButton16"); // NOI18N
		jButton16.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton16KeyPressed(evt);
			}
		});
		jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton13MouseClicked(evt);
			}
		});
		jPanel4.add(jButton16);

		jButton17.setBackground(resourceMap.getColor("jButton17.background")); // NOI18N
		jButton17.setFont(resourceMap.getFont("jButton17.font")); // NOI18N
		jButton17.setForeground(resourceMap.getColor("jButton17.foreground")); // NOI18N
		jButton17.setText(resourceMap.getString("jButton17.text")); // NOI18N
		jButton17.setName("jButton17"); // NOI18N
		jButton17.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton17KeyPressed(evt);
			}
		});
		jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton13MouseClicked(evt);
			}
		});
		jPanel4.add(jButton17);

		jButton18.setName("jButton18"); // NOI18N
		jButton18.setPreferredSize(new java.awt.Dimension(39, 23));
		jButton18.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton18KeyPressed(evt);
			}
		});
		jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton13MouseClicked(evt);
			}
		});
		jPanel4.add(jButton18);

		jButton19.setFont(resourceMap.getFont("jButton19.font")); // NOI18N
		jButton19.setText(resourceMap.getString("jButton19.text")); // NOI18N
		jButton19.setName("jButton19"); // NOI18N
		jButton19.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton19KeyPressed(evt);
			}
		});
		jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton13MouseClicked(evt);
			}
		});
		jPanel4.add(jButton19);

		jButton20.setMaximumSize(new java.awt.Dimension(39, 23));
		jButton20.setName("jButton20"); // NOI18N
		jButton20.setPreferredSize(new java.awt.Dimension(39, 23));
		jButton20.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton20KeyPressed(evt);
			}
		});
		jButton20.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton13MouseClicked(evt);
			}
		});
		jPanel4.add(jButton20);

		jButton21.setName("jButton21"); // NOI18N
		jButton21.setPreferredSize(new java.awt.Dimension(39, 23));
		jButton21.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton21KeyPressed(evt);
			}
		});
		jButton21.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton13MouseClicked(evt);
			}
		});
		jPanel4.add(jButton21);

		jButton22.setName("jButton22"); // NOI18N
		jButton22.setPreferredSize(new java.awt.Dimension(39, 23));
		jButton22.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton22KeyPressed(evt);
			}
		});
		jButton22.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton13MouseClicked(evt);
			}
		});
		jPanel4.add(jButton22);

		jButton23.setName("jButton23"); // NOI18N
		jButton23.setPreferredSize(new java.awt.Dimension(39, 23));
		jButton23.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton23KeyPressed(evt);
			}
		});
		jButton23.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton13MouseClicked(evt);
			}
		});
		jPanel4.add(jButton23);

		jButton24.setFont(resourceMap.getFont("jButton24.font")); // NOI18N
		jButton24.setText(resourceMap.getString("jButton24.text")); // NOI18N
		jButton24.setName("jButton24"); // NOI18N
		jButton24.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton24KeyPressed(evt);
			}
		});
		jButton24.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton13MouseClicked(evt);
			}
		});
		jPanel4.add(jButton24);

		jButton25.setName("jButton25"); // NOI18N
		jButton25.setPreferredSize(new java.awt.Dimension(39, 23));
		jButton25.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton25KeyPressed(evt);
			}
		});
		jButton25.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton13MouseClicked(evt);
			}
		});
		jPanel4.add(jButton25);

		jButton26.setName("jButton26"); // NOI18N
		jButton26.setPreferredSize(new java.awt.Dimension(39, 23));
		jButton26.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton26KeyPressed(evt);
			}
		});
		jButton26.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton13MouseClicked(evt);
			}
		});
		jPanel4.add(jButton26);

		jButton27.setName("jButton27"); // NOI18N
		jButton27.setPreferredSize(new java.awt.Dimension(39, 23));
		jButton27.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton27KeyPressed(evt);
			}
		});
		jButton27.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton13MouseClicked(evt);
			}
		});
		jPanel4.add(jButton27);

		jButton28.setName("jButton28"); // NOI18N
		jButton28.setPreferredSize(new java.awt.Dimension(39, 23));
		jButton28.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton28KeyPressed(evt);
			}
		});
		jButton28.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton13MouseClicked(evt);
			}
		});
		jPanel4.add(jButton28);

		jButton29.setFont(resourceMap.getFont("jButton29.font")); // NOI18N
		jButton29.setText(resourceMap.getString("jButton29.text")); // NOI18N
		jButton29.setName("jButton29"); // NOI18N
		jButton29.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton29KeyPressed(evt);
			}
		});
		jButton29.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton13MouseClicked(evt);
			}
		});
		jPanel4.add(jButton29);

		jButton30.setFont(resourceMap.getFont("jButton30.font")); // NOI18N
		jButton30.setText(resourceMap.getString("jButton30.text")); // NOI18N
		jButton30.setName("jButton30"); // NOI18N
		jButton30.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton30KeyPressed(evt);
			}
		});
		jButton30.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton13MouseClicked(evt);
			}
		});
		jPanel4.add(jButton30);

		jButton31.setFont(resourceMap.getFont("jButton31.font")); // NOI18N
		jButton31.setText(resourceMap.getString("jButton31.text")); // NOI18N
		jButton31.setName("jButton31"); // NOI18N
		jButton31.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton31KeyPressed(evt);
			}
		});
		jButton31.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton13MouseClicked(evt);
			}
		});
		jPanel4.add(jButton31);

		jButton32.setFont(resourceMap.getFont("jButton32.font")); // NOI18N
		jButton32.setText(resourceMap.getString("jButton32.text")); // NOI18N
		jButton32.setName("jButton32"); // NOI18N
		jButton32.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton32KeyPressed(evt);
			}
		});
		jButton32.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton13MouseClicked(evt);
			}
		});
		jPanel4.add(jButton32);

		jButton33.setName("jButton33"); // NOI18N
		jButton33.setPreferredSize(new java.awt.Dimension(39, 23));
		jButton33.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton33KeyPressed(evt);
			}
		});
		jButton33.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton13MouseClicked(evt);
			}
		});
		// jButton33.setRolloverIcon(new
		// ImageIcon(System.getProperty("user.dir") +
		// "/src/salesmanagement/resources/start-icon.jpg"));
		jPanel4.add(jButton33);

		jButton34.setBackground(resourceMap.getColor("jButton34.background")); // NOI18N
		jButton34.setFont(resourceMap.getFont("jButton34.font")); // NOI18N
		jButton34.setForeground(resourceMap.getColor("jButton34.foreground")); // NOI18N
		jButton34.setText(resourceMap.getString("jButton34.text")); // NOI18N
		jButton34.setInheritsPopupMenu(true);
		jButton34.setName("jButton34"); // NOI18N
		jButton34.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton34KeyPressed(evt);
			}
		});
		jButton34.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton13MouseClicked(evt);
			}
		});
		jPanel4.add(jButton34);
		jButton34.requestFocus();

		jButton35.setName("jButton35"); // NOI18N
		jButton35.setPreferredSize(new java.awt.Dimension(39, 23));
		jButton35.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton35KeyPressed(evt);
			}
		});
		jButton35.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton13MouseClicked(evt);
			}
		});
		jPanel4.add(jButton35);

		jButton36.setName("jButton36"); // NOI18N
		jButton36.setPreferredSize(new java.awt.Dimension(39, 23));
		jButton36.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton36KeyPressed(evt);
			}
		});
		jButton36.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton13MouseClicked(evt);
			}
		});
		jPanel4.add(jButton36);

		jButton37.setFont(resourceMap.getFont("jButton37.font")); // NOI18N
		jButton37.setText(resourceMap.getString("jButton37.text")); // NOI18N
		jButton37.setName("jButton37"); // NOI18N
		jButton37.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton37KeyPressed(evt);
			}
		});
		jButton37.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton13MouseClicked(evt);
			}
		});
		jPanel4.add(jButton37);

		jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
		jLabel2.setForeground(resourceMap.getColor("jLabel2.foreground")); // NOI18N
		jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
		jLabel2.setName("jLabel2"); // NOI18N

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(12,
																				12,
																				12)
																		.addComponent(
																				jPanel4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				439,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jPanel2,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(178,
																				178,
																				178)
																		.addComponent(
																				jLabel2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				36,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap()));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jPanel2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																324,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jPanel4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																337,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel2)
										.addGap(74, 74, 74)));

		javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(
				mainPanel);
		mainPanel.setLayout(mainPanelLayout);
		mainPanelLayout.setHorizontalGroup(mainPanelLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				mainPanelLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(jPanel1,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		mainPanelLayout.setVerticalGroup(mainPanelLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				mainPanelLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(jPanel1,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(15, Short.MAX_VALUE)));

		menuBar.setBackground(resourceMap.getColor("menuBar.background")); // NOI18N
		menuBar.setName("menuBar"); // NOI18N

		fileMenu.setBackground(resourceMap.getColor("fileMenu.background")); // NOI18N
		fileMenu.setBorder(new javax.swing.border.MatteBorder(null));
		fileMenu.setText(resourceMap.getString("fileMenu.text")); // NOI18N
		fileMenu.setName("fileMenu"); // NOI18N

		javax.swing.ActionMap actionMap = org.jdesktop.application.Application
				.getInstance(salesmanagement.SalesManagementApp.class)
				.getContext().getActionMap(SalesManagementView.class, this);
		exitMenuItem.setAction(actionMap.get("quit")); // NOI18N
		exitMenuItem.setName("exitMenuItem"); // NOI18N
		fileMenu.add(exitMenuItem);

		menuBar.add(fileMenu);

		helpMenu.setBackground(resourceMap.getColor("helpMenu.background")); // NOI18N
		helpMenu.setText(resourceMap.getString("helpMenu.text")); // NOI18N
		helpMenu.setName("helpMenu"); // NOI18N

		helpContent.setAction(actionMap.get("showGameInstructionBox")); // NOI18N
		helpContent.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_F1, 0));
		helpContent.setText(resourceMap.getString("helpContent.text")); // NOI18N
		helpContent.setName("helpContent"); // NOI18N
		helpMenu.add(helpContent);

		aboutMenuItem.setAction(actionMap.get("showAboutBox")); // NOI18N
		aboutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_A,
				java.awt.event.InputEvent.CTRL_MASK));
		aboutMenuItem.setText(resourceMap.getString("aboutMenuItem.text")); // NOI18N
		aboutMenuItem.setName("aboutMenuItem"); // NOI18N
		helpMenu.add(aboutMenuItem);

		menuBar.add(helpMenu);

		statusPanel.setForeground(resourceMap
				.getColor("statusPanel.foreground")); // NOI18N

		statusPanelSeparator.setName("statusPanelSeparator"); // NOI18N

		statusMessageLabel.setName("statusMessageLabel"); // NOI18N

		statusAnimationLabel
				.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		statusAnimationLabel.setName("statusAnimationLabel"); // NOI18N

		progressBar.setName("progressBar"); // NOI18N

		javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(
				statusPanel);
		statusPanel.setLayout(statusPanelLayout);
		statusPanelLayout
				.setHorizontalGroup(statusPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(statusPanelSeparator,
								javax.swing.GroupLayout.DEFAULT_SIZE, 1065,
								Short.MAX_VALUE)
						.addGroup(
								statusPanelLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(statusMessageLabel)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												895, Short.MAX_VALUE)
										.addComponent(
												progressBar,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(statusAnimationLabel)
										.addContainerGap()));
		statusPanelLayout
				.setVerticalGroup(statusPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								statusPanelLayout
										.createSequentialGroup()
										.addComponent(
												statusPanelSeparator,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												2,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												statusPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																statusMessageLabel)
														.addComponent(
																statusAnimationLabel)
														.addComponent(
																progressBar,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(3, 3, 3)));

		jDialog1.setTitle(resourceMap.getString("jDialog1.title")); // NOI18N
		jDialog1.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
		jDialog1.setName("jDialog1"); // NOI18N

		jPanel6.setBackground(resourceMap.getColor("jPanel6.background")); // NOI18N
		jPanel6.setName("jPanel6"); // NOI18N

		jLabel14.setFont(resourceMap.getFont("jLabel14.font")); // NOI18N
		jLabel14.setText(resourceMap.getString("jLabel14.text")); // NOI18N
		jLabel14.setName("jLabel14"); // NOI18N

		jLabel15.setFont(resourceMap.getFont("jLabel23.font")); // NOI18N
		jLabel15.setText(resourceMap.getString("jLabel15.text")); // NOI18N
		jLabel15.setName("jLabel15"); // NOI18N

		jLabel19.setFont(resourceMap.getFont("jLabel23.font")); // NOI18N
		jLabel19.setText(resourceMap.getString("jLabel19.text")); // NOI18N
		jLabel19.setName("jLabel19"); // NOI18N

		jLabel21.setFont(resourceMap.getFont("jLabel23.font")); // NOI18N
		jLabel21.setText(resourceMap.getString("jLabel21.text")); // NOI18N
		jLabel21.setName("jLabel21"); // NOI18N

		jLabel22.setFont(resourceMap.getFont("jLabel23.font")); // NOI18N
		jLabel22.setText(resourceMap.getString("jLabel22.text")); // NOI18N
		jLabel22.setName("jLabel22"); // NOI18N

		jLabel9.setFont(resourceMap.getFont("jLabel9.font")); // NOI18N
		jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
		jLabel9.setName("jLabel9"); // NOI18N

		jLabel11.setFont(resourceMap.getFont("jLabel9.font")); // NOI18N
		jLabel11.setText(resourceMap.getString("jLabel11.text")); // NOI18N
		jLabel11.setName("jLabel11"); // NOI18N
		jLabel11.setPreferredSize(new java.awt.Dimension(46, 14));

		jLabel10.setFont(resourceMap.getFont("jLabel9.font")); // NOI18N
		jLabel10.setText(resourceMap.getString("jLabel10.text")); // NOI18N
		jLabel10.setName("jLabel10"); // NOI18N
		jLabel10.setPreferredSize(new java.awt.Dimension(46, 14));

		jLabel12.setFont(resourceMap.getFont("jLabel9.font")); // NOI18N
		jLabel12.setText(resourceMap.getString("jLabel12.text")); // NOI18N
		jLabel12.setName("jLabel12"); // NOI18N
		jLabel12.setPreferredSize(new java.awt.Dimension(46, 14));

		jLabel23.setFont(resourceMap.getFont("jLabel23.font")); // NOI18N
		jLabel23.setText(resourceMap.getString("jLabel23.text")); // NOI18N
		jLabel23.setName("jLabel23"); // NOI18N

		jLabel8.setFont(resourceMap.getFont("jLabel9.font")); // NOI18N
		jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
		jLabel8.setName("jLabel8"); // NOI18N
		jLabel8.setPreferredSize(new java.awt.Dimension(46, 14));

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(
				jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout
				.setHorizontalGroup(jPanel6Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel6Layout
										.createSequentialGroup()
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel6Layout
																		.createSequentialGroup()
																		.addGap(22,
																				22,
																				22)
																		.addComponent(
																				jLabel14))
														.addGroup(
																jPanel6Layout
																		.createSequentialGroup()
																		.addGap(43,
																				43,
																				43)
																		.addGroup(
																				jPanel6Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel15)
																						.addComponent(
																								jLabel19)
																						.addComponent(
																								jLabel21)
																						.addComponent(
																								jLabel22)
																						.addComponent(
																								jLabel23))
																		.addGap(36,
																				36,
																				36)
																		.addGroup(
																				jPanel6Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								jLabel9,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								320,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel11,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel10,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel12,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel8,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE))))
										.addContainerGap(7, Short.MAX_VALUE)));
		jPanel6Layout
				.setVerticalGroup(jPanel6Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel6Layout
										.createSequentialGroup()
										.addGap(5, 5, 5)
										.addComponent(jLabel14)
										.addGap(5, 5, 5)
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel15)
														.addComponent(jLabel9))
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel6Layout
																		.createSequentialGroup()
																		.addGap(6,
																				6,
																				6)
																		.addComponent(
																				jLabel19)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jLabel21)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jLabel22)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jLabel23))
														.addGroup(
																jPanel6Layout
																		.createSequentialGroup()
																		.addGap(11,
																				11,
																				11)
																		.addComponent(
																				jLabel11,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jLabel10,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel12,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		jPanel7.setBackground(resourceMap.getColor("jPanel7.background")); // NOI18N
		jPanel7.setName("jPanel7"); // NOI18N

		jScrollPane41.setName("jScrollPane41"); // NOI18N

		jTextPane2.setBackground(resourceMap.getColor("jTextPane2.background")); // NOI18N
		jTextPane2.setEditable(false);
		jTextPane2.setFont(resourceMap.getFont("jTextPane2.font")); // NOI18N
		jTextPane2.setName("jTextPane2"); // NOI18N
		jTextPane2.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jTextPane2KeyPressed(evt);
			}
		});
		jScrollPane41.setViewportView(jTextPane2);

		jLabel181.setFont(resourceMap.getFont("jLabel181.font")); // NOI18N
		jLabel181.setText(resourceMap.getString("jLabel181.text")); // NOI18N
		jLabel181.setName("jLabel181"); // NOI18N

		jLabel161.setFont(resourceMap.getFont("jLabel161.font")); // NOI18N
		jLabel161.setText(resourceMap.getString("jLabel161.text")); // NOI18N
		jLabel161.setName("jLabel161"); // NOI18N

		jTextField11.setBackground(resourceMap
				.getColor("jTextField11.background")); // NOI18N
		jTextField11.setName("jTextField11"); // NOI18N
		jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jTextField11KeyPressed(evt);
			}
		});

		jLabel171.setBackground(resourceMap.getColor("jLabel171.background")); // NOI18N
		jLabel171.setFont(resourceMap.getFont("jLabel171.font")); // NOI18N
		jLabel171.setForeground(resourceMap.getColor("jLabel171.foreground")); // NOI18N
		jLabel171.setName("jLabel171"); // NOI18N
		jLabel171.setPreferredSize(new java.awt.Dimension(40, 14));

		jButton411.setText(resourceMap.getString("jButton411.text")); // NOI18N
		jButton411.setName("jButton411"); // NOI18N
		jButton411.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton411MouseClicked(evt);
			}
		});
		jButton411.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton411KeyPressed(evt);
			}
		});

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(
				jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout
				.setHorizontalGroup(jPanel7Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel7Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel7Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel7Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel161,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				107,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jTextField11,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				59,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				jLabel171,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				333,
																				Short.MAX_VALUE)
																		.addContainerGap())
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel7Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel7Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addGroup(
																								jPanel7Layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jLabel181,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												521,
																												Short.MAX_VALUE))
																						.addComponent(
																								jScrollPane41,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								521,
																								Short.MAX_VALUE))
																		.addContainerGap())))
						.addGroup(
								jPanel7Layout
										.createSequentialGroup()
										.addGap(172, 172, 172)
										.addComponent(
												jButton411,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												179,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(190, Short.MAX_VALUE)));
		jPanel7Layout
				.setVerticalGroup(jPanel7Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel7Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel7Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel7Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jLabel161,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				26,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jTextField11,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				24,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(
																jLabel171,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																23,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addComponent(
												jLabel181,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												26,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane41,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												130,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jButton411)
										.addContainerGap(26, Short.MAX_VALUE)));

		javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(
				jDialog1.getContentPane());
		jDialog1.getContentPane().setLayout(jDialog1Layout);
		jDialog1Layout.setHorizontalGroup(jDialog1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE,
						541, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		jDialog1Layout
				.setVerticalGroup(jDialog1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jDialog1Layout
										.createSequentialGroup()
										.addComponent(
												jPanel6,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel7,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap()));

		jDialog1.setLocationRelativeTo(null);

		jFrame1.setName("jFrame1"); // NOI18N

		jPanel8.setBackground(resourceMap.getColor("jPanel8.background")); // NOI18N
		jPanel8.setName("jPanel8"); // NOI18N

		jLabel24.setFont(resourceMap.getFont("jLabel24.font")); // NOI18N
		jLabel24.setText(resourceMap.getString("jLabel24.text")); // NOI18N
		jLabel24.setName("jLabel24"); // NOI18N

		jLabel25.setFont(resourceMap.getFont("jLabel25.font")); // NOI18N
		jLabel25.setText(resourceMap.getString("jLabel25.text")); // NOI18N
		jLabel25.setName("jLabel25"); // NOI18N

		jLabel26.setFont(resourceMap.getFont("jLabel26.font")); // NOI18N
		jLabel26.setText(resourceMap.getString("jLabel26.text")); // NOI18N
		jLabel26.setName("jLabel26"); // NOI18N

		jLabel27.setFont(resourceMap.getFont("jLabel27.font")); // NOI18N
		jLabel27.setText(resourceMap.getString("jLabel27.text")); // NOI18N
		jLabel27.setName("jLabel27"); // NOI18N

		jLabel28.setFont(resourceMap.getFont("jLabel28.font")); // NOI18N
		jLabel28.setText(resourceMap.getString("jLabel28.text")); // NOI18N
		jLabel28.setName("jLabel28"); // NOI18N

		jLabel29.setFont(resourceMap.getFont("jLabel29.font")); // NOI18N
		jLabel29.setText(resourceMap.getString("jLabel29.text")); // NOI18N
		jLabel29.setName("jLabel29"); // NOI18N

		jLabel30.setFont(resourceMap.getFont("jLabel30.font")); // NOI18N
		jLabel30.setText(resourceMap.getString("jLabel30.text")); // NOI18N
		jLabel30.setName("jLabel30"); // NOI18N
		jLabel30.setPreferredSize(new java.awt.Dimension(46, 14));

		jLabel31.setFont(resourceMap.getFont("jLabel31.font")); // NOI18N
		jLabel31.setText(resourceMap.getString("jLabel31.text")); // NOI18N
		jLabel31.setName("jLabel31"); // NOI18N
		jLabel31.setPreferredSize(new java.awt.Dimension(46, 14));

		jLabel32.setFont(resourceMap.getFont("jLabel32.font")); // NOI18N
		jLabel32.setText(resourceMap.getString("jLabel32.text")); // NOI18N
		jLabel32.setName("jLabel32"); // NOI18N
		jLabel32.setPreferredSize(new java.awt.Dimension(46, 14));

		jLabel33.setFont(resourceMap.getFont("jLabel33.font")); // NOI18N
		jLabel33.setText(resourceMap.getString("jLabel33.text")); // NOI18N
		jLabel33.setName("jLabel33"); // NOI18N

		jLabel34.setFont(resourceMap.getFont("jLabel34.font")); // NOI18N
		jLabel34.setText(resourceMap.getString("jLabel34.text")); // NOI18N
		jLabel34.setName("jLabel34"); // NOI18N
		jLabel34.setPreferredSize(new java.awt.Dimension(46, 14));

		javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(
				jPanel8);
		jPanel8.setLayout(jPanel8Layout);
		jPanel8Layout
				.setHorizontalGroup(jPanel8Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel8Layout
										.createSequentialGroup()
										.addGroup(
												jPanel8Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel8Layout
																		.createSequentialGroup()
																		.addGap(22,
																				22,
																				22)
																		.addComponent(
																				jLabel24))
														.addGroup(
																jPanel8Layout
																		.createSequentialGroup()
																		.addGap(43,
																				43,
																				43)
																		.addGroup(
																				jPanel8Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel25)
																						.addComponent(
																								jLabel26)
																						.addComponent(
																								jLabel27)
																						.addComponent(
																								jLabel28)
																						.addComponent(
																								jLabel33))
																		.addGap(43,
																				43,
																				43)
																		.addGroup(
																				jPanel8Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								jLabel29,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								320,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel30,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel31,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel32,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel34,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE))))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));
		jPanel8Layout
				.setVerticalGroup(jPanel8Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel8Layout
										.createSequentialGroup()
										.addGap(8, 8, 8)
										.addComponent(jLabel24)
										.addGap(8, 8, 8)
										.addGroup(
												jPanel8Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel25)
														.addComponent(jLabel29))
										.addGroup(
												jPanel8Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel8Layout
																		.createSequentialGroup()
																		.addGap(8,
																				8,
																				8)
																		.addComponent(
																				jLabel26)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jLabel27)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jLabel28)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jLabel33))
														.addGroup(
																jPanel8Layout
																		.createSequentialGroup()
																		.addGap(8,
																				8,
																				8)
																		// .addComponent(jLabel30,
																		// javax.swing.GroupLayout.PREFERRED_SIZE,
																		// javax.swing.GroupLayout.DEFAULT_SIZE,
																		// javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jLabel30)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		// .addComponent(jLabel31,
																		// javax.swing.GroupLayout.PREFERRED_SIZE,
																		// javax.swing.GroupLayout.DEFAULT_SIZE,
																		// javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jLabel31)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		// .addComponent(jLabel32,
																		// javax.swing.GroupLayout.PREFERRED_SIZE,
																		// javax.swing.GroupLayout.DEFAULT_SIZE,
																		// javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jLabel32)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		// .addComponent(jLabel34,
																		// javax.swing.GroupLayout.PREFERRED_SIZE,
																		// javax.swing.GroupLayout.DEFAULT_SIZE,
																		// javax.swing.GroupLayout.PREFERRED_SIZE)))
																		.addComponent(
																				jLabel34)))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		jPanel9.setBackground(resourceMap.getColor("jPanel9.background")); // NOI18N
		jPanel9.setName("jPanel9"); // NOI18N

		jScrollPane4.setName("jScrollPane4"); // NOI18N

		jTextPane3.setBackground(resourceMap.getColor("jTextPane3.background")); // NOI18N
		jTextPane3.setEditable(false);
		jTextPane3.setFont(resourceMap.getFont("jTextPane3.font")); // NOI18N
		jTextPane3.setName("jTextPane3"); // NOI18N
		jTextPane3.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jTextPane3KeyPressed(evt);
			}
		});
		jScrollPane4.setViewportView(jTextPane3);

		jLabel18.setFont(resourceMap.getFont("jLabel18.font")); // NOI18N
		jLabel18.setText(resourceMap.getString("jLabel18.text")); // NOI18N
		jLabel18.setName("jLabel18"); // NOI18N

		jLabel16.setFont(resourceMap.getFont("jLabel16.font")); // NOI18N
		jLabel16.setText(resourceMap.getString("jLabel16.text")); // NOI18N
		jLabel16.setName("jLabel16"); // NOI18N

		jTextField1.setBackground(resourceMap
				.getColor("jTextField1.background")); // NOI18N
		jTextField1.setName("jTextField1"); // NOI18N
		jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jTextField1KeyPressed(evt);
			}
		});

		jLabel17.setBackground(resourceMap.getColor("jLabel17.background")); // NOI18N
		jLabel17.setFont(resourceMap.getFont("jLabel17.font")); // NOI18N
		jLabel17.setForeground(resourceMap.getColor("jLabel17.foreground")); // NOI18N
		jLabel17.setName("jLabel17"); // NOI18N
		jLabel17.setPreferredSize(new java.awt.Dimension(40, 14));

		jButton4.setText(resourceMap.getString("jButton4.text")); // NOI18N
		jButton4.setName("jButton4"); // NOI18N
		jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton4MouseClicked(evt);
			}
		});
		jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton4KeyPressed(evt);
			}
		});

		javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(
				jPanel9);
		jPanel9.setLayout(jPanel9Layout);
		jPanel9Layout
				.setHorizontalGroup(jPanel9Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel9Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel9Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jLabel18,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																498,
																Short.MAX_VALUE)
														.addComponent(
																jScrollPane4,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																498,
																Short.MAX_VALUE)
														.addGroup(
																jPanel9Layout
																		.createSequentialGroup()
																		.addGap(162,
																				162,
																				162)
																		.addComponent(
																				jButton4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				179,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				157,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel9Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel16,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				107,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel9Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jTextField1,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								385,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel17,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								385,
																								Short.MAX_VALUE))))
										.addContainerGap()));
		jPanel9Layout
				.setVerticalGroup(jPanel9Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel9Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel9Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel16,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																26,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																24,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jLabel17,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												23,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												29, Short.MAX_VALUE)
										.addComponent(
												jLabel18,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												26,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane4,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												130,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton4)
										.addContainerGap()));

		javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(
				jFrame1.getContentPane());
		jFrame1.getContentPane().setLayout(jFrame1Layout);
		jFrame1Layout.setHorizontalGroup(jFrame1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		jFrame1Layout
				.setVerticalGroup(jFrame1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jFrame1Layout
										.createSequentialGroup()
										.addComponent(
												jPanel8,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel9,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)));

		jFrame1.setVisible(false);

		setComponent(mainPanel);
		setMenuBar(menuBar);
		setStatusBar(statusPanel);
	}// </editor-fold>//GEN-END:initComponents

	private void jButton38MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton38MouseClicked
		// TODO add your handling code here:
		beginDay2();
	}// GEN-LAST:event_jButton38MouseClicked

	private void jButton38KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton38KeyPressed
		// TODO add your handling code here:
		if (10 == evt.getKeyCode())
			beginDay2();
	}// GEN-LAST:event_jButton38KeyPressed

	private void jButton1firstItemGainedFocus(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jButton1firstItemGainedFocus
		// TODO add your handling code here:
		if (imagePainted) {
			jButton34.requestFocusInWindow();
			imagePainted = false;
		}
	}// GEN-LAST:event_jButton1firstItemGainedFocus

	private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton1KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton1;
		if (38 == evt.getKeyCode()) {// up move
			messageLabel.setText("Invalid Move");
		} else if (39 == evt.getKeyCode()) { // right move
			jButton2.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (37 == evt.getKeyCode()) {// left move
			messageLabel.setText("Invalid Move");
		} else if (40 == evt.getKeyCode()) {// down move
			jButton8.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (10 == evt.getKeyCode()) {// Pressed Enter
			performCustomerVisit(jButton1);
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton1KeyPressed

	private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton2KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton2;
		if (38 == evt.getKeyCode()) {// up move
			messageLabel.setText("Invalid Move");
		} else if (39 == evt.getKeyCode()) { // right move
			jButton3.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (37 == evt.getKeyCode()) {// left move
			jButton1.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			jButton9.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (10 == evt.getKeyCode()) {// Pressed Enter
			performCustomerVisit(jButton2);
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton2KeyPressed

	private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton3KeyPressed
		currentFocusCustomer = jButton3;
		if (38 == evt.getKeyCode()) {// up move
			messageLabel.setText("Invalid Move");
		} else if (39 == evt.getKeyCode()) { // right move
			jButton5.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (37 == evt.getKeyCode()) {// left move
			jButton2.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			jButton10.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (10 == evt.getKeyCode()) {// Pressed Enter
			performCustomerVisit(jButton3);
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton3KeyPressed

	private void jButton5KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton5KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton5;
		if (38 == evt.getKeyCode()) {// up move
			messageLabel.setText("Invalid Move");
		} else if (39 == evt.getKeyCode()) { // right move
			jButton6.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (37 == evt.getKeyCode()) {// left move
			jButton3.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			jButton11.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (10 == evt.getKeyCode()) {// Pressed Enter
			performCustomerVisit(jButton5);
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton5KeyPressed

	private void jButton6KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton6KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton6;
		if (38 == evt.getKeyCode()) {// up move
			messageLabel.setText("Invalid Move");
		} else if (39 == evt.getKeyCode()) { // right move
			jButton7.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (37 == evt.getKeyCode()) {// left move
			jButton5.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			jButton12.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (10 == evt.getKeyCode()) {// Pressed Enter
			performCustomerVisit(jButton6);
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton6KeyPressed

	private void jButton7KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton7KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton7;
		if (38 == evt.getKeyCode()) {// up move
			messageLabel.setText("Invalid Move");
		} else if (39 == evt.getKeyCode()) { // right move
			messageLabel.setText("Invalid Move");
		} else if (37 == evt.getKeyCode()) {// left move
			jButton6.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			jButton13.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (10 == evt.getKeyCode()) {// Pressed Enter
			performCustomerVisit(jButton7);
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton7KeyPressed

	private void jButton8KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton8KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton8;
		if (38 == evt.getKeyCode()) {// up move
			jButton1.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			jButton9.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (37 == evt.getKeyCode()) {// left move
			messageLabel.setText("Invalid Move");
		} else if (40 == evt.getKeyCode()) {// down move
			jButton14.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton8KeyPressed

	private void jButton9KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton9KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton9;
		if (38 == evt.getKeyCode()) {// up move
			jButton2.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			jButton10.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (37 == evt.getKeyCode()) {// left move
			jButton8.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			jButton15.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton9KeyPressed

	private void jButton10KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton10KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton10;
		if (38 == evt.getKeyCode()) {// up move
			jButton3.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			jButton11.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (37 == evt.getKeyCode()) {// left move
			jButton9.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			jButton16.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton10KeyPressed

	private void jButton11KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton11KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton11;
		if (38 == evt.getKeyCode()) {// up move
			jButton5.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			jButton12.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (37 == evt.getKeyCode()) {// left move
			jButton10.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			jButton17.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (10 == evt.getKeyCode()) {// Pressed Enter
			performCustomerVisit(jButton11);
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton11KeyPressed

	private void jButton12KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton12KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton12;
		if (38 == evt.getKeyCode()) {// up move
			jButton6.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			jButton13.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (37 == evt.getKeyCode()) {// left move
			jButton11.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			jButton18.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (10 == evt.getKeyCode()) {// Pressed Enter
			performCustomerVisit(jButton12);
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton12KeyPressed

	private void jButton13KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton13KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton13;
		if (38 == evt.getKeyCode()) {// up move
			jButton7.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			messageLabel.setText("Invalid Move");
		} else if (37 == evt.getKeyCode()) {// left move
			jButton12.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			jButton19.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton13KeyPressed

	private void jButton14KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton14KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton14;
		if (38 == evt.getKeyCode()) {// up move
			jButton8.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			jButton15.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (37 == evt.getKeyCode()) {// left move
			messageLabel.setText("Invalid Move");
		} else if (40 == evt.getKeyCode()) {// down move
			jButton20.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (10 == evt.getKeyCode()) {// Pressed Enter
			performCustomerVisit(jButton14);
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton14KeyPressed

	private void jButton15KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton15KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton15;
		if (38 == evt.getKeyCode()) {// up move
			jButton9.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			jButton16.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (37 == evt.getKeyCode()) {// left move
			jButton14.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			jButton21.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton15KeyPressed

	private void jButton16KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton16KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton16;
		if (38 == evt.getKeyCode()) {// up move
			jButton10.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			jButton17.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (37 == evt.getKeyCode()) {// left move
			jButton15.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			jButton22.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (10 == evt.getKeyCode()) {// Pressed Enter
			performCustomerVisit(jButton16);
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton16KeyPressed

	private void jButton17KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton17KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton17;
		if (38 == evt.getKeyCode()) {// up move
			jButton11.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			jButton18.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (37 == evt.getKeyCode()) {// left move
			jButton16.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			jButton23.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (10 == evt.getKeyCode()) {// Pressed Enter
			if (visitedRestaurant) {
				if (!updateTimeForCustomerVisit()) {
					messageLabel.setText("Insufficient Time For Lunch");
				} else {
					messageLabel
							.setText("Lunch Time ..... heading to your favorite restaurant");
					visitedRestaurant = false;
					if (listVisitedCustomers.size() == 16 || hours == 5) {
						endDay1();
					}
				}
			} else {
				messageLabel.setText("You should eat only once a day");
			}
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton17KeyPressed

	private void jButton18KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton18KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton18;
		if (38 == evt.getKeyCode()) {// up move
			jButton12.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			jButton19.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (37 == evt.getKeyCode()) {// left move
			jButton17.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			jButton24.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton18KeyPressed

	private void jButton19KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton19KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton19;
		if (38 == evt.getKeyCode()) {// up move
			jButton13.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			messageLabel.setText("Invalid Move");
		} else if (37 == evt.getKeyCode()) {// left move
			jButton18.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			jButton25.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (10 == evt.getKeyCode()) {// Pressed Enter
			performCustomerVisit(jButton19);
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton19KeyPressed

	private void jButton20KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton20KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton20;
		if (38 == evt.getKeyCode()) {// up move
			jButton14.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			jButton21.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (37 == evt.getKeyCode()) {// left move
			messageLabel.setText("Invalid Move");
		} else if (40 == evt.getKeyCode()) {// down move
			jButton26.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton20KeyPressed

	private void jButton21KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton21KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton21;
		if (38 == evt.getKeyCode()) {// up move
			jButton15.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			jButton22.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (37 == evt.getKeyCode()) {// left move
			jButton20.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			jButton27.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton21KeyPressed

	private void jButton22KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton22KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton22;
		if (38 == evt.getKeyCode()) {// up move
			jButton16.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			jButton23.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (37 == evt.getKeyCode()) {// left move
			jButton21.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			jButton28.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton22KeyPressed

	private void jButton23KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton23KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton23;
		if (38 == evt.getKeyCode()) {// up move
			jButton17.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			jButton24.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (37 == evt.getKeyCode()) {// left move
			jButton22.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			jButton29.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton23KeyPressed

	private void jButton24KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton24KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton24;
		if (38 == evt.getKeyCode()) {// up move
			jButton18.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			jButton25.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (37 == evt.getKeyCode()) {// left move
			jButton23.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			jButton30.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (10 == evt.getKeyCode()) {// Pressed Enter
			performCustomerVisit(jButton24);
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton24KeyPressed

	private void jButton25KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton25KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton25;
		if (38 == evt.getKeyCode()) {// up move
			jButton19.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			messageLabel.setText("Invalid Move");
		} else if (37 == evt.getKeyCode()) {// left move
			jButton24.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			jButton31.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton25KeyPressed

	private void jButton26KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton26KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton26;
		if (38 == evt.getKeyCode()) {// up move
			jButton20.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			jButton27.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (37 == evt.getKeyCode()) {// left move
			messageLabel.setText("Invalid Move");
		} else if (40 == evt.getKeyCode()) {// down move
			jButton32.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton26KeyPressed

	private void jButton27KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton27KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton27;
		if (38 == evt.getKeyCode()) {// up move
			jButton21.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			jButton28.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (37 == evt.getKeyCode()) {// left move
			jButton26.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			jButton33.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton27KeyPressed

	private void jButton28KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton28KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton28;
		if (38 == evt.getKeyCode()) {// up move
			jButton22.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			jButton29.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (37 == evt.getKeyCode()) {// left move
			jButton27.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			jButton34.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton28KeyPressed

	private void jButton29KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton29KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton29;
		if (38 == evt.getKeyCode()) {// up move
			jButton23.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			jButton30.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (37 == evt.getKeyCode()) {// left move
			jButton28.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			jButton35.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (10 == evt.getKeyCode()) {// Pressed Enter
			performCustomerVisit(jButton29);
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton29KeyPressed

	private void jButton30KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton30KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton30;
		if (38 == evt.getKeyCode()) {// up move
			jButton24.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			jButton31.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (37 == evt.getKeyCode()) {// left move
			jButton29.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			jButton36.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (10 == evt.getKeyCode()) {// Pressed Enter
			performCustomerVisit(jButton30);
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton30KeyPressed

	private void jButton31KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton31KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton31;
		if (38 == evt.getKeyCode()) {// up move
			jButton25.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			messageLabel.setText("Invalid Move");
		} else if (37 == evt.getKeyCode()) {// left move
			jButton30.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			jButton37.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (10 == evt.getKeyCode()) {// Pressed Enter
			performCustomerVisit(jButton31);
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton31KeyPressed

	private void jButton32KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton32KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton32;
		messageLabel.setText("");
		if (38 == evt.getKeyCode()) {// up move
			jButton26.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			jButton33.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (37 == evt.getKeyCode()) {// left move
			messageLabel.setText("Invalid Move");
		} else if (40 == evt.getKeyCode()) {// down move
			messageLabel.setText("Invalid Move");
		} else if (10 == evt.getKeyCode()) {// Pressed Enter
			performCustomerVisit(jButton32);
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton32KeyPressed

	private void jButton33KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton33KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton33;
		if (38 == evt.getKeyCode()) {// up move
			jButton27.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			jButton34.requestFocus();
			messageLabel.setText("");
			updateTime();
			// messageLabel.setText("Invalid Move");
		} else if (37 == evt.getKeyCode()) {// left move
			jButton32.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			messageLabel.setText("Invalid Move");
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton33KeyPressed

	private void jButton34KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton34KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton34;
		if (38 == evt.getKeyCode()) {// up move
			jButton28.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			jButton35.requestFocus();
			messageLabel.setText("");
			updateTime();
			// messageLabel.setText("Invalid Move");
		} else if (37 == evt.getKeyCode()) {// left move
			jButton33.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			// jDialog1.setVisible(true);
			messageLabel.setText("Invalid Move");
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton34KeyPressed

	private void jButton35KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton35KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton35;
		if (38 == evt.getKeyCode()) {// up move
			jButton29.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			jButton36.requestFocus();
			messageLabel.setText("");
			updateTime();
			// messageLabel.setText("Invalid Move");
		} else if (37 == evt.getKeyCode()) {// left move
			jButton34.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			messageLabel.setText("Invalid Move");
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton35KeyPressed

	private void jButton36KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton36KeyPressed
		// TODO add your handling code here:
		currentFocusCustomer = jButton36;
		if (38 == evt.getKeyCode()) {// up move
			jButton30.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			jButton37.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (37 == evt.getKeyCode()) {// left move
			jButton35.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			messageLabel.setText("Invalid Move");
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton36KeyPressed

	private void jButton37KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton37KeyPressed
		// TODO add your handling code here:

		currentFocusCustomer = jButton37;
		if (38 == evt.getKeyCode()) {// up move
			jButton31.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (39 == evt.getKeyCode()) { // right move
			messageLabel.setText("Invalid Move");
		} else if (37 == evt.getKeyCode()) {// left move
			jButton36.requestFocus();
			messageLabel.setText("");
			updateTime();
		} else if (40 == evt.getKeyCode()) {// down move
			messageLabel.setText("Invalid Move");
		} else if (10 == evt.getKeyCode()) {// Pressed Enter
			performCustomerVisit(jButton37);
		} else {
			messageLabel.setText("Invalid Move");
		}
	}// GEN-LAST:event_jButton37KeyPressed

	private void jTextPane2KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jTextPane2KeyPressed
		// TODO add your handling code here:
		if (evt.getKeyCode() == 67)
			jButton411.requestFocus();
		// moveBackToGameAfterAnswer();
	}// GEN-LAST:event_jTextPane2KeyPressed

	private void jTextField11KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jTextField11KeyPressed
		// TODO add your handling code here:
		evaluateOptionDisplayPerformanceFeedback(evt);

	}// GEN-LAST:event_jTextField11KeyPressed

	private void jButton411MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton411MouseClicked
		// TODO add your handling code here:
		moveBackToGameAfterAnswer();
	}// GEN-LAST:event_jButton411MouseClicked

	private void jButton411KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton411KeyPressed
		// TODO add your handling code here:
		if (10 == evt.getKeyCode())
			moveBackToGameAfterAnswer();
	}// GEN-LAST:event_jButton411KeyPressed

	private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton1MouseClicked
		// TODO add your handling code here:
		avoidCheatingByMouseClick();
	}// GEN-LAST:event_jButton1MouseClicked

	private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton2MouseClicked
		// TODO add your handling code here:
		avoidCheatingByMouseClick();
	}// GEN-LAST:event_jButton2MouseClicked

	private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton3MouseClicked
		// TODO add your handling code here:
		avoidCheatingByMouseClick();
	}// GEN-LAST:event_jButton3MouseClicked

	private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton5MouseClicked
		// TODO add your handling code here:
		avoidCheatingByMouseClick();
	}// GEN-LAST:event_jButton5MouseClicked

	private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton6MouseClicked
		// TODO add your handling code here:
		avoidCheatingByMouseClick();
	}// GEN-LAST:event_jButton6MouseClicked

	private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton7MouseClicked
		// TODO add your handling code here:
		avoidCheatingByMouseClick();
	}// GEN-LAST:event_jButton7MouseClicked

	private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton8MouseClicked
		// TODO add your handling code here:
		avoidCheatingByMouseClick();
	}// GEN-LAST:event_jButton8MouseClicked

	private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton9MouseClicked
		// TODO add your handling code here:
		avoidCheatingByMouseClick();
	}// GEN-LAST:event_jButton9MouseClicked

	private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton10MouseClicked
		// TODO add your handling code here:
		avoidCheatingByMouseClick();
	}// GEN-LAST:event_jButton10MouseClicked

	private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton11MouseClicked
		// TODO add your handling code here:
		avoidCheatingByMouseClick();
	}// GEN-LAST:event_jButton11MouseClicked

	private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton12MouseClicked
		// TODO add your handling code here:
		avoidCheatingByMouseClick();
	}// GEN-LAST:event_jButton12MouseClicked

	private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton13MouseClicked
		// TODO add your handling code here:
		avoidCheatingByMouseClick();
	}// GEN-LAST:event_jButton13MouseClicked

	private void jButton40MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton40MouseClicked
		// TODO add your handling code here:
		printFinalScores();
	}// GEN-LAST:event_jButton40MouseClicked

	private void jButton40KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton40KeyPressed
		printFinalScores();
	}// GEN-LAST:event_jButton40KeyPressed

	private void jTextPane3KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jTextPane3KeyPressed
		// TODO add your handling code here:
		if (evt.getKeyCode() == 67)
			jButton4.requestFocus();
		// moveBackToGameAfterAnswer();
	}// GEN-LAST:event_jTextPane3KeyPressed

	private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jTextField1KeyPressed
		// TODO add your handling code here:
		evaluateOptionDisplayPerformanceFeedback(evt);
	}// GEN-LAST:event_jTextField1KeyPressed

	private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton4MouseClicked
		// TODO add your handling code here:
		moveBackToGameAfterAnswer();
	}// GEN-LAST:event_jButton4MouseClicked

	private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton4KeyPressed
		// TODO add your handling code here:
		if (10 == evt.getKeyCode())
			moveBackToGameAfterAnswer();
	}// GEN-LAST:event_jButton4KeyPressed

	private void printFinalScores() {
		// TODO add your handling code here:
		PrinterJob printJob = PrinterJob.getPrinterJob();
		printJob.setJobName("Sales Management Score Print");
		printJob.setCopies(1);
		printJob.setPrintable((PrintablePanel) jPanel2);
		if (printJob.printDialog() == false) // choose printer
			return;
		try {
			printJob.print();
		} catch (Exception printException) {
			messageLabel.setText("Error Occurred While Printing");
			printException.printStackTrace();
		}
	}

	private void avoidCheatingByMouseClick() {

		/*
		 * JOptionPane.showMessageDialog(null,
		 * "No Cheating .... Please Use Arrow Keys To Navigate....You will be "
		 * + "directed back to last visited customer","Invalid Move",
		 * JOptionPane.WARNING_MESSAGE);
		 */
		messageLabel
				.setText("Please Use Arrow Keys To Navigate....You will be "
						+ "directed back to current position");
		currentFocusCustomer.requestFocus();
	}

	private void evaluateOptionDisplayPerformanceFeedback(
			java.awt.event.KeyEvent evt) {

		// String optionEntered = jTextField11.getText().trim();
		String optionEntered = jTextField1.getText().trim();
		optionEntered = optionEntered.toUpperCase();
		if (10 == evt.getKeyCode()) {// Pressed Enter

			if (!answerOptionModel.getOptionExplanation().keySet()
					.contains(optionEntered)) {
				jLabel171
						.setText("Invalid Option Entered. Please Enter Again.");
				jLabel17.setText("Invalid Option Entered. Please Enter Again.");
				jLabel171.setVisible(true);
				jLabel17.setVisible(true);
				jTextField11.requestFocus();
				jTextField1.requestFocus();
			} else {
				jLabel181.setVisible(true);
				jLabel18.setVisible(true);

				jTextPane2.setVisible(true);
				jTextPane3.setVisible(true);

				jButton411.setVisible(true);
				jButton4.setVisible(true);

				jLabel171.setText("Your answer is worth "
						+ answerOptionModel.getOptionPrize().get(optionEntered)
						+ " dollars.");
				jLabel17.setText("Your answer is worth "
						+ answerOptionModel.getOptionPrize().get(optionEntered)
						+ " dollars.");
				jLabel171.setVisible(true);
				jLabel17.setVisible(true);

				int positionBeforeSettingText = jTextPane2.getCaretPosition();
				jTextPane2.setText(answerOptionModel.getOptionExplanation()
						.get(optionEntered));
				jTextPane2.setCaretPosition(positionBeforeSettingText);

				int positionBeforeSettingText3 = jTextPane3.getCaretPosition();
				jTextPane3.setText(answerOptionModel.getOptionExplanation()
						.get(optionEntered));
				jTextPane3.setCaretPosition(positionBeforeSettingText3);

				moneyEarned.setText(Integer.parseInt(moneyEarned.getText())
						+ Integer.parseInt(answerOptionModel.getOptionPrize()
								.get(optionEntered)) + "");
				jButton411.requestFocus();
				jButton4.requestFocus();
				// jTextPane2.requestFocus();
				jTextField1.setEnabled(false);
				jTextField11.setEnabled(false);
				// jTextField11.requestFocus();
			}
		}

	}

	private void beginDay2() {
		messageLabel.setText("");
		for (int i = 0; i < jPanel4.getComponentCount(); i++)
			jPanel4.getComponents()[i].setEnabled(true);
		moneyEarned.setText("0");
		hours = 8;
		minutes = 0;
		timeSpent.setText(hours + ":" + "00");
		ampmLabel.setText("A.M.");
		jButton38.setVisible(false);
		// currentFocusCustomer.requestFocus();
		jButton34.requestFocus();

	}

	private void moveBackToGameAfterAnswer() {

		jTextPane2.setText("");
		jTextPane3.setText("");
		jTextField11.setText("");
		jTextField1.setText("");
		jLabel171.setText("");
		jLabel17.setText("");
		jLabel181.setVisible(false);
		jLabel18.setVisible(false);
		jTextPane2.setVisible(false);
		jTextPane3.setVisible(false);
		jDialog1.setVisible(false);
		jFrame1.setVisible(false);
		jButton411.setVisible(false);
		jButton4.setVisible(false);
		currentFocusCustomer.requestFocus();
		if (listVisitedCustomers.size() == 16 || hours == 5) {
			endDay1();
		} else {
			enableGameGridAfterCurrentQuestionAnswered();
		}
	}

	private void performCustomerVisit(JButton tempJButton) {

		boolean tempFlag = false;
		currentFocusCustomer = tempJButton;
		customer = tempJButton.getText().trim();

		for (JButton temp : listVisitedCustomers) {
			if (temp.getText().equalsIgnoreCase(tempJButton.getText())) {
				tempFlag = true;
				break;
			}
		}
		if (tempFlag) {
			messageLabel.setText("You have already visited this customer.");
			return;
		}
		if (!updateTimeForCustomerVisit()) {
			messageLabel
					.setText("Insufficient time left...Please come back again");
			return;
		}
		listVisitedCustomers.add(tempJButton);
		tempJButton.setBackground(new Color(0, 0, 255));
		questionInformationModel = databaseReading
				.getQuestionInformation(customer);

		answerOptionModel = databaseReading.getAnswerOptions(customer);
		updateQuestionInformationPanel();
		disableGameGridUntilCurrentQuestionAnswered();
	}

	/**
	 * Update the Time method This will update the time accordingly after each
	 * and every move
	 */

	private void updateTime() {

		/* logic to increase minures */
		if (minutes < 45) {
			minutes = minutes + 15;
		} else {
			hours = hours + 1;
			minutes = 0;
		}

		/* logic for counting from 1 after reach of 12 */
		if (hours > 12) {
			hours = hours - 12;
		}

		/* logic for changing AM to PM */
		if (hours == 12) {
			ampmLabel.setText("P.M.");
		}

		if (minutes == 0) {
			timeSpent.setText(hours + ":" + "00");
		} else {
			timeSpent.setText(hours + ":" + minutes);
		}

		/* Condition to check if the time is up */
		if (hours == 5) {
			endDay1();
		}

	}

	/**
	 * Update time after the customer visit
	 */

	private boolean updateTimeForCustomerVisit() {

		if (hours == 4 && minutes == 45) {
			return false;
		}

		if (minutes == 15 || minutes == 0) {
			minutes = minutes + 30;
		} else if (minutes == 30) {
			minutes = 0;
			hours = hours + 1;
		} else if (minutes == 45) {
			minutes = 15;
			hours = hours + 1;
		}

		/* logic for counting from 1 after reach of 12 */
		if (hours > 12) {
			hours = hours - 12;
		}

		/* logic for changing AM to PM */
		if (hours == 12) {
			ampmLabel.setText("P.M.");
		}

		if (minutes == 0) {
			timeSpent.setText(hours + ":" + "00");
		} else {
			timeSpent.setText(hours + ":" + minutes);
		}

		return true;

	}

	/**
	 * this method will set the labels from where in player can get the
	 * information of all the questions
	 */
	private void updateQuestionInformationPanel() {
		// jDialog1.setVisible(true);
		// jDialog1.setLocation(160, 170);
		// jDialog1.setSize(550, 500);
		jFrame1.setVisible(true);
		jFrame1.setSize(520, 500);
		// jPanel8.setSize(520, 210);
		jFrame1.setLocation(380, 250);
		jFrame1.setResizable(false);
		jFrame1.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		jFrame1.toFront();
		jFrame1.setState(Frame.NORMAL);
		// jFrame1.requestFocus();

		jLabel9.setText(questionInformationModel.getCustomer());
		jLabel10.setText(questionInformationModel.getChapterName());
		jLabel11.setText(questionInformationModel.getCaseName());
		jLabel12.setText(questionInformationModel.getCaseNumber());
		jLabel8.setText(questionInformationModel.getQuestionNumber());

		jLabel29.setText(questionInformationModel.getCustomer());
		jLabel30.setText(questionInformationModel.getCaseName());
		jLabel31.setText(questionInformationModel.getChapterName());
		jLabel32.setText(questionInformationModel.getCaseNumber());
		jLabel34.setText(questionInformationModel.getQuestionNumber());

		jTextField11.requestFocus();
		jTextField1.requestFocus();
		jLabel171.setVisible(false);
		jLabel17.setVisible(false);
		jLabel181.setVisible(false);
		jLabel18.setVisible(false);
		jTextPane2.setVisible(false);
		jTextPane3.setVisible(false);
		jButton411.setVisible(false);
		jButton4.setVisible(false);
		jTextField11.setEnabled(true);
		jTextField1.setEnabled(true);
		jTextField11.setText("");
		jTextField1.setText("");

	}

	private void endDay1() {

		if (!beginDay2) {

			messageLabel.setText("");
			messageLabel
					.setText(loggedInUser
							+ ", your first day has come to an end. Your score for day 1 was $ "
							+ moneyEarned.getText() + ".");
			day1Score = moneyEarned.getText();
			jLabel4.setVisible(true);
			jLabel5.setText(moneyEarned.getText());
			jLabel5.setVisible(true);
			jButton38.setVisible(true);
			visitedRestaurant = true;
			for (int i = 0; i < jPanel4.getComponentCount(); i++)
				jPanel4.getComponents()[i].setEnabled(false);
			beginDay2 = true;
			jButton38.requestFocus();

		} else {

			day2Score = moneyEarned.getText();
			messageLabel.setText("");
			// messageLabel1.setText("");
			if (listVisitedCustomers.size() == 16) {
				messageLabel
						.setText(loggedInUser
								+ ", you have visited all the customers. Your score for day 2 was $ "
								+ moneyEarned.getText() + ".");
			} else {
				messageLabel
						.setText("<HTML>"
								+ loggedInUser
								+ ", your second day has come to an end. Your score for day 2 was $ "
								+ moneyEarned.getText()
								+ "."
								+ "<br>Your total sales is $ "
								+ (Integer.parseInt(day1Score) + Integer
										.parseInt(day2Score)) + "<br></HTML>");
			}

			jLabel6.setVisible(true);
			jLabel7.setText(moneyEarned.getText());
			jLabel7.setVisible(true);
			// messageLabel1.setText("Your total sales is $ "+
			// Integer.parseInt(day1Score)+Integer.parseInt(day2Score));
			for (int i = 0; i < jPanel4.getComponentCount(); i++)
				jPanel4.getComponents()[i].setEnabled(false);
			moneyEarned.setText(Integer.parseInt(jLabel5.getText())
					+ Integer.parseInt(jLabel7.getText()) + "");
			displayEndGameButton();
			jButton40.setVisible(true);
		}
	}

	private void displayEndGameButton() {

		javax.swing.ActionMap actionMap = org.jdesktop.application.Application
				.getInstance(salesmanagement.SalesManagementApp.class)
				.getContext().getActionMap(SalesManagementView.class, this);
		jButton39.setAction(actionMap.get("quit"));
		jButton39.setText("End Game");
		jButton39.setVisible(true);
		jButton39.requestFocus();

	}

	private void disableGameGridUntilCurrentQuestionAnswered() {
		for (int i = 0; i < jPanel4.getComponentCount(); i++)
			jPanel4.getComponents()[i].setEnabled(false);
	}

	private void enableGameGridAfterCurrentQuestionAnswered() {
		for (int i = 0; i < jPanel4.getComponentCount(); i++)
			jPanel4.getComponents()[i].setEnabled(true);
	}

	private javax.swing.JLabel ampmLabel;
	private javax.swing.JMenuItem helpContent;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton11;
	private javax.swing.JButton jButton12;
	private javax.swing.JButton jButton13;
	private javax.swing.JButton jButton14;
	private javax.swing.JButton jButton15;
	private javax.swing.JButton jButton16;
	private javax.swing.JButton jButton17;
	private javax.swing.JButton jButton18;
	private javax.swing.JButton jButton19;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton20;
	private javax.swing.JButton jButton21;
	private javax.swing.JButton jButton22;
	private javax.swing.JButton jButton23;
	private javax.swing.JButton jButton24;
	private javax.swing.JButton jButton25;
	private javax.swing.JButton jButton26;
	private javax.swing.JButton jButton27;
	private javax.swing.JButton jButton28;
	private javax.swing.JButton jButton29;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton30;
	private javax.swing.JButton jButton31;
	private javax.swing.JButton jButton32;
	private javax.swing.JButton jButton33;
	private javax.swing.JButton jButton34;
	private javax.swing.JButton jButton35;
	private javax.swing.JButton jButton36;
	private javax.swing.JButton jButton37;
	private javax.swing.JButton jButton38;
	private javax.swing.JButton jButton39;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton40;
	private javax.swing.JButton jButton411;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JDialog jDialog1;
	private javax.swing.JFrame jFrame1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel161;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel171;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel181;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel23;
	private javax.swing.JLabel jLabel24;
	private javax.swing.JLabel jLabel25;
	private javax.swing.JLabel jLabel26;
	private javax.swing.JLabel jLabel27;
	private javax.swing.JLabel jLabel28;
	private javax.swing.JLabel jLabel29;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel30;
	private javax.swing.JLabel jLabel31;
	private javax.swing.JLabel jLabel32;
	private javax.swing.JLabel jLabel33;
	private javax.swing.JLabel jLabel34;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private javax.swing.JPanel jPanel9;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JScrollPane jScrollPane41;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable2;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField11;
	private javax.swing.JTextPane jTextPane2;
	private javax.swing.JTextPane jTextPane3;
	private javax.swing.JPanel mainPanel;
	private javax.swing.JMenuBar menuBar;
	private javax.swing.JLabel messageLabel;
	private javax.swing.JLabel moneyEarned;
	private javax.swing.JProgressBar progressBar;
	private javax.swing.JLabel statusAnimationLabel;
	private javax.swing.JLabel statusMessageLabel;
	private javax.swing.JPanel statusPanel;
	private javax.swing.JLabel timeSpent;

	private final Timer messageTimer;
	private final Timer busyIconTimer;
	private final Icon idleIcon;
	private final Icon[] busyIcons = new Icon[15];
	private int busyIconIndex = 0;

	// Defined later on
	private int hours = 8;
	private int minutes = 0;
	private javax.swing.JButton currentFocusCustomer;
	private List<JButton> listVisitedCustomers;
	private String customer;
	private boolean imagePainted = true;
	private boolean visitedRestaurant = true;
	private boolean beginDay2 = false;
	private String day1Score = "";
	private String day2Score = "";
	private String loggedInUser = "";

	// For File Reading
	DatabaseReading databaseReading;
	QuestionInformationModel questionInformationModel;
	QuestionModel questionModel;
	AnswerOptionModel answerOptionModel;

	private JDialog aboutBox;
}
