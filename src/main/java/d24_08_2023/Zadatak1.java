package d24_08_2023;

//Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni) i koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
//Primer:
//Unesite pozicjiu od 0 do 9: 3
//Unesite novu vrednost: 11
//Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(7);
        numbers.add(14);
        numbers.add(2);
        numbers.add(10);
        numbers.add(897);
        numbers.add(1987);
        numbers.add(456);
        numbers.add(48759);
        numbers.add(14025);
        numbers.add(77777);

        System.out.println("Unesite poziciju od 0 do 9:");
        int index = s.nextInt();

        System.out.println("Unesite novu vrednost:");
        int newNumber = s.nextInt();

        numbers.set(index, newNumber);

        System.out.println(numbers);
    }
}
