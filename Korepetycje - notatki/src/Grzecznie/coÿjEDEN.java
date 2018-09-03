package Grzecznie;

public class coœjEDEN 
{
	
	public static void main(String[] args)
	{
		// typ nazwa;
		
		// INT ============================
		
		// -2.9 * 10^8 -> 2.8 * 10^8
		
		int a = 8;
		
		int a1 = 5;
		
		int b = a + a1;
		int b1 = a - a1;
		int b2 = a * a1;
		int b3 = a / a1;
		int b4 = a % a1;
		
		// CHAR ============================
		
		// 0 - 255
		
		char c = 'a';
		
		// FLOAT ===========================
		
		float f = 5.7f;
		
		// DOUBLE ==========================
		
		double d = 5.7;
		
		// BOOLEAN =========================
		
		boolean bool = true;
		boolean bool2 = false;
		
		// ! - negacja
		
		System.out.println(bool);
		System.out.println(!bool);
		
		// STRING ========================== (NIE JEST TYPEM PODSTAWOWYM)
		
		String str = "Zamek";
		String str2 = " w Poznaniu";
		
		System.out.println(str.charAt(4));
		System.out.println(str.length());
		
		System.out.println(str + str2);
		
		// TABLIE ==========================
		
		// typ[] nazwa;
		
		int[] tabA = new int[5];  		//[0, 0, 0, 11, 0] tabA
		int[] tabB = {1, 2, 3, 4, 5};   //[1, 2, 3, 9, 5] tabB
		
		System.out.println(tabA[3]);
		System.out.println(tabB[3]);
		
		tabA[3] = 11;
		tabB[3] = 9;
		
		System.out.println(tabA[3]);
		System.out.println(tabB[3]);
		
		
		// IF, IF ELSE, IF ELSE IF =============
		
		// WHILE, DO WHILE
		
		int g1 = 64;
		
		while(g1 > 2)
		{
			System.out.println(g1);
			g1 /= 2;
		}
		
		/// ==========
		g1 = 10;
		
		do {
			g1--;
		} while (g1 > 100);
		
//		while(g1 > 100) //while robi dopoki jest prawda
//		{
//			g1--;
//		}
//		
		System.out.println(g1);
		
		// FOR =======================================
		
		// for ( zmienne i inicjaizacje, warunek zakonczenia, krok) 
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println(i);
		}
			
	}
}
