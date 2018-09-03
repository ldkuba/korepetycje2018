package Skarbonka;

public class Skarbonka {
	public String imie;
	public float stankonta;
	
	public Skarbonka(String imie) {
		this.imie = imie;
		this.stankonta = 0f;
	}
	
	public void dodajKwote(float dodatek) {
		this.stankonta += dodatek;
	}
	
	public void wyswietlStan() {
		System.out.println(imie);
		System.out.println(stankonta);
	}
	public void pobranieOszczednosci(float pobieranie){
		this.stankonta -= pobieranie;
	}
}
