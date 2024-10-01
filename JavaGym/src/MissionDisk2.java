
public class MissionDisk2 {
	
	// ############################################################################################
	// 							        JavaGym: Mission Disk 2
	// ############################################################################################	
		
	public static int ggT(int a, int b) {
		// Berechnet den ggT von a und b nach dem Euklidischen Algorithmus.
		// Sie duerfen davon ausgehen, dass a >= 0 und b >= 0 ist.
		//
		// Beispiele:
		// ----------
		// a: 4, b: 6 -> Rueckgabewert: 2
		// a: 6, b: 7 -> Rueckgabewert: 1
		// a: 4, b: 8 -> Rueckgabewert: 4
		//
		// Tipp:
		// -----
		// Den Euklidischen Algorithmus googlen und als while-Schleife implementieren.
		while (b != 0) {
			int rest = a % b;
			a = b;
			b = rest;
		}
		
		return a;
	}

	
    public static int kgV(int a, int b) {
    	// Berechnet das kgV von a und b.
    	//
    	// Beispiele:
    	// ----------
    	// a: 12, b: 18 -> Rueckgabewert: 36
    	// a: 144, b: 160 -> Rueckgabewert: 1440
    	// a: 35, b: 1 -> Rueckgabewert: 35
    	//
    	// Tipp:
    	// -----
    	// Das kgV laesst sich aus dem ggT berechnen!
    	return Math.abs(a * b)/ggT(a, b);
    }
    

