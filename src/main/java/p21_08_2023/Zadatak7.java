package p21_08_2023;

//7.	Napisati program koji od korisnika ucitava N brojeva  i ispisuje koliko je parnih brojeva uneo korisnik. N nam kaze koliko broja ce korisnik da unese.
//Primer izvrsenja:
//Unesite N: 6
//Unesite broj: 2
//Unesite broj: 4
//Unesite broj: 9
//Unesite broj: 12
//Unesite broj: 8
//Unesite broj: 1
//		Uneto je 4 parna broja.

import java.util.Scanner;

public class Zadatak7 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj n:");
        int n = s.nextInt();

        int counter = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj:");
            int broj = s.nextInt();

            if(broj % 2 == 0){
                counter++;
            }
        }

        if(counter > 0) {
            System.out.println("Uneli ste " + counter + " parna broja.");
        } else {
            System.out.println("Niste uneli nijedan parni broj.");
        }
    }
}
