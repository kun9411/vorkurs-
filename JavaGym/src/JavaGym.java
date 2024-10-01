import java.util.Iterator;

public class JavaGym {
	
	// ############################################################################################
	// 							  Willkommen im Java-Fitnessstudio! :-)
	// ############################################################################################
	//
	//										  .:ldddo:.                                   
	//										.cKWWMMWMWKc                                  
	//			   .'.                      :XWWMWWMMWWX:                      ...        
	//			.;;xNO'                     :NWWMMMWWMMN:                     'ONx;;.     
	//			cNO0M0'                     .oNWMMMMMMNo.                     ,0M0OWx.    
	//			cNO0MK:...............ckd,...'ck0KKK0kc'...,dkc...............cKM0OWx.    
	//			cNO0MNkdddddddddddodokNMNdlOKXXKKKKKXXXXKOcdNMNkodddddddddddodkNM0OWx.    
	//			cNO0M0,             cNWWk:oKWWWWWWWWWWWWWKo:kWWXc             ,KM0OWx.    
	//			:KkOM0'            .kWWWXNMWWMMWWMMMWMWWMMWNXWWWx.            ,0MOkXo.    
	//			 ..lOd.            .dWWWWN0KWWWWMWMMWMMMWK0NWWWWd.            .dOl...     
	//								.:llc'.oMWWWWWWMWWWMWo.'cll;.                         
	//									   dMMWWWWWWWWWMWo                                
	//									   oWMMMWWWWWWWWWo                                
	//									   oWMMMMWWWMMWWWo                                
	// 									   oMMWMWMMWWMMWMo                                
	// 									   dMWWMWMWWMWMMMd                                
	//									  .kMWWMNKOKWWWWWk.                               
	//									  ,KWWWMO' 'OWWWWK,                               
	//									  :NMWWMx. .xWWWMN:                               
	//									  oWWWMWl   lWMWMWo                               
	//									 .kMWWMX;   ;XWWWMk.                              
	//									 '0MWWWO'   '0WWWM0'                              
	//									 :NMWWMx.   .xMWWMN:                              
	//									 oWMWMWl     lWMWMWo                              
	//									.kMWWMX;     ;XMWWMk.                             
	//									'0WWWM0'     '0WWWW0'                             
	//									,KWWWWx.     .xWWWWK,                             
	//									 :k0Od.       'dO0k:                              
	//									   .             .                          	
	//
	// ############################################################################################
	
	
	
	// <1>-<1> - Hanteln
	// =================
	
	public static int vierundzwanzig() {
		// Gibt den Wert 24 zurueck.
		
		return 24; // Bitte ersetzen Sie diese Zeile durch Ihre Loesung.
	}

	
	public static int plus1(int x) {
		// Gibt den Wert x+1 zurueck.
		
		return x+1; // Bitte ersetzen Sie diese Zeile durch Ihre Loesung.
	}

	
	
	// <2>-<2> - Hanteln
	// =================
	
