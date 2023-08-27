package p21_08_2023;

//6.	(ZA VEZBANJE)Napisati program koji od korisnika ucitava N jednocifrenih brojeva i od njih formira rezultujuci broj kao na primeru
//Unesite N: 5
//Unesite broj: 1 => 1
//Unesite broj: 2 => 12
//Unesite broj: 0 => 120
//Unesite broj: 4 …
//Unesite broj: 1
//Rezultujuci broj je 12041 (Promenljiva tipa int)
//
//a = 1
//b = 3
//c = a * 10 + b => 10 + 3 => 13

import java.util.Scanner;

public class Zadatak6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj n:");
        int n = s.nextInt();

        int result = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj:");
            int a = s.nextInt();

            result = result * 10 + a;
        }

        System.out.println("Konacan broj je: " + result);
    }
}
