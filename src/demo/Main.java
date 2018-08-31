package demo;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		Pies pies1 = new Pies(5.0f, 3, 1.0f, "Jamnik", "Azor");
		
		System.out.println("Nazwij psa");
		
		String imie = scanner.nextLine();
		
		pies1.nadajImie(imie);
		
		pies1.jakSieNazwyasz();
	}
}
