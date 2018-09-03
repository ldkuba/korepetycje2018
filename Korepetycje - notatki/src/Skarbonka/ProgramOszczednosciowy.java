package Skarbonka;

public class ProgramOszczednosciowy {
	public static void main(String[] args) {
		Skarbonka pierwsza= new Skarbonka("Alicja");
		Skarbonka druga = new Skarbonka("Bogdan");
	    pierwsza.wyswietlStan();
	    druga.wyswietlStan();
	    pierwsza.dodajKwote(50);
	    pierwsza.wyswietlStan();
	    druga.wyswietlStan();
	    druga.dodajKwote(20);
	    pierwsza.wyswietlStan();
	    druga.wyswietlStan();
	    druga.dodajKwote(pierwsza.stankonta);
	    pierwsza.pobranieOszczednosci(pierwsza.stankonta);
	    pierwsza.wyswietlStan();
	    druga.wyswietlStan();
	}
}
