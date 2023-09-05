package Mini_projekat;

//1.	**Zadatak: Simulacija skidanja tekstualnog fajla**
//Napišite program koji simulira proces skidanja tekstualnog fajla. Skidanje fajla se obavlja u paketima od po 5 karaktera. Pretpostavljamo da korisnik unosi podatke u skladu sa sledećim zahtevima:
//
//●	Korisnik unosi veličinu fajla u bajtovima, pri čemu svaki karakter zauzima 1 bajt.
//●	Ako broj karaktera u fajlu nije deljiv sa 5, poslednji paket će sadržati manje od 5 karaktera.
//●	Korisnik će biti upitan za podatke svakog paketa kroz for petlju. Nakon unosa svakog paketa, program treba da prikaže procenat trenutno skinutog fajla. Na programu je da odredi koliko paketa je potrebno za ceo fajl.
//●	Na kraju programa, ispišite sadržaj celog fajla.
//Primer izvršenja 1:
//Unesite veličinu fajla: 25
//Unesite paket: soiek
//Skinuto 20.0%
//Unesite paket: ew43t
//Skinuto 40.0%
//Unesite paket: tr5y7
//Skinuto 60.0%
//Unesite paket: dbtu6
//Skinuto 80.0%
//Unesite paket: 6ghku
//Skinuto 100.0%
//Sadržaj fajla je: soiekew43ttr5y7dbtu66ghku
//
//Primer izvršenja 2:
//Unesite veličinu fajla: 27
//Unesite paket: soiek
//Skinuto 18.5%
//Unesite paket: ew43t
//Skinuto 37.0%
//Unesite paket: tr5y7
//Skinuto 55.5%
//Unesite paket: dbtu6
//Skinuto 74.0%
//Unesite paket: 6ghku
//Skinuto 92.5%
//Unesite paket: cc
//Skinuto 100.0%
//Sadržaj fajla je: soiekew43ttr5y7dbtu66ghkucc
//Napomena: Posto je procenat realan broj, u stampi ce se prikazati vise cifara iza zareza.

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite velicinu fajla: ");
        int fileSize = s.nextInt();

        String file = "";
        double percentage = 0;

        for (int i = 1; i <= fileSize; i+=5) {
            System.out.println("Unesite paket:");
            file = file + s.next();

            percentage = percentage + 100.0 * 5 / fileSize;

            if (percentage > 100){
                percentage = 100;
            }
            System.out.println("Skinuto: " + percentage + "%");
        }

        System.out.println("Sadrzaj fajla je: " + file);

    }
}
