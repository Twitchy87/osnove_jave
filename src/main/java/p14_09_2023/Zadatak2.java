package p14_09_2023;
//2.	Zadatak
//	Kreirati klasu Reakcija koja ima
//●	tip reakcije (smajli, like, srce)
//●	ime i prezime korisnika koji je reagovao
//●	gettere, settere i konstruktore
//
//Kreirati klasu FacebookPost koja ima:
//●	ime i prezime korisnika koji je stavio oglas
//●	tekst objave
//●	niz reakcija
//●	metodu reaguj, koja dodaje reakciju u niz
//(modifikacija za vezbu) Ukoliko se desi situacija da jedan isti korisnik reaguje na post (tj. postoji rekacija korisnika sa istim imenom i prezimenom) izbaciti prethodnu reakciju i uracunati novu.
//Primer: Milan - lajkuje
//	 Nemanja - lajkuje
//	 Milan - daje srce
//Post ima lajk od Nemanje i srce od Milana.
//●	privatnu metodu koja vraca broj reakcija odredjenog tipa (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
//
//brojReakcija(“smajli) => 3
//brojReakcija(“srce”) => 2
//brojReakcija(“like”) => 1
//brojReakcija(“cry”) => 0
//
//●	metodu stampaj koja stampa podatke u formatu:
//ime i prezime
//tekst objave
//Smajli 10 | Like 15 | Srce 2

public class Zadatak2 {

    public static void main(String[] args) {

        Reakcija reakcija1 = new Reakcija("smajli", "Pera");
        Reakcija reakcija2 = new Reakcija("smajli", "Mika");
        Reakcija reakcija3 = new Reakcija("srce", "Zika");
        Reakcija reakcija4 = new Reakcija("like", "Laza");
        Reakcija reakcija5 = new Reakcija("srce", "Pera");

        FacebookPost post = new FacebookPost("Kiki", "Pozdrav!");

        post.reaguj(reakcija1);
        post.reaguj(reakcija2);
        post.reaguj(reakcija3);
        post.reaguj(reakcija4);
        post.reaguj(reakcija5);

        post.stampaj();
    }
}
