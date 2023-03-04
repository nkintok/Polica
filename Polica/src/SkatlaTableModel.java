/*
	
	Ime datoteke: 		SkatlaTableModel.java
	Avtor: 				Nejc Kotnik
				
*/

import javax.swing.table.*;

public class SkatlaTableModel extends DefaultTableModel {
	
	// Konstruktor
	public SkatlaTableModel() {
		
		// Kličemo konstruktor nadrazreda
		super();
		
		// V tabelo dodamo stolpce
		addColumn("Dimenzija");
		addColumn("Vsebina");
		addColumn("Teža");
		
		// Dodamo naslov vrstice
		// Ustvarimo statičen seznam objektov
		Object[] vrstica = new Object[] {"Dimenzija", "Vsebina", "Teža(g)"};
		
		// Dodamo vrstico v tabelo
		addRow(vrstica);
	}
	
	// Metoda, ki doda škatlo na seznam in v tabelo
	// Vhodni parametri: sk - Skatla
	// Potek/opis: doda skatlo na seznam - v tabelo 
	// Vrne vrednost: /
	public void addSkatla(Skatla sk) {
		
		// Ustvarimo statičen seznam objektov
		Object[] vrstica = new Object[] {sk.getDimenzija(), sk.getVsebina(), sk.getTeza()};
		
		// Dodamo vrstico v tabelo
		addRow(vrstica);
		
	}
	
}