package d17_08_2023;

//(Za vezbanje)Napisati program koji ucitava 4 broja (a,b,c,d) i formira string p (p ima startni deo #) tako sto negativne brojeve lepi sa leve strane a pozitivne i nulu sa desne.
//Hint: Potrebno je da se vrsi konkatanacija nad jednom promenljivom.
//Primer izvrsenja 1:
//Unesite a: 10  -> # 10
//Unesite b: -2   -> -2 # 10
//Unesite c: -1   -> -1 -2 # 10
//Unesite d: 9    -> -1 -2 # 10 9
//String p ime vrednost = -1 -2 # 10 9
//
//Primer izvrsenja 2:
//Unesite a: 5
//Unesite b: 4
//Unesite c: 41
//Unesite d: -1
//String p ime vrednost = -1 # 5 4 41

import java.util.Scanner;

public class Zadatak6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj a:");
        int a = s.nextInt();

        System.out.println("Unesite broj b:");
        int b = s.nextInt();

        System.out.println("Unesite broj c:");
        int c = s.nextInt();

        System.out.println("Unesite broj d:");
        int d = s.nextInt();

        String p = "#";

        if(a >= 0){
            p = p + a;
        } else {
            p = a + p;
        }

        if(b >= 0){
            p = p + b;
        } else {
            p = b + p;
        }

        if(c >= 0){
            p = p + c;
        } else {
            p = c + p;
        }

        if(d >= 0){
            p = p + d;
        } else {
            p = d + p;
        }

        System.out.println("String p ima vrednost: " + p);
    }
}
