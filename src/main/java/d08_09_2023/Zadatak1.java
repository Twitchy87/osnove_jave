package d08_09_2023;
//1.	Napisati klasu Proizvod koja ima atribute
//a.	naziv proizvoda (String)
//b.	cenu proizvoda (double)
//c.	težinu proizvoda u gramima. (double)
//	i metode:
//d.	stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//e.	povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//f.	vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//g.	racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//-	za tezinu do 100g, postarina iznosi 200din
//-	za tezinu od 101g do 500g, postarina iznosi 400din
//-	za tezinu preko 500g, postarina iznosi 1000din
//
//U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        Proizvod proizvod1 = new Proizvod();

        proizvod1.naziv = "Smoki";
        proizvod1.cena = 50;
        proizvod1.tezina = 40;

        Proizvod proizvod2 = new Proizvod();

        proizvod2.naziv = "Cokolada";
        proizvod2.cena = 200;
        proizvod2.tezina = 100;

        proizvod1.stampaj();
        proizvod2.stampaj();
        System.out.println();

        proizvod1.povecajCenu(20);
        proizvod2.povecajCenu(20);

        System.out.println("Nova cena proizvoda " + proizvod1.naziv + " je " + proizvod1.cena + " din.");
        System.out.println("Nova cena proizvoda " + proizvod2.naziv + " je " + proizvod2.cena + " din.");

        System.out.println();

        System.out.println("Cena proizvoda " + proizvod1.naziv + " sa popustom je " + proizvod1.vratiCenuSaPopustom(50) + " din.");
        System.out.println("Cena proizvoda " + proizvod2.naziv + " sa popustom je " + proizvod2.vratiCenuSaPopustom(50) + " din.");

        System.out.println();

        Scanner s = new Scanner(System.in);

        System.out.println("Da li zelite da se proizvod posalje kurirskom sluzbom?");
        boolean saljiKurirskomSluzbom = s.nextBoolean();

        if (saljiKurirskomSluzbom){
            System.out.println("Postarina iznosi: " + proizvod1.racunajPostarinu() + " din.");
        } else {
            System.out.println("Izabrali ste da proizvod " + proizvod1.naziv + " preuzmete licno.");
        }

        if (saljiKurirskomSluzbom){
            System.out.println("Postarina iznosi: " + proizvod2.racunajPostarinu() + " din.");
        } else {
            System.out.println("Izabrali ste da proizvod " + proizvod2.naziv + " preuzmete licno.");
        }

    }
}
