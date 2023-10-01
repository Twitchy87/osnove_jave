package d19_09_2023.Zadatak2;
//2.Zadatak (za vezbanje)
//(10 poena) Kreirati klasu Planina koja od privatnih atributa ima:
//●	ime planine
//●	naziv države u kojoj se nalazi
//●	visinu planine.
//a od javnih metoda:
//●	default-ni konstruktor i konstuktor koji postavlja sve parametre
//●	gettere i settere za sve atribute
//
//(15 poena) Kreirati apstraktnu klasu Planinar koja od zaštićenih atributa ima:
//●	jedinstveni celobrojni identifikacioni broj
//●	ime i prezime
//Dok od javnih metoda:
//●	konstruktor koji postavlja sve atribute klase.
//●	gettere i settere (atribute klase nije moguće menjati, nakon inicijalizacije tj. posle njihovog postavljanja u konstruktoru)
//●	apstraktnu metodu štampaj
//●	apstraktnu metodu koja vraca clanarinu planinara
//●	apstraktnu metodu uspesanUspon koja vraća informaciju da li će se planinar upešno popeti na planinu. Metoda kao ulazni parametar prima objekat tipa Planina.
//(20 poena) Kreirati klasu RekreativniPlaninar koja nasleđuje klasu Planinar. Klasa dodatno pamti još neke informacije koje se ne mogu menjati nakon postavljanja u konstuktoru:
//●	težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg)
//●	naziv okruga odakle je rekreativni planinar.
//●	maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
//●	da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon manji od visine planine, s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje.
//●	rekeativci placaju clanarinu u iznosu od 1000 rsd
//●	metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
//Rekreativac, id: (id) ime: (imei prezime) Okrug: (okrug)
//(20 poena) Kreirati klasu Alpinista koja nasleđuje klasu Planinar. Klasa sadrži atribut koji pamti koliko poena je alpinista ostvario (celobrojna vrednost) i poeni se mogu menjati. Alpinista može da savlada sve uspone do 4000 metara, placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50, a informacije o alpinisti se ispisuju u formatu:
//Alpinista, id: (id) ime: (ime i rezime) Broj poena: (poeni)
//
//(25 poena) Kreirati klasu PlaninarskiDom koja ima privatne atribute:
//●	naziv doma
//●	godinu kada je osnovan.
//●	članove doma koji su planinari (klasa vodi računa o nizu)
//Dok od javnih:
//●	default-ni konstuktor i konstuktor koji postavlja sve parametre
//●	gettere i settere koji su potrebni
//●	metodu učlani planinara, koja dodaje planinara u niz
//●	metodu koja vraća broj planinara koji će se uspešno popeti na planinu (metoda za parametar prima Planinu za koju se proverava informacija)
//●	metodu koja izbacuje planinara iz planinarskog doma prema identifikacionom broju
//●	metodu koja štampa podatke o domu i o svim članovima doma
//●	metodu koja racuna i vraca mesecni prihod od clanarina svih planinara
//(10 poena) U glavnom programu kreirati jedan planinarski dom, i u njemu učlaniti nekoliko rekreativnih planinara i nekoliko alpinista (minimum po 3), i istestirati svaku od metoda.
//Napomena: Za funkcionalnost koju ne znate da uradite, izostavite njenu implementaciju i smatrajte da je ona implementirana.

public class Zadatak2 {

    public static void main(String[] args) {

        Planina planina = new Planina("Alpi", "Svajcarska", 3800);

        PlaninarskiDom planinarskiDom = new PlaninarskiDom("Zeleznicar Nis", 1959);

        planinarskiDom.uclaniPlaninara(new RekreativniPlaninar(123, "Pera Peric", 10, "Nis", 3500));
        planinarskiDom.uclaniPlaninara(new RekreativniPlaninar(124, "Mika Mikic", 20, "Nis", 5000));
        planinarskiDom.uclaniPlaninara(new RekreativniPlaninar(125, "Zika Zikic", 15, "Leskovac", 3000));

        planinarskiDom.uclaniPlaninara(new Alpinista(234, "Laza Lazic", 10));
        planinarskiDom.uclaniPlaninara(new Alpinista(235, "Sava Savic", 5));
        planinarskiDom.uclaniPlaninara(new Alpinista(236, "Nikola Nikolic", 12));

        planinarskiDom.izbaciPlaninara(235);

        planinarskiDom.stampaj();
        System.out.println("----------------------------");

        if (planinarskiDom.brojUspesnihPlaninara(planina) > 0){
            System.out.println("Planinari sa uspesnim usponom:");
            System.out.println();
            for (int i = 0; i < planinarskiDom.getPlaninari().size(); i++) {
                if (planinarskiDom.getPlaninari().get(i).uspesanUspon(planina)) {
                    planinarskiDom.getPlaninari().get(i).stampaj();
                    System.out.println();
                }
            }
        } else {
            System.out.println("Nijedan planinar nije imao uspesan uspon.");
        }

        System.out.println("Mesecni prihod doma od clanarina: " + planinarskiDom.mesecniPrihod() + ".rsd.");
    }
}
