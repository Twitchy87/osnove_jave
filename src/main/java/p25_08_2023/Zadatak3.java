package p25_08_2023;

//Napisati metodu koja stampa zvezdicu sa razmakom.
//U glavnom programu je potrebno odstampati sledecu sliku koristeci metode koje smo definisali.
//*  *  *
//*  *
//*

public class Zadatak3 {

    public static void main(String[] args) {

//        printStars();
//        printStars();
//        printStars();
//        System.out.println();
//        printStars();
//        printStars();
//        System.out.println();
//        printStars();

        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                printStars();
            }
            System.out.println();
        }
    }

    public static void printStars(){
        System.out.print("* ");
    }
}
