package Grzecznie;

import java.util.ArrayList;

public class Kolekcje {
	
	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		String[] b = new String[4];
		
		System.out.println(a.isEmpty());
		
		wypisz(a);
		
		a.add("4");
		a.add("5");
		a.add("6");
		a.add("7");
		a.add("8");
		
		wypisz(a);
		
		a.remove("4");
		wypisz(a);
		
		System.out.println(a.isEmpty());
		
		String v = a.get(3); //a[4]
		System.out.println(v);
		wypisz(a);
		
		String[] tablicaStr = (String[]) a.toArray();
		
		a.clear();
		a.add("askdj");
		wypisz(a);
	}
	
	static void wypisz(ArrayList<String> tablica)
	{
		for(int i = 0; i < tablica.size(); i++)
		{
			System.out.print(tablica.get(i) + ", ");
		}
		
		System.out.println();
	}

}
