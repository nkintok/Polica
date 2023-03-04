/*
	Ime datoteke: 		Darilo.java
	Avtor: 				Nejc Kotnik
*/

// Deklariramo javni razred, ki razširja razred skatla
public class Darilo extends Skatla implements CarinskiPaket {
	
	// Vse lastnosti od nadrazreda se prenesejo
	// Deklariramo nove lastnosti
	private boolean jeOkraseno;
	private Double znesekCarine;
	
	// Javni konstruktor
	// Vhodni parametri: d - dimenzija skatle
	// Potek/opis: Ustvari nov objekt tipa Darilo
	// Vrne vrednost: nov objekt
		public Darilo(String d, String v, int m) {
			
			// Pokličemo konstruktor nadrazreda - ustvarimo prazno darilo
			
			super (d, v, m);
			
			// Naložimo darila v darilno škatlo
			odpri();
			try {	
			zapakiraj(getTeza(), "Darila");
			}
			
			catch(Exception e) {
			System.out.println("Napaka pri pakiranju: " + e);
			}	
			
			// Inicializiramo še ostale lastnosti
			jeOkraseno = false;
			
		}
		
	// Javna metoda, ki okrasi darilo
	// Vhodni parametri: /
	// Potek/opis: spremeni lastnost okrašeno na true
	// Vrne vrednost: true - darilo je okrašeno, false - darilo ni okrašeno
	public void okrasi() {
		
		try {
			if(getTeza() > 0) {
				jeOkraseno = true;
				System.out.println("Zelo lepo ste okrasili to darilo");
			}	
			else {
				jeOkraseno = false;
				System.out.println("V škatli ni daril!");
			}
		}
		catch(Exception e) {
			System.out.println("Napaka pri okraševanju: " + e);
		}	
	}

	// Metoda, ki vrne znesek plačila za carino in ga predpisuje vmesniku CarinskiPaket
	// Vhodni parametri: /
	// Potek/opis: vrne ceno
	// Vrne vrednost: double - cena v €
	public Double getZnesekCarine() {
		
		return Double.valueOf(znesekCarine);
	}	
}		