package d24_08_2023;

//5.	. Napisati program koji ucitava niz A duzine N i broj X. Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.
//	Primer izvrsenja:
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: 3
//Unesite broj: 7
//Unesite broj: 3
//Unesite broj: 9
//Unesite X: 3
//
//Rezultat: Elementi niza A koji su jednaki broju X imaju indekse: 1, 3

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

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

        System.out.println("Unesite broj x:");
        int x = s.nextInt();

        System.out.println("Elementi niza A koji su jednaki broju X imaju indekse: ");

        for (int i = 0; i < numbers.size() ; i++) {
            if (numbers.get(i) == x) {
                System.out.print(i + ", ");
            }
        }
    }
}
