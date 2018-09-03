package Grzecznie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Zarz¹dzanie_Debt {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("który z plikow chcesz wczytaæ?(nazwa pliku + .txt)");
		String ok = sc.next();
		File plik = new File(ok);
		
		FileReader filereader = new FileReader(plik);
		BufferedReader bufferedreader = new BufferedReader(filereader);
		String liniaTekstu = bufferedreader.readLine();

		ListaKrajow listaKrajow = new ListaKrajow();

		try {
			while ((liniaTekstu = bufferedreader.readLine()) != null) {

				String[] tablicadanych = liniaTekstu.split(";");
				String nazwaKraju = tablicadanych[0];
				String dlugString = tablicadanych[1];
				String ludnoscString = tablicadanych[2];

				int ludnosc = Integer.parseInt(ludnoscString);
				int dlug = Integer.parseInt(dlugString);

				Debt kraj = new Debt(nazwaKraju, dlug, ludnosc);
				listaKrajow.dodajKraj(kraj);
			}

			bufferedreader.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		while(true) {
		
		System.out.println("\t(0) Dodaj plik");
		System.out.println("\t(1) wy³¹cz");
		byte k = sc.nextByte();
		sc.nextLine();
		switch (k) {
		case 0:
			System.out.println("który z plikow chcesz wczytaæ?(nazwa pliku + .txt)");
			String ok1 = sc.next();
			File plik1 = new File(ok1);
			
			FileReader filereader1 = new FileReader(plik1);
			BufferedReader bufferedreader1 = new BufferedReader(filereader1);
			String liniaTekstu1 = bufferedreader1.readLine();

			ListaKrajow listaKrajow1 = new ListaKrajow();

			try {
				while ((liniaTekstu1 = bufferedreader1.readLine()) != null) {

					String[] tablicadanych1 = liniaTekstu1.split(";");
					String nazwaKraju1 = tablicadanych1[0];
					String dlugString1 = tablicadanych1[1];
					String ludnoscString1= tablicadanych1[2];

					int ludnosc1 = Integer.parseInt(ludnoscString1);
					int dlug1 = Integer.parseInt(dlugString1);

					Debt kraj = new Debt(nazwaKraju1, dlug1, ludnosc1);
					listaKrajow1.dodajKraj(kraj);
				}

				bufferedreader1.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			break;
		case 1:
			return;
			
		}
		
		while (true) {
			System.out.println("Co chcesz zrobiæ? Wybierz opcjê:");
			System.out.println("\t(0) wyœwietliæ liste krajów");
			System.out.println("\t(1) dodac nowy kraj");
			System.out.println("\t(2) sortuj kraje");
			System.out.println("\t(3) skasowac kraj");
			System.out.println("\t(4) wy³¹cz");
			System.out.print("? ");
			byte o = sc.nextByte();
			sc.nextLine();
			switch (o) {
			case 0:
				listaKrajow.wyswietlKraje();
				break;
			case 1:
				System.out.println("Podaj nazwê, D³ug i Ludnosc");
				String kraj = sc.nextLine();
				double dlug = sc.nextDouble();
				long ludnosc = sc.nextLong();
				Debt ki = new Debt(kraj, dlug, ludnosc);
				listaKrajow.dodajKraj(ki);
				break;
			case 2:
				listaKrajow.posortujKraje();
				System.out.println("Posortowano kraje");
				break;
			case 3:
				listaKrajow.wyswietlKraje();
				// zapytaj uzytkownika ktory utwor skasowac
				System.out.print("Który kraj skasowaæ? ");
				byte nr_kraju = sc.nextByte();
				// skasuj utwor
				Debt u = listaKrajow.usunKraj(nr_kraju);
				System.out.println(">>> skasowano kraj " + u);

				break;
			case 4:
				System.out.println("Do zobaczenia");
				System.exit(0);
			}
			System.out.println("");
		
		}
		}
	}
}
	


