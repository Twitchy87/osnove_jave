package Mini_projekat;

//4.	**Zadatak: Zamena Vrednosti u Locust Komandi**
//
//Za rešenje ovog zadatka, biće potrebno upoznati se sa upotrebom `replace` metode koju pruža `String` klasa u Javi.
//Napišite program koji omogućava korisniku da menja vrednosti unutar komande dok se ne zamene sve vrednosti u komandi. Komanda iz primera je komanda koja pokreće Locust skriptu za stres testiranje. Ukoliko ste zainteresovani, preporučuje se da istražite alat Locust.
//
//Komanda je obican String, a vrednosti koje se menjaju su reči napisane velikim slovima i ispred svake od njih se nalazi znak $. Ako u skripti postoji barem jedan znak $, to znači da još uvek postoje promenljive koje treba zameniti.
//
//Program od korisnika traži da unese naziv promenljive za zamenu i vrednost koja će biti postavljena umesto te promenljive u komandi. Nakon svake zamene, program će prikazati trenutnu komandu sa izmenama.
//Komanda koja je koriscena za ovaj primer je
//locust -f $LOCUSTFILE -u $NUMBER_OF_USERS -r $SPAWN_RATE -t $RUN_TIME --headless –host $HOST --html $HTML_FILE
//Promenljivi delovi komande su
//●	$LOCUSTFILE
//●	$NUMBER_OF_USERS
//●	$SPAWN_RATE
//●	$RUN_TIME
//●	$HOST
//●	$HTML_FILE
//
//Primer izvrsenja nije previse citak zato na kraju zadataka imate sliku izvrsenja
//
//Primer izvršenja:
//Komanda: locust -f $LOCUSTFILE -u $NUMBER_OF_USERS -r $SPAWN_RATE -t $RUN_TIME --headless –host $HOST --html $HTML_FILE
//Unesite naziv promenljive za zamenu: $LOCUSTFILE
//Unesite vrednost: login_stress_test.py
//Komanda: locust -f login_stress_test.py -u $NUMBER_OF_USERS -r $SPAWN_RATE -t $RUN_TIME --headless –host $HOST --html $HTML_FILE
//Unesite naziv promenljive za zamenu: $NUMBER_OF_USERS
//Unesite vrednost: 1000
//Komanda: locust -f login_stress_test.py -u 1000 -r $SPAWN_RATE  -t $RUN_TIME --headless –host $HOST --html $HTML_FILE
//Unesite naziv promenljive za zamenu: $SPAWN_RATE
//Unesite vrednost: 5
//Komanda: locust -f login_stress_test.py -u 1000 -r 5  -t $RUN_TIME --headless –host $HOST --html $HTML_FILE
//Unesite naziv promenljive za zamenu: $RUN_TIME
//Unesite vrednost: 100
//Komanda: locust -f login_stress_test.py -u 1000 -r 5  -t 100 --headless –host $HOST --html $HTML_FILE
//Unesite naziv promenljive za zamenu: $HOST
//Unesite vrednost: https://cms.demo.katalon.com/
//Komanda: locust -f login_stress_test.py -u 1000 -r 5  -t 100 --headless –host  https://cms.demo.katalon.com/ --html $HTML_FILE
//Unesite naziv promenljive za zamenu: $HTML_FILE
//Unesite vrednost: login_stress_report.html
//Komanda: locust -f login_stress_test.py -u 1000 -r 5  -t 100 --headless –host  https://cms.demo.katalon.com/ --html login_stress_report.html

import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String command = "locust -f $LOCUSTFILE -u $NUMBER_OF_USERS -r $SPAWN_RATE -t $RUN_TIME --headless –host $HOST --html $HTML_FILE";

        while (command.contains("$")){
            System.out.println("Unesite naziv promenljive za zamenu:");
            String oldVariable = s.next();

            System.out.println("Unesite vrednost:");
            String newValue = s.next();

            command = command.replace(oldVariable, newValue);

            System.out.println("Komanda: " + command);
        }
    }
}
