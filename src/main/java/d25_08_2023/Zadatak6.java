package d25_08_2023;

//6.	Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//Primer izvrsenja:
//izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1

import java.util.Scanner;

public class Zadatak6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite prvi broj:");
        int number1 = s.nextInt();

        System.out.println("Unesite drugi broj:");
        int number2 = s.nextInt();

        int counter = countNumbers(number1, number2);

        System.out.println("Izmedju " + number1 + " i " + number2 + " ima " + counter + " cela broja.");
    }

    public static int countNumbers(int number1, int number2){
        int counter = 0;
        for (int i = number1 + 1; i < number2; i++) {
            counter++;
        }
        return counter;
    }
}
