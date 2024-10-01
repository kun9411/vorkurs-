import java.nio.channels.Pipe;

public class MissionDisk1 {
	
	// ############################################################################################
	// 							        JavaGym: Mission Disk 1
	// ############################################################################################
	

	public static String echo(String s, int anzahl) {
		// Schreibe den String s so oft hintereinander, wie der Parameter anzahl vorgibt.
		// Sie duerfen davon ausgehen, dass anzahl >= 0 ist.
		//
		// Beispiele:
		// ----------
		// s: "Hallo", anzahl: 2 -> Rueckgabewert: "HalloHallo"
		// s: "Echo", anzahl: 0 -> Rueckgabewert: ""
		String result = "";
		for (int i = 0; i < anzahl; i++) {
			result = result + s;
		}
		
		return result;
	}
	
	
	public static boolean genauEins(boolean a, boolean b) {
		// Gibt "true" zurueck genau dann, wenn a erfuellt ist, b jedoch nicht oder b erfuellt
		// ist, a jedoch nicht.
		//
		// Beispiele:
		// ----------
		// a: false, b: false -> Rueckgabewert: false
		// a: false, b: true -> Rueckgabewert: true
		// a: true, b: false -> Rueckgabewert: true
		// a: true, b: true -> Rueckgabewert: false

		return a != b;
	}
		
	
	public static boolean schaltjahr(int x) {
		// Gibt "true" zurueck genau dann, wenn x ein Schaltjahr ist.
		// Sie duerfen davon ausgehen, dass x >= 0 ist.
		//
		// Beispiele:
		// x: 1996 -> Rueckgabewert: true
		// x: 1800 -> Rueckgabewert: false
		// x: 2000 -> Rueckgabewert: true
		//
		// Hinweis:
		// --------
		// Alle ganzzahlig durch 4 teilbaren Jahre sind Schaltjahre. Jahre, die ein Jahrhundert abschliessen,
		// sind keine Schaltjahre, es sei denn, sie sind ganzzahllig durch 400 teilbar.
		
		return (x % 4 == 0 && x % 100 != 0) || (x % 400 == 0);
	}
	
	
	public static int fakultaet(int n) {
		// Berechnet n! = 1 * 2 * 3 * ... * n.
		// Sie duerfen davon ausgehen, dass n >= 0 ist.
		//
		// Beispiele:
		// ----------
		// n: 2 -> Rueckgabewert: 2
		// n: 3 -> Rueckgabewert: 6
		// n: 4 -> Rueckgabewert: 24
		//
		// Tipp:
		// -----
		// n! beschreibt die Anzahl von Moeglichkeiten, wie man n Sachen der Reihe nach anordnen kann.
		// Mit 3 Buechern kann man es noch selbst ausprobieren. Dass 1! = 1 ist, ueberrascht nicht,
		// 0! ist aber auch 1. Es gibt nur eine Moeglichkeit, ein nicht vorhandenes Buch auf den Tisch
		// zu stellen, naemlich es bleiben zu lassen.
		int result = 1;
		if (n == 0) {
			return 1;
		}else {
			for (int i = 1; i <= n; i++) {
				result *= i;
			}
			return result;
		}
	}
	
	
	public static int millionaer(double i) {
		// Liefert die Anzahl an Jahren, die es dauert, bis man mit einem Startkapital von 1 Euro
		// und einem Zinssatz von i zum Millionaer geworden ist.
		//
		// Beispiele:
		// ----------
		// i: 0.03 -> Rueckgabewert: 468
		// i: 0.001 -> Rueckgabewert: 13823
		//
		// Hinweis:
		// --------
		// 3 % wird als 0.03 angegeben usw. 
		double num = 1;
		int year = 0;
		while (num < 1000000) {
			year++;
			num *= (1+i);
			
		}
		
		return year ;
	}
	
	
	public static int potenz(int basis, int exponent) {
		// Gibt "basis hoch exponent" zurueck.
		// Sie duerfen davon ausgehen, dass exponent >= 0 ist.
		//
		// Beispiele:
		// ----------
		// basis: 2, exponent: 3 -> Rueckgabewert: 8
		// basis: -1, exponent: 4 -> Rueckgabewert: 1
		// basis: 10, exponent: 0 -> Rueckgabewert: 1
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= basis;
		}
		
