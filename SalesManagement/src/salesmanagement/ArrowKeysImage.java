/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salesmanagement;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedInputStream;
import java.io.IOException;

/**
 * 
 * @author shrikant
 */
public class ArrowKeysImage extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5029565698741852490L;
	Image image;

	@Override
	public void init() {

		BufferedInputStream imgStream = new BufferedInputStream(getClass()
				.getClassLoader().getResourceAsStream("arrowkeys.JPG"));
		// int count = 0;
		byte buf[] = new byte[75000];
		if (imgStream != null) {
			try {
				imgStream.read(buf);
				imgStream.close();
			} catch (IOException ieo) {
				System.err.println("Couldn't read stream from file: "
						+ ieo.getMessage());
			}
		}

		this.image = Toolkit.getDefaultToolkit().createImage(buf);
	}

	@Override
	public void paint(Graphics screen) {
		screen.drawImage(image, 0, 0, this);
	}

}
