package d07_09_2023;
//Zadatak 4: Kreiranje klase "Film"
//Napišite klasu "Film" sa atributima: naslov (String), godinaIzdanja (int) i reziser (String). U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti unosom sa tastature. Ispisati informacije o filmovima.

import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Film film1 = new Film();

        System.out.println("Unesite naslov filma:");
        film1.naslov = s.next();

        System.out.println("Godina izdanja:");
        film1.godinaIzdanja = s.nextInt();

        System.out.println("Reziser:");
        film1.reziser = s.next();

        Film film2 = new Film();

        System.out.println("Unesite naslov filma:");
        film2.naslov = s.next();

        System.out.println("Godina izdanja:");
        film2.godinaIzdanja = s.nextInt();

        System.out.println("Reziser:");
        film2.reziser = s.next();

        System.out.println("Naslov filma: " + film1.naslov);
        System.out.println("Godina izdanja: " + film1.godinaIzdanja);
        System.out.println("Reziser: " + film1.reziser);
        System.out.println();

        System.out.println("Naslov filma: " + film2.naslov);
        System.out.println("Godina izdanja: " + film2.godinaIzdanja);
        System.out.println("Reziser: " + film2.reziser);

    }
}
