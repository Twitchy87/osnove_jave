package p08_09_2023;
//1.	Zadatak
//Kreirati klasu SlackMessage koja ima:
//●	tekst poruke
//●	ime i prezime osobe koja je stavila poruku
//●	datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//●	(dopuna) kreirati metodu za stampu koja stampa podatke u formatu
//[ime i prezime osobe] - [kad je poslata]
//[Tekst poruke]
//U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke
//
//(Dopuna)
//Dopuniti klasu SlackMessage novim atributom koji kaze kada je poruka azurirana i kreirati metodu za azuriranje teksta. Metoda kao parametar prima novi tekst i datum kada je poruka azurirana. Metoda postavlja novi tekst i datum azuriranja u objektu.
//U glavnom programu pozvati ovu metodu za izmenu i nakon toga ponovo odstampati stanje objekata.

public class Zadatak1 {

    public static void main(String[] args) {

        SlackMessage message1 = new SlackMessage();
        message1.text = "Pozdrav!";
        message1.ime = "Pera";
        message1.prezime = "Peric";
        message1.datumIVreme = "07.07.2023   18:25";

        SlackMessage message2 = new SlackMessage();
        message2.text = "Pozdrav!";
        message2.ime = "Pera";
        message2.prezime = "Peric";
        message2.datumIVreme = "01.05.2023   18:25";

        message1.printInfo();
        message2.printInfo();

        message1.azurirajText("HI!", "08.09.2023  19:00");

        message2.azurirajText("HELLO!", "08.09.2023  19:00");

        message1.printInfo();
        message2.printInfo();
    }
}
