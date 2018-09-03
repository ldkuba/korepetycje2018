package Niegrecznie;

public class Pies {
	
	public String rasa;
	public String imie;
	public int wiek;
	public float waga;
	
	// Konstruktor - tworzy obiekt
	public Pies(String imie, String rasa, int wiek, float waga)
	{
		this.imie = imie;
		this.rasa = rasa;
		this.wiek = wiek;
		this.waga = waga;
		
		System.out.println("Stworzono psa " + this.imie);
	}
	
//	public void stworzPsa(String imie, String rasa, int wiek, float waga)
//	{
//		this.imie = imie;
//		this.rasa = rasa;
//		this.wiek = wiek;
//		this.waga = waga;
//	}
	
	public void Prosi() {
		System.out.println("Mmmyuu");
	}
	
	public void Info()
	{
		System.out.println("Rasa: " + rasa);
		System.out.println("Imie: " + imie);
		System.out.println("Wiek: " + wiek);
		System.out.println("Waga: " + waga);
	}
	
	public void NadajImie(String noweImie) {
		imie = noweImie;
	}

	public void przytyl() {
		this.waga += 2.0f;
	}
	
	public void Szczekanie() {
		System.out.println("hau hau");
	}
	
}
