package d07_09_2023;
// Zadatak 3: Kreiranje klase "Proizvod"
//Napišite klasu "Proizvod" sa atributima: naziv (String) i cena (double). U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti. Ispisati informacije o proizvodima.

public class Zadatak3 {

    public static void main(String[] args) {

        Proizvod proizvod1 = new Proizvod();

        proizvod1.naziv = "Kapa";
        proizvod1.cena = 2700;

        Proizvod proizvod2 = new Proizvod();

        proizvod2.naziv = "Sal";
        proizvod2.cena = 2600;

        Proizvod proizvod3 = new Proizvod();

        proizvod3.naziv = "Ranac";
        proizvod3.cena = 3500;

        System.out.println("Naziv proizvoda: " + proizvod1.naziv);
        System.out.println("Cena proizvoda: " + proizvod1.cena);
        System.out.println();

        System.out.println("Naziv proizvoda: " + proizvod2.naziv);
        System.out.println("Cena proizvoda: " + proizvod2.cena);
        System.out.println();

        System.out.println("Naziv proizvoda: " + proizvod3.naziv);
        System.out.println("Cena proizvoda: " + proizvod3.cena);
    }
}
