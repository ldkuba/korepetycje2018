package Koszykowka;

public class Koszykarz {
	private String imie;
	private String nazwisko;
	private int wzrost;
	
	public Koszykarz(String imie, String nazwisko, int wzrost) throws NegativeNumberException {
		
		this.imie=imie;
		this.nazwisko=nazwisko;
		
		if(wzrost < 0)
		{
	    	throw new NegativeNumberException();
		}
		
		this.wzrost = wzrost;
	}
	
	public int getWzrost() {
		return wzrost;
	}
	public String toString() {
	    return "Koszykarz [imie=" + imie + ", nazwisko=" + nazwisko + ", wzrost=" + wzrost +"]";
	}

}
