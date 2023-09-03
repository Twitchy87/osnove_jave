package d25_08_2023;

//2.	Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
//ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite prvi broj:");
        int brojA = s.nextInt();

        System.out.println("Unesite drugi broj:");
        int brojB = s.nextInt();

        int noviBroj = spojiBrojeve(brojA, brojB);

        System.out.println("Novi broj je: " + noviBroj);

    }

    public static int spojiBrojeve(int a, int b){
        return a * 10 + b;
    }
}
