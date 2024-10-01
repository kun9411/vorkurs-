
public class Morse {

	public static String encodeMorse(String s) {
		// Kodiere den durch s angegebenen Text als Morse-Code!
		// Trennen Sie Buchstaben durch ein Leerzeichen, Woerter durch zwei Leerzeichen.
		// Der Rueckgabestring muss in jedem Fall mit einem Leerzeichen enden.
		//
		// Hinweise:
		// ---------
		// * Sie brauchen nichts weiter als String-Operation sowie Modulo und Division, insbesondere
		//   keine komplexen Datentypen!
		// * Sie muessen sich aber einlesen, wie der Morsecode als Binaerbaum dargestellt wird.
		// * Die Konstante "alleZeichen" ist dieser Baum in Form eines Strings.
		// * s.length() liefert die Laenge des Strings s
		// * s.charAt(i) liefert das Zeichen an Position i im String s
		// * s.indexOf(c); liefert die Position des Zeichens c im String s
		//
		// Beispiele:
		// ----------
		// s: "SOS" -> Rueckgabewert: "... --- ... "
		// s: "HALLO" -> Rueckgabewert: ".... .- .-.. .-.. --- "
		// s: "VORKURS INFORMATIK" -> Rueckgabewert: "...- --- .-. -.- ..- .-. ...  .. -. ..-. --- .-. -- .- - .. -.- "

		final String alleZeichen = "**ETIANMSURWDKGOHVF*L*PJBXCYZQ**";
		StringBuilder morseCode = new StringBuilder();
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (c == ' ') {
				morseCode.append(" ");
				continue;
			}
			
			int index = alleZeichen.indexOf(c);
			
			if (index != -1) {
				StringBuilder morseChar = new StringBuilder();
				
				while (index > 1) {
					if (index % 2 == 0) {
						morseChar.insert(0, '.');
					}else {
						morseChar.insert(0, '-');
					}
					index = index / 2;
				}
				morseCode.append(morseChar).append(" ");
			}
		}
		
		return morseCode.toString();
	}
	
	
	public static String decodeMorse(String s) {
		// Dekodiere den durch s angegebenen Morse-Code!
		// Buchstaben sind in s durch ein Leerzeichen getrennt, Woerter durch zwei Leerzeichen.
		// Der String s hat in jedem Fall mit einem Leerzeichen zu enden.
		//
		// Hinweise:
		// ---------
		// * Sie brauchen nichts weiter als String-Operation sowie Modulo und Division, insbesondere
		//   keine komplexen Datentypen!
		// * Sie muessen sich aber einlesen, wie sich der Morsecode als Binaerbaum darstellen laesst.
		// * Die Konstante "alleZeichen" ist dieser Baum in Form eines Strings.
		// * Eine moegliche Loesung wuerde eine Tabelle mit dem kompletten Morse-Code fuer jeden
		//   Buchstaben verwenden; das kann man machen, ist hier aber nicht Sinn der Uebung.
		// * Fangen Sie am besten nicht mit dieser Aufgabe, sondern mit decodeMorse an.
		// * s.length() liefert die Laenge des Strings s
		// * s.charAt(i) liefert das Zeichen an Position i im String s
		// * s.indexOf(c); liefert die Position des Zeichens c im String s
		//
		// Beispiele:
		// ----------
		// s: "... --- ... " -> Rueckgabewert: "SOS"
		// s: ".... .- .-.. .-.. --- " -> Rueckgabewert: "HALLO"
		// s: "...- --- .-. -.- ..- .-. ...  .. -. ..-. --- .-. -- .- - .. -.- " -> Rueckgabewert: "VORKURS INFORMATIK"

		final String alleZeichen = "**ETIANMSURWDKGOHVF*L*PJBXCYZQ**";
		
		StringBuilder result = new StringBuilder();
		int index = 1;
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			

			if (c == '.') {
				index *= 2;
			}
			if (c == '-') {
				index = index * 2 + 1;
			}
			if (c == ' ') {
				if (i+1 < s.length() && s.charAt(i+1)==' ') {
					result.append(alleZeichen.charAt(index)).append(" ");
					index = 1;
					i++;
				}else {
					if (index > 1) {
						result.append(alleZeichen.charAt(index));
					}
					index = 1;
				}
			}	
		}
		
		return result.toString();
	}
	
	
	public static void main(String[] args) {

		String s = encodeMorse("VORKURS INFORMATIK");
		System.out.println(decodeMorse(s));


	}
}
