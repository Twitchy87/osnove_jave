package d24_08_2023;

//Napisati program koji ucitava N brojeva i smesta ih u niz. Zatim, iz niza, broji koliko je parnih brojeva uneto. brojeve unosi korisnik.
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: 3
//Unesite broj: 4
//Unesite broj: 7
//Unesite broj: 8
//U nizu ima 2 parna broja.

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList <Integer> numbers = new ArrayList<>();

        System.out.println("Koliko brojeva zelite da unesete?");
        int number = s.nextInt();

        int evenNumbersCounter = 0;

        for (int i = 0; i < number; i++) {
            System.out.println("Unesite broj:");
            int input = s.nextInt();
            numbers.add(input);
        }

        for (int i = 0; i < number; i++) {
            if (numbers.get(i) % 2 == 0) {
                evenNumbersCounter++;
            }
        }

//        System.out.println(numbers);
        if (evenNumbersCounter > 0) {
            System.out.println("U nizu ima " + evenNumbersCounter + " parna broja.");
        } else {
            System.out.println("Niste uneli nijedan parni broj.");
        }
    }
}
