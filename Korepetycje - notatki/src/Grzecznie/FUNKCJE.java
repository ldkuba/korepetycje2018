package Grzecznie;

public class FUNKCJE {

	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		
		int wynik = dodaj(a, b);
		
		int wynik2 = pomnoz(a, b);
		
		System.out.println(wynik2);
		
		System.out.println(pomnoz(4,6));
		System.out.println(pomnoz(4,7));
		System.out.println(pomnoz(4,8));
		System.out.println(pomnoz(4,9));
		System.out.println(pomnoz(a,6));
		System.out.println(pomnoz(6,6));
		System.out.println(pomnoz(7,6));
		System.out.println(pomnoz(8,b));
		System.out.println(pomnoz(9,6));
		System.out.println(pomnoz(2,dodaj(5, 7)));
		System.out.println(pomnoz(pomnoz(4,5),2));
	}
	
	static int dodaj(int t, int u) {
		return t+u;
	}
	
	static int pomnoz(int a,int b) {
		
		int k=0;
		
		for(int i=0;i<b;i++) {
			k=dodaj(k, a);
		}
		
		return k;
	}

	static boolean sprawdz(String cos, char c) {
		for(int i=0; i<cos.length();i++) {
			//charAt(int n) - znak pod indeksem n
			if(cos.charAt(i) == c) {
				return true;
			} 
		}
		
		return false;
	}
}
