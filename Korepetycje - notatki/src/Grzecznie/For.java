package Grzecznie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class For {

	public static void main(String[] args) {

//		int[] tablica = { 2, 4, 3, 6, 9 };
//
//		int[] obT = obroc(tablica);
//
//		obT = zwiekszOJeden(obT);
//		obT = zwiekszOJeden(obT);
//		obT = zwiekszOJeden(obT);
//		
//		for (int i = 0; i < tablica.length; i++) {
//			System.out.println(obT[i]);
//		}

		ArrayList<Integer> kraje = wczytajKraje("kraje.txt");

		System.out.println(kraje);

	}

	static int[] zwiekszOJeden(int[] t) {
		for (int i = 0; i < t.length; i++) {
			t[i] = t[i] + 1;
		}
		return t;
	}

	static float srednia(int[] t) {
		float suma = 0;
		for (int i = 0; i < t.length; i++) {
			suma += t[i];
		}
		float srednia = suma / t.length;
		return srednia;
	}

	static int[] obroc(int[] t) {
		int[] tabodw = new int[t.length];
		for (int i = 0; i < t.length; i++) {
			tabodw[t.length - i - 1] = t[i];
		}
		return tabodw;
	}

	static void wypiszTablice(String[] tablica) {
		for (int i = 0; i < tablica.length; i++) {
			System.out.print(tablica[i] + ", ");
		}
	}

	static ArrayList<Integer> wczytajKraje(String path) {

		ArrayList<Integer> kraje = new ArrayList<Integer>();

		try {
			String linia;

			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);

			while ((linia = br.readLine()) != null) {
				// Czytanie kazdej linijki
				
				//bierze tekst i robi z niego liste
				int liczba = Integer.parseInt(linia);
				
				kraje.add(liczba);
			}
		} catch (IOException exx) {
			System.out.println("Nie znleziono pliku");
		}

		return kraje;
	}
}
