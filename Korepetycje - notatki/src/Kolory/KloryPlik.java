package Kolory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class KloryPlik {
	public static void main(String[] args) {
		ArrayList<Kolor> listaKolorow = new ArrayList<>();

		try {
			String linia;

			FileReader fr = new FileReader("kolory.txt");
			BufferedReader br = new BufferedReader(fr);

			while ((linia = br.readLine()) != null) {
				// Czytanie kazdej linijki
				String[] rozbitaLinia = linia.split(" "); // rozbilam linie na poszczegolne liczby
				
				try {
					float czerwony = Float.parseFloat(rozbitaLinia[0]);// zmiana z Stringa na floata
					float zielony = Float.parseFloat(rozbitaLinia[1]);
					float niebieski = Float.parseFloat(rozbitaLinia[2]);
				
					Kolor kolor = new Kolor(czerwony, zielony, niebieski);
					listaKolorow.add(kolor);
				
				}catch(NumberFormatException ex)
				{
					System.err.println("To nie jest kolor: " + linia);
				}
			}
		} catch (IOException exx) {
			System.out.println("Nie znleziono pliku");
		}

		Collections.sort(listaKolorow, new Comparator<Kolor>() {

			public int compare(Kolor k1, Kolor k2) {
				if(k1.natezenie()<k2.natezenie()) {
					return 1;
				} else if (k1.natezenie()==k2.natezenie()) {
					return 0;
				}else {
					return -1;	
				}
			}
		});

		System.out.println(listaKolorow);

	}
}
