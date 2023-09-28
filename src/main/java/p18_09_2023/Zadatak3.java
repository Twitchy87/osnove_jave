package p18_09_2023;
//3. Zadatak
//Kreirati abstraktnu klasu Figura koja ima
//●	abstraktnu metodu povrsina
//●	abstraktnu metodu obim
//●	metodu koja stampa podatke u formatu:
//Povrsina je (povrsina)
//Obim je (obim)
//
//Kreirati klasu JednakostranicniTrougao koja nasledjuje klasu Figura:
//●	stranicu a
//●	gettere/settere/konstruktore
//●	implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
//●	implementira metodu obim
//
//Kreirati klasu Pravougaonik koja nasledjuje klasu Figura:
//●	stranice a i b
//●	gettere/settere/konstruktore
//●	implementira metodu povrsina
//●	implementira metodu obim
//
//
//U glavnom programu kreirati niz figura (niz od 3 pravougaonika i 2 trougla). Zatim odstampati na ekranu sve figure i sume njhovih povrsina i obima.

import java.util.ArrayList;

public class Zadatak3 {

    public static void main(String[] args) {

        Pravougaonik pravougaonik1 = new Pravougaonik(4, 6);
        Pravougaonik pravougaonik2 = new Pravougaonik(3, 7);
        Pravougaonik pravougaonik3 = new Pravougaonik(5, 10);

        JednakostranicniTrougao trougao1 = new JednakostranicniTrougao(5);
        JednakostranicniTrougao trougao2 = new JednakostranicniTrougao(7);

        ArrayList<Figura> figure = new ArrayList<>();

        figure.add(pravougaonik1);
        figure.add(pravougaonik2);
        figure.add(pravougaonik3);
        figure.add(trougao1);
        figure.add(trougao2);

        for (int i = 0; i < figure.size(); i++) {
            figure.get(i).stampaj();
            System.out.println();
        }

        double zbirPovrsina = 0;
        int zbirObima = 0;

        for (int i = 0; i < figure.size(); i++) {
            zbirPovrsina += figure.get(i).povrsina();
            zbirObima += figure.get(i).obim();
        }

        System.out.println("Zbir povrsina svih figura je " + zbirPovrsina);
        System.out.println("Zbir obima svih figura je " + zbirObima);
    }
}
