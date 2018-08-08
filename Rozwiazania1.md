# Rozwiązania 1

#### Wypisz X'a

```java
package com.main;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wielkosc: ");
        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i == j)
                {
                    System.out.print("X");
                }else if(i == n-1-j)
                {
                    System.out.print("X");
                }else
                {
                    System.out.print(".");
                }
            }

            System.out.println("");
        }
    }
}

```

#### Kalkulator

```java
package com.main;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
		    Scanner scanner = new Scanner(System.in);

		    String linia = "";

		    while(!linia.equals("0"))
		    {
			       System.out.println("============");
			       System.out.println("Wybierz dzialanie:");
			       System.out.println("0 - zakoncz");
			       System.out.println("1 - dodaj");
			       System.out.println("2 - odejmij");
			       System.out.println("3 - pomnoz");
			       System.out.println("4 - podziel");

			       linia = scanner.nextLine();

			       if(linia.equals("0"))
			       {
				         continue;
			       }

			       System.out.println("Podaj pierwsza liczbe:");
			       int a = Integer.parseInt(scanner.nextLine());

			       System.out.println("Podaj druga liczbe:");
			       int b = Integer.parseInt(scanner.nextLine());

			       if(linia.equals("1"))
			       {
				         System.out.println("Wynik = " + (a+b));
			       }else if(linia.equals("2"))
			       {
				         System.out.println("Wynik = " + (a-b));
			       }else if(linia.equals("3"))
			       {
                 System.out.println("Wynik = " + (a*b));
			       }else if(linia.equals("4"))
			       {
				         System.out.println("Wynik = " + (a/b) + " reszta " + (a%b));
			       }
		     }
	   }
 }

```
