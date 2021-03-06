/*
 * HelpForm.java
 *
 * Created on October 1, 2011, 6:40 PM
 */

package salesmanagement;

/**
 * 
 * @author shrikant
 */
public class HelpFormDuringGame extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2450256483678232860L;

	/** Creates new form HelpForm */
	public HelpFormDuringGame() {
		initComponents();
		setLocationRelativeTo(null);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextPane1 = new javax.swing.JTextPane();
		jLabel1 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setName("FormGame"); // NOI18N
		setResizable(false);

		org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application
				.getInstance(salesmanagement.SalesManagementApp.class)
				.getContext().getResourceMap(HelpFormDuringGame.class);
		jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
		jPanel1.setName("jPanel1"); // NOI18N

		jScrollPane1.setName("jScrollPane1"); // NOI18N

		jTextPane1.setBackground(resourceMap.getColor("jTextPane1.background")); // NOI18N
		jTextPane1.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));
		jTextPane1.setContentType("text/html");
		jTextPane1.setFont(resourceMap.getFont("jTextPane1.font")); // NOI18N
		jTextPane1.setText(resourceMap.getString("jTextPane1.text")); // NOI18N
		jTextPane1.setDisabledTextColor(resourceMap
				.getColor("jTextPane1.disabledTextColor")); // NOI18N
		jTextPane1.setEnabled(false);
		jTextPane1.setName("jTextPane1"); // NOI18N
		jScrollPane1.setViewportView(jTextPane1);
		jTextPane1.setCaretPosition(0);

		jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
		jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
		jLabel1.setName("jLabel1"); // NOI18N

		jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
		jButton1.setName("jButton1"); // NOI18N
		jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton1MouseClicked(evt);
			}
		});
		jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jButton1KeyPressed(evt);
			}
		});

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
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jScrollPane1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																507,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jLabel1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																485,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(17, Short.MAX_VALUE))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap(419, Short.MAX_VALUE)
										.addComponent(
												jButton1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												105,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap()));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(33, 33, 33)
										.addComponent(
												jLabel1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												24,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												449,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												11, Short.MAX_VALUE)
										.addComponent(
												jButton1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												32,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		jPanel1.setVisible(true);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton1MouseClicked
		dispose();
	}// GEN-LAST:event_jButton1MouseClicked

	private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jButton1KeyPressed
		// TODO add your handling code here:
		dispose();
	}// GEN-LAST:event_jButton1KeyPressed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new HelpFormDuringGame().setVisible(true);
			}
		});
		// SalesManagementApp.launch(SalesManagementApp.class,args);
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextPane jTextPane1;
	// End of variables declaration//GEN-END:variables

}
