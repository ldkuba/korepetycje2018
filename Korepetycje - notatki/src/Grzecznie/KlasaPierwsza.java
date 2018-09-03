package Grzecznie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class KlasaPierwsza {

	public static void main(String[] args) {

		String linia;
		BufferedReader br;
		FileReader fr;
		
		Dlug dlug1 = new Dlug();
		
		System.out.println("Dlug: " + dlug1.zadluzenie);
		
		dlug1.ustawZadluzenie(500009);
		
		System.out.println("Dlug: " + dlug1.zadluzenie);
		
		dlug1.zeruj();
		
		System.out.println("Dlug: " + dlug1.zadluzenie);
		
		try {

			fr = new FileReader("debt.txt");
			br = new BufferedReader(fr);
			// to jest wyj¹tek ktory probouje wychwyciæ
			while ((linia = br.readLine()) != null) {

			}
		} catch (IOException exx) {
			System.out.println("Nie znleziono pliku");
		}

	}
}
