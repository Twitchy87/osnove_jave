package p18_09_2023;

public abstract class PlatnaKartica {

    protected double suma;
    protected String broj;
    protected int godina;
    protected int mesec;

    public PlatnaKartica(double suma, String broj, int godina, int mesec) {
        this.suma = suma;
        this.broj = broj;
        this.godina = godina;
        this.mesec = mesec;
    }

    public void dodajSredstva(double iznos){
        this.suma += iznos;
    }

    public abstract void izvrsiTransakciju(double iznos);

    public abstract void stampaj();

    public double getSuma() {
        return suma;
    }

    public String getBroj() {
        return broj;
    }

    public int getGodina() {
        return godina;
    }

    public int getMesec() {
        return mesec;
    }
}