		return result;
	}
	
	
	public static double ungefaehrPi(int anzahlSummanden) {
		// Berechnet die angegebene Zahl von Summanden der folgenden Naeherungsformel fuer Pi:
		// pi = 4 * summe((-1^n)/(2n+1)), n = 0..unendlich (vgl. z. B. Wikipedia).
		// 
		// Beispiele:
		// ----------
		// anzahlSummanden: 1 -> Rueckgabewert: 4.0
		// anzahlSummanden: 10 -> Rueckgabewert: 3.0418396189294032
		// anzahlSummanden: 100 -> Rueckgabewert: 3.1315929035585537
		// 
		// Hinweis:
		// --------
		// Verwenden Sie nicht die oben programmierte Methode, sondern
		// Math.pow(a, b) fuer "a hoch b", diese hat den hier benoetigten Rueckgabetyp "double".
		double pi = 0.0;
		for (int i = 0; i < anzahlSummanden; i++) {
			pi += Math.pow(-1, i)/(2*i+1);
		}
		return pi * 4;
		
	}
	
	
	public static boolean istPrimzahl(int x) {
		// Gibt "true" zurueck genau dann, wenn x eine Primzahl ist.
		// Primzahlen sind alle Zahlen > 1 die nur durch 1 und sich selbst ohne Rest teilbar sind.
		// Sie duerfen davon ausgehen, dass x >= 0 ist.
		//
		// Beispiele:
		// ----------
		// x: 1 -> Rueckgabewert: false
		// x: 2 -> Rueckgabewert: true
		// x: 21 ->	Rueckgabewert: false
		// x: 997 -> Rueckgabewert: true
		if (x <= 1) {
			return false;
		}
		if (x == 2) {
			return true;
		}
		if (x % 2 == 0) {
			return false;
		}
		for (int i = 3; i*i <= x ; i+=2) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static int abrunden(int x, int raster) {
		// Rundet die Zahl x innerhalb des angegebenen Rasters ab.
		//
		// Beispiele:
		// ----------
		// x: 18, raster: 10 -> Rueckgabewert: 10
		// x: 39, raster: 5 -> Rueckgabewert: 35
		// x: 42, raster: 2 -> Rueckgabewert: 42
		//
		// Tipp:
		// -----
		// In einer Zeile loesbar. Verwenden Sie u. a. den %-Operator!
		
		
		return x - (x % raster);
	}
	
	
	public static int quersumme(int x) {
		// Liefert die Quersumme der Zahl x.
		//
		// Beispiele:
		// ----------
		// x: 1341 -> Rueckgabewert: 9
		// x: 33 -> Rueckgabewert: 6  
		// x: 0 -> Rueckgabewert: 0
		int summe = 0;
		x = Math.abs(x);
		while (x > 0) {
			summe += x % 10;
			x = x / 10;
		}
	
		return summe;
	}
	
	
	public static void main(String[] args) {
		// Hier koennen Sie Ihre Methoden testen.
		
		
//	    System.out.println(istPrimzahl(17)); // true
//	    System.out.println(istPrimzahl(997)); // true
//	    System.out.println(istPrimzahl(21)); // false
//	    
//	    
//	    System.out.println(abrunden(18, 10)); // 10
//	    System.out.println(abrunden(39, 5));  // 35
//	    
//	   
//	    System.out.println(quersumme(1341));  // 9
//	    System.out.println(quersumme(-1341)); // 9 
		
		final String alleZeichen = "**ETIANMSURWDKGOHVF*L*PJBXCYZQ**";
		int index = alleZeichen.indexOf("W");
		System.out.println(index);

	}
}