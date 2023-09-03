package p25_08_2023;

//. Napisati metodu koja proverava da li je trougao pravougli. Metoda prima stranice trougla i hipotenuzu trougla. Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//Trougao je pravougli ukoliko je a*a+b*b=c*c

import java.util.Scanner;

public class Zadatak7 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite stranicu a:");
        int a = s.nextInt();

        System.out.println("Unesite stranicu b:");
        int b = s.nextInt();

        System.out.println("Unesite hipotenuzu:");
        int c = s.nextInt();

        boolean trougao = proveraPravougliTrougao(a, b, c);

        if (trougao){
            System.out.println("Trougao je pravougli.");
        } else {
            System.out.println("Trougao nije pravougli.");
        }

    }

    public static boolean proveraPravougliTrougao(int a, int b, int c){
        if (a * a + b * b == c * c){
            return true;
        } else {
            return false;
        }
    }
}
