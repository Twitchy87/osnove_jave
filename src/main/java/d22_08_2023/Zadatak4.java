package d22_08_2023;

//4.	Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
//Primer izvrsenja 1:
//Unesite broj:1
//Unesite broj:2
//Unesite broj:0
//Unesite broj:2
//Kraj programa.
//(Objasnjenje: Kraj jer je uneto dve dvojke)
//
//Primer izvrsenja 1:
//Unesite broj:1
//Unesite broj:2
//Unesite broj:1
//Unesite broj:3
//Unesite broj:1
//Kraj programa.
//(Objasnjenje: Kraj jer je uneto tri jedinice)

import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int counterOne = 0;
        int counterTwo = 0;
        String message = "";
        boolean isOver = false;

        while (!isOver){
            System.out.println("Unesite broj:");
            int number = s.nextInt();

            if (number == 1){
                counterOne++;
            } else if (number == 2) {
                counterTwo++;
            }

            if (counterOne == 3){
                isOver = true;
                message = "Uneli ste tri jedinice.";
            } else if (counterTwo == 2) {
                isOver = true;
                message = "Uneli ste dve dvojke.";
            }
        }

            System.out.println(message);
    }
}
