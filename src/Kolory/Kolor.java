package Kolory;

public class Kolor
{
	private float czerwony;
	private float zielony;
	private float niebieski;

	public Kolor(float czerwony, float zielony, float niebieski)
	{
		this.czerwony = czerwony;
		this.zielony = zielony;
		this.niebieski = niebieski;
	}

	float czerwony()
	{
		return czerwony;
	}

	float zielony()
	{
		return zielony;
	}

	float niebieski()
	{
		return niebieski;
	}

	void wypiszKolor() {
		System.out.println("Cz: " + czerwony + " Ziel: " + zielony + "Nieb: " + niebieski);
	}
}
