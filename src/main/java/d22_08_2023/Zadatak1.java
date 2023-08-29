package d22_08_2023;

//1.	Napisati program koji sabira brojeve koje korisnik unosi, pritom da suma ne predje 100.Na kraju programa ispisati sracunatu sumu.
//Unesite vrednost: 20
//Unesite vrednost: 50
//Unesite vrednost: 50
//Prekoracenje! Kraj programa. Sracunata suma je 70

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int sum = 0;
        boolean isOverLimit = false;

        while (!isOverLimit){
            System.out.println("Unesite vrednost:");
            int number = s.nextInt();
           // sum = sum + number;

            if (sum + number > 100){
                System.out.println("Prekoracenje");
//                System.out.println("Sracunata suma je: " + sum);
                isOverLimit = true;

            } else {
                sum = sum + number;
            }
        }

        System.out.println("Sracunata suma je: " + sum);

    }
}
