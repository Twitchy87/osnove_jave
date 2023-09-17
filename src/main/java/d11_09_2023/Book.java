package d11_09_2023;

public class Book {

    private String isbn;
    private String title;
    private int yearOfEdition;
    private Author author;

    public Book(String title, Author author){
        this.title = title;
        this.author = author;
    }
    public Book(String isbn, String title, int yearOfEdition, Author author){
        this.isbn = isbn;
        this.title = title;
        this.yearOfEdition = yearOfEdition;
        this.author = author;
    }

    public void print(){
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Naziv knjige: " + this.title + " - " + this.yearOfEdition + " god.");
        this.author.print();
    }

    public String getIsbn(){
        return this.isbn;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public int getYearOfEdition(){
        return this.yearOfEdition;
    }
    public void setYearOfEdition(int yearOfEdition){
        this.yearOfEdition = yearOfEdition;
    }

    public Author getAuthor(){
        return this.author;
    }
    public void setAuthor(Author author){
        this.author = author;
    }

}
