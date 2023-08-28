package p22_08_2023;

//Napisati program koji radi bipovanje ruznih reci. Program radi za jednu recenicu, sto znaci da ucitava od korisnika rec po rec sve dok se ne unese rec sa tackom. Za reci koje su nepristojne ispisuje beeeeeeeeeeeeep.
//Ruzne reci koje program prepoznaje su:
//●	zajebava
//●	mars
//●	stoko
//●	svinjo
//Unesite rec: Jel
//Jel
//Unesite rec:ti
//ti
//Unesite rec:to
//to
//Unesite rec:mene
//mene
//Unesite rec:zajebavas
//beeeeeeeeeep
//Unesite rec:stoko
//beeeeeeeeeep
//Unesite rec:jedna.
//jedna.
//Kraj programa.

import java.util.Scanner;

public class Zadatak6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String word = "";

        while (!word.endsWith(".")) {
            System.out.print("Unesite rec: ");
            word = s.next();

            if (word.contains("zajebava") || word.contains("mars") || word.contains("stoko") || word.contains("svinjo")) {
                System.out.println("beeeeeeeeeeep");
            } else {
                System.out.println(word);
            }
        }

        //boolean endOfLine = false;
//        while(!endOfLine){
//            .....

//            if (word.contains("."){
//                    endOfLine = true;
//                }
//        }
    }
}
