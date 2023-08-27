package p21_08_2023;

public class Zadatak2 {

    //Napisati program koji od brojeva od 1 do 10 formira string koji ima spoj svih brojeva.
    //Primer izvrsenja:
    //String je 12345678910

    public static void main(String[] args) {

        String niz = "";

        for (int i = 1; i <= 10; i++){
            niz = niz + i;
        }
        System.out.println(niz);
    }
}
