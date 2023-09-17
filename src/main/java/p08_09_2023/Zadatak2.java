package p08_09_2023;
//2.  Zadatak
//Kreirati klasu Auto koja ima:
//●	ime i prezime vozaca
//●	marku automobila
//●	broj vrata
//●	potrosnju na 100km (npr: 3.6 litra)
//●	trenutnu brzinu kojom se auto krece
//●	metodu za stampu koja stampa podatke u formatu:
//[Vozac]
//	[Marka] - [br vrata]-ro vrata
//	Sa potrosnjom od [potrosnja] l na 100km
//	[Trenutna brzina auta] km/h je trenutna brzina.
//
//Primer:
//	Milan Jovanovic
//	BMW - 5-ro vrata
//	Sa potrosnjom od 10 l na 100km
//	200 km/h je trenutna brzina
//
//
//(Dopuna 1)
//U okviru klase Auto, implementirati jos 2 metode:
//●	metoda koja vraca informaciju da li je vozac prekoracio brzinu. Kao parametar metode se prima ogranicenje (kao broj) a metoda vraca true ili false ako je trenutna brzina veca od ogranicenja.
//●	metoda koja vraca visinu novcane kazne za prekoracenje, za svaku jedinicu prekoracenja placa se 1000din. Metoda od parametara prima ogranicenje brzine
//U glavnom programu pozvati ove metode i odstmpajte neke poruke na osnovu informacija koje dobijete od njih.
//
//(Dopuna 2)
//Dopuniti klasu Auto tako da ima:
//●	atribut godinu proizvodnje
//●	atribut mesec do kad je registrovan auto (int)
//●	atribut kubikaza auta (npr: 1600 - 5000)
//●	metodu koja vraca da li je auto oldtimer, svaki auto proizveden pre 1950 je oldtimer.
//●	metodu koja vraca da li je istekla registracije. Metoda kao parametar prima trenutni mesec i na osnovu toga vraca true ili false.
//●	metodu koja racuna i vraca cenu registracije za auto. Za automobile do 2000 kubika cena registracije kubikaza * 100din, za automobile preko 2000 kubika dodatno se uracunava 30% na cenu.
//
//(Dopuna 3)
//Dopuniti klasu Auto tako da ima:
//●	atribut broj registracije
//●	atribut da li je ukljucena klima u autu
//●	metodu dodajGas, koja povecava trenutnu brzinu za 10.
//●	metodu koci, koja smanjuje brzinu za 10. Brzina ne moze da ode ispod nule.
//●	metodu koja racuna i vraca trenutnu potrosnju auta. Metoda racuna po formuli:
//○	faktor klime - ako je ukljucena klima faktor je 1.2, ako nije ukljucena onda je 1.0
//○	(trenutna brzina / 100.0 * potrosnja na 100km) * faktor klime
//
//	(Dopuna 4)
//	Dopuniti klasu Auto tako da ima:
//●	atribut za maksimalnu brzinu na auto (npr: 240)
//●	Promenite metodu dodajGas tako da povecanje brzine ne bude preko maksimalne brzine auta
//●	metodu stampajTablu koja stampa brzinomer sa table. Brzinomer uvek ima 100 jedinica za prikaz brzine.
//Ako je npr maksimalna brzina 240 i auto je u trenutnoj brzini 100, metoda stampa
//               |||||||||||||||||||||||||||||||||||||||||..................................................................... 100/240km/h
//(objasnjenje: ovde imamo 41 crticu koja oznacava brzinu 100km/h i imamo 59 tackica koje oznacavaju ostatak do maksimalne brzine)
//Broj crtica se racuna po formuli: (trenutna brzina * 100) / maksimalna brzina.
public class Zadatak2 {

    public static void main(String[] args) {

        Auto auto = new Auto();

        auto.vozac = "Ana Cvetkovic";
        auto.marka = "BMW";
        auto.brojVrata = 5;
        auto.potrosnja = 3.5;
        auto.trenutnaBrzina = 77;
        auto.maxBrzina = 240;

        auto.stampajInfo();
        System.out.println();

        boolean prekoracenje = auto.daLiJePrekoracenje(60);

        if (prekoracenje){
            System.out.println("Prekoracili ste brzinu!");
            System.out.println("Morate da platite kaznu od " + auto.visinaKazne(60) + " din.");
        } else {
            System.out.println("Vozite ispod ogranicenja.");
        }
        System.out.println();

        auto.godProizvodnje = 2020;
        auto.mesecRegistracija = 7;
        auto.kubikaza = 3000;

        if (auto.daLiJeOldtimer()){
            System.out.println("Vas auto je oldtimer.");
        } else {
            System.out.println("Vas auto nije oldtimer.");
        }

        if(auto.daLiVaziRegistracija(6)){
            System.out.println("Vas auto je registrovan.");
        } else {
            System.out.println("Registracija Vam je istekla.");
        }

        double cenaRegistracije = auto.cenaRegistracije();
        System.out.println("Morate da platite za registraciju: " + cenaRegistracije + " din.");

        System.out.println();

        auto.dodajGas();
        System.out.println("Brzina sa gasom: " + auto.trenutnaBrzina);
        System.out.println();
        auto.koci();
        System.out.println("Brzina sa kocenjem: " + auto.trenutnaBrzina);
        System.out.println();

        auto.brojRegistracije = "NI-125-95";
        auto.ukljucenaKlima = true;
        System.out.println("Vasa trenutna potrosnja je: " + auto.trenutnaPotrosnja());
//        auto.ukljucenaKlima

        auto.stampajTablu();
    }
}
