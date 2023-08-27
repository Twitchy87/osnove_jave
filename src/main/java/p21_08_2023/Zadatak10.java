package p21_08_2023;

//10.	Napisati program koji sakriva uneti password..
//Primer izvrsenja:
//Unestite password: OvoJePassword123
//Skriverni password: ****************

import java.util.Scanner;

public class Zadatak10 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite password:");
        String password = s.next();

        String hiddenPassword = "";

        for (int i = 0; i < password.length(); i++) {
            hiddenPassword = hiddenPassword + "*";
        }

        System.out.println("Skriveni password: " + hiddenPassword);
    }
}
