package Grzecznie;

import java.util.Scanner;

public class Potega {
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("Podaj a");
	int a= scanner.nextInt();
	System.out.println("Podaj b");
	int b= scanner.nextInt();
	int wynik= dodaj(a,b);
	int wynik2=mnozenie(a,b);
	int wynik3=potega(a,b);
	System.out.println(wynik3);
	
	
	
}



private static int potega(int a, int b) {
int k=1;
for(int i=0; i<b;i++) {
	k=(mnozenie(k,a));
}
	return k;
}



private static int mnozenie(int a, int b) {
	
	return a*b;
}

private static int dodaj(int a, int b) {
	
	return a+b;
}
}