	public static String primfaktoren(int x) {
		// Liefert die Primfaktoren, aus denen sich die Zahl x zusammensetzt.
		// Jeder Primfaktor ist - durch Leerzeichen getrennt - so oft hintereinander auszugeben,
		// wie er vorkommt.
		//
		// Beispiele:
		// ----------
		// x: 44 -> Rueckgabewert: 2 2 11
		// x: 50 -> Rueckgabewert: 2 5 5
		// x: 17 -> Rueckgabewert: 17
		//
		// Hinweis:
		// --------
		// Ein einzelnes Leerzeichen am Ende des zurueckgegebenen Strings ist ok.
		
		String result = "";
		
		while (x % 2 == 0) {
			x = x / 2;
			result += 2 + " ";
		}
		for (int i = 3; i*i<=x; i+=2) {
			while (x % i == 0) {
				x = x /i;
				result += i + " ";
			}
		}
		if (x > 2) {
			result += x;
		}
		
		return result;
	}
	
	
	public static int anzahlStellen(int x) {
		// Liefert zurueck, wieviele Dezimalstellen die Zahl x hat.
		// Sie duerfen davon ausgehen, dass x >= 0 ist.
		//
		// Beispiele:
		// ----------
		// x: 1 -> Rueckgabewert: 1
		// x: 0 -> Rueckgabewert: 1
		// x: 231 -> Rueckgabewert: 3
		if (x == 0) {
			return 1;
		}
		
		int anzahl = 0;
		while (x > 0) {
			x = x / 10;
			anzahl++;
		}
		return anzahl;
	}
	
	
	public static int stelle(int x, int s) {
		// Liefert die Ziffer an Stelle s einer Zahl x (von "vorne" gezaehlt).
		// Wenn die Stelle s in x nicht existiert, soll 0 zurueckgegeben werden.
		//
		// Beispiele:
		// ----------
		// x: 84711, s: 1 -> Rueckgabewert: 8
		// x: 84711, s: 3 -> Rueckgabewert: 7
		// x: 84711, s: 6 -> Rueckgabewert: 0
		int anzahl = anzahlStellen(x);
		if (s > anzahl) {
			return 0;
		}
		int num = (int)Math.pow(10, anzahl-s);
		x = x / num;
		return x % 10;
		
	}
	
	
	public static boolean schnapszahl(int x) {
		// Liefert "true" zurueck genau dann, wenn x eine "Schnapszahl" ist, also mehr als
		// eine Stelle hat und aus lauter gleichen Ziffern besteht.
		// Sie duerfen davon ausgehen, dass x >= 0 ist.
		//
		// Beispiele:
		// ----------
		// x: 11 -> Rueckgabewert: true
		// x: 444 -> Rueckgabewert: true
		// x: 8 -> Rueckgabewert: false
		int anzahl = anzahlStellen(x);
		if (anzahl < 2) {
			return false;
		}
		int index = 1;
		int num1 = stelle(x, index);
		for (int i = 2; i <= anzahl; i++) {
			int num2 = stelle(x, i);
			if (num1 != num2) {
				return false;
		}			
		}
		return true;
	}
	
	
	public static boolean istSymmetrisch(int x) {
		// Liefert "true" zurueck genau dann, wenn x bezogen auf seine Dezimalstellen
		// symmetrische ist. Sie duerfen davon ausgehen, dass x >= 0 ist.
		//
		// Beispiele:
		// ----------
		// x: 2552 -> Rueckgabewert: true
		// x: 7 -> Rueckgabewert: true
		// x: 98 -> Rueckgabewert: false
		int anzahl = anzahlStellen(x);
		if (anzahl == 1) {
			return true;
		}
		
		for (int i = 1; i <= anzahl/2; i++) {
			int num1 = stelle(x, i);
			int num2 = stelle(x, anzahl+1-i);
			if (num1 != num2) {
				return false;
			}
		}
		
		return true;
	}
	
	
	public static int umkehren(int x) {
		// Gibt die Zahl x in umgekehrter Ziffernfolge zurueck.
		//
		// Beispiele:
		// ----------
		// x: 1234 -> Rueckgabewert: 4321
		// x: 100 -> Rueckgabewert: 1 (s. u.)
		// x: 7654 -> Rueckgabewert: 4567
		//
		// Hinweis:
		// --------
		// Wenn beim Umkehren der Reihenfolge "fuehrende Nullen" entstehen, also z. B. bei
		// 100 -> 001 , dann fallen diese in der zurueckgegebenen Zahl weg.
//		int result = 0;
//		int anzahl = anzahlStellen(x);
//		int index = 0;
//		int num1 = stelle(x, anzahl);
//		while (num1 == 0) {
//			index++;
//			num1 = stelle(x, anzahl-index);
//		}
//		for (int i = anzahl-index; i >= 1; i--) {
//			num1 = stelle(x, i);
//			result += num1*(int)Math.pow(10, i-1);
//		}
//		return result;
		
		int result = 0;
		while (x > 0) {
			int num1 = x % 10;
			result = result*10 + num1;
			x = x / 10;
		}
		return result;
	}
	
	
	public static String roemisch(int x) {
		// Wandelt eine arabische Zahl x in eine roemische um. Sie duerfen davon ausgehen,
		// dass x > 0 ist. Verwenden Sie Grossbuchstaben.
		//
		// Beispiele:
		// ----------
		// x: 2020 -> Rueckgabewert: MMXX
		// x: 1986 -> MCMLXXXVI
		int[] arabic = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		String result = "";
		for (int i = 0; i < arabic.length; i++) {
			while (x >= arabic[i]) {
				result += roman[i];
				x -= arabic[i];
			}
		}
		return result;
	}
	
	
	public static String zahlVorlesen(int x) {
		// Liefert die Zahl x als String. Sie duerfen davon ausgehen, dass x >= 1 und
		// x <= 99 ist. Verwenden Sie Kleinbuchstaben und keine Sonderzeichen.
		//
		// Beispiele:
		// ----------
		// x: 11 -> Rueckgabewert: elf
		// x: 91 -> Rueckgabewert: einundneunzig
		// x: 80 -> Rueckgabewert: achtzig
		//
		// Hinweis:
		// --------
		// Nicht alle 99 Rueckgabewerte von Hand hinschreiben ;-)
		String[] zahlen1 = {"eins", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun", "zehn"};
		if (x < 11) {
			return zahlen1[x-1];
		}
		String[] zahlen2 = {"elf", "zwölf", "dreizehn", "vierzehn", "fünfzehn","sechzehn", "siebzehn", "achtzehn", "neunzehn", "zwanzig"};
		if (x>=11 && x<=20) {
			return zahlen2[x-11];
		}
		String[] zahlen3 = {"zwanzig", "dreißig", "vierzig", "fünfzig", "sechzig", "siebzig", "achtzig", "neunzig"};
	    int[] num3 = {20, 30, 40, 50, 60, 70, 80, 90};
	    for (int i = 0; i < num3.length; i++) {
			if (x == num3[i]) {
				return zahlen3[i];
			}
		}
	    for (int i = num3.length-1; i >= 0; i--) {
			if (x > num3[i] && x < num3 [i]+10) {
				return zahlen1[x%10-1] + "und" + zahlen3[i];
			}
		}
	    return "";
		
	}
	
	
	public static void main(String[] args) {
		// Hier koennen Sie Ihre Methoden testen.
		
		 System.out.println(roemisch(1986));  
	     System.out.println(primfaktoren(50));  
	     System.out.println(kgV(12, 18));  
	     System.out.println(umkehren(1234));  
	     System.out.println(zahlVorlesen(91));   
	}
}