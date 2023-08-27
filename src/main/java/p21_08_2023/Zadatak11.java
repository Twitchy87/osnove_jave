package p21_08_2023;

//11.	(ZA VEZBANJE)Napisati program prikazuje koliko je svaki od unetih passworda jak. Korisnik unosi N passworda i za svaki se ispisuje jacina.
//Svaki uslov koji password ispunjava dodaje po 1 poen:
//●	duzina veca od 8
//●	sadrzi @ specijalan karakter
//
//		Primer izvrsenja:
//		Unesite N: 3
//		Unesite password: passwdr
//		Password ima 0 poena.
//Unesite password: password123
//		Password ima 1 poena.
//		Unesite password: password@123
//		Password ima 2 poena.

import java.util.Scanner;

public class Zadatak11 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Koliko passworda zelite da unesete?");
        int number = s.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.println("Unesite password:");
            String password = s.next();

            int counter = 0;
            if (password.length() > 8 && password.contains("@")){
                counter += 2;
            } else if (password.length() > 8 || password.contains("@")) {
                counter++;
            }

            System.out.println("Password ima " + counter + " poena.");
        }
    }
}
