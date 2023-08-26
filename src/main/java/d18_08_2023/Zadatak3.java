package d18_08_2023;

//3.	Napisati program koji za uneti broj x (smatrajte da korisnik unosi jednocifreni broj) ispisuje tablicu mnozenja za taj broj. Resiti for petljom.
//Primer:
//Unesite x: 5
//5 x 1 = 5
//5 x 2 = 10
//5 x 3 = 15
//5 x 4 = 20
//5 x 5 = 25
//5 x 6 = 30
//5 x 7 = 35
//5 x 8 = 40
//5 x 9 = 45

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj x:");
        int x = s.nextInt();

        int y = x;

        for (int i = 1; i < 10; i++) {
            y = x * i;
            System.out.println(x + " x " + i + " = " + y);
        }
    }
}
