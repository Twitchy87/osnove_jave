package d17_08_2023;
//1.	Napisati program koji ima informacije koje ucitava informacije sa tastature:
//●	Ime
//●	Prezime
//●	godinu rodjenja
//I stampa informaicije u formatu:
//[ime] [prezime] - [startost] god
//
//Primer izvrsenja:
//Ako je ime = Milan, prezime = Jovanovic i godina rodjenja 1995 stapaju se informacije
//Milan Jovanovic - 26 god

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite ime:");
        String firstName = s.next();

        System.out.println("Unesite prezime:");
        String lastName = s.next();

        System.out.println("Unesite godinu rodjenja:");
        int yearOfBirth = s.nextInt();

        int currentYear = 2023;
        int age = currentYear - yearOfBirth;

        System.out.println(firstName + " " + lastName + " - " + age + " god");

    }
}
