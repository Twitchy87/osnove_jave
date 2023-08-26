package p18_08_2023;

//7.	Napisati program koji od korisnika ucitava jacinu zvuka (od 0 do 10) i stampa slikicu za zvuk sa brojem crtica koje je korisnik uneo.
//Primer izvrsenja;
//Unesite jacinu zvuka: 8
//< | | | | | | | |
//< 12345679
//
//(Dopuna za vezbanje)
//Ukoliko je jacina zvuka 0 stampa se slika </ (simulacija za mute) u sprotnom < | | | (sa brojem crtica jacinom zvuka)

import java.util.Scanner;

public class Zadatak7 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite jacinu zvuka :");
        int soundVolume = s.nextInt();

        String sound = "<";

        if(soundVolume == 0){
            sound = sound + "/";
        } else {
            for (int i = 1; i <= soundVolume; i++) {
                sound = sound + "|";
            }
        }

        System.out.println(sound);
    }
}
