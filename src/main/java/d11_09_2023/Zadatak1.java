package d11_09_2023;
//1.	Kreirati klasu Autor koja ima
//-ime i prezime
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu:
//(ime autora) (prezime autora)
//
//Kreirati klasu Knjiga koji ima:
//-ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//(ISBN)
//(naziv) - (godina izdanja)
//autor: (ime autora) (prezime autora)
//
//	U glavnom programu napraviti vise autora sa vise knjiga.

public class Zadatak1 {

    public static void main(String[] args) {

        Author author1 = new Author("Nil", "Gejmen");
        Author author2 = new Author("Daglas", "Adams");
        Author author3 = new Author("Bil", "Brajson");

        Book book1 = new Book("1459853655","Koralina",2006,author1);
        Book book2 = new Book("45687422635","Autostoperski vodic kroz galaksiju", 1987, author2);
        Book book3 = new Book("4452366984","Ni ovde, ni tamo", 2003, author3);

        book1.print();
        System.out.println();
        book2.print();
        System.out.println();
        book3.print();
    }
}
