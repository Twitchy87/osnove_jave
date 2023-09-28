package p19_09_2023.Zadatak2;
//Zadatak 2. Kreirati apstraktnu klasu Atleticar čiji su tributi:
//●	ime i prezime privatni
//●	i rezultat ostvaren na takmičenju koji je zasticen
//Javne metode klase su:
//●	apstratktna metoda koja ispituje da li je rezultat atletičara bolji od rezultata drugog atletičara (metoda za parametar prima atleticara, ne rezultat drugog atleticara!!)
//●	metoda koja stampa podataka o atletičaru u formatu: (ime) (prezime), (rezultat)
//Kreirati i klase Trkac i Skakac izvedene iz klase Atleticar. Kod trkača je bolji manji rezultat, a kod skakača veći.
//Kreirati i klasu Disciplina čiji su privatni atributi:
//●	ime discipline
//●	tip discipline (Trkacka ili Skakacka)
//●	niz atletičara koji učestvuju u toj disciplini.
//U javnom delu klase definisati:
//●	konstuktore, gettere i settere
//●	konstruktor koji postavlja ime discipline i tip
//●	metodu dodaj atleticara u disciplinu
//●	metodu diskvalifikuj atleticara iz discipline, za parametar funkcije prima se ime i prezime atleticara
//●	(za vezbanje) privatnu metodu koja pronalazi i vraca atletircara (ne ime i prezime) sa najboljim rezultatom
//●	(za vezbanje) metoda koja prikazuje podatke o pobedniku discipline.
//U funkciji main kreirati discipline „Skok u dalj“ i „110m s preponama“ sa proizvoljnim brojem učesnika,
//(za vezbanje) na ekranu prikazati poruke o pobednicima obe discipline.

public class Zadatak2 {

    public static void main(String[] args) {

        Atleticar trkac1 = new Trkac("Pera Peric", 35.50);
        Atleticar trkac2 = new Trkac("Mika Mikic", 36.51);
        Atleticar trkac3 = new Trkac("Zika Zikic", 35.32);

        Atleticar skakac1 = new Skakac("Laza Lazic", 7.53);
        Atleticar skakac2 = new Skakac("Marko Markovic", 8.12);
        Atleticar skakac3 = new Skakac("Sava Savic", 7.73);
        Atleticar skakac4 = new Skakac("Susumiga Susumigovic", 8.54);

        Disciplina disciplina1 = new Disciplina("Skok u dalj", "skakanje");
        Disciplina disciplina2 = new Disciplina("110m s preponama", "trkanje");

        disciplina1.dodajAtleticara(skakac1);
        disciplina1.dodajAtleticara(skakac2);
        disciplina1.dodajAtleticara(skakac3);
        disciplina1.dodajAtleticara(skakac4);

        disciplina1.diskvalifikujAtleticara("Laza Lazic");

        disciplina2.dodajAtleticara(trkac1);
        disciplina2.dodajAtleticara(trkac2);
        disciplina2.dodajAtleticara(trkac3);

        System.out.println("Pobednik u disciplini 'Skok u dalj' je:");
        disciplina1.stampajNajboljiAtleticar();
        System.out.println("---------------------------------");
        System.out.println("Pobednik u disciplini \"110m s preponama\" je:");
        disciplina2.stampajNajboljiAtleticar();
    }
}
