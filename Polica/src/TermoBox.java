/*
	Ime datoteke: 		TermoBox.java
	Avtor: 				Nejc Kotnik
*/

// Deklariramo javni razred, ki razširja razred skatla
public class TermoBox extends Skatla {
	
	// Vse lastnosti od nadrazreda se prenesejo
	// Deklariramo nove lastnosti
	private double temperatura;
	
	// Javni konstruktor
	// Vhodni parametri: d - dimenzija skatle
	// Potek/opis: Ustvari nov objekt tipa TermoBox
	// Vrne vrednost: nov objekt
	public TermoBox(String d, String v, int m) {
			
			// Pokličemo konstruktor nadrazreda - ustvarimo prazno darilo
			
			super (d, v, m);
			
			// Naložimo elemente v izolirno škatlo
			odpri();
			try {	
			zapakiraj(getTeza(), "Hrana");
			}
			
			catch(Exception e) {
			System.out.println("Napaka pri pakiranju: " + e);
			}
			
			zapri();		
			
			// Inicializiramo še ostale lastnosti
			temperatura = 50.2;
			System.out.println("Trenutna temperatura v škatli je " + temperatura + " stopinj celzija.");
			
		}
	
	// Javna metoda, ki spremeni temperaturo če je škatla odprta
	// Vhodni parametri: /
	// Potek/opis: spremeni lastnost temperatura, če je škatla odprta
	// Vrne vrednost: škatla je zaprta - ohrnai temperaturo, odprta - spremeni temperaturo
	public void izoliraj() {
		
		try {
			if(getjeOdprta()) {
				temperatura = 21.5;
				System.out.println("Ker je škatla odprta se je temperatura spremenila na " + temperatura + " stopinj celzija.");
			}	
			else {
				System.out.println("Škatla je izolirana na " + temperatura + " stopinj celzija.");
			}
		}
		catch(Exception e) {
			System.out.println("Napaka pri izoliranju: " + e);
		}	
	}		
	
}