	public static int aendereVorzeichen(int x) {
		// Aendert das Vorzeichen von x. 
		//
		// Beispiele:
		// ----------
		// x: 5 -> Rueckgabewert: -5
		// x: -8 -> Rueckgabewert: 8
		// x: 0 -> Rueckgabewert: 0
		//
		// Tipp:
		// -----
		// Ueberlegen Sie, mit welchem Wert man eine Zahl multiplizieren muss, um das Vorzeichen
		// umzukehren.
		
		return x * -1; // Bitte ersetzen Sie diese Zeile durch Ihre Loesung.
	}
	
	
	public static double dollar(double betragEuro) {
		// Rechnet einen Euro-Betrag in US-Dollar um. Der Wechselkurs ist als Konstante
		// schon vorgegeben: 1 Euro sind 1.19 US-Dollar.
		//
		// Beispiele:
		// ----------
		// betragEuro: 1 -> Rueckgabewert: 1.19
		// betragEuro: 5 -> Rueckgabewert: 5.95
		// betragEuro: 0 -> Rueckgabewert: 0
		//
		// Tipp:
		// -----
		// Multiplizieren Sie den Euro-Betrag mit dem vorgegebenen Wechselkurs.
		
		final double wechselkurs = 1.19; // Diese Zeile bitte nicht veraendern!
		
		return betragEuro * wechselkurs; // Bitte ersetzen Sie diese Zeile durch Ihre Loesung.
	}
	
	
	public static double wechselgeld(double preis, double bezahlt) {
		// Als Parameter uebergeben werden der Preis eines fiktiven Artikels bei Karstadt oder
		// sonstwo und der vom Kunden an der Kasse bezahlte Betrag, beides Euro. Die Methode
		// liefert das auszuzahlende Wechselgeld, ebenfalls in Euro.
		//
		// Beispiele:
		// ----------
		// preis: 0.50, bezahlt: 0.50 -> Rueckgabewert: 0
		// preis: 4.90, bezahlt: 5.00 -> Rueckgabewert: 0.10
		// preis: 5.99, bezahlt: 11.00 -> Rueckgabewert: 5.01

		return bezahlt - preis; // Bitte ersetzen Sie diese Zeile durch Ihre Loesung.
	}
	
	
	
	// <5>-<5> - Hanteln
	// =================

	public static int betrag(int x) {
		// Liefert den Betrag von x ("den Abstand zur 0").
		//
		// Beispiele:
		// ----------
		// x: 4 -> Rueckgabewert: 4
		// x: -5 -> Rueckgabewert: 5
		// x: 0 -> Rueckgabewert: 0
		//
		// Tipp:
		// -----
		// Verwenden Sie eine Fallunterscheidung (if..else).
		return x >= 0 ? x : -x;
		
		// Bitte ersetzen Sie diese Zeile durch Ihre Loesung.
	}

	
	public static boolean istEinstellig(int x) {
		// Liefert true, falls x eine einstellige Zahl ist.
		//
		// Beispiele:
		// ----------
		// x: 0 -> Rueckgabewert: true
		// x: -4 -> Rueckgabewert: true
		// x: 15 -> Rueckgabewert: false
		//
		// Tipp:
		// -----
		// Einstellige Zahlen sind groesser als -10 UND kleiner als 10.
		return x > -10 && x < 10;
		 // Bitte ersetzen Sie diese Zeile durch Ihre Loesung.
	}

	
	public static double celsius(double fahrenheit) {
		// Rechnet eine in Fahrenheit angegebene Temperatur nach Grad Celsius um.
		//
		// Beispiele:
		// ----------
		// fahrenheit: 32 -> Rueckgabewert: 0
		// fahrenheit: 86 -> Rueckgabewert: 30
		// fahrenheit: -40 -> Rueckgabewert: -40
		//
		// Tipp:
		// -----
		// Die Umrechnungsformel von Fahrenheit nach Celsius lautet: c = 5*(f-32)/9.
		
		return 5*(fahrenheit-32)/9; // Bitte ersetzen Sie diese Zeile durch Ihre Loesung.
	}
	
	
	public static double bmi(double kg, double groesse) {
		// Berechnet den Body-Mass-Index (BMI) aus dem in kg angegebenen Gewicht und der
		// in m angegebenen Koerpergroesse.
		
		// Beispiele:
		// ----------
		// kg: 100, groesse: 2.0 -> Rueckgabewert: 25
		// kg: 78, groesse: 1.84 -> Rueckgabewert: ~23,03875
		//
		// Tipp:
		// -----
		// Die BMI-Formel lautet: Gewicht in Kilogramm geteilt durch Koerpergroesse in Metern
		// zum Quadrat. 
		
		return kg/(groesse*groesse); // Bitte ersetzen Sie diese Zeile durch Ihre Loesung.
	}
	
	
	public static int montagekosten(int arbeitsstunden) {
		// Liefert die Montagekosten bei Beauftragung eines Handwerkers. Die Anfahrt kostet
		// pauschal 40 Euro, jede angefangene Arbeitsstunde zusaetzlich 50 Euro. Beide Werte
		// sind als Konstanten bereits im Programm vorgegeben.
		//
		// Beispiele:
		// ----------
		// arbeitsstunden: 2 -> Rueckgabewert: 140 (40+2*50)
		// arbeitsstunden: 7 -> Rueckgabewert: 390 (40+7*50)
		//
		// Tipp:
		// -----
		// Orientieren Sie sich an den Beispielen und verwenden Sie statt den Zahlwerten die
		// Namen der entsprechenden Variablennamen bzw. Konstanten.
		
		final int kostenAnfahrt = 40; // Diese Zeile bitte nicht veraendern!
		final int stundensatz = 50; // Diese Zeile bitte nicht veraendern!
		
		return kostenAnfahrt + arbeitsstunden*stundensatz; // Bitte ersetzen Sie diese Zeile durch Ihre Loesung.
	}
	
	
	public static String preisstufe(int stationen) {
		// Berechnet die Preisstufe (A, B, C oder D) nach einem fiktiven, stark vereinfachten 
		// Strassenbahntarif.
		//
		// Regeln:
		// -------
		// weniger als 5 Stationen -> Rueckgabewert: "A"
		// 5 bis 9 Stationen -> Rueckgabewert: "B"
		// 10 bis 14 Stationen -> Rueckgabewert: "C"
		// 15 und mehr Stationen -> Rueckgabewert: "D"
		//
		// Tipp:
		// -----
		// Verwenden Sie eine Fallunterscheidung mit mehreren else..if-Zweigen.
		if (stationen < 5) {
			return "A";
		}else if (stationen >= 5 && stationen <= 9) {
			return "B";
		}else if (stationen >= 10 && stationen <= 14) {
			return "C";
		}else {
			return "D";
		}
		
		// Bitte ersetzen Sie diese Zeile durch Ihre Loesung.
	}


