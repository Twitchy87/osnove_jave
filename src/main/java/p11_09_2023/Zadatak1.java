package p11_09_2023;
//1. Zadatak
//Kreirati klasu Student koja ima:
//ime
//prezime
//broj indeksa (int)
//da li je na budzetu
//gettere i settere za sve atributge
//(dopuna) Kreirati metodu za stampu koja stampa sve podatke studenta.

public class Zadatak1 {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.setIme("Pera");
        student1.setPrezime("Peric");
        student1.setBrojIndeksa(14567);
        student1.setDaLiJeBudzet(true);

        student1.stampaj();

    }
}
