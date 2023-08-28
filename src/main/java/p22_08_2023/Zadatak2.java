package p22_08_2023;

//Napisati program koji od korisnika ucitava brojeve sve dok ne unesu dve nule.
//Primer:
//Unesite broj:1
//Unesite broj:2
//Unesite broj:0
//Unesite broj:1
//Unesite broj:0
//Kraj programa jer je uneto 2 nule.

import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int broj = -1;
        int brojac = 0;

        while (brojac < 2){

            System.out.println("Unesite broj:");
            broj = s.nextInt();

            if(broj == 0){
                brojac++;
            }
        }
        System.out.println("Kraj");

    }
}
