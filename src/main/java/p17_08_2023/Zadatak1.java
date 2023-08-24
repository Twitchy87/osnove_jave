package p17_08_2023;

//1.	Napisati program koji sa tastature ucitava ime, prezime, broj telefona, email  i jmbg korisnika prikazuje u formatu:
//[Ime] [Prezime] - [JMBG]
//Broj Tel: [Broj telefona],
//Email: [Email],

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite ime:");
        String firstName = s.next();

        System.out.println("Unesite prezime:");
        String lastName = s.next();

        System.out.println("Unesite broj telefona:");
        String phoneNumber = s.next();

        System.out.println("Unesite email:");
        String email = s.next();

        System.out.println("Unesite JMBG:");
        String id = s.next();

        System.out.println(firstName + " " + lastName + " - " + id);
        System.out.println("Broj tel: " + phoneNumber);
        System.out.println("Email: " + email);



    }
}
