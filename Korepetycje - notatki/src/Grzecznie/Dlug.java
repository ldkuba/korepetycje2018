package Grzecznie;

public class Dlug {
	String kraj;
	int populacja;
	int zadluzenie;

	Dlug()
	{
		zadluzenie = 1000;
		populacja = 100;
	}
	
	Dlug(String kraj, int populacja, int zadluzenie){
		this.kraj= kraj; 
		
	}
	
	void zeruj() {
		zadluzenie = 0;
	}
	
	void ustawZadluzenie(int z){
		zadluzenie = z;
		
	}
}
