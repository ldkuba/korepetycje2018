package Kolory;

public class KolorMain {
	public static void main(String[] args) {
		Kolor fioletowy = new Kolor(0.65f, 0.5f, 1.0f);
		
		Kolor zielony = new Kolor(0,1,0);
		Kolor zielsny = new Kolor(0,1,0);
		Kolor zxc = new Kolor(0,1,0);
		Kolor zieugyny = new Kolor(0,1,0);
		Kolor ony = new Kolor(0,1,0);
		Kolor zixvony = new Kolor(0,1,0);
		Kolor elony = new Kolor(0,1,0);
		
		fioletowy.wypiszKolor();
		fioletowy.dodajKolor(zielony);
		
		Kolor k = fioletowy.zmieszaj(zielony);
		
		k.wypiszKolor();
		
		k.czerwony();
		
		System.out.println(k.natezenie());
		
		
		
	}
}
