/*
	Ime datoteke: 		Skatla.java
	Avtor: 				Nejc Kotnik
*/

	// Deklariramo javni razred Skatla
	public class Skatla {
		
		// Deklariramo zasebne lastnosti razreda skatla
		private int teza;
		private String vrstaVsebine;
		private boolean jeOdprta;
		private String dimenzija;
		private int novaTeza;
		private String novaVsebina;
		
		// Definiramo javni konstruktor, ki ustvari nov objekt tipa Skatla
		// Vhodni parametri: /
		// Potek/opis: Ustvari nov objekt tipa skatla
		// Vrne vrednost: nov objekt
		public Skatla() {
			
			// Inicializiramo lastnosti objekta
			teza = 0;
			vrstaVsebine = "";
			jeOdprta = false;
			dimenzija = "";
			
			System.out.println("Ustvarjam nov objekt tipa Skatla");
		}
		
		// Javni konstruktor
		// Vhodni parametri: d - dimenzija skatle
		// Potek/opis: Ustvari nov objekt tipa skatla
		// Vrne vrednost: nov objekt
		public Skatla(String d, String v, int t) {
			
			// Inicializiramo lastnosti objekta
			novaTeza = novaTeza + t;
			novaVsebina = v;
			jeOdprta = false;
			dimenzija = d;
			
			System.out.println("Ustvarjam nov objekt tipa Skatla z dimenzijami " + d + "cm. Vsebina škatle: " + novaVsebina + " Teža vsebine: " + novaTeza + "g");
		}
		
		// Javna metoda za odpiranje škatle
		// Vhodni parametri: /
		// Potek/opis: spremeni vrednost jeOdprta na true
		// Vrne vrednost: true - pakiranje uspešno, false - pakiranje ni uspešno
		public boolean odpri() {
			
			// Če je škatla že odprta
			if(jeOdprta) {
				
				// Vrnemo false
				return false;
				
			}
			// Če je zaprta
			else {
				
				// Odpremo škatlo
				jeOdprta = true;
				// Vrnemo true
				return true;
			}
		}
		
		// Javna metoda za zapiranje škatle
		// Vhodni parametri: /
		// Potek/opis: spremeni vrednost jeOdprta na false
		// Vrne vrednost: 
		public boolean zapri() {
			
			// Če je škatla že zaprta
			if(!jeOdprta) {
				
				// Vrnemo true
				return true;
				
			}
			// Če je odprta
			else {
				
				// Zapremo škatlo
				jeOdprta = false;
				// Vrnemo true
				return true;
			}
		
		}
		
		// Javna metoda za pakiranje škatle, ki vrže false, če je škatla zaprta
		// Vhodni parametri: t - teža vsebine, v - vrsta vsebine, ki jo pakiramo
		// Potek/opis: Prišteje težo predmetov in doda vrsto vsebine
		// Vrne vrednost: teža škatle po pakiranju
		public int zapakiraj(int t, String v) {
			
			System.out.println("V škatlo bomo zapakirali " + t + " gramov " + v);
			System.out.println("Teža škatle pred pakiranjem: " + teza + "gramov.");
			
			// Če je skatla odprta, poskusi zapakirati
			if(jeOdprta) {
				
				// Prištejemo težo vsebine
				teza = teza + t;
			
				// Dodamo vrsto vsebine
				vrstaVsebine = vrstaVsebine + v;
			
				System.out.println("Teža škatle po pakiranju: " + teza + "gramov.");				
				
			}
			else {
				
				// Vržemo izjemo za neuspešno polnjenje
				System.out.println("Škatla je zaprta...");
			}
			return teza;
		}
		
		// Javna metoda za rezanje škatle, ki spremeni dimenzijo škatle
		// Vhodni parametri: d - dimenzija 
		// Potek/opis: Spremeni dimenzijo škatle
		// Vrne vrednost: dimenzija škatle po rezanju
		public String obrezi(String d) {
			System.out.println("Dimenzije škatle po obrezovanju: " + d);
			return dimenzija;
		}
		
		// Javna metoda vrne težo škatle
		// Vhodni parametri: /
		// Potek/opis: vrne vrednost
		// Vrne vrednost: teža škatle
		public int getTeza() {
			return novaTeza;
		}		
		
		// Javna metoda vrne stanje jeOdprta
		// Vhodni parametri: /
		// Potek/opis: vrne vrednost
		// Vrne vrednost: stanje jeOdprta		
		public boolean getjeOdprta() {
			if (jeOdprta) {
				return true;
			}
			else {
				return false;
			}
		}
		
		// Javna metoda, ki vrne dimenzijo škatel
		// Vhodni parametri: /
		// Potek/opis: vrne vrednosti
		// Vrne vrednost: niz z dimenzijami škatel
		public String getDimenzija() {
		
			return dimenzija + "cm";
		} 
		
		// Javna metoda, ki vrne vsebino škatel
		// Vhodni parametri: /
		// Potek/opis: vrne vrednosti
		// Vrne vrednost: niz z vrednostmi škatel
		public String getVsebina() {
		
			return novaVsebina;
		}

}