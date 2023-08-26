package p18_08_2023;

//3.	Napisati program koji ispisuje za uneti broj a da li je deljiv sa 2 ili sa 3.Ispisati poruke na kraju programa u obe situacije.

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj a:");
        int a = s.nextInt();

        if(a % 2 == 0 && a % 3 == 0){
            System.out.println("Broj " + a + " je deljiv i sa 2 i sa 3.");
        } else if(a % 2 == 0){
            System.out.println("Broj " + a + " je deljiv sa 2.");
        } else if (a % 3 == 0) {
            System.out.println("Broj " + a + " je deljiv sa 3.");
        } else {
            System.out.println("Broj " + a + " nije deljiv ni sa 2 ni sa 3.");
        }
    }
}
