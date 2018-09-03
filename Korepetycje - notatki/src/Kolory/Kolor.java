package Kolory;

public class Kolor {
	
	private float czerwony;
	private float zielony;
	private float niebieski;
	
	public Kolor(float c, float z, float n)
	{
		this.czerwony = c;
		this.zielony = z;
		this.niebieski = n;
	}
	
	void wypiszKolor() {
		System.out.println("Czerwony: " + czerwony + " Zielony: " + zielony + " Niebieski: " + niebieski);
	}
	
	void dodajKolor(Kolor kolor) {
		this.czerwony = (this.czerwony + kolor.czerwony) / 2;
		this.zielony = (this.zielony + kolor.zielony)/2;
		this.niebieski = (this.niebieski + kolor.niebieski)/2;
	}
	
	Kolor zmieszaj(Kolor drugi)
	{
		float nowyCzerwony = (this.czerwony + drugi.czerwony) / 2;
		float nowyZielony = (this.zielony + drugi.zielony)/2;
		float nowyNiebieski = (this.niebieski + drugi.niebieski)/2;
		
		Kolor nowyKolor = new Kolor(nowyCzerwony, nowyZielony, nowyNiebieski);
		
		return nowyKolor;
	}
	
	public float natezenie() {
		float natezenie= (czerwony+zielony+niebieski)/3;
		return natezenie;
	}

	public float getCzerwony(){
		return czerwony;
	}
	
	public float getZielony() {
		return zielony;
		
	}
	
	public float getZiebieski() {
		return niebieski;
	}
	
	@Override
	public String toString() {
		return "[" + czerwony + ", " + zielony + ", " + niebieski + ", " + natezenie() +"]";
	}
}
