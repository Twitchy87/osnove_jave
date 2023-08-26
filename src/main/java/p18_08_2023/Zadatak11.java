package p18_08_2023;

//11.	(ZA VEZBANJE) Napisati program koji iscrtava timeline na youtube videu. Korisnik unosi duzinu videa u sekundama i trenutno vreme u videu, a program iscrtava timeline tako sto deo koji je pogledan iscrtava zvezdicama a ostatak crticama. Timeline je kontrola koja ima tacno 100 karaktera.
//Primer izvrsenja:
//Unesite duzinu videa (s): 203
//Unesite trenutno vreme videa (s): 20
//*********-------------------------------------------------------------------------------------------
//
//(Objasnjenje:Ako video ima 203s a mi smo na 20s, to znaci da je pogledano 9.85% videa, zaokruzicemo to na 9zvezdica ostatak do 100 su crtice)

import java.util.Scanner;

public class Zadatak11 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite duzinu videa u sekundama");
        int videoLength = s.nextInt();

        System.out.println("Unesite trenutno vreme videa u sekundama");
        int videoCurrentTime = s.nextInt();

        double timeWatched = 100.0 * videoCurrentTime / videoLength;
        String timeline = "";

        for (int i = 1; i <= 100 ; i++) {
            if(i <= timeWatched){
                timeline = timeline + "*";
            } else {
                timeline = timeline + "_";
            }
        }

        System.out.println(timeline);
    }
}
