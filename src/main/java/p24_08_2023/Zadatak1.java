package p24_08_2023;

//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i prikazuje sumu nultog i zadnjeg elementa tog niza.

import java.util.ArrayList;

public class Zadatak1 {

    public static void main(String[] args) {

        ArrayList<Integer> niz = new ArrayList<>();

        niz.add(11);
        niz.add(2);
        niz.add(37);
        niz.add(4);
        niz.add(59);

        int a = niz.get(0);
//        int b = niz.get(4);
        int b = niz.get(niz.size() - 1);
        int suma = a + b;

        System.out.println(suma);
    }
}
