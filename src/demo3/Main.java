package demo3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<String> kraje = new ArrayList<>();
		
		kraje.add("Polska");
		kraje.add("Nowa Zelandia");
		
//		kraje.size()
		
//		kraje.get(0);
		
		kraje.clear();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ile kraji? ");
	 
		String liczba = scanner.nextLine();
		int l = Integer.parseInt(liczba);
	 
		
		
		for( int  i = 0; i < l; i++) {
			System.out.println("Podaj kraj: ");
			String kraj = scanner.nextLine();
			kraje.add(kraj);
		}
		System.out.println(kraje);
	}
}
