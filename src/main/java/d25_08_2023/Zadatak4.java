package d25_08_2023;

//4.	Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
/// / / / /
//Napomena: Metoda nista ne vraca.

import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite karakter:");
        String character = s.next();

        System.out.println("Koliko puta zelite da se odstampa karakter?");
        int number = s.nextInt();

        printCharacters(number, character);

    }

    public static void printCharacters(int number, String character){
        for (int i = 0; i < number; i++) {
            System.out.print(character + " ");
        }
    }
}
