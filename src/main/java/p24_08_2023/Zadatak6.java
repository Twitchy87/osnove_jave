package p24_08_2023;

// Napisati program koji vrsi mesanje niza. Niz je duzine 10, proizvoljnih brojeva.
//Mesanje niza se vrsi tako sto se 8 puta vrsi zamena dva random elementa iz niza.
//primer jedne zamene:
//Ako je niz
//1,2,3,4,5,6,7,8,9,10
//i prvi random indeks je 4 a drugi random indeks je 6
//1,2,3,4,7,6,5,8,9,10

import java.util.ArrayList;
import java.util.Random;

public class Zadatak6 {

    public static void main(String[] args) {

        ArrayList<Integer> niz = new ArrayList<>();

        niz.add(11);
        niz.add(2);
        niz.add(37);
        niz.add(4);
        niz.add(59);
        niz.add(111);
        niz.add(27);
        niz.add(39);
        niz.add(478);
        niz.add(591);

        int a = 0;
        int b = 0;
        Random random = new Random();

        for (int i = 0; i < 8; i++) {

            int x = random.nextInt(10);
            a = niz.get(x);

            int y = random.nextInt(10);
            b = niz.get(y);

            niz.set(y, a);
            niz.set(x, b);

        }

        System.out.println(niz);
    }
}
