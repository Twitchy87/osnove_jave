package p11_09_2023;
//Za klasu Tacka, koja ima privatne atribute:
//●	x - x koordinata
//●	y - y koordinata
//Javne metode:
//●	metodu stampaj
//●	imamo difoltni konstruktor
//●	imamo konstuktor koji prima obe koordinate za kreiranje objekta
//●	geter za x
//●	geter za y
//●	seter za x
//●	seter za y
//
//U glavnom programu kreirati dva objekta:
//●	Jedan preko difoltnog konstuktora i postavite koordinate na 10 i 20
//●	Drugi objekat preko konsuktora sa parametrima i postavite kooridnate na 30 i 40

public class Zadatak2 {

    public static void main(String[] args) {

        Tacka tacka1 = new Tacka();

        tacka1.setX(10);
        tacka1.setY(20);

        Tacka tacka2 = new Tacka(30, 40);

        tacka1.stampaj();
        tacka2.stampaj();
    }
}
