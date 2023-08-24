package p17_08_2023;

//2.	Napisati program koji sa tastature ucitava tri cela broja:
//●	dan
//●	mesec
//●	godina
//	I formira datum u ispisu u formatu dan-mesec-godina

import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite dan:");
        int day = s.nextInt();

        System.out.println("Unesite mesec:");
        int month = s.nextInt();

        System.out.println("Unesite godinu:");
        int year = s.nextInt();

        System.out.println("Datum je: " + day + "-" + month + "-" + year);

    }
}
