package d18_08_2023;

//6.	(Za vezbanje) Napisati program koji ucitava dimenziju table i stampa je na ekranu.
//Primer izvrsenja:
//Unesite dimenziju table: 5
// _|_|_|_|_|
// _|_|_|_|_|
// _|_|_|_|_|
// _|_|_|_|_|
// _|_|_|_|_|
//
//Primver izvrsenja 2:
//Unesite dimenziju table: 7
// _|_|_|_|_|_|_|
// _|_|_|_|_|_|_|
// _|_|_|_|_|_|_|
// _|_|_|_|_|_|_|
// _|_|_|_|_|_|_|
// _|_|_|_|_|_|_|
// _|_|_|_|_|_|_|

import java.util.Scanner;

public class Zadatak6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite dimenziju table:");
        int dimenzija = s.nextInt();

        for (int i = 1; i <= dimenzija ; i++) {

            for(int j = 1; j <= dimenzija; j++) {

                if (j % dimenzija == 0) {
                    System.out.println("_|");
                } else {
                    System.out.print("_|");
                }
            }
        }
    }
}
