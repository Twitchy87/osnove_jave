package p12_09_2023;

public class Sastojak {

    private String naziv;
    private double cena;

    public Sastojak(){

    }
    public Sastojak(String naziv, double cena){
        this.naziv = naziv;
        this.cena = cena;
    }

    public String getNaziv(){
        return this.naziv;
    }
    public void setNaziv(String naziv){
        this.naziv = naziv;
    }

    public double getCena(){
        return this.cena;
    }
    public void setCena(double cena){
        this.cena = cena;
    }
}
