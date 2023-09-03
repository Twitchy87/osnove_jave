package d24_08_2023;

//(Za vezbanje) Napisati program koji ucitava niz a duzine N. Nakon unosa niza a, formira se niz b tako sto se prva 3 elementa niza a kopiraju u niz b,
//a ostale elemente niza b ispuniti jedinicama.(niz b je iste duzine kao i niz a)
//
//
//	Unesite N: 6
//Unesite broj: 1
//Unesite broj: 5
//Unesite broj: 2
//Unesite broj: 7
//Unesite broj: 8
//Unesite broj: -1
//
//Niz a: 1, 5, 2, 7, 8, -1
//Niz b: 1, 5, 2, 1, 1, 1

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak7 {

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

        ArrayList<Integer> numbers2 = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (i < 3) {
                numbers2.add(numbers.get(i));
            } else {
                numbers2.add(1);
            }
        }

        System.out.println("Niz a: " + numbers);
        System.out.println("Niz b: " + numbers2);
    }
}
