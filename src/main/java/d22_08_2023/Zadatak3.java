package d22_08_2023;

//3.	Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..
//
//Primer izvrsenja:
//Unesite rimski broj: X
//Arapski: 10
//Unesite rimski broj: C
//Arapski: 50
//Unesite rimski broj: D
//Arapski: 500
//Unesite rimski broj: M
//Arapski: 1000
//Unesite rimski broj: I
//Arapski: 1
//Unesite rimski broj: KRAJ
//Kraj programa.

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        boolean isOver = false;

        while (!isOver) {
            System.out.println("Unesite rimski broj:");
            String romanNumber = s.next();

            String romanNumberLower = romanNumber.toLowerCase();
            int arabicNumber = 0;

            if (romanNumberLower.equals("kraj")) {
                isOver = true;
                System.out.println("Kraj programa.");
            } else {
                if (romanNumberLower.equals("i")) {
                    arabicNumber = 1;
                } else if (romanNumberLower.equals("v")) {
                    arabicNumber = 5;
                } else if (romanNumberLower.equals("x")) {
                    arabicNumber = 10;
                } else if (romanNumberLower.equals("l")) {
                    arabicNumber = 50;
                } else if (romanNumberLower.equals("c")) {
                    arabicNumber = 100;
                } else if (romanNumberLower.equals("d")) {
                    arabicNumber = 500;
                } else if (romanNumberLower.equals("m")) {
                    arabicNumber = 1000;
                }
                System.out.println("Arapski broj: " + arabicNumber);

            }
        }
    }
}
