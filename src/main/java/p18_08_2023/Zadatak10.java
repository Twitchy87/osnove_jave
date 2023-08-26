package p18_08_2023;

//Napisati program koji stampa 20 pozicija.
//●	Za aktivnu poziciju stampa *
//●	Za neaktivnu pozciju stampa _
//	Korisnik unosi granice za nekativni opseg, unoseci A i B.
//	Primer izvrsenja:
//	Unesite a: 5
//	Unesite b: 10
//            * * * * _ _ _ _ _ _ * * * * * * * * * *
//	Objasnjenje: stampamo _ od 5 do 10 u ostalim situacijama stampamo *

import java.util.Scanner;

public class Zadatak10 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj a:");
        int a = s.nextInt();

        System.out.println("Unesite broj b:");
        int b = s.nextInt();

        String niz = "";

        for (int i = 1; i <= 20 ; i++) {
            if(i >= a && i <= b){
                niz = niz + "_";
            } else{
                niz = niz + "*";
            }
        }

        System.out.println(niz);
    }
}