	public static double kassenzettel(int anzahlPaketeNudeln, int anzahlPaketeButter, int anzahlPaketeEier) {
		// Liefert den Gesamtpreis in Euro beim Kauf einer bestimmten Anzahl von Lebensmitteln. Diese
		// Mengen werden als Parameter uebergeben. Die jeweiligen Preise sind als Konstanten schon
		// im Programm vorgegeben.
		
		final double preisNudeln = 0.49; // Preis fuer 500 g Spaghetti, diese Zeile bitte nicht veraendern!
		final double preisButter = 1.79; // Preis fuer 250 g Butter, diese Zeile bitte nicht veraendern!
		final double preisEier = 1.55; // Preis fuer 6 Bio-Eier, diese Zeile bitte nicht veraendern!
		
		return anzahlPaketeNudeln*preisNudeln + anzahlPaketeButter*preisButter + anzahlPaketeEier*preisEier; // Bitte ersetzen Sie diese Zeile durch Ihre Loesung.
	}
	
	
	public static int flaecheninhalt(int x1, int x2, int y1, int y2) {
		// Liefert den Flaecheninhalt eines Rechtecks. Als Parameter uebergeben werden die
		// beiden Eckpunkte (x1|y1) und (x2|y2) als Einzelkoordinaten x1, x2, y1, y2.
		//
		// Beispiele:
		// ----------
		// x1: 3, x2: 8, y1: 1, y2: 6 -> Rueckgabewert 25
		//
		// Tipp:
		// -----
		// Let me google that for you... :-)
		
		return Math.abs(x2-x1)*Math.abs(y2-y1); // Bitte ersetzen Sie diese Zeile durch Ihre Loesung.
	}
	
	
	public static boolean istZweistellig(int x) {
		// Liefert true, falls x eine zweistellige Zahl ist.
		//
		// Beispiele:
		// ----------
		// x: 99 -> Rueckgabewert: true
		// x: -180 -> Rueckgabewert: false
		// x: 5 -> Rueckgabewert: false
		//
		// Tipp:
		// -----
		// Zweistellige Zahlen sind groesser als -100 UND kleiner als 100 UND NICHT einstellig!
		return (x >= 10 && x < 100) || (x <= -10 && x > -100 );
		 // Bitte ersetzen Sie diese Zeile durch Ihre Loesung. 
	}
	
	
	public static int wartezeit(int stunden, int minuten) {
		// Liefert die Wartezeit auf den Bus. Dieser moege um Voll und um Halb abfahren. In den
		// beiden Parametern wird die Uhrzeit uebergeben, zu der wir an der Haltestelle ankommen.
		//
		// Beispiele:
		// ----------
		// stunden: 8, minuten: 27 -> Rueckgabewert: 3
		// stunden: 9, minuten: 0 -> Rueckgabewert: 0
		// stunden: 8, minuten: 44 -> Rueckgabewert: 16
		//
		// Tipp:
		// -----
		// Bisschen Nachdenken erforderlich. Unterscheiden Sie die drei Faelle: Ankunft genau
		// um Voll, Ankunft zwischen Voll und Halb, Ankunft zwischen Halb und Voll (if..else-if..else).
		if (minuten==0 || minuten==30) {
			return 0;
		}else if (minuten>0 && minuten<30) {
			return 30 - minuten;
		}else {
			return 60 - minuten;
		}
		
		// Bitte ersetzen Sie diese Zeile durch Ihre Loesung.
	}
	
	
	
