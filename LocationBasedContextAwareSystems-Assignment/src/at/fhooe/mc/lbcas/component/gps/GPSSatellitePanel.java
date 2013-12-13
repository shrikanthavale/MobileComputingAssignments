package at.fhooe.mc.lbcas.component.gps;

/**
 * Datum: 10. 5. 2006
 * @author Lin Yen-Chia
 * @version 1.6
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

import javax.swing.JPanel;

/**
 * Mit dieser Klasse werden die Positionen der Satelliten in einem Kreis
 * angezeigt, Sowie ihrer ID und SNR. Zusätzlich werden noch SNR Balken der
 * einzelenen Satelliten (bis zu 12) am Ende des Panels gezeichnet.
 * 
 */
public class GPSSatellitePanel extends JPanel implements Observer {
	/**
	 * Für Serializeable
	 */
	private static final long serialVersionUID = -7937316128342798378L;
	NMEAInfo m_info;
	int m_mitteX;
	int m_mitteY;
	double m_r = 0;
	double m_phi = 0;
	double m_a = 0;
	double m_b = 0;
	int m_sx = 0;
	int m_sy = 0;
	Image m_img = null;
	boolean m_tieFighter = false;
	final int m_rand = 20;
	final int m_doppelRand = m_rand * 2;
	int m_viertelX = 0;
	int m_viertelY = 0;
	int m_balkenBreite = 15;

