package d19_09_2023.Zadatak1;
//1.Zadatak
//Kreirati abstraktnu klasu Ambalaza koja ima:
//-	barkod (primer: 328232-2823)
//-	naziv artikla
//-	neto tezinu
//-	bruto tezinu
//-	konstuktore (default-ni i sa parametrima)
//-	gettere i settere
//-	metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//-	abstraktnu metodu koja vraca cenu artikla
//-	abstraktnu metodu stampaj
//
//Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//-	atribut koji kaze da li se moze reciklirati
//-	osnovna cena
//-	gettere i setter za atribute
//-	konstuktori koji su vam potrebni
//-	racuna cenu tako da ispunjava uslova:
//-	ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//-	ako nije u cenu ulazi samo osnovna cena
//-	metoda stampaj stampa sve podatke iz klase tetrapak.
//
//
//Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//-	kaucija za flasu
//-	atribut koji kaze da li se za flasu placa kaucija
//-	osnovna cena
//-	gettere i setter za atribute
//-	konstuktori koji su vam potrebni
//-	racuna cenu
//-	ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//-	ako se ne placa, (osnovna cena) * 1.2
//-	metoda stampaj stampa sve podatke iz klase staklena flasa.
//
//Kreirati klasu SuperKartica koja ima:
//-	broj kartice
//-	ime i prezime vlasnika
//-	popust (200, 500, … )
//-	konstuktore (default-ni i sa parametrima)
//-	gettere i settere
//-	metodu stampaj koja stampa karticu u formatu:
//(broj kartice), (ime i prezime)
//
//Kreirati klasu Korpa koja ima:
//-	niz ambalaza
//-	metodu dodaj ambalazu
//-	metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//-	privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
//-	metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.
//
//U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.

public class Zadatak1 {

    public static void main(String[] args) {

        Tetrapak tetrapak1 = new Tetrapak("123456","Mleko",1000, 1050, true,120);
        Tetrapak tetrapak2 = new Tetrapak("123789","Cokoladno mleko",500, 540, true,90);
        Tetrapak tetrapak3 = new Tetrapak("456789","Jogurt",250, 280, false,50);

        StaklenaAmbalaza staklenaAmbalaza1 = new StaklenaAmbalaza("987654", "Dzem od pomorandze", 375, 500, 0, false, 250);
        StaklenaAmbalaza staklenaAmbalaza2 = new StaklenaAmbalaza("987123", "Belo vino", 750, 1000, 100, true, 500);
        StaklenaAmbalaza staklenaAmbalaza3 = new StaklenaAmbalaza("654321", "Liker od cokolade", 700, 900, 50, true, 500);
        StaklenaAmbalaza staklenaAmbalaza4 = new StaklenaAmbalaza("654545454", "Pivo", 250, 350, 50, true, 100);

        SuperKartica superKartica = new SuperKartica(123, "Pera Peric",600);

        Korpa korpa = new Korpa();

        korpa.dodajAmbalazu(tetrapak1);
        korpa.dodajAmbalazu(tetrapak2);
        korpa.dodajAmbalazu(tetrapak3);
        korpa.dodajAmbalazu(staklenaAmbalaza1);
        korpa.dodajAmbalazu(staklenaAmbalaza2);
        korpa.dodajAmbalazu(staklenaAmbalaza3);
        korpa.dodajAmbalazu(staklenaAmbalaza4);

        korpa.izbaciAmbalazu("654545454");

        System.out.println("Podaci o super kartici :");
        superKartica.stampaj();
        System.out.println("-----------------------------------");
        System.out.println("Artikli u korpi: ");
        korpa.stampaj();
        System.out.println("---------------------------------");
        System.out.println("Ukupna cena korpe: " + korpa.ukupnaCenaKorpe(superKartica));
    }
}
