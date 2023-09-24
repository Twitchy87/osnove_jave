package p12_09_2023;
//Kreirati klasu Sastojak koja ima:
//●	naziv sastojka
//●	cenu
//●	gettere i settere
//●	konstuktore
//
//
//--U glavnom programu kreirati 3 sastojka.
// U glavnom programu kreirati niz sastojaka ucitavajuci ih od korisnika. Ucitavaju se N sastojaka i na kraju odstampati niz. Koristeci ArrayList-e

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

        Sastojak sastojak1 = new Sastojak("Makarone", 99.99);
        Sastojak sastojak2 = new Sastojak("Cokolada", 120);
        Sastojak sastojak3 = new Sastojak("Kafa", 549.99);

        Scanner s = new Scanner(System.in);

        System.out.println("Koliko sastojaka zelite da unesete?");
        int brojSastojaka = s.nextInt();

        ArrayList<Sastojak> sastojci = new ArrayList<>();

        for (int i = 0; i < brojSastojaka; i++) {
            System.out.println("Unesite sastojak:");
            String sastojak = s.next();

            System.out.println("Unesite cenu:");
            double cena = s.nextDouble();

            sastojci.add(new Sastojak(sastojak, cena));
        }

        System.out.println("Sastojak 1: " + sastojak1.getNaziv() + ", cena: " + sastojak1.getCena() + " din.");
        System.out.println("Sastojak 2: " + sastojak2.getNaziv() + ", cena: " + sastojak2.getCena() + " din.");
        System.out.println("Sastojak 3: " + sastojak3.getNaziv() + ", cena: " + sastojak3.getCena() + " din.");
        System.out.println();

        for (int i = 0; i < sastojci.size(); i++) {
            System.out.println("Sastojak " + (i + 1) + ": " + sastojci.get(i).getNaziv() + ", cena: " + sastojci.get(i).getCena() + " din.");
        }
    }
}