	/**
	 * Erstellt den SatellitenPanel.
	 * 
	 * @param useTieFighter
	 *            Tiefighter werden gezeichnet bei true, bei false die Standard
	 *            Ansicht
	 */
	public GPSSatellitePanel(boolean useTieFighter) {
		super();
		this.m_info = new NMEAInfo();
		m_img = Toolkit.getDefaultToolkit().createImage("tie-fighter_t.png");
		m_tieFighter = useTieFighter;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	public void paintComponent(Graphics _g) {
		super.paintComponent(_g);
		m_mitteX = this.getWidth() >> 1;
		m_mitteY = this.getHeight() >> 1;
		m_viertelX = m_mitteX >> 1;
		m_viertelY = m_mitteY >> 1;

		// g.setColor(Color.white);
		// g.fillRect(0,0,this.getWidth(), this.getHeight());

		// 2 Kreise zeichnen
		_g.setColor(Color.blue);
		_g.drawOval(m_rand, m_rand, this.getWidth() - m_doppelRand,
				this.getHeight() - m_doppelRand);
		_g.drawOval(m_viertelX + 10, m_viertelY + 10, m_mitteX - m_rand,
				m_mitteY - m_rand);

		// Fadenkreuz zeichnen
		_g.drawLine(m_mitteX, m_rand, m_mitteX, this.getHeight() - m_rand);
		_g.drawLine(m_rand, m_mitteY, this.getWidth() - m_rand, m_mitteY);

		// Himmelsrichtung
		_g.drawString("N", m_mitteX - 3, 15);
		_g.drawString("E", this.getWidth() - 15, m_mitteY);
		_g.drawString("S", m_mitteX - 3, this.getHeight() - 5);
		_g.drawString("W", 5, m_mitteY);

		Vector<SatelliteInfo> iter = m_info.getSatinfos();
		SatelliteInfo sat = null;
		// System.out.println(iter.size());
		for (int i = 0; i < iter.size(); i++) {
			sat = (SatelliteInfo) iter.get(i);

			m_r = Math.cos(Math.toRadians(sat.getAngleVertical()))
					* (m_mitteX - m_rand);
			m_phi = sat.getAngleHorizontal() - 90;
			m_a = Math.round(m_r * Math.cos(Math.toRadians(m_phi)));
			m_b = Math.round(m_r * Math.sin(Math.toRadians(m_phi)));

			// System.out.println("SatID: "+sat.getId()+"; VertAngle: "+sat.getAngleVertical()+"; HoriAngle: "+sat.getAngleHorizontal()+"; SNR: "+sat.getSnr());
			// System.out.println("SatID: "+sat.getId()+"; a = "+a+"; b = "+b+"; r = "+r);

			if (sat.isUsed())
				_g.setColor(new Color(0, 200, 0));
			else
				_g.setColor(new Color(64, 64, 255));

			// SNR kleiner als 4 werden Rot dargestellt
			if (sat.getSnr() < 4)
				_g.setColor(Color.RED);

			m_sx = m_mitteX + (int) m_a - 15;
			m_sy = m_mitteY + (int) m_b - 15;

			if (m_tieFighter) {
				_g.drawImage(m_img, m_sx, m_sy, 30, 30, null);
				_g.setColor(Color.black);
				_g.setFont(new Font("Arial", Font.BOLD, 16));
				_g.drawString(
						sat.getId() < 10 ? "0" + sat.getId() : "" + sat.getId(),
						m_sx - 25, m_sy + 20);
				_g.setFont(new Font("Arial", Font.PLAIN, 10));
				_g.drawString("Pew! Pew! (Tie-Fighter)", m_sx + 37, m_sy + 20);
			} else {
				_g.fillOval(m_sx, m_sy, 30, 30);
				_g.drawLine(m_sx - 5, m_sy + 15, m_sx + 34, m_sy + 15);
				_g.drawLine(m_sx - 5, m_sy - 5, m_sx - 5, m_sy + 35);
				_g.drawLine(m_sx + 34, m_sy - 5, m_sx + 34, m_sy + 35);
				_g.setColor(Color.black);
				_g.setFont(new Font("Arial", Font.BOLD, 16));
				_g.drawString(
						sat.getId() < 10 ? "0" + sat.getId() : "" + sat.getId(),
						m_sx + 6, m_sy + 20);
			}

			// SNR Zeichnen
			_g.setFont(new Font("Arial", Font.PLAIN, 10));
			_g.drawString(sat.getSnr() < 10 ? "0" + sat.getSnr() + " dB" : ""
					+ sat.getSnr() + " dB", m_sx, m_sy + 40);

			// SNR Balken von alle Satelliten zeichnen
			this.drawSNRBalken(_g);
		}
	}

	/**
	 * Zeichnet die SNR Balken von alle Satelliten. Satelliten 1-6 links unten
	 * und 7-12 rechts unten.
	 * 
	 * @param _g
	 *            Graphics Objekt
	 */
	public void drawSNRBalken(Graphics _g) {
		Vector<SatelliteInfo> iter = m_info.getSatinfos();
		SatelliteInfo sat = null;
		int snr = 0;
		float factor = 0; // Skalierungsfaktor
		int startX = 0;
		int rechtsX = this.getWidth() - m_rand;
		for (int i = 0; i < iter.size(); i++) {
			_g.setColor(Color.BLACK);
			sat = iter.get(i);
			if (i < 6) {
				startX = m_rand * i;
			} else {
				startX = rechtsX - m_rand * (i - 6);
			}
			snr = sat.getSnr();
			factor = snr / 70f;

			// Satelliten ID zeichnen
			_g.drawString(
					sat.getId() < 10 ? "0" + sat.getId() : "" + sat.getId(),
					startX + 2, this.getHeight() - 10);

			// SNR Balken zeichnen
			_g.drawRect(startX, this.getHeight() - 20 - snr, m_balkenBreite,
					snr);
			_g.setColor(new Color(1 - factor, factor, 0));
			_g.fillRect(startX, this.getHeight() - 20 - snr, m_balkenBreite,
					snr);
		}
		_g.setColor(Color.blue);
		_g.drawString("ID", m_rand * 6, this.getHeight() - 10);
		_g.drawString("ID", startX - m_balkenBreite, this.getHeight() - 10);
		_g.drawString("SNR", m_rand * 3 - 15, this.getHeight() - 80);
		_g.drawString("SNR", rechtsX - m_rand * 2 + 7, this.getHeight() - 80);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(Observable o, Object arg) {
		// von Observer Pattern
		if (m_info != null)
			m_info = (NMEAInfo) arg;
		this.repaint();
	}
}
