package p24_08_2023;

//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i koji zamenjuje vrednosti prvog (na poziciji nula) i zadnjeg elemnta niza.
//Objasnjenje: Ako je niz 2,4,5,6,7 nakon izmene treba da bude 7,4,5,6,2
//Napomena: U zadataku nakon kreiraanja niza, ne treba da se desi kod koji setuje fiksne vrednosti u niz.

import java.util.ArrayList;

public class Zadatak3 {

    public static void main(String[] args) {

        ArrayList<Integer> niz = new ArrayList<>();

        niz.add(11);
        niz.add(2);
        niz.add(37);
        niz.add(4);
        niz.add(59);

        int a = niz.get(0);
        int b = niz.get(niz.size() - 1);

        niz.set(0, b);
        niz.set(niz.size() - 1, a);

        System.out.println(niz);
    }
}
