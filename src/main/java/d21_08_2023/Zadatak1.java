package d21_08_2023;

//1.	Napisati program koji od korisnika ucitava N brojeva i sabira samo parne brojeve. Na kraju programa prikazati sumu.
//Primer izvrsenja:
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: 2
//Unesite broj: 9
//Unesite broj: 6
//Unesite broj: 8
//Suma parnih brojeva je 16
//Objasnjenje: 2 + 6 + 8 = 16

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Koliko brojeva zelite da unesete?");
        int number = s.nextInt();

        int res = 0;

        for (int i = 1; i <= number ; i++) {
            System.out.println("Unesite broj " + i + ":");
            int number2 = s.nextInt();

            if(number2 % 2 == 0){
                res = res + number2;
            }
        }

        if(res != 0) {
            System.out.println("Suma parnih brojeva je: " + res);
        } else {
            System.out.println("Niste uneli nijedan parni broj.");
        }
    }
}
