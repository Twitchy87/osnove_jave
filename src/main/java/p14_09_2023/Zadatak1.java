package p14_09_2023;
//1.	Zadatak
//
//Kreirati klasu Sastojak koja ima:
//●	naziv
//●	cenu
//●	gettere i settere
//●	konstruktore
//●	metodu za stampanje koja stampa  podatke u formatu:
//naziv - cena.din
//
//	Kreirati klasu Pasta koja ima:
//●	niz sastojaka
//●	metodu za dodavanje sastojka
//●	defaultni konstruktor
//●	metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
//●	metodu za stampu koja stampa podatke u formatu:
//Pasta je sa sastojcima:
//naziv - cena.din
//naziv - cena.din
//naziv - cena.din
//Cena paste je <sracunata cena paste>.din
//
//U glavnom programu kreirati objekte i testirati funkcionalnosti
//
//●	(ostavite za kraj) metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.

public class Zadatak1 {

    public static void main(String[] args) {

        Sastojak sastojak1 = new Sastojak("Mleveno meso", 100);
        Sastojak sastojak2 = new Sastojak("Luk", 20);
        Sastojak sastojak3 = new Sastojak("Paradajz sos", 50);
        Sastojak sastojak4 = new Sastojak("Makarone", 70);

        Pasta pasta = new Pasta();

        pasta.dodajSastojak(sastojak1);
        pasta.dodajSastojak(sastojak2);
        pasta.dodajSastojak(sastojak2);
        pasta.dodajSastojak(sastojak3);
        pasta.dodajSastojak(sastojak4);
        pasta.dodajSastojak(sastojak2);

        pasta.stampaj();

        pasta.obrisiSastojak("Luk");

        System.out.println("---------------");
        pasta.stampaj();
    }
}
