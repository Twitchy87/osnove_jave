package d08_09_2023;

public class FacebookPost {

    public String posiljalac;
    public String primalac;
    public String text;
    public int brojLajkova;
    public int brojDeljenja;

    public void like(){
        brojLajkova++;
    }

    public void dislike(){
        brojLajkova--;
        if (brojLajkova < 0){
            brojLajkova = 0;
        }
    }

    public void share(){
        brojDeljenja++;
    }

    public void print(){
        System.out.println(this.posiljalac + " >>> " + this.primalac);
        System.out.println(this.text);
        System.out.println("Likes " + this.brojLajkova + " | Shares " + this.brojDeljenja);
    }
}
