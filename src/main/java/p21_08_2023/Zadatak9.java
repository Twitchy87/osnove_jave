package p21_08_2023;

//9.	(Za vezbanje) Napisati program koji za sve petocifene brojeve radi mirror opciju.
//Primer izvrsenja:
//Unesite broj: 32492
//Novi broj je 29423

import java.util.Scanner;

public class Zadatak9 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite petocifren broj:");
        int number = s.nextInt();

        int pom = number;
        int pom2 = 0;
        int pom3 = 0;
        int pom4 = 0;
        for (int i = 0; i < 5; i++) {
            pom2 = pom /10 *10;
            pom3 = pom - pom2;
            pom = pom2 / 10;
//            pom4 = pom3;
            pom4 = pom4 * 10 + pom3;

//           if(i >= 0 && i <= 4) {
//               pom2 = pom /10 *10;
//               pom3 = pom - pom2;
//               pom = pom2 / 10;
//               pom4 = pom3;
//                pom4 = pom4 * 10 + pom3;
//            } else {
//               pom4 = pom4 + pom3;
//           }

            //II nacin:
            //int res = 0;
            // for (int i = 0; i < 5; i++)
            // int cifra = number % 10
//            number = number/10
//            res = res * 10 + cifra;
        }

        System.out.println("Novi broj je: " + pom4);
    }
}
