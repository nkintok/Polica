/*
	
	Ime datoteke: 		Polica.java
	Avtor: 				Nejc Kotnik
	Vhodni podatki: 	/
	Opis:				Aplikacija z grafičnim uporabniškim vmesnikom za delo s škatlami	
	Izhodni podatki: 	Okno grafičnega uporabniškega vmesnika
				
*/

// Uvozimo pakete za delo z grafičnim vmesnikom
import javax.swing.*;

// Uvozimo knjižico za delo z dogodki
import java.awt.event.*;

public class Polica extends JFrame implements ActionListener {
	
	// Deklariramo zasebne lastnosti
	private JPanel povrsina;
	private JButton dodajJButton;
	private JTextField dimenzijaPolje, tezaPolje, vsebinaPolje;
	private JTable tabela;
	private SkatlaTableModel modelTabele;
	
	// Deklariramo javno statično metodo, ki se izvede ob zagonu programa
	// Vhodni parametri: Vhodni parametri iz konzole
	// Potek/opis: ustvari novo okno 
	// Vrne vrednost:
	public static void main(String[] args) {
		
		Polica p = new Polica("Polica s paketi/škatlami");
		
	}
	
	// Javni konstruktor
	// Vhodni parametri: n - naslov okna
	// Potek/opis: vrne objekt tipa Polica 
	// Vrne vrednost: vrne objekt tipa Polica
	public Polica(String n) {
		
		// Kličemo konstruktor nadrazreda
		super(n);
		
		// Inicializiramo zasebne lastnosti
		povrsina = new JPanel();
		dodajJButton = new JButton("Dodaj škatlo");
		tezaPolje = new JTextField(10);
		dimenzijaPolje = new JTextField(20);
		vsebinaPolje = new JTextField(15);
		modelTabele = new SkatlaTableModel();
		tabela = new JTable(modelTabele);
		
		// Površino dodamo na polico
		add(povrsina);
		
		// Gumbu za dodajanje dodamo action listener
		dodajJButton.addActionListener(this);
		
		// Dodamo gumb, tabelo in vnosna polja na površino
		povrsina.add(new JLabel("Dimenzija:"));
		povrsina.add(dimenzijaPolje);
		povrsina.add(new JLabel("Teža:"));
		povrsina.add(tezaPolje);
		povrsina.add(new JLabel("Vsebina:"));
		povrsina.add(vsebinaPolje);
		povrsina.add(dodajJButton);
		povrsina.add(tabela);
		
		// Pokažemo okno
		setVisible(true);
		
		// Nastavimo velikost
		setSize(1000, 1000);
		
		// Nastavimo obnašanje križca (x) - da konča aplikacijo
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		System.out.println("Ustvarjam objekt Polica");
	}
	
	// Metoda, ki jo predpisuje vmesnik ActionListener
	// Vhodni parametri: ae - dogodek
	// Potek/opis: doda škatlo na seznam - v tabelo 
	// Vrne vrednost: /
	public void actionPerformed(ActionEvent ae) {
		
		System.out.println("Dodajam škatlo...");
		System.out.println("Dimenzija je " + dimenzijaPolje.getText());
		System.out.println("Vsebina škatle: " + vsebinaPolje.getText());
		System.out.println("Teža je " + tezaPolje.getText());
		
		// Ustvarimo lokalno spremenljivko flasa
		//double d = Double.parseDouble(alkoholPolje.getText());
		//PivskaSteklenica flasa = new PivskaSteklenica(znamkaPolje.getText(), 500, d);
		
		// Dodamo objekt v seznam
		//modelTabele.addPivskaSteklenica(flasa);
		modelTabele.addSkatla(new Skatla(dimenzijaPolje.getText(), vsebinaPolje.getText(), Integer.parseInt(tezaPolje.getText())));
		
	}
	
}