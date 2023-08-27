package p21_08_2023;

//8.	(Za vezbanje) Napisati program koji za sve petocifrene brojeve izvlaci sve cifre i stampa ih na ekranu.
//Primer izvrsenja:
//Unesite broj: 19452
//2, 5, 4, 9, 1

import java.util.Scanner;

public class Zadatak8 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite petocifren broj:");
        int number = s.nextInt();

        int pom = number;

        for (int i = 0; i < 5; i++) {
            int num2 = pom / 10 * 10;
            int num3 = pom - num2;
            pom = (pom - num3) / 10;
            System.out.print(num3 + ", ");
        }

        //II nacin:
        //for (int i = 0; i < 5; i++) {
        //int pom = number % 10;
        //number = number/10;
    }
}
