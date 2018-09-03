package Grzecznie;

import java.util.Scanner;

public class Main2 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		/*System.out.println("Podaj a i b");
		
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println( a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a*b);
		System.out.println(a%b);
		*/	
		
		/*
		String[] tydzien= new String[7];
		
		tydzien[0]= "poniedzialek";
		tydzien[1]="wtorek";
		tydzien[2]="sroda";
		tydzien[3]="czwartek";
		tydzien[4]="piatek";
		tydzien[5]="sobota";
		tydzien[6]="niedziela";
		
		
		System.out.print(tydzien[0] +", " + tydzien[3] + ", "+ tydzien[6] );
		
		*/
		
		/*int a = scanner.nextInt();
		
		if(a > 10)
		{
			System.out.println("Wieksze niz 10");
		}else if(a > 5)
		{
			System.out.println("Miedzy 5 a 10");
		}else if(a > 3)
		{
			System.out.println("Miedzy 5 a 3");
		}else
		{
			System.out.println("Mniejsze niz 3");
		}*/
			
//		int a = scanner.nextInt();
//		
//		switch(a)
//		{
//		case 1:
//			System.out.println("1");
//			break;
//		case 2:
//			System.out.println("2");
//			break;
//		case 3:
//			System.out.println("3");
//			break;
//		case 4:
//			System.out.println("4");
//			break;
//		}
//		
		
/*		String ulu = "rozowy";  //null nie moge operowac, tylko na obiektach np String
		
		
		String kolor= " ";
	
		kolor= scanner.nextLine();
		
		
		while (!ulu.equals(kolor)) {   //equals zwraca prawde/falsz
			System.out.println("z³y kolor");
			kolor= scanner.nextLine();

		}
		System.out.println("Brawo zgadniête");
		
		*/
		/*
		
		int n = scanner.nextInt();
		for(int i=n; i>=0 ;i--) {
			System.out.println(i);
		}
		*/
		
		int n= scanner.nextInt();
		scanner.nextLine();
		String[] slownik = new String[n];
		for (int i = 0; i<n ; i++) {
			String slowo = scanner.nextLine();
			slownik[i] = slowo;
		}
		
		 String slowo = scanner.nextLine();
		 while (!slowo.equals("exit")) {
	        for (int i= 0; i<n; i++) {
	        	if (slowo.equals(slownik[i])) {
	        		System.out.println("znaleziono");
	        	}
	        }
	        
	        slowo = scanner.nextLine();
		 	}
		}
}
