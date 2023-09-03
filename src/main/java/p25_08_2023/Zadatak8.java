package p25_08_2023;

//Napisati metodu koja vrsi konverziju rimske(string) u arapske brojeve(int).
//1 - I
//2 - II
//3 - III
//4 - IV
//5 - V
//Kao parametar se unosi vrednost rimkog broja(string) a vraca se arapski (int).
//Ako se unese V vraca se 5. Ako se unese vrednost koja nije podrzana vracamo nulu.

import java.util.Scanner;

public class Zadatak8 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite rimski broj:");
        String romanNumber = s.next();
        romanNumber = romanNumber.toUpperCase();

        int arabicNumber = romanToArabic(romanNumber);

        System.out.println("Rimski broj: " + romanNumber + ", arapski broj: " + arabicNumber);
    }

    public static int romanToArabic(String romanNumber){
        switch (romanNumber){
            case "I": return 1;
            case "II": return 2;
            case "III": return 3;
            case "IV": return 4;
            case "V": return 5;
            default: return 0;
        }
    }

//    public static int romanToArabic(String romanNumber){
//        if (romanNumber.equals("I")){
//            return 1;
//        } else if (romanNumber.equals("II")) {
//            return 2;
//        } else if (romanNumber.equals("III")) {
//            return 3;
//        } else if (romanNumber.equals("IV")) {
//            return 4;
//        } else if (romanNumber.equals("V")){
//            return 5;
//        } else {
//            return 0;
//        }
//    }
}
