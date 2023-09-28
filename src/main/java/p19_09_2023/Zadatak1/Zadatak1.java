package p19_09_2023.Zadatak1;
//Zadatak 1.. Kreirati abstraktnu klasu Objekat ciji su zasticeni atributi. NE NAZIVAJTE KLASU OBJECT !!
//-	adresa (ulica i broj)
//-	povrsina objekta
//-	zona (1, 2 ili 3)
//-	konstuktore, gettere i settere
//-	metodu koja vraca koeficijent koji ce se koristiti za racunanje poreza u zavisnosti u kojoj zoni se nalazi objekat
//-	zona 1, koeficijent je 1.4
//-	zona 2, koeficijent je 1.1
//-	zona 3, koeficijent je 1.05
//-	abstraktnu metodu koja racuna i vraca porez objekta
//-	abstraktnu metodu stampaj
//
//	Kreirati klasu Kuca koja nasledjuje klasu Objekat koja ima broj clanova koji zive u tom objektu,
//-	konstuktore, gettere i setter
//-	porez racuna po formuli: koeficijent * povrsina.
//-	prepisati metodu stampaj tako da stampa sve podatke vezane za kucu
//	Kreirati klasu Zgrada koja nasledjuje klasu Objekat koja ima
//-	broj stanova
//-	konstuktore, gettere i setter
//-	porez racuna po formuli koeficijent * povrsina * broj stanova
//-	prepisati metodu stampaj tako da stampa sve podatke vezane za zgradu
//	Kreirati klasu Lokal koja naslejduje klasu Objekat koja od metoda ima:
//-	konstuktore
//-	porez racuna po formuli koeficijent * povrsina * 1.3
//-	prepisati metodu stampaj tako da stampa sve podatke vezane za lokal
//	Kreirati klasu PoreskaUprava koja za atribute ima:
//-	ime grada u kom se nalazi
//-	niz objekata
//-	metodu dodaj objekat
//-	metodu koja vraca objekat sa najvecim porezom public Objekat najveciPorez
//-	metodu koja vraca objekat sa najmanjim porezom
//-	metodu koja racuna ukupan porez za ceo grad
//-	metodu koja stampa sve objekte
//U glavnom programu napraviti jednu poresku upravu i u nju dodati minimum 5 razlicita objekta i istestirati sve metode.

public class Zadatak1 {

    public static void main(String[] args) {

        PoreskaUprava poreskaUprava = new PoreskaUprava("Nis");

        Objekat kuca1 = new Kuca("Ulica Lipa br. 27", 120, 3, 4);
        Objekat kuca2 = new Kuca("Pobedina 45", 60, 1, 2);
        Objekat kuca3 = new Kuca("Vozdova ulica br. 14", 85, 2, 3);

        Objekat zgrada1 = new Zgrada("Pobedina br. 14/7", 45, 1, 20);
        Objekat zgrada2 = new Zgrada("Vozdova ulica br. 35/2", 50, 2, 10);

        Objekat lokal = new Lokal("Pobedina bb", 30, 1);

        poreskaUprava.dodajObjekat(kuca1);
        poreskaUprava.dodajObjekat(kuca2);
        poreskaUprava.dodajObjekat(kuca3);
        poreskaUprava.dodajObjekat(zgrada1);
        poreskaUprava.dodajObjekat(zgrada2);
        poreskaUprava.dodajObjekat(lokal);

        poreskaUprava.stampajObjekte();

        Objekat objekatNajveciPorez = poreskaUprava.najveciPorez();
        System.out.println("Objekat sa najvecim porezom:");
        objekatNajveciPorez.stampaj();
        System.out.println("--------------------------");

        Objekat objekatNajmanjiPorez = poreskaUprava.najmanjiPorez();
        System.out.println("Objekat sa najmanjim porezom:");
        objekatNajmanjiPorez.stampaj();
        System.out.println("--------------------------");

        System.out.println("Ukupan porez za sve objekte: " + poreskaUprava.ukupanPorez());

    }
}
