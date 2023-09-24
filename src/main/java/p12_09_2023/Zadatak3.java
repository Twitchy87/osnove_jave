package p12_09_2023;
//.Zadatak (Za vezbanje)
//Kreirati klasu ViberKorisnik koja ima:
//●	ime i prezime
//●	broj telefona
//●	da li je trenutno aktivan (boolean)
//●	gettere, settere, konstuktore
//
//Kreirati klasu ViberPoruka koja ima:
//●	tekst poruke
//●	vreme kad je poslata poruka
//●	korisnika koji je poslao poruku
//●	korisnika kome je poslata poruka
//●	gettere i setere i konstuktore
//●	rekaciju na poruku
//●	metodu prikazi koja stampa podatke o poruci u formatu:
//From: [Ime i prezime korisnika] * Active Now ili Not Active - at [vreme kad je poslata]
//To: [Ime i prezime korisnika kome je poslata]
//[Tekst poruke] : [reakcija] from [korisnik koji je reagovao]
//
//
//Kreirati klasu ViberReakcija koja ima:
//●	emoji (moze da bude sunglases, heart, smile, like ili sad)
//●	korisnika koji je reagovao
//U mainu kreirati nekoliko poruka izmedju dva korisnika i postavite nekoliko reakcija na poruke.

public class Zadatak3 {

    public static void main(String[] args) {

        ViberUser user1 = new ViberUser("Pera Peric", "38160123456");
        ViberUser user2 = new ViberUser("Laza Lazic", "38161987654");

        user1.setIsActive(true);

        ViberReaction reaction1 = new ViberReaction("smile", user2);

        ViberMessage message1 = new ViberMessage("Cao!", "10.02.2023  12:25", user1, user2);
        message1.setReaction(reaction1);

        message1.print();

        ViberReaction reaction2 = new ViberReaction("sunglases", user1);

        ViberMessage message2 = new ViberMessage("Hola!", "10.02.2023  12:30", user2, user1);
        message2.setReaction(reaction2);

        message2.print();


    }
}
