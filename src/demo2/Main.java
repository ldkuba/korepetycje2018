package demo2;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Podaj liczbe");
		
		String liczba = scanner.nextLine();
		int l = Integer.parseInt(liczba);
		
		wypisz(l);
	}
	
	static void wypisz(int n)
	{ 
		for(int i=0; i<n; i += 2) 
		{
			System.out.println(i);
		}
	}
}
