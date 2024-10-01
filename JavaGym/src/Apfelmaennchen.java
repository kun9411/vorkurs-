import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class Apfelmaennchen extends JFrame {
	//		 ==============
	
	private static final long serialVersionUID = 1271937545529412683L;

	public Apfelmaennchen() {
		// Fenster initialisieren
		
		setSize(640, 480);
		setResizable(false);
		setTitle("Apfelmaennchen");
		
		addWindowListener(new WindowAdapter() {
			// beim Klick auf "Schliessen" Programm beenden
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}	
	
	public int checkIter(double c_re, double c_im, double max_betrag2, int max_iter) {
		// Liefert die Anzahl der Iterationen, bei der festfestellt wird,
		// dass die Folge z(n) mit dem entsprechenden Wert c gegen Unendlich divergiert.
		//
		// Realteil und Imaginaerteil von c werden als c_re und c_im uebergeben.
		// Die Methode soll bei max_iter abbrechen (dann wird unterstellt, dass die Folge beschraenkt bleibt).
		// Divergenz gegen Unendlich soll festgestellt werden, wenn das Quadrat des Betrags von z(n) groesser als max_betrag2 ist.
		
		double z_re = 0.0;
		double z_im = 0.0;
		
		for (int iter = 0; iter < max_iter; iter++) {
			double betrag2 = z_re*z_re + z_im*z_im;
			
			if (betrag2 > max_betrag2) {
				return iter;
			}
			double new_z_re = z_re*z_re - z_im*z_im + c_re;
			double new_z_im = 2*z_re*z_im + c_im;
			
			z_re = new_z_re;
			z_im = new_z_im;
		}
		return max_iter; // Diese Zeile bitte durch Ihre Loesung ersetzen!
	}

	Color getEGAColor(int index) {
		// liefere die Farbe der Standard-EGA-Palette mit dem angegebenen Index
		
		switch (index) {
			case 0:  return new Color(0   ,    0,    0);
			case 1:  return new Color(0   ,    0, 0xAA);
			case 2:  return new Color(0   , 0xAA,    0);
			case 3:  return new Color(0   , 0xAA, 0xAA);
			case 4:  return new Color(0xAA,    0,    0);
			case 5:  return new Color(0xAA,    0, 0xAA);
			case 6:  return new Color(0xAA, 0x55,    0);
			case 7:  return new Color(0xAA, 0xAA, 0xAA);
			case 8:  return new Color(0x55, 0x55, 0x55);
			case 9:  return new Color(0x55, 0x55, 0xFF);
			case 10: return new Color(0x55, 0xFF, 0x55);
			case 11: return new Color(0x55, 0xFF, 0xFF);
			case 12: return new Color(0xFF, 0x55, 0x55);
			case 13: return new Color(0xFF, 0x55, 0xFF);
			case 14: return new Color(0xFF, 0xFF, 0x55);
			case 15: return new Color(0xFF, 0xFF, 0xFF);
			default: return Color.BLACK;
		}
	}
	  
	@Override
	public void paint(Graphics g) {
		// zeichne die Mandelbrot-Menge
		
		final double re_min = -2.2, re_max = 1, im_min = -1.2, im_max = 1.2; // betrachteter Ausschnitt der gaussschen Zahlenebene
		final int max_iter = 300;  // Anzahl Iterationen, bei der abgebrochen werden soll (gerne auch mal einstellige Werte ausprobieren)
		final double max_betrag2 = 4; // Quadrat des Betrags von z(n), bei dem Divergenz gegen Unendlich festgestellt werden soll (mindestens 4)
		
		double c_re, c_im; // die Zahl c (Realteil und Imaginaerteil getrennt)
		int iter; 		   // Anzahl Iterationen bei der festgestellt wurde, dass Folge gegen Unendlich strebt
		int farbe; 		   // zum Einfaerben der Bildpunkte je nach Wert von "iter"
			
		int x_pixels = getWidth() - getInsets().left - getInsets().right; 	// horizontalen Fensterrahmen abziehen
		int y_pixels = getHeight() - getInsets().top - getInsets().bottom;	// vertikalen Fensterrahmen abziehen
		
		g.translate(getInsets().left, getInsets().top); 		    // linke obere Ecke verschieben
		
		for (int y = 0; y < y_pixels; y++) { 						 // fuer alle Zeilen des Bildes
			c_im = im_min + (im_max - im_min) * y/y_pixels; 		 // berechne zugehoerigen Imaginaerteil von c
			for (int x = 0; x < x_pixels; x++) { 					 // fuer alle Spalten des Bildes
				c_re = re_min + (re_max - re_min) * x/x_pixels; 	 // berechne zugehoerigen Realteil von c
				iter = checkIter(c_re, c_im, max_betrag2, max_iter); // pruefe, wann die Iteration abbricht
				farbe = (iter < max_iter ? (iter % 15) + 1 : 0);	 // faerbe Pixel entsprechend
				g.setColor(getEGAColor(farbe));
				g.drawLine(x, y, x, y); 							 // (es gibt kein "drawPoint" in AWT)
			}
		}
	}
	
	public static void main(String[] args) {
		// zeige das Fenster an
		
		new Apfelmaennchen().setVisible(true);
	}
}