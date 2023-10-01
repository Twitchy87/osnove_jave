package d19_09_2023.Zadatak1;

public abstract class Ambalaza {
    protected String barkod;
    protected String naziv;
    protected int netoTezina;
    protected int brutoTezina;

    public Ambalaza() {
    }

    public Ambalaza(String barkod, String naziv, int netoTezina, int brutoTezina) {
        this.barkod = barkod;
        this.naziv = naziv;
        this.netoTezina = netoTezina;
        this.brutoTezina = brutoTezina;
    }

    public int tezinaPakovanja(){
        return this.brutoTezina - this.netoTezina;
    }

    public abstract double cenaArtikla();

    public abstract void stampaj();

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getNetoTezina() {
        return netoTezina;
    }

    public void setNetoTezina(int netoTezina) {
        this.netoTezina = netoTezina;
    }

    public int getBrutoTezina() {
        return brutoTezina;
    }

    public void setBrutoTezina(int brutoTezina) {
        this.brutoTezina = brutoTezina;
    }
}
