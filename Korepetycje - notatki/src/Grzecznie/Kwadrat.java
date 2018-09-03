package Grzecznie;

import java.util.Scanner;

public class Kwadrat {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj n");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {

			for (int k = 0; k < n; k++) {

		
				if (i == k ) {
					System.out.print("X");
					
				} else if(i==n-1-k) {
					System.out.print("X");
				
				} else {
					System.out.print(".");
				}
			}

			System.out.println(" ");
		}
	}
}
