package p18_08_2023;

//1.	Napisati program koji sa tastature ucitava broj N i operaciju koja se izvrsava nad njim. Na kraju programa se ispisuje nova vrednost promenljive N.
//○	Ukoliko se za operaciju unese uvecaj, to uvecava promenljivu N za 1.
//●	Ukoliko se za operaciju unese smanji, to smanjuje promenljivu N za 1.
//
//	Primer izvrsenja:
//	Unesite N: 10
//	Unesite akciju: uvecaj
//	Nova vrednost za N je 11

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj N:");
        int n = s.nextInt();

        System.out.println("Unesite operaciju:");
        String operation = s.next();

        if (operation.equals("uvecaj")){
            n++;
        } //else if (operation.equals("smanji")){
           // n--;
        //}
        if (operation.equals("smanji")) {
            n--;
        }

        System.out.println("Nova vrednost broja N je " + n);
    }
}
