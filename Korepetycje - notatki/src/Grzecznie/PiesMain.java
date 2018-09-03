package Grzecznie;

import Niegrecznie.Pies;

public class PiesMain {
	
	public static void main(String[] args) {
		
		Pies pies1 = new Pies("Daisy", "Berenski", 1, 50.0f);
		
		pies1.Info();
		
		Pies pies2 = new Pies("Tosia", "Z pod stodoly", 5, 5.0f);
		
		pies2.przytyl();
		
		pies2.Info();
		
	}
}
