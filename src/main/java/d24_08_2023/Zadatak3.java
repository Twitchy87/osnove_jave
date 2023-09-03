package d24_08_2023;

//Napisati progam koji stampa niz u obrnutom redosledu tj. od zadnjeg elementa do nultog.
//Ako je niz 1,2,4,5,7, stampa se 7,5,4,2,1

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList <Integer> numbers = new ArrayList<>();

        System.out.println("Koliko brojeva zelite da unesete?");
        int limit = s.nextInt();

        for (int i = 0; i < limit; i++) {
            System.out.println("Unesite broj:");
            int number = s.nextInt();
            numbers.add(number);
        }

        System.out.println("Niz u obrnutom redosledu: ");
        for (int i = numbers.size() - 1; i >= 0 ; i--) {
            if (i == 0){
                System.out.print(numbers.get(i));
            } else {
                System.out.print(numbers.get(i) + ", ");
            }
        }
    }
}
