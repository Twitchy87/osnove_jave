package p18_09_2023;
//2.Zadatak
//
//Kreirati apstraktnu klasu Student koja ima:
//●	ime i prezime studenta
//●	broj indeksa
//●	godinu studija
//●	gettere, settere i konstruktore
//●	apstraktnu metodu koja vraca cenu skolarine.
//●	apstraktnu metodu koja vraca da li je student na buzetu ili ne.
//●	metodu koja stampa podatke u formatu:
//ime i prezime, broj indeksa, godina studija
//Finansiranje: budzet/samofinansirajuci
//Cena skolarine: cena
//
//	Kreirati klasu StudentOsnovnih koja nasledjuje klasu Student i koja ima:
//●	koja za cenu skolarine vraca 90000
//●	za metodu da li je na budzetu vraca true ako je student ispod 5 godine studija
//
//Kreirati klasu StudentMaster koja nasledjuje klasu Student i koja ima:
//●	koja za cenu skolarine vraca 100000
//●	za metodu da li je na budzetu vraca true ako je student ispod 2 godine studija
//	U glavnoj klasi kreirati studente i testirati funkciolanosti

public class Zadatak2 {

    public static void main(String[] args) {

        StudentOsnovnih osnovne1 = new StudentOsnovnih("Pera Peric", "14567", 3);
        StudentOsnovnih osnovne2 = new StudentOsnovnih("Mika Mikic", "17548", 5);

        osnovne1.skolarina();  //ne moraju da se pozivaju
        osnovne1.naBudzetu();  //ne moraju da se pozivaju
//        osnovne2.skolarina();
//        osnovne2.naBudzetu();

        StudentMaster master1 = new StudentMaster("Zika Zikic", "23547", 1);
        StudentMaster master2 = new StudentMaster("Laza Lazic", "23896", 2);

//        master1.skolarina();
//        master1.naBudzetu();
//        master2.skolarina();
//        master2.naBudzetu();

        System.out.println("Studenti osnovnih studija:");
        System.out.println();
        osnovne1.stampaj();
        System.out.println();
        osnovne2.stampaj();

        System.out.println("------------------------------");

        System.out.println("Studenti master studija:");
        System.out.println();
        master1.stampaj();
        System.out.println();
        master2.stampaj();
    }
}
