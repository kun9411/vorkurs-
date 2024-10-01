public class Teppichfabrik { 
 
 static int[][] a = new int[10][10]; // der "Teppich" 
 
  
 static void ausgabe() { 
  // Ausgabe des Teppichmusters 
   
  for (int i = 0; i < a.length; i++) { 
   for (int j = 0; j < a[0].length; j++) { 
    System.out.print(a[i][j] + "  "); 
   } 
   System.out.println(); 
  } 
 } 
 
  
 static void muster1() { 
// Muster erzeugen, einfach indem bestimmte Elemente auf "1" 
// gesetzt werden, andere auf "0". 
  // hier: immer zwei Spalten "1", dann eine Spalte "0" 
//   
//  for (int i = 0; i < a.length; i++) { 
//   for (int j = 0 ; j < a[0].length; j++) { 
//	   if (j % 2 == 0) {
//		a[i][j] = 0;
//		if (j+1<a[0].length) {
//			a[i][j+1] = 0;
//		}
//	   }
//	   if (j % 4 == 0) {
//		   a[i][j] = 1;
//		   if (j+1<a[0].length) {
//				a[i][j+1] = 1;
//			}
//	}
	   
//	   if (i <= 2) {
//		a[i][j] = 1;
//	}
	   
//	   if (i % 2 != 0) {
//		if (j % 2 == 0) {
//			a[i][j] = 1;
//		}
//	}
//	   if (i % 2 == 0) {
//			if (j % 2 != 0) {
//				a[i][j] = 1;
//			}
//		}
	   
	   
//   } 
//  } 
	 
	 for (int i = 0; i < a.length; i++) {
		 
		 if (i < a.length/2) {
			 int index = (a.length-1)/2 - i;
			 int num = 2*(i+1);
			 
			for (int j = index; j<num+index; j++) {
				a[i][j] = 1;
				if (i == a.length/2-1) {
					a[i][a.length/2-1] = 0;
					a[i][a.length/2] = 0;
					
				}
			}
		}else {
			int index = i - a.length/2;
			int num = 2*(a.length-i);
			
			for (int j = index; j < num+index; j++) {
				a[i][j] = 1;
				if (i == a.length/2) {
					a[i][a.length/2-1] = 0;
					a[i][a.length/2] = 0;
				}
			}
		}
		 
		
	}
 } 
  
 
 public static void main(String[] args) { 
  // zum Testen der verschiedenen Muster 
   
  muster1(); 
  ausgabe(); 
 } 
}