package d07_09_2023;
//Zadatak 5: Kreiranje klase "Oprema"
//Napišite klasu "Oprema" sa atributima: tip (String), marka (String) i cena (double). U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti unosom sa tasture. Ispisati informacije o opremi.

import java.util.Scanner;

public class Zadatak5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Oprema oprema1 = new Oprema();

        System.out.println("Unesite tip:");
        oprema1.tip = s.next();

        System.out.println("Unesite marku:");
        oprema1.marka = s.next();

        System.out.println("Unesite cenu:");
        oprema1.cena = s.nextDouble();

        Oprema oprema2 = new Oprema();

        System.out.println("Unesite tip:");
        oprema2.tip = s.next();

        System.out.println("Unesite marku:");
        oprema2.marka = s.next();

        System.out.println("Unesite cenu:");
        oprema2.cena = s.nextDouble();

        Oprema oprema3 = new Oprema();

        System.out.println("Unesite tip:");
        oprema3.tip = s.next();

        System.out.println("Unesite marku:");
        oprema3.marka = s.next();

        System.out.println("Unesite cenu:");
        oprema3.cena = s.nextDouble();

        System.out.println("Tip opreme: " + oprema1.tip);
        System.out.println("Marka: " + oprema1.marka);
        System.out.println("Cena: " + oprema1.cena);
        System.out.println();

        System.out.println("Tip opreme: " + oprema2.tip);
        System.out.println("Marka: " + oprema2.marka);
        System.out.println("Cena: " + oprema2.cena);
        System.out.println();

        System.out.println("Tip opreme: " + oprema3.tip);
        System.out.println("Marka: " + oprema3.marka);
        System.out.println("Cena: " + oprema3.cena);
    }
}
