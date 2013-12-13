/**
 * 
 */
package at.fhooe.mc.lbcas.reflectionapi;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import at.fhooe.mc.lbcas.componentcompositionparser.ComponentComposition;
import at.fhooe.mc.lbcas.mediator.CASMediator;
import at.fhooe.mc.lbcas.mediator.MediatorIF;

/**
 * @author Shrikant Havale
 * 
 *         Reflection API Component which loads the components and allows user
 *         to add different components
 * 
 */
public class ReflectionAPIFrame extends JFrame {

	/**
	 * generated serial version id
	 */
	private static final long serialVersionUID = 6467105544183420562L;

	/**
	 * m_content pane Jpanel
	 */
	private JPanel m_contentPane;

	/**
	 * main panel
	 */
	private JPanel m_mainPanel;

	/**
	 * empty label for the alignment
	 */
	private JLabel m_emptyLabelForAlignmentRight;

	/**
	 * panel for check box
	 */
	private JPanel m_centerCheckboxPanel;

	/**
	 * heading component label
	 */
	private JLabel m_headingLabel;

	/**
	 * button panel
	 */
	private JPanel m_bottomButtonPanel;

	/**
	 * add component button
	 */
	private JButton m_addComponentButton;

	/**
	 * empty label for alignment
	 */
	private JLabel m_emptyLabelForAlignmentLeft;

	/**
	 * list of selected string components
	 */
	private Set<String> m_listComponentsSelected = new HashSet<String>();

	/**
	 * mediator interface
	 */
	private MediatorIF m_CASMediator;

	/**
	 * check all button
	 */
	private JButton m_selectAllButton;

	/**
	 * un check all button
	 */
	private JButton m_deselectAllButton;

	/**
	 * close frame button
	 */
	private JButton m_closeFrameButton;

	/**
	 * Constructor dynamically generating the component check box for adding the
	 * components based on the selection
	 * 
	 * @param m_componentCompositionList
	 */
	public ReflectionAPIFrame(
			HashMap<String, ComponentComposition> m_componentCompositionList) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		m_contentPane = new JPanel();
		m_contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		m_contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(m_contentPane);
		setSize(500, 500);
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

		m_mainPanel = new JPanel();
		m_contentPane.add(m_mainPanel, BorderLayout.CENTER);
		m_mainPanel.setLayout(new BorderLayout(0, 0));

		// create the borders
		Border raisedbevel = BorderFactory.createRaisedBevelBorder();
		Border loweredbevel = BorderFactory.createLoweredBevelBorder();
		Border titledBorder = BorderFactory.createTitledBorder(raisedbevel,
				getPanelName(), TitledBorder.LEFT, TitledBorder.CENTER,
				new Font("Tahoma", Font.BOLD | Font.ITALIC, 12)); //$NON-NLS-1$
		m_mainPanel.setBorder(BorderFactory.createCompoundBorder(titledBorder,
				loweredbevel));

		// empty label for the alignment
		m_emptyLabelForAlignmentLeft = new JLabel(
				"                                  ");
		m_mainPanel.add(m_emptyLabelForAlignmentLeft, BorderLayout.WEST);

		// empty label for the alignment
		m_emptyLabelForAlignmentRight = new JLabel(
				"                                  ");
		m_emptyLabelForAlignmentRight.setVisible(false);
		m_mainPanel.add(m_emptyLabelForAlignmentRight, BorderLayout.EAST);

		// center check box panel
		m_centerCheckboxPanel = new JPanel();
		m_mainPanel.add(m_centerCheckboxPanel, BorderLayout.CENTER);
		m_centerCheckboxPanel.setLayout(new GridLayout(
				m_componentCompositionList.size(), 1, 0, 0));

		for (final ComponentComposition componentComposition : m_componentCompositionList
				.values()) {

			final JCheckBox checkBox = new JCheckBox(
					componentComposition.getComponentName());
			checkBox.setEnabled(componentComposition.isShouldLoaded());
			checkBox.addChangeListener(new ChangeListener() {

				@Override
				public void stateChanged(ChangeEvent e) {
					if (checkBox.isSelected()) {
						m_listComponentsSelected.add(componentComposition
								.getM_componentKey());
					} else {
						m_listComponentsSelected.remove(componentComposition
								.getM_componentKey());
					}
				}
			});
			m_centerCheckboxPanel.add(checkBox);
		}

		// heading component
		m_headingLabel = new JLabel("Select the components to be added");
		m_headingLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		m_headingLabel.setHorizontalAlignment(SwingConstants.CENTER);
		m_mainPanel.add(m_headingLabel, BorderLayout.NORTH);

		// button panel
		m_bottomButtonPanel = new JPanel();
		m_mainPanel.add(m_bottomButtonPanel, BorderLayout.SOUTH);
		m_bottomButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		// add component button
		m_addComponentButton = new JButton("Add Component");
		m_bottomButtonPanel.add(m_addComponentButton);
		m_addComponentButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				m_CASMediator = CASMediator.getInstance();
				m_CASMediator
						.communicateSelectedComponents(m_listComponentsSelected);

			}
		});

		// select all component button
		m_selectAllButton = new JButton("Check All");
		m_bottomButtonPanel.add(m_selectAllButton);
		m_selectAllButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				for (Component component : m_centerCheckboxPanel
						.getComponents()) {
					if (component instanceof JCheckBox) {
						if (((JCheckBox) component).isEnabled())
							((JCheckBox) component).setSelected(true);
					}
				}
			}
		});

		// de-select all component button
		m_deselectAllButton = new JButton("Uncheck All");
		m_bottomButtonPanel.add(m_deselectAllButton);
		m_deselectAllButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (Component component : m_centerCheckboxPanel
						.getComponents()) {
					if (component instanceof JCheckBox) {
						if (((JCheckBox) component).isEnabled())
							((JCheckBox) component).setSelected(false);
					}
				}
			}
		});

		// close frame component button
		m_closeFrameButton = new JButton("Close Frame");
		m_bottomButtonPanel.add(m_closeFrameButton);
		m_closeFrameButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// hide the frame
				m_contentPane.getParent().getParent().getParent()
						.setVisible(false);
			}
		});

	}

	private String getPanelName() {
		return "Refelection API Frame";
	}

}
