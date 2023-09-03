package p24_08_2023;

//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i koji prikazuje element na poziciji K. K unosi korisnik i smatrajte da unosi u opsegu od 0 do 4.
//Primer:
//Unesite pozicjiu: 2
//Na pozicji 2 je vrednost 7.

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<Integer> niz = new ArrayList<>();

        niz.add(11);
        niz.add(2);
        niz.add(37);
        niz.add(4);
        niz.add(59);

        System.out.println("Unesite poziciju:");
        int index = s.nextInt();

        System.out.println("Na poziciji " + index + " je vrednost " + niz.get(index));
    }
}
