package p17_08_2023;

//9.	(Za vezbanje) Napisati program za potrebe Makao igrice. Korisnik unosi 4 informacije:
//a.	znak karte koja je na stolu
//b.	broj karte koja je na stolu
//c.	znak karte koju igrac zeli da odigra
//d.	broj karte koju igrac zeli da odigra
//	i nakon toga se na ekranu ispisuje da li je potez ispravan. Potez je ispravan ukoliko se karta na stolu i odigrana karta poklapaju po znaku ili broju.
//
//	Znakovi karata: srce, kocka, list, detelina
//	Brojevi karata: 2,3,4,5,6,7,8,9,10,A,J,Q,K

import java.util.Scanner;

public class Zadatak9 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite znak karte na stolu:");
        String cardSuitTable = s.next();

        System.out.println("Unesite broj karte na stolu:");
        String cardTable = s.next();

        System.out.println("Unesite znak karte koju zelite da odigrate:");
        String cardSuitPlayer = s.next();

        System.out.println("Unesite broj karte koju zelite da odigrate:");
        String cardPlayer = s.next();

        if(cardSuitTable.equals(cardSuitPlayer) || cardTable.equals(cardPlayer)){
            System.out.println("Potez je validan.");
        } else {
            System.out.println("Potez nije validan.");
        }

    }
}
