package p07_09_2023;
//2.Zad
//Krairti klasu SlackMessage koja ima:
//●	tekst poruke
//●	ime i prezime osobe koja je stavila poruku
//●	datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke u formatu:
//[ime i prezime osobe] - [kad je poslata]
//[Tekst poruke]

public class Zadatak2 {

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

        System.out.println(message1.ime + " " + message1.prezime + " - " + message1.datumIVreme);
        System.out.println(message1.text);

        System.out.println(message2.ime + " " + message2.prezime + " - " + message2.datumIVreme);
        System.out.println(message2.text);

    }
}
