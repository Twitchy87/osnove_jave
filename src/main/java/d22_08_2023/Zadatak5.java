package d22_08_2023;

//	Napisati program koji proverava uparenost zagrada. Korisnik unosi matematicku formulu sve dok ne unese znak =. Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje da li su sve zagrade uparene.
//	Formula koja se koristi u primeru je: (2 * ( 1 + 3))=
//	Primer izvrsenja:
//	Unos: (
//	Unos: 2
//	Unos: *
//	Unos: (
//	Unos: 1
//	Unos: +
//	Unos: 3
//	Unos: )
//	Unos: )
//	Unos: =
//	Zagrade su uparene
//	(Objasnjenje: Imamo isti broj otvorenih i zatvorenih zagrada)
//
//	Primer izvrsenja 2:
//	Unos: (
//	Unos: 2
//	Unos: *
//	Unos: (
//	Unos: 1
//	Unos: +
//	Unos: 3
//	Unos: )
//	Unos: =
//	Zagrade nisu uparene
//	(Objasnjenje: fali poslednja zagrada iz formule)

import java.util.Scanner;

public class Zadatak5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int openingBracketCounter = 0;
        int closingBracketCounter = 0;
        boolean isOver = false;

        while (!isOver){
            System.out.println("Unos:");
            String formula = s.next();

            if (formula.equals("=")){
                isOver = true;
            } else {
                if (formula.equals("(")){
                    openingBracketCounter++;
                } else if (formula.equals(")")){
                    closingBracketCounter++;
                }
            }
        }

        if (openingBracketCounter == closingBracketCounter){
            System.out.println("Zagrade su uparene.");
        } else {
            System.out.println("Zagrade nisu uparene.");
        }
    }
}
