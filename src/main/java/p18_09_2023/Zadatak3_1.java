package p18_09_2023;
//3.1 Zadatak
//Kreirati klasu FigureGenerator koja ima:
//●	Napisati metodu koja generiše geometrijske figure u zavisnosti od prosleđenog parametra koji predstavlja tip figure. Tip figure može biti trougao ili pravougaonik. U zavisnosti od tipa figure, funkcija treba da kreira odgovarajući objekat i vrati ga kao povratnu vrednost. Po defaultu, funkcija treba da kreira pravougaonik sa stranicama dužine 5 i 10 i trougao sa stranicama dužine 5.
//●	(ZA VEZBAJE) Kreirati metodu koja kreira i vraca niz od N trouglova. N je parametar metode
//●	(ZA VEZBAJE) Kreirati metodu koja kreira i vraca niz od N pravougaonika. N je parametar metode
//●	(ZA VEZBAJE) Kreirati metodu koja kreira i vraca niz od N trouglova i N pravougaonika. N je parametar metode
//
//U glavnom programu generisati 3 pravougaonika i 2 trougla

import java.util.ArrayList;

public class Zadatak3_1 {

    public static void main(String[] args) {

        FigureGenerator generisanaFigura = new FigureGenerator();

        Figura figura1 = generisanaFigura.generisiFiguru("trougao");
        Figura figura2 = generisanaFigura.generisiFiguru("trougao");
        Figura figura3 = generisanaFigura.generisiFiguru("pravougaonik");
        Figura figura4 = generisanaFigura.generisiFiguru("pravougaonik");
        Figura figura5 = generisanaFigura.generisiFiguru("pravougaonik");
        figura1.stampaj();
        figura2.stampaj();
        figura3.stampaj();
        figura4.stampaj();
        figura5.stampaj();
        System.out.println("----------------------");

        ArrayList<Figura> figure = generisanaFigura.nizFigura(2);

        for (int i = 0; i < figure.size(); i++) {
            figure.get(i).stampaj();
        }
    }
}
