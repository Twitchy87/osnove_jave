package p14_09_2023;
//4.Zadatak(Za vezbanje)
//Kreirati klasu InstagramUser koja ima:
//●	username
//●	Ime i prezime
//●	email
//●	Sve sto vam dalje zatreba dopunite klasu.
//Kreiarti klasu InstagramTag koja ima:
//●	x koordinatu na slici
//●	y koordinatu na slici
//●	usera koji je tagovan
//Kreirati klasu InstagramImage koja ima:
//●	niz tagova
//●	duzinu slike
//●	visinu slike
//●	putanju do slike (npr: instagram.com/korsnik-pera/profilna.jpg)
//●	metodu dodajTag
//
//Kreirati klasu InstagramPost koja ima
//●	niz slika
//●	Opis koji moze da se postavi za post
//●	metodu dodajSliku

public class Zadatak4 {

    public static void main(String[] args) {

        InstagramUser user1 = new InstagramUser("pera", "pera peric", "pera@gmail.com");
        InstagramUser user2 = new InstagramUser("mika", "mika mikic", "mika@gmail.com");
        InstagramUser user3 = new InstagramUser("zika", "zika zikic", "zika@gmail.com");
        InstagramUser user4 = new InstagramUser("laza", "laza lazic", "laza@gmail.com");

        InstagramTag tag1 = new InstagramTag(35, 40, user2);
        InstagramTag tag2 = new InstagramTag(45, 57, user3);
        InstagramTag tag3 = new InstagramTag(15, 23, user4);

        InstagramImage image = new InstagramImage(100, 200, "instagram.com/korsnik-pera/profilna.jpg");

        image.addTag(tag1);
        image.addTag(tag2);
        image.addTag(tag3);

        InstagramPost post = new InstagramPost("Party!");

        post.addImage(image);

    }
}