	// <10>-<10> - Hanteln
	// ===================
	
	public static int summeBis(int n) {
		// Liefert die Summe der Zahlen von 1 bis n.
		//
		// Beispiele:
		// ----------
		// n: 1 -> Rueckgabewert: 1
		// n: 2 -> Rueckgabewert: 3 (1+2)
		// n: 3 -> Rueckgabewert: 6 (1+2+3)
		//
		// Tipp:
		// -----
		// Verwenden Sie eine for- oder while-Schleife.
		int summe = 0;
		for (int i = 0; i <= n; i++) {
			summe += i;
		}
		return summe;
		
		// Bitte ersetzen Sie diese Zeile durch Ihre Loesung.
	}
	
	
	public static int summeAbisB(int a, int b) {
		// Liefert die Summe aller Zahlen von a bis b. Sie duerfen davon ausgehen, dass a und b
		// positive Zahlen sind und dass b >= a gilt.
		//
		// Beispiele:
		// ----------
		// a: 1, b: 5 -> Rueckgabewert: 15 (1+2+3+4+5)
		// a: 3, b: 6 -> Rueckgabewert: 18 (3+4+5+6)
		// a: 7, b: 7 -> Rueckgabewert: 7
		//
		// Tipp:
		// -----
		// Verwenden Sie eine for- oder while-Schleife.
		int summe = 0;
		for (int i = a; i <= b; i++) {
			summe += i;
		}
		
		return summe; // Bitte ersetzen Sie diese Zeile durch Ihre Loesung.
	}
	
	
	public static int summeGeradeZahlenBis(int n) {
		// Liefert die Summe aller geraden Zahlen von 2 bis n. Sie duerfen davon ausgehen,
		// dass n >= 0 ist.
		//
		// Beispiele:
		// ----------
		// n: 1 -> Rueckgabewert: 0
		// n: 4 -> Rueckgabewert: 6 (2+4)
		// n: 7 -> Rueckgabewert: 12 (2+4+6)
		//
		// Tipp:
		// ------
		// Verwenden Sie eine for- oder while-Schleife. Innerhalb der Schleife machen Sie eine
		// Fallunterscheidung und ermitteln mit Hilfe des %-Operators die geraden Zahlen.
		// Alternativ koennen Sie die Schleife auch in Zweierschritten hochzaehlen, dann brauchen
		// Sie keinen %-Operator!
		int summe = 0;
		
		for (int i = 2; i <= n; i+=2) {
				summe += i;
		}
		
		return summe;
		
		// Bitte ersetzen Sie diese Zeile durch Ihre Loesung.
	}

	
	
	// <20>-<20> - Hanteln
	// ===================
	
