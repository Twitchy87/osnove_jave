package p22_08_2023;

//5.	Napišite program koji simulira ponašanje jednog test slučaja. Test slučaj ima 5 provera, a program će svaku proveru validirati jednu po jednu sve dok ne proveri sve ili dok neka provera ne prodje. Korisnik sa tastature unosi očekivane i stvarne rezultate za svaku proveru. Ako dođe do neuspeha, program će ispisati odgovarajuću poruku.
//	Primer izvrsenja 1:
//	Unesite expected: hello
//	Unesite actual: hello
//Unesite expected: hello1
//	Unesite actual: hello1
//Unesite expected: hello2
//	Unesite actual: hello
//	Test failed: Expected hello2 but got hello.
//
//Primer izvrsenja 2:
//	Unesite expected: hello
//	Unesite actual: hello
//Unesite expected: hello1
//	Unesite actual: hello1
//Unesite expected: hello2
//	Unesite actual: hello2
//Unesite expected: hello3
//	Unesite actual: hello3
//Unesite expected: hello4
//	Unesite actual: hello4
//	Test passed.

import java.util.Scanner;

public class Zadatak5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int counter = 0;
        boolean hasError = false;
//      String errorMessage ="";

        while (!hasError && counter < 5) {
            System.out.println("Unesite expected result:");
            String expectedResult = s.next();

            System.out.println("Unesite actual result:");
            String actualResult = s.next();

            if (!expectedResult.equals(actualResult)) {
                System.out.println("Test failed: Expected " + expectedResult + " but got " + actualResult + ".");
                hasError = true;
//              errorMessage = "Expected " + expectedResult + " but got " + actualResult + ".";
            } else {
                counter++;
            }

            // counter++;
        }

        System.out.println("Test passed.");

//      if(hasError) {
//      System.out.println("Test failed: " + errorMessage);
//    } else {
//        System.out.println("Test passed.");
//    }

    }
}
