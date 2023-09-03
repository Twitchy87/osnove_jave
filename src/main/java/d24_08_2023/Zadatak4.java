package d24_08_2023;

//Napisati program koji ucitava niz A duzine N, i koji nakon unosa niz A stampa sve elemente niza koji su veci od nule.
//Primer izvrsenja:
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: -4
//Unesite broj: 3
//Unesite broj: -7
//Unesite broj: 9
//
//Brojevi veci od nule u nizu A su: 1, 3, 9,

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Koliko brojeva zelite da unesete?");
        int limit = s.nextInt();

        for (int i = 0; i < limit; i++) {
            System.out.println("Unesite broj:");
            int number = s.nextInt();
            numbers.add(number);
        }

        System.out.println("Brojevi veci od nule su: ");

        for (int i = 0; i < numbers.size() ; i++) {
            if (numbers.get(i) > 0) {
                System.out.print(numbers.get(i) + ", ");
            }
        }
    }
}
