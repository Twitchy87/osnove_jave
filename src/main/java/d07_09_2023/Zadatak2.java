package d07_09_2023;
//Zadatak 2: Kreiranje klase "Automobil"
//Napišite klasu "Automobil" sa atributima: marka (String), model (String) i godinaProizvodnje (int). U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti. Ispisati informacije o automobilima.

public class Zadatak2 {

    public static void main(String[] args) {

        Automobil auto1 = new Automobil();

        auto1.marka = "Porsche";
        auto1.model = "Cayenne";
        auto1.godinaProizvodnje = 2015;

        Automobil auto2 = new Automobil();

        auto2.marka = "Ferrari";
        auto2.model = "F430";
        auto2.godinaProizvodnje = 2010;

        System.out.println(auto1.marka + " " + auto1.model);
        System.out.println(auto1.godinaProizvodnje);
        System.out.println();

        System.out.println(auto2.marka + " " + auto2.model);
        System.out.println(auto2.godinaProizvodnje);
    }
}
