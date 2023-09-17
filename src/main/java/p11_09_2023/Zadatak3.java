package p11_09_2023;
//3.Zadatak
//        Kreirati klasu Film koja ima:
//        ●	naziv filma
//        ●	iz koje godine je film
//        ●	reziser
//        ●	konstruktore, gettere i settere
//        ●	getter i setter za rezisera
//        ●	metodu print koja stampa podatke u formatu
//        naziv filma, godina
//        Rezirao ga: ime i prezime rezisera, starost
//
//
//        Kreirati klasu Reziser koja ima:
//        ●	ime i prezime rezisera
//        ●	starost
//        ●	konstruktore, gettere i settere koji su potrebni
//        ●	metodu print koja stampa podatke u formatu
//        ●	ime prezime, starost.god
//
//        U main metodi, kreirati jedan film i jednog rezisera i pozvati svaku od metoda
//        Napravite vezu izmedju objekata i pozovite metode.

public class Zadatak3 {

    public static void main(String[] args) {

        Film film = new Film("Charade", 1963);

        Reziser reziser = new Reziser("Stanley Donen", 94);

        film.setReziser(reziser);

        film.printFilm();
        System.out.println();
        reziser.stampajRezisera();
    }
}