	public static int mittlerste(int a, int b, int c) {
		// Liefert die der Groesse nach mittlerste der drei Zahlen a, b und c.
		// Sie duerfen davon ausgehen, dass die drei Zahlen unterschiedlich sind.
		//
		// Beispiel:
		// ---------
		// a: 1, b: 2, c: 4 -> Rueckgabewert: 2
		// a: 4, b: 8, c: -5 -> Rueckgabewert: 4
		// a: 7, b: 0, c: 3 -> Rueckgabewert: 3
		//
		// Tipp:
		// -----
		// Verwenden Sie verschachtelte Fallunterscheidungen.
		if ((a > b && a < c) || (a > c && a < b)) {
			return a;
		}else if ((b > a && b < c) || (b > c && b < a)) {
			return b;
		}else {
			return c;
		}
		
		
		 // Bitte ersetzen Sie diese Zeile durch Ihre Loesung.
	}

	
	
	// <50>-<50> - Hanteln
	// ===================
	
	public static String glockenschlag(int stunden, int minuten) {
		// Liefert die Glockenschlaege zur angegebenen Uhrzeit als String.
		// 
		// Regeln:
		// -------
		// Viertelstundenschlag: "Bim" 1..4 fuer jede Viertelstunde.
		// Stundenschlag: "Bam", nur zur vollen Stunde.
		// Bei vollen Stunden erfolgt erst der Viertelstunden- dann der Stundenschlag.
		// 12..23 Uhr wird geschlagen als 0..11 Uhr.
		// Bei 0 Uhr erfolgen zwoelf Stundenschlaege.
		//
		// Beispiele:
		// ----------
		// stunden: 5, minuten: 23 -> Rueckgabewert: "" (kein Glockenschlag)
		// stunden: 14, miunten: 15 -> Rueckgabewert: "Bim"
		// stunden: 14, minuten: 30 -> Rueckgabewert: "BimBim"
		// stunden: 14, minuten: 45 -> Rueckgabewert: "BimBimBim"
		// stunden: 15, minuten: 0 -> Rueckgabewert: "BimBimBimBimBamBamBam"
		// stunden: 0, minuten: 0 -> Rueckgabewert: "BimBimBimBimBamBamBamBamBamBamBamBamBamBamBamBam"
		//
		// Tipp:
		// -----
		// Strings lassen sich mit '+' aneinanderhaengen. Viel Spass beim Knobeln! ;-)
		String schlag = "";
		if (minuten % 15 != 0) {
			return "";
		}
		if (minuten == 0) {
			schlag = "BimBimBimBim";
		}else if (minuten == 15) {
			schlag = "Bim";
		}else if (minuten == 30) {
			schlag = "BimBim";
		}else {
			schlag = "BimBimBim";
		}
		
		if (minuten == 0) {
			int stundenSchlag = stunden % 12;
			if (stundenSchlag == 0) {
				stundenSchlag = 12;
			}
			for (int i = 0; i < stundenSchlag; i++) {
				schlag += "Bam";
			}
		}
		return schlag;
		
		
		
		// Bitte ersetzen Sie diese Zeile durch Ihre Loesung.
	}
	
	

	// main-Methode
	// ============
	
	public static void main(String[] args) {
		// Hier koennen Sie Ihre Loesungen selbst testen, bevor Sie sie zur Ueberpruefung in JACK hochladen.
		
		// Beispiel:
		// ---------
		System.out.println(vierundzwanzig());
		
		// Diese Zeile sollte, solange Sie die Methode "vierundzwanzig" noch nicht bearbeitet haben, den Wert 0
		// ausgeben. (Im vorgegebenen "Geruest" der Methode steht ja: "return 0;".)
		// Wenn Sie die Methode dann richtig implementiert haben, sollte der Wert 24 ausgegeben werden.
		
		// Die main-Methode wird uebrigens von JACK ignoriert. Alles was hier steht, hat also keinen Einfluss auf die
		// Test-Ergebnisse in JACK!
	}
}
