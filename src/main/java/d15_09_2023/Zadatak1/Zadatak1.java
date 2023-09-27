package d15_09_2023.Zadatak1;
//1.Zadatak
//Kreirati klasu Osoba koja ima:
//-	ime i prezime
//-	jmbg
//-	godinu rodjenja
//-	default-ni konstuktor
//-	konstuktor sa parametrima
//-	gettere i settere
//-	metodu stampaj koja stampa u formatu:
//(ime i prezime), (jmbg), (godina rodjenja)
//
//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//-	broj (broj koji igrac nosi)
//-	poziciju koju igra (odbrambeni, napadac, … )
//-	kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//-	default-ni konstuktor
//-	konstuktor sa parametrima
//-	gettere i settere za broj, kapiten i poziciju
//-	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//-	godine iskustva
//-	tip trenera (kondicioni, za igru, pomocni, personalni)
//-	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode a zatim kreirati niz igraca i niz trenera, na kraju programa ispisati sve igrace i trenere. Podatke za igrace i trenere unosi korisnik sa tastature.

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Igrac igrac1 = new Igrac();

        System.out.println("Unesite ime i prezime igraca:");
        igrac1.setPunoIme(s.next());

        System.out.println("Unesite jmbg igraca:");
        igrac1.setJmbg(s.next());

        System.out.println("Unesite godinu rodjenja igraca:");
        igrac1.setGodinaRodjenja(s.nextInt());

        System.out.println("Unesite broj igraca:");
        igrac1.setBroj(s.nextInt());

        System.out.println("Unesite poziciju igraca:");
        igrac1.setPozicija(s.next());

        System.out.println("Unesite da li je igrac kapiten tima:");
        igrac1.setDaLiJeKapiten(s.nextBoolean());

        Igrac igrac2 = new Igrac();

        System.out.println("Unesite ime i prezime igraca:");
        igrac2.setPunoIme(s.next());

        System.out.println("Unesite jmbg igraca:");
        igrac2.setJmbg(s.next());

        System.out.println("Unesite godinu rodjenja igraca:");
        igrac2.setGodinaRodjenja(s.nextInt());

        System.out.println("Unesite broj igraca:");
        igrac2.setBroj(s.nextInt());

        System.out.println("Unesite poziciju igraca:");
        igrac2.setPozicija(s.next());

        System.out.println("Unesite da li je igrac kapiten tima:");
        igrac2.setDaLiJeKapiten(s.nextBoolean());

        Trener trener1 = new Trener();

        System.out.println("Unesite ime i prezime trenera:");
        trener1.setPunoIme(s.next());

        System.out.println("Unesite jmbg trenera:");
        trener1.setJmbg(s.next());

        System.out.println("Unesite godinu rodjenja trenera:");
        trener1.setGodinaRodjenja(s.nextInt());

        System.out.println("Unesite godine iskustva trenera:");
        trener1.setGodineIskustva(s.nextInt());

        System.out.println("Unesite tip trenera:");
        trener1.setTip(s.next());

        Trener trener2 = new Trener();

        System.out.println("Unesite ime i prezime trenera:");
        trener2.setPunoIme(s.next());

        System.out.println("Unesite jmbg trenera:");
        trener2.setJmbg(s.next());

        System.out.println("Unesite godinu rodjenja trenera:");
        trener2.setGodinaRodjenja(s.nextInt());

        System.out.println("Unesite godine iskustva trenera:");
        trener2.setGodineIskustva(s.nextInt());

        System.out.println("Unesite tip trenera:");
        trener2.setTip(s.next());

        System.out.println("Igraci:");
        igrac1.stampaj();
        System.out.println();
        igrac2.stampaj();
        System.out.println("---------------------------------------");
        System.out.println("Treneri:");
        trener1.stampaj();
        System.out.println();
        trener2.stampaj();

        ArrayList<Igrac> igraci = new ArrayList<>();
        igraci.add(igrac1);
        igraci.add(igrac2);

        System.out.println("Igraci:");
        for (int i = 0; i < igraci.size(); i++) {
            System.out.println(igraci.get(i).getPunoIme());
        }

        ArrayList<Trener> treneri = new ArrayList<>();
        treneri.add(trener1);
        treneri.add(trener2);

        System.out.println();
        System.out.println("Treneri:");
        for (int i = 0; i < treneri.size(); i++) {
            System.out.println(treneri.get(i).getPunoIme());
        }
    }
}
