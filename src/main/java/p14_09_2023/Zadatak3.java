package p14_09_2023;
//3.Zadatak(Za vezbanje)
//Za potrebe google istorije potrebno je kreirati sledece klase.
//Klasu HistoryPage koja ima:
//●	naziv stranice
//●	link do stranice
//●	vreme otvaranja stranice - sat i minut (2 atributa)
//●	username i password sacuvani za ovu stranicu (kao objasnjene ovo su kao kolacici za neki sajt)
//●	konstuktore koji su logicni
//●	gettere i setter (username i password nemaju settere)
//●	metodu sacuvaj kredencijale za ovu stranicu. Metoda kao parametre  prima username i password i setuje te atribute.
//●	Metoda obrisi kolacice koja setuje username i password na null.
//●	Metoda stampaj koja stampa podatke u formatu:
//[sat] - [minut] - [ naziv ]…[ link ] [Ako postoje kredencijali stampa se zvezdica pored linka]
//
//Klasu History koja ima:
//●	niz stranica koje su posecene
//●	metoda otvori stranicu koja dodaje novi historypage u niz.
//●	metodu obrisi prema linku - metoda koja iz niza izbacuje stranicu prema linku
//●	metoda obrisi kolacice za link - metoda koja za homepage brise kolacice
//●	metoda obrisi istoriju - metoda brise celu istoriju
//●	metoda sacuvajKredencija - od parametara se prima naziv stranice i username i password koji se cuvaju.
//●	metoda pogledajIstoriju - stampa sve posecene stranice
//●	metoda obrisiSveKolacice - metoda brise kredencijale za sve stranice.
//●	metoda obrisiSveKolaciceZaSadnjihSatVremena-  brise kolacice za strnaice koje su ucitane u zadnjih sat vremena. Metoda kao parametar prima trenutno vreme (sat i minut)

public class Zadatak3 {

    public static void main(String[] args) {

        HistoryPage page1 = new HistoryPage("Google", "https://www.google.com",12, 57);
        HistoryPage page2 = new HistoryPage("Udemy", "https://www.udemy.com", 13, 00);
        HistoryPage page3 = new HistoryPage("Facebook", "https://www.facebook.com", 13, 35);
        HistoryPage page4 = new HistoryPage("Instagram", "https://www.instagram.com",19, 17);
        HistoryPage page5 = new HistoryPage("Youtube", "https://www.youtube.com", 21, 00);
        HistoryPage page6 = new HistoryPage("Facebook", "https://www.facebook.com", 21, 32);

        History history = new History();

        history.openPage(page1);
        history.openPage(page2);
        history.openPage(page3);
        history.openPage(page4);
        history.openPage(page5);
        history.openPage(page6);

        history.saveCredentials("Google", "pera", "1234");
        history.saveCredentials("Udemy", "mika", "987");
        history.saveCredentials("Facebook", "zika", "456");
        history.saveCredentials("Instagram", "laza", "qwerty");
        history.saveCredentials("Youtube", "mirko", "789p");

        history.print();
        System.out.println("------------------------------------");

        history.deletePage("https://www.facebook.com");

        history.print();
        System.out.println("------------------------------------");

        history.deleteCookies("https://www.google.com");

        history.print();
        System.out.println("------------------------------------");

        history.deleteAllCookiesLastHour(21, 30);

        history.print();
        System.out.println("------------------------------------");

        history.deleteAllCookies();

        history.print();
        System.out.println("------------------------------------");

        history.deleteHistory();

        history.print();
        System.out.println("------------------------------------");
    }
}
