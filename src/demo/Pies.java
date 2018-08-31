package demo;

public class Pies
{
	private float wielkosc;
	private String rasa;
	private String imie;
	private int wiek;
	private float waga;
	
	public Pies(float wielkosc, int wiek, float waga, String rasa, String imie)
	{
		this.wielkosc = wielkosc;
		this.rasa = rasa;
		this.imie = imie;
		this.wiek = wiek;
		this.waga = waga;
	}
	
	public void szczekanie()
	{
		System.out.println("hau hau");
	}
	
	public void jakSieNazwyasz()
	{
		System.out.println("Mam na imie " + imie);
	}
	
	public void nadajImie(String imie)
	{
		this.imie = imie;
	}
}
