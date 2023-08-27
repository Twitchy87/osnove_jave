package d21_08_2023;

//2.	Napisati program koji ucitava N brojeva od korisnika i sabira samo trocifrene brojeve.
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: 32
//Unesite broj: 121
//Unesite broj: 1333
//Unesite broj: 144
//Suma je: 265

import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Koliko brojeva zelite da unesete?");
        int number = s.nextInt();

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            System.out.println("Unesite broj " + i + ":");
            int number2 = s.nextInt();

            if (number2 >= 100 && number2 < 1000){
                sum = sum + number2;
            }
        }

        if (sum != 0) {
            System.out.println("Suma trocifrenih brojeva je: " + sum + ".");
        } else {
            System.out.println("Niste uneli nijedan trocifren broj.");
        }
    }
}
