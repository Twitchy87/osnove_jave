package p22_08_2023;

//Napisati pogram koji vrsi korkeciju zvuka. Korisnik unosi akcije “pojacaj” ili “smanji” ili “play”. Program radi dok korisnik ne unese play. Inicijalna jacina zvuka je 75.
//Pojacaj - akcije koja povecava jacinu zvuka za 10
//smanji - akcija koja smajnjuje jacinu zvuka za 10.
//Zvuk nakon nijedne akcije ne sme da spadne ispod nule ili da ode preko 100.
//Na kraju programa odstampati jacinu zvuka.
//
//Primer izvrsenja:
//Unesite akciju: pojacaj (iz 75 u 85)
//Unesite akciju: pojacaj ( iz 85 u 95)
//Unesite akciju: pojacaj (iz 95 u 100)
//Unesite akciju: smanji (iz 100 u 90)
//Unesite akciju: smanji (iz 90 u 80)
//Unesite akciju: play
//Jacina zvuka je 80.

import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
//        String action = "";
        int soundVolume = 75;
        boolean counter = false;

        while (!counter){

            System.out.println("Unesite akciju:");
            String action = s.next();

            if(action.equals("pojacaj")){
                soundVolume += 10;
                if(soundVolume > 100){
                    soundVolume = 100;
                }
            } else if(action.equals("smanji")) {
                soundVolume -= 10;
                if(soundVolume < 0) {
                    soundVolume = 0;
                }
            }

            if(action.equals("play")) {
                counter = true;
            }
        }
        System.out.println("Jacina zvuka je " + soundVolume);
    }
}
