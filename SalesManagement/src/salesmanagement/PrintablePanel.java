/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package salesmanagement;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

import javax.swing.JPanel;

/**
 * 
 * @author shrikant
 */
public class PrintablePanel extends JPanel implements Printable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4200022381281370134L;

	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex)
			throws PrinterException {
		if (pageIndex >= 1) {// we only print one page
			return Printable.NO_SUCH_PAGE; // ie., end of job
		}
		/* graphics.translate(100, 100); */
		Font f = new Font("Monospaced", Font.PLAIN, 6);
		graphics.setFont(f);
		System.out.print(graphics.getFont());
		paint(graphics);
		return Printable.PAGE_EXISTS;
	}
}
