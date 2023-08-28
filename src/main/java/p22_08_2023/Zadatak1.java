package p22_08_2023;

//Napisati program koji validira unos input polja za broj. Polje za unos prima samo brojeve u opsegu od 10 do 50.Korisnik unosi vrednosti dok ne unese validan  broj.
//Primer izvrsenja:
//Unesite broj: 5
//Greska: Broj nije u opsegu od 10 do 50.
//Unesite broj: -1
//Greska: Broj nije u opsegu od 10 do 50.
//Unesite broj: 51
//Greska: Broj nije u opsegu od 10 do 50.
//Unesite broj: 4
//KRAJ

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int broj = -1;

        while (broj <= 10 || broj >= 50){

            System.out.println("Unesite broj izmedju 10 i 50:");
            broj = s.nextInt();

            if (broj <= 10 || broj >= 50){
                System.out.println("Broj nije u opsegu od 10 do 50");
            }
        }

        System.out.println("Kraj");

        //II nacin

//        Scanner s = new Scanner(System.in);
//        System.out.println("Unesite broj izmedju 10 i 50:");
//        int broj = s.nextInt();
//        while (broj <= 10 || broj >= 50) {
//            System.out.println("Broj nije u opsegu od 10 do 50");
//            System.out.println("Unesite broj izmedju 10 i 50:");
//            broj = s.nextInt();
//        }
//        System.out.println("Kraj");

//        III nacin - sistem zastavice (univerzalno resenje)

//        Scanner s = new Scanner(System.in);
//        int broj = 0;
//        int kraj = 0; ( ili boolean isValid = false)

//        while (kraj == 0 ili isValid == false){
//            System.out.println("Unesite broj izmedju 10 i 50:");
//            broj = s.nextInt();
//
//            if (broj <= 10 || broj >= 50){
//                System.out.println("Broj nije u opsegu od 10 do 50");
//            }
//               if(broj > 10 && broj < 50){
//                  kraj = 1; (ili isValid = true;)
//               }
//        }
//        System.out.println("Kraj");

    }
}
