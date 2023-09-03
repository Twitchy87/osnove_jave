package p25_08_2023;

//Napisati metodu koja stampa ime i prezime i u glavnom programu pozvati metodu na izvrsenje 5 puta.

public class Zadatak1 {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            printFullName();
        }
    }

    public static void printFullName(){
        System.out.println("Ana Cvetkovic");
    }
}
