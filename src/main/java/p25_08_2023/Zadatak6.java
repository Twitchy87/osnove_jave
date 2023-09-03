package p25_08_2023;

//Napisati metodu koja vraca suprotno negativni broj od prosledjenog. Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//Primer: Ako se metoda pozove za N=10, vraca -10
//	Ako se metoda pozove za N=-11, vraca 11

import java.util.Scanner;

public class Zadatak6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj:");
        int number = s.nextInt();

        int number2 = getNumber(number);

        System.out.println("Vas broj: " + number + ", novi broj: " + number2);
    }

    public static int getNumber(int number){
        return number * (-1);
    }
}
