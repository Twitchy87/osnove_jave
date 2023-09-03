package p25_08_2023;
//Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja. Brojevi su ulazni parametri funkcije. U gravnom programu pozvati nekoliko puta funkciju sa razlicitim prosledjenim vrednostima.

import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj operacija:");
        int number = s.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.println("Unesite broj a:");
            int a = s.nextInt();

            System.out.println("Unesite broj b:");
            int b = s.nextInt();

            operations(a,b);
        }
    }

    public static void operations(int x, int y){
        int a = x + y;
        int b = x - y;
        int c = x / y;
        int d = x * y;

        System.out.println("Zbir je: " + a);
        System.out.println("Razlika je: " + b);
        System.out.println("Kolicnik je: " + c);
        System.out.println("Proizvod je: " + d);
    }
}
