package d25_08_2023;

//1.	Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj:");
        int number = s.nextInt();

        stampajVrednostZa10Vecu(number);
    }

    public static void stampajVrednostZa10Vecu(int number){
        System.out.println("Novi broj je: " + (number + 10));
    }
}
