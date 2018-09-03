package Totootek;

import java.util.ArrayList;

public class Kupon {
	private String imie;
	private ArrayList<Integer> wylosowaneliczby;

	public Kupon(String imie, ArrayList<Integer> wylosowaneliczby) {
		this.imie = imie;
		this.wylosowaneliczby = wylosowaneliczby;

	}

	public ArrayList<Integer> getWylosowaneliczby() {
		return wylosowaneliczby;
	}

	public String getImie() {
		return imie;
	}
	public String toString() {
		
		String informacje= imie;
		
		for(int i=0; i<wylosowaneliczby.size();i++) {
			informacje += " " + wylosowaneliczby.get(i);
		}
		
		return informacje;
	}
}
