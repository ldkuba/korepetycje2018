package Koszykowka;

import java.util.ArrayList;

public class Druzyna {
	
	private String nazwa;
	private Koszykarz kapitan;// jak mam duzo kogos, nie wie(wiecej niz 1) ile to robie ArrayList
	private ArrayList<Koszykarz> koszykarze;

	public Druzyna(String nazwa) {
		this.nazwa = nazwa;
		koszykarze = new ArrayList<Koszykarz>();
	}

	public String getNazwa() {
		return nazwa;
	}

	public Koszykarz getKapitan() {
		return kapitan;
	}

	public ArrayList<Koszykarz> getKoszykarze() {
		return koszykarze;
	}

	public void mianujKapitana() {

		Koszykarz najnizszy = koszykarze.get(0);

		for (int i = 0; i < koszykarze.size(); i++) {
			if ((koszykarze.get(i)).getWzrost() < najnizszy.getWzrost()) {
				najnizszy = (koszykarze.get(i));
			}
		}

		kapitan = najnizszy;
	}

	public void powolaj(Koszykarz koszykarz) {
		koszykarze.add(koszykarz);
	}

	public void odwolaj(Koszykarz koszykarz) {

		if (koszykarze.contains(koszykarz) == false) {
			System.out.println(koszykarz.toString() + "Nie gra w druzynie " + nazwa);
			return;
		}
		
		if(koszykarz == kapitan) {
			kapitan=null;
		}
		
		koszykarze.remove(koszykarz);
	} 
}
