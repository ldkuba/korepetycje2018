package Grzecznie;

import java.util.Scanner;

public class WykresB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj wysokoœæ s³upka A");
		int A = scanner.nextInt();
		if(A<0 || A>=9) {
			return;
		}
		
		System.out.println("Podaj wysokoœæ s³upka B");
		int B = scanner.nextInt();
		if(B<0 || B>=9 ) {
			return;
		}
		if(A==B) {
			return;
		}
		int C = Math.abs(A - B);
		System.out.println("--+-+--+-+--+-+--");
		for (int i = 1; i <= Math.max(A, B); i++) {
			System.out.print("  ");
			if (A > i) {
				System.out.print("| |");
			} else if (A == i) {
				System.out.print("+-+");
			} else {
				System.out.print("   ");
			}
			
			
			
			System.out.print("  ");
			if (B > i) {
				System.out.print("| |");
			} else if (B == i) {
				System.out.print("+-+");
			} else {
				System.out.print("   ");
			}
			
			
			
			System.out.print("  ");
			if (C > i) {
				System.out.print("| |");
			} else if (C == i) {
				System.out.print("+-+");
			} else {
				System.out.print("   ");
			}
			System.out.println("  ");
		}
	}

}
