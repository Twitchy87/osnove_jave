package d14_09_2023;
//Napisati klasu Student koja ima
//
//●	broj indeksa
//●	ime i prezime
//●	tip studija (osnovne, master, doktorske)
//●	niz ispita
//●	konstuktore koje mislite da ce vam trebati
//●	gettere i settere za indeks, ime i prezime, tip studija
//●	getter za niz predmeta
//●	metodu dodaj ispit u niz ispita
//●	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//●	metodu stampaj koja stampa u formatu:
//(broj indeksa) - (ime i prezime) - (tip studija)
//Predmeti:
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//Prosecna ocena: (prosecna ocena)
//
//Napisati klasu Ispit koja ima
//●	naziv predmeta
//●	ocenu (u rasponu od 5 do 10)
//●	Ime i prezime profesora koji predaje predmet
//●	konstuktore koje mislite da ce vam trebati
//●	gettere i settere za sve atribute
//●	metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//●	metodu koja stampa ispit u formatu:
//(naziv predmeta) - (profesor) - (ocena)

public class Zadatak1 {

    public static void main(String[] args) {

        Student student = new Student("A/123/20", "Laza Lazic", "Osnovne akademske studije");

        Ispit ispit1 = new Ispit("Mehanika", 8, "Pera Peric");
        Ispit ispit2 = new Ispit("Termodinamika", 9, "Mika Mikic");
        Ispit ispit3 = new Ispit("Optika", 10, "Zika Zikic");
        Ispit ispit4 = new Ispit("Metrologija", 10, "Nikola Nikolic");
        Ispit ispit5 = new Ispit("Hemija", 5, "Mirko Mirkovic");

        student.dodajIspit(ispit1);
        student.dodajIspit(ispit2);
        student.dodajIspit(ispit3);
        student.dodajIspit(ispit4);
        student.dodajIspit(ispit5);

        student.stampaj();
    }
}
