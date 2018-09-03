package Blad;

import java.util.Scanner;

public class BladMain {
	
	Scanner scanner;
	//stackOverflow jak nie wiem co robic to tam pytam.
	
	public void run()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj tekst: ");
		String tekst = scanner.nextLine();
		System.out.println(tekst);
	}
	
	public static void main(String[] args) {
		BladMain b = new BladMain();
		b.run();
	}
}
