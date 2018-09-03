package Grzecznie;

public class TablicaForZad {
	public static void main(String[] args) {

		int[] tablica = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] tablica2 = coDrugi(tablica);
		
		for(int i = 0; i < tablica2.length; i++)
			System.out.print(tablica2[i]);
	
	}
	
	static int[] coDrugi(int[] t) {

		int[] nowaTablica = new int[t.length / 2];
		for (int i = 0; i < t.length; i += 2) {
			nowaTablica[i / 2] = t[i];
		}
		return nowaTablica;
	}
}
