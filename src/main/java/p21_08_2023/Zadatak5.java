package p21_08_2023;

//Napisati program koji od korisnika ucitava N brojeva  i ispisuje sumu tih brojeva. N nam kaze koliko broja ce korisnik da unese.
//Primer izvrsenja:
//Unesite N: 3
//Unesite broj: 1
//Unesite broj: 4
//Unesite broj: 9
//Suma je 14.

import java.util.Scanner;

public class Zadatak5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj n:");
        int n = s.nextInt();

        int suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj:");
            int a = s.nextInt();

            suma = suma + a;
        }

        System.out.println("Suma unetih brojeva je: " + suma);
    }
}
