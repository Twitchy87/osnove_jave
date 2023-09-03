package p25_08_2023;

//Napisati metodu koja stampa N zvezdica u istom redu, na kraju reda stampa novi red.. Broj zvezdica je odredjen parametrom N.
//Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
//N=5, print je=> * * * * *
//
//Ako se metoda pozove za N = 9, metoda stampa 9 zvezdica i enter
//N=9, print je=> * * * * * * * * *
//
//(DOPUNA)
//Napisati main program koji koristi kreiranu metodu tako da stampa sledecu sliku za M. M unosi korisnik. Zadatak resiti koristeci petlju u main metodi.
//Primer izvrsenja:
//Unesite M: 6
//*
//* *
//* * *
//* * * *
//* * * * *
//* * * * * *

import java.util.Scanner;

public class Zadatak5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj zvezdica:");
        int star = s.nextInt();

        printStar(star);
        System.out.println();

        System.out.println("Unesite broj redova:");
        int row = s.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = i; j < i + 1 ; j++) {
                printStar(i);
           }
        }
    }
    public static void printStar(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
