package d12_09_2023;
//Kreirati klasu Racun koja ima:
//●	broj racuna (npr: 170-289328923-23)
//●	ime i prezime osobe
//●	trenutno stanje na racunu (npr: 100, 1220)
//●	gettere i setter za sve atribute, sem settera za stanje na racunu
//●	metodu uplatiNaRacun kojoj se dodaje prosledjena vrednost na stanje
//●	metodu skiniSaRacunai kojom se stanje umanjuje za prosledjenja vrednost
//●	metodu koja stampa podatke o racunu u formatu:
//Ime i prezime  -  broj racuna
//stanje na racunu je (trenutno stanje) rsd.
//
//		Kreirati klasu Transakcija koja ima:
//●	id transakcije
//●	racun sa kog se prenose sredstva
//●	racun na koji se prenose sredstva
//●	gettere i settere
//●	konstruktore
//●	metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//○	ako je prenos sredstava manji od 4500, provizija je fiksna 45
//○	ako je prenos sredstava veci od 4500, provizija je 1%
//○	S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar koji predstavlja visinu transakcije
//○	Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
//●	metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije se unosi vrednost koja se prebacuje.
//Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje samo (trazena suma).
//(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
//●	metodu koja stampa podatke o transakciji u formatu:
//id transkacije
//Racun sa: Ime i prezime  -  broj racuna
//Racun na: Ime i prezime  -  broj racuna
//
//	Naravno u glavnom kreirati objekte i testirati funkcionalnosti
public class Zadatak3 {

    public static void main(String[] args) {

        Racun racun1 = new Racun("123-456789-98","Pera Peric", 172345.54);
        Racun racun2 = new Racun("452-987456-99","Laza Lazic", 12000);
        Racun racun3 = new Racun("852-956544-87", "Mika Mikic");

        Transakcija transakcija1 = new Transakcija(98563214, racun1, racun2);
        Transakcija transakcija2 = new Transakcija(1862122214, racun2, racun3);
        Transakcija transakcija3 = new Transakcija(1862122223, racun3, racun2);

        if (transakcija1.izvrsiTransakciju(1000)){
            transakcija1.stampaj();
            System.out.println("--------------------------------------");
        } else {
            System.out.println("Nemate dovoljno sredstava na svom racunu.");
        }

        if (transakcija2.izvrsiTransakciju(5000)){
            transakcija2.stampaj();
            System.out.println("--------------------------------------");
        } else {
            System.out.println("Nemate dovoljno sredstava na svom racunu.");
        }

        if (transakcija3.izvrsiTransakciju(5000)){
            transakcija3.stampaj();
            System.out.println("--------------------------------------");
        } else {
            System.out.println("Nemate dovoljno sredstava na svom racunu.");
        }

    }
}
