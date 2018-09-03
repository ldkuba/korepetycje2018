package Totootek;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TotolotekMain {
	
	public void run() {
		Totolotek p1 = new Totolotek();
		p1.noweLosowanie();
		
		try {
			String linia;

			FileReader fr = new FileReader("Totolotek1.txt");
			BufferedReader br = new BufferedReader(fr);

			while ((linia = br.readLine()) != null) {
				// Czytanie kazdej linijki
				
				String[] rozbiteL= linia.split(" ");
				
				String imie = rozbiteL[0] + " " + rozbiteL[1];
				
				ArrayList<Integer> wylosowaneliczby = new ArrayList<Integer>();
				
				wylosowaneliczby.add(Integer.parseInt(rozbiteL[2]));
				wylosowaneliczby.add(Integer.parseInt(rozbiteL[3]));
				wylosowaneliczby.add(Integer.parseInt(rozbiteL[4]));
				wylosowaneliczby.add(Integer.parseInt(rozbiteL[5]));
				wylosowaneliczby.add(Integer.parseInt(rozbiteL[6]));
				wylosowaneliczby.add(Integer.parseInt(rozbiteL[7]));
				
				Kupon d1 = new Kupon(imie, wylosowaneliczby);
				p1.dodajKupon(d1);
			}
		} catch (IOException exx) {
			System.out.println("Nie znleziono pliku");
		}
		
		p1.Sortowanie();
		
		for(int i =0; i<10; i++)
		{
			System.out.println(p1.getKupony().get(i));
		}
		
		System.out.println(p1.getLiczby());
	}
	
	public static void main(String[] args) {
		TotolotekMain a = new TotolotekMain();
		a.run();
	}

}
