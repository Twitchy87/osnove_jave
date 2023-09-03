package d25_08_2023;

//Napisati metodu koja stampa podatke o korisniku u formatu:
//JMBG: [jmbg]
//Ime: [ime]
//Prezime: [prezime]
//God. rodjenja: [god]
//Aktivan: [true/false]
//Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite JMBG:");
        String jmbg = s.next();

        System.out.println("Unesite ime:");
        String ime = s.next();

        System.out.println("Unesite prezime:");
        String prezime = s.next();

        System.out.println("Unesite godinu rodjenja:");
        int godinaRodjenja = s.nextInt();

        System.out.println("Unesite da li je aktivan:");
        boolean aktivan = s.nextBoolean();

        stampajKorisnika(jmbg, ime, prezime, godinaRodjenja, aktivan);

    }

    public static void stampajKorisnika(String jmbg, String ime, String prezime, int godinaRodjenja, boolean aktivan){
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("Godina rodjenja: " + godinaRodjenja);
        if(aktivan) {
            System.out.println("Aktivan: o");
        } else {
            System.out.println("Aktivan: x");
        }
    }
}
