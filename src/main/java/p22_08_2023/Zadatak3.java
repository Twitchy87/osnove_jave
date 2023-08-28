package p22_08_2023;

//Napisati program koji od korisnika ucitava brojeve sve dok ne unesu makar po jedan broj od 1 do 4.

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int broj = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        boolean brojac = false;

        while (!brojac){
            System.out.println("Unesite broj:");
            broj = s.nextInt();

            if(broj == 1){
                one++;
            } else if(broj == 2){
                two++;
            } else if (broj == 3) {
                three++;
            } else if (broj == 4) {
                four++;
            }

            if(one != 0 && two != 0 && three !=0 && four !=0){
                brojac = true;
            }
        }
        System.out.println("Kraj");
    }
}
