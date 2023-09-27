package p15_09_2023;
//1.	Zadatak
//		Kreirati klasu Osoba koja od atributa ima:
//●	 ime i prezime
//●	 jmbg
//●	konstuktor sa parametrima
//●	difoltni konstuktor
//●	metodu stampaj koja stampa podatke u formatu
//			ime prezime, jmbg
//
//		Kreirati klasu Student koja nasledjuje klasu Osoba,
//			koja od dodatnih atributa ima:
//●	broj indeksa
//●	dug za skolarinu
//●	konstuktor sa parametrima
//●	difoltni konstuktor
//●	metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost. Metoda prima iznos uplate kao parametar metode.
//●	Napisati metod stampajStudenta da stampa sve podatke o studentu
//
//Kreirati klasu Profesor koja nasledjuje klasu Osoba,
//			koja od dodatnih atributa ima:
//●	naziv predmeta koji predaje
//●	iznos plate
//●	konstuktor sa parametrima
//●	difoltni konstuktor
//●	metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
//●	Napisati metodu stampajProfu da stampa sve podatke o profesoru
//
//		U glavnom programu kreirati 2 studenta i 2 profesora.
//
//●	Prilagodite konstuktore
//●	Overide-tujte metodu za stampu iz osnovne klase

public class Zadatak1 {

    public static void main(String[] args) {

        Student student1 = new Student("Pera Peric", "123456789", "S/123/20", 12000);

        student1.uplatiSkolarinu(3500);

        Student student2 = new Student("Mika Mikic", "9876543210", "A/123/23", 21000);

        student2.uplatiSkolarinu(20000);

        Profesor profesor1 = new Profesor("Laza Lazic", "456321789", "Matematika", 70000);

        profesor1.povecajPlatu(10);

        Profesor profesor2 = new Profesor("Zika Zikic", "769871235", "Fizika", 80000);

        profesor2.povecajPlatu(10);

        System.out.println("Studenti:");
        System.out.println();
        student1.stampaj();
        System.out.println();
        student2.stampaj();
        System.out.println("-----------------------");
        System.out.println("Profesori:");
        System.out.println();
        profesor1.stampaj();
        System.out.println();
        profesor2.stampaj();
    }
}
