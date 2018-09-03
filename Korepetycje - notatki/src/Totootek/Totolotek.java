package Totootek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Totolotek {
	private ArrayList<Kupon> kupony;
	private ArrayList<Integer> wybraneliczby;

	public Totolotek() {
		kupony = new ArrayList<Kupon>();
		wybraneliczby= new ArrayList<Integer>();
	}

	public void noweLosowanie() {
		kupony.clear();

		Random random = new Random();

		wybraneliczby.clear();
		wybraneliczby.add(Math.abs(random.nextInt()) % 49 + 1);
		wybraneliczby.add(Math.abs(random.nextInt()) % 49 + 1);
		wybraneliczby.add(Math.abs(random.nextInt()) % 49 + 1);
		wybraneliczby.add(Math.abs(random.nextInt()) % 49 + 1);
		wybraneliczby.add(Math.abs(random.nextInt()) % 49 + 1);
		wybraneliczby.add(Math.abs(random.nextInt()) % 49 + 1);
	}

	public void Sortowanie() {
		// sortuje
		Collections.sort(kupony, new Comparator<Kupon>() {

			public int IloscTrafnychLiczb(Kupon k) {
				int trafneliczby= 0;
				for(int i=0; i < k.getWylosowaneliczby().size();i++) {
					
					if( k.getWylosowaneliczby().get(i).equals(wybraneliczby.get(i))) {
						trafneliczby += 1;
			
					}
					
				}
				
				return trafneliczby;
			}
			
			@Override
			public int compare(Kupon kupon1, Kupon kupon2) {
				if(IloscTrafnychLiczb(kupon1) > IloscTrafnychLiczb(kupon2)) {
					return -1;
				} else if(IloscTrafnychLiczb(kupon1) == IloscTrafnychLiczb(kupon2)){
					return 0;	
				}
				
				return 1;
			}	
		});
	}

	public ArrayList<Kupon> getKupony(){
		return kupony;
	}
	
	 public void dodajKupon(Kupon kupon) {
		 kupony.add(kupon);
	 }
	 
	 public ArrayList<Integer> getLiczby() {
		 return wybraneliczby;
	 }
	
}
