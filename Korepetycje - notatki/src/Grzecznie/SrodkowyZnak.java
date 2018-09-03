package Grzecznie;

import java.util.Scanner;

public class SrodkowyZnak {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Napisz s³owo");
		String slowo = scanner.nextLine();
		srodkowyZnak(slowo);

	}

	static void srodkowyZnak(String s) {

		char znak = s.charAt(s.length() / 2);
		System.out.println(znak);

	}

}
