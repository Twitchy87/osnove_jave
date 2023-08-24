package d15_08_2023;

//Napisati program koji racuna i ispisuje povrsinu i obim trougla. KOREN BROJA 3 neka bude konstanta 1.73. Za stranicu trougla postavite proizvoljnu vrednost.
//Primer izvrsenja programa:
//a: 10
//Povrsina je 43.25
//Obim je 30

public class Zadatak5 {

    public static void main(String[] args) {

    int a = 10;
    double koren = 1.73;
    int obim = 0;
    double povrsina = 0;

    obim = 3 * a;
    povrsina = a * a * koren / 4;

        System.out.println("Obim trougla je: " + obim);
        System.out.println("Povrsina trougla je: " + povrsina);

    }
}
