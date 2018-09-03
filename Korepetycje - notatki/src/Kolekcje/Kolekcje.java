package Kolekcje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Kolekcje { // ctrl+shift+o IMPORT
	public static void main(String[] args) {

		ArrayList<String> kraje = new ArrayList<String>();

		System.out.println(kraje);

		kraje.add("Polska");

		System.out.println(kraje);

		System.out.println(kraje.size());

		kraje.add("Niemcy");
		kraje.add("Ukraina");
		kraje.add("Iran");

		System.out.println(kraje);

		Collections.sort(kraje, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				
				if(s1.length() > s2.length()) {
					return 1;
				}else if(s1.length()== s2.length()){
					return 0;	
				}else{
					return -1;
				}
			}
		});
		
		System.out.println(kraje);

	}
}
