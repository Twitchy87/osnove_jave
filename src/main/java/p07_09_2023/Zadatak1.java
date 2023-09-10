package p07_09_2023;
//1.Zad
////		Kreirati klasu Racun koja ima
////		broj racuna (npr: 840-23932-323)
////		ime i prezime vlasnika
////		stanje na racunu
////		U mainu kreirati minimum dva racuna sa pratecim podacima i ostampati podatke za svaki objekat.
//Dopuniti zadatak tako da se vrsi transakcija sa prvog na drugi racun. Korisnik unosi svotu koja se skida sa prvog i prebacuje na drugi racun.
//
//Primer izvrsenja:
//Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 1000
//Primalac: Marko Markovic, 840-23932-334, stanje: 200
//Unesite sumu za transakciju: 500
//Stanje nakon stransakcije
//Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 500
//Primalac: Marko Markovic, 840-23932-334, stanje: 700

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        Racun racun1 = new Racun();

        racun1.broj = "123-1234667-89";
        racun1.ime = "Pera";
        racun1.prezime = "Peric";
        racun1.stanje = 12345.36;

        Racun racun2 = new Racun();

        racun2.broj = "123-12347777-89";
        racun2.ime = "Laza";
        racun2.prezime = "Lazic";
        racun2.stanje = 456987.12;

        System.out.println("Broj racuna: " + racun1.broj);
        System.out.println("Ime vlasnika: " + racun1.ime);
        System.out.println("Prezime vlasnika: " + racun1.prezime);
        System.out.println("Stanje na racunu: " + racun1.stanje);

        System.out.println();

        System.out.println("Broj racuna: " + racun2.broj);
        System.out.println("Ime vlasnika: " + racun2.ime);
        System.out.println("Prezime vlasnika: " + racun2.prezime);
        System.out.println("Stanje na racunu: " + racun2.stanje);

        System.out.println();

        System.out.println("Posiljalac: " + racun2.ime + " " + racun2.prezime + ", " + racun2.broj + ", stanje: " + racun2.stanje );

        System.out.println("Primalac: " + racun1.ime + " " + racun1.prezime + ", " + racun1.broj + ", stanje: " + racun1.stanje );

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite sumu za transakciju: ");
        double suma = s.nextDouble();

        racun2.stanje = racun2.stanje - suma;
        racun1.stanje = racun1.stanje + suma;

        System.out.println("Stanje nakon transakcije: ");

        System.out.println("Posiljalac: " + racun2.ime + " " + racun2.prezime + ", " + racun2.broj + ", stanje: " + racun2.stanje );

        System.out.println("Primalac: " + racun1.ime + " " + racun1.prezime + ", " + racun1.broj + ", stanje: " + racun1.stanje );
    }
}
