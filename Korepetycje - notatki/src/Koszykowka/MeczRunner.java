package Koszykowka;

public class MeczRunner {

	public void run() {
		Druzyna d1 = new Druzyna("Chicago bulls");
		Druzyna d2 = new Druzyna("Los Angeles Lakers");

		try {
			Koszykarz k1 = new Koszykarz("Micheal", "Jordan", 192);
			d1.powolaj(k1);
		} catch (NegativeNumberException e) {
			System.out.println("Wzrost musi byc nieujemny");
		}
		
		try {
			Koszykarz k2 = new Koszykarz("Pub", "Puki", 201);
			d1.powolaj(k2);
		} catch (NegativeNumberException e) {
			System.out.println("Wzrost musi byc nieujemny");
		}
		
		try {
			Koszykarz k3 = new Koszykarz("Adam", "Nowak", 210);
			d1.powolaj(k3);
		} catch (NegativeNumberException e) {
			System.out.println("Wzrost musi byc nieujemny");
		}
		
		try {
			Koszykarz k11 = new Koszykarz("Bogus", "Jord", 195);
			d2.powolaj(k11);
		} catch (NegativeNumberException e) {
			System.out.println("Wzrost musi byc nieujemny");
		}
		
		try {
			Koszykarz k22 = new Koszykarz("James", "Bond", 211);
			d2.powolaj(k22);
		} catch (NegativeNumberException e) {
			System.out.println("Wzrost musi byc nieujemny");
		}
		
		try {
			Koszykarz k33 = new Koszykarz("Geogre", "Cloe", 180);
			d2.powolaj(k33);
		} catch (NegativeNumberException e) {
			System.out.println("Wzrost musi byc nieujemny");
		}

		d1.mianujKapitana();

		// Chicago Bulls

//		if(d1.getKapitan()==null) {
//			System.out.println("Nie ma kapitana");
//		} else {
//			System.out.println("Druzyna Chicago Bulls kieruje: " + d1.getKapitan().toString());	
//		}
//		
//		System.out.println("W druzynie graj¹: ");
//		for(int i=0; i<d1.getKoszykarze().size(); i++) {
//			System.out.println(d1.getKoszykarze().get(i).toString());
//		}

		WypiszDruzyne(d1);

		// Los Angeles Lakers

		WypiszDruzyne(d2);

//		
//		if(d2.getKapitan()==null) {
//			System.out.println("Nie ma kapitana");
//		} else {
//			System.out.println("Druzyna Los Angeles kieruje: " + d2.getKapitan().toString());	
//		}
//		for(int i=0; i<d2.getKoszykarze().size(); i++) {
//			System.out.println(d2.getKoszykarze().get(i).toString());
//		}

		d2.mianujKapitana();
		WypiszDruzyne(d2);
		d2.odwolaj(d2.getKapitan());
		WypiszDruzyne(d2);

		d2.odwolaj(d1.getKapitan());

	}

	public void WypiszDruzyne(Druzyna d) {
		if (d.getKapitan() == null) {
			System.out.println("Druzyna " + d.getNazwa() + " Nie ma kapitana");
		} else {
			System.out.println("Druzyna " + d.getNazwa() + " kieruje: " + d.getKapitan().toString());
		}
		System.out.println("W druzynie graj¹: ");
		for (int i = 0; i < d.getKoszykarze().size(); i++) {
			System.out.println(d.getKoszykarze().get(i).toString());
		}
	}

	public static void main(String[] args) {
		MeczRunner meczRunner = new MeczRunner();
		meczRunner.run();
	}
}
