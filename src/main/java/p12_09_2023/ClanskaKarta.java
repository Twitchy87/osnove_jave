package p12_09_2023;

public class ClanskaKarta {

    private int popust;
    private String broj;

    public ClanskaKarta(){
    }
    public ClanskaKarta(int popust, String broj){
        this.popust = popust;
        this.broj = broj;
    }

    public int getPopust(){
        return this.popust;
    }
    public void setPopust(int popust){
        this.popust = popust;
    }

    public String getBroj(){
        return this.broj;
    }
    public void setBroj(String broj){
        this.broj = broj;
    }
}
