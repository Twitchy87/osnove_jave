package p24_08_2023;

//Napisati program koji simulira digitalni meni za pasta bar. Program ima dva niza informacija paste i cene. Program stampa meni u formatu
//naziv paste ………………………….cena rsd
//Informacije su uparene po poziciji, to znaci da je:
//pasta na poziciji 0, sa cenom sa pozicije 0
//pasta na poziciji 1, sa cenom sa pozicije 1
//…..
//
//Primer izvrsenja:
//AGLIO E OLIO ………………… 500 rsd
//PRIMAVERA…………………340 rsd
//ARRABBIATA ………………….420 rsd
//NAPOLITANA ………………….440 rsd
//POLLO E SPINACI ………………….550 rsd

import java.util.ArrayList;

public class Zadatak7 {

    public static void main(String[] args) {

        ArrayList<String> pasta = new ArrayList<>();

        pasta.add("AGLIO E OLIO");
        pasta.add("PRIMAVERA");
        pasta.add("ARRABBIATA");
        pasta.add("NAPOLITANA");
        pasta.add("POLLO E SPINACI");

        ArrayList<Integer> cena = new ArrayList<>();

        cena.add(500);
        cena.add(340);
        cena.add(420);
        cena.add(440);
        cena.add(550);

        for (int i = 0; i < pasta.size(); i++) {
            System.out.println(pasta.get(i) + " .................." + cena.get(i) + " rsd");
        }

    }
}
