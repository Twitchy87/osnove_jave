package Mini_projekat;

//5.	**Zadatak: Generisanje Random Passworda sa Specijalnim Karakterom**
//
//Kako biste saznali više o generisanju random brojeva u programiranju, preporučujemo da istražite sledeći link: random koristeci Random class. Ovaj resurs će vam pružiti detaljnije razumevanje kako programi generišu slučajne brojeve i kako ih možete koristiti u različitim situacijama.
//
//Napišite program koji simulira automatsko generisanje random passworda. Korisnik će uneti željenu dužinu passworda, a program će kreirati i ispisati password koji zadovoljava te parametre. Ovaj zadatak zahteva implementaciju različitih metoda za generisanje karaktera i passworda.
//●	generisiRandomKarakter: Ova metoda generiše i vraća random karakter. Metoda koristi niz stringova sa elementima koji predstavljaju mala slova, velika slova i brojeve (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao povreatnu vrednost (string). Ova metoda nema ulazne parametre.
//●	generisiRandomSpecijalanKarakter: Ova metoda generiše i vraća random specijalan karakter. Metoda koristi niz stringova sa elementima `@`, `#`, `&`, `*` i `!` (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao string. Ova metoda nema ulazne parametre.
//
//Napomena: Metode generisiRandomSpecijalanKarakter generisiRandomKarakter nemaju nikakvu stampu u sebi!
//
//Glavni program:
//   - Korisnik unosi dužinu passworda i informaciju da li treba sadržati specijalan karakter.
//   - Koristeći metodu `generisiPassword`, program generiše i ispisuje password.
//
//Primer izvršenja 1:
//Unesite dužinu passworda: 10
//Da li želite da sadrži specijalan karakter: true
//Generisan password: eD9Kx0e@
//
//Primer izvršenja 2:
//Unesite dužinu passworda: 10
//Da li želite da sadrži specijalan karakter: false
//Generisan password: eCxdwEeFEx

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite duzinu passworda:");
        int passwordLength = s.nextInt();

        System.out.println("Da li zelite da sadrzi specijalan karakter?");
        boolean hasSpecialCharacter = s.nextBoolean();

        String password = generisiPassword(passwordLength, hasSpecialCharacter);

        System.out.println("Generisan password: " + password);

    }

    public static String generisiRandomKarakter() {
        Random random = new Random();

        ArrayList<String> characters = new ArrayList<>();

        characters.add("a");
        characters.add("A");
        characters.add("7");
        characters.add("x");
        characters.add("V");
        characters.add("9");
        characters.add("O");
        characters.add("M");
        characters.add("3");
        characters.add("F");

        int x = random.nextInt(10);

        return characters.get(x);
    }

    public static String generisiRandomSpecijalanKarakter() {
        Random random = new Random();

        ArrayList<String> specialCharacters = new ArrayList<>();

        specialCharacters.add("@");
        specialCharacters.add("#");
        specialCharacters.add("&");
        specialCharacters.add("*");
        specialCharacters.add("!");

        int x = random.nextInt(5);

        return specialCharacters.get(x);
    }

    public static String generisiPassword(int passwordLength, boolean hasSpecialCharacter) {
        String password = "";

        if (!hasSpecialCharacter) {
            for (int i = 0; i < passwordLength; i++) {
                String character = generisiRandomKarakter();
                password = password + character;
            }
        } else {
            for (int i = 0; i < passwordLength - 1; i++) {
                String character = generisiRandomKarakter();
                password = password + character;
            }
            String specialCharacter = generisiRandomSpecijalanKarakter();
            password = password + specialCharacter;
        }
        return password;
    }
}