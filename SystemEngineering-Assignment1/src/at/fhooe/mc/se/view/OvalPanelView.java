package at.fhooe.mc.se.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import at.fhooe.mc.se.model.CustomMouseModel;

public class OvalPanelView extends JPanel {
	/**
	 * Generated Serial Version ID
	 */
	private static final long serialVersionUID = -4447239673624611434L;

	/**
	 * Mouse event listener for text association
	 */
	private CustomMouseModel customMouseModel = new CustomMouseModel();

	/**
	 * 
	 * @param xPositionComponent
	 * @param yPositionComponent
	 */
	public OvalPanelView(int xPositionComponent, int yPositionComponent) {
		super();
		this.setLayout(new BorderLayout());
		this.setBounds(xPositionComponent, yPositionComponent, 100, 100);
		this.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.setBorder(new RoundedBorder(20));
		JTextField textField = new JTextField();
		textField.setBounds(0, 25, 100, 50);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setText("Enter State");
		this.add(textField, BorderLayout.CENTER);
		this.addMouseListener(customMouseModel);
		this.addMouseMotionListener(customMouseModel);

	}

	class RoundedBorder implements Border {
		int radius;

		RoundedBorder(int radius) {
			this.radius = radius;
		}

		public Insets getBorderInsets(Component c) {
			return new Insets(this.radius + 1, this.radius + 1,
					this.radius + 2, this.radius);
		}

		public boolean isBorderOpaque() {
			return true;
		}

		public void paintBorder(Component c, Graphics g, int x, int y,
				int width, int height) {
			g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
		}
	}

}