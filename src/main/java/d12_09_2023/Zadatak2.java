package d12_09_2023;
//Kreirati klasu ZeleniKarton koja ima:
//●	ime i prezime studenta
//●	broj indeksa
//●	naziv predmeta
//●	ime i prezime profesora
//●	ocenu - od 5 do 10
//●	gettere i settere
//●	konstruktore
//●	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//●	metodu stampaj koja stampa podatke u formatu:
//		(naziv predmeta) - (ocena)
//		Student: ime i prezime, broj indeksa
//		Profesor: ime i prezime
//
//	U glavnoj klasi:
//●	kreirati niz od 5 zelenih kartona za ispite i odstampati podatke za sve ispite
//●	Zatim program pronalazi i ispisuje prosecnu ocenu za sve ispite
//○	(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo za polozene ispite

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

        ArrayList<ZeleniKarton> zeleniKartoni = new ArrayList<>();

        zeleniKartoni.add(new ZeleniKarton("Pera Peric","S/123/11","Fizika","Laza Lazic", 7));
        zeleniKartoni.add(new ZeleniKarton("Pera Peric","S/123/11","Hemija","Mika Mikic", 10));
        zeleniKartoni.add(new ZeleniKarton("Pera Peric","S/123/11","Matematika","Zika Zikic", 9));
        zeleniKartoni.add(new ZeleniKarton("Pera Peric","S/123/11","Informatika","Zika Zikic", 7));
        zeleniKartoni.add(new ZeleniKarton("Pera Peric","S/123/11","Biologija","Sova Sovic", 5));

        for (int i = 0; i < zeleniKartoni.size(); i++) {
            zeleniKartoni.get(i).stampaj();
            System.out.println();
        }

        int zbirOcena = 0;
        int brojPolozenihIspita = 0;

        for (int i = 0; i < zeleniKartoni.size(); i++) {
            if(zeleniKartoni.get(i).polozenIspit()){
                zbirOcena += zeleniKartoni.get(i).getOcena();
                brojPolozenihIspita++;
            }
        }

        double prosecnaOcena = 1.0 * zbirOcena / brojPolozenihIspita;

        System.out.println("Prosecna ocena: " + prosecnaOcena);

    }
}
