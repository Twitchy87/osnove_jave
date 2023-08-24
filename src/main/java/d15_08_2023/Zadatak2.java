package d15_08_2023;

//2.	Napisati program koji stampa podatke o kreditnoj kartici u formatu kao na slici. Od informacija se pamti broj kartice (16 cifara sa razmacima), mesec i godina do kada vazi kartica, kao i ime i prezime vlasnika kartice. Kartica se stampa sa zvezdicama i ne brinite ukoliko neka zvezdica mrdne i nije u liniji to ce zavisiti od duzine imena.
//Napomena: svaka informacija mora da bude u okviru posebne promenljive.

public class Zadatak2 {

    public static void main(String[] args) {

        String brojKartice = "1234 1232 4321 1212";
        String mesecVazenja = "10";
        String godinaVazenja = "25";
        String ime = "Ana";
        String prezime = "Cvetkovic";

        System.out.println("**************************************");
        System.out.println("*  Credit Card                       *");
        System.out.println("*    ****                            *");
        System.out.println("*    ****                            *");
        System.out.println("*       " + brojKartice + "          *");
        System.out.println("*                  valid > " + mesecVazenja + "/" + godinaVazenja + "     *");
        System.out.println("*                                    *");
        System.out.println("*     " + ime + " " + prezime + "                  *");
        System.out.println("**************************************");

    }
}
