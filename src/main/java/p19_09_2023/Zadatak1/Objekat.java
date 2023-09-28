package p19_09_2023.Zadatak1;

public abstract class Objekat {

    protected String adresa;
    protected double povrsina;
    protected int zona;

    public Objekat() {
    }

    public Objekat(String adresa, double povrsina, int zona) {
        this.adresa = adresa;
        this.povrsina = povrsina;
        this.zona = zona;
    }

    public double koeficijent(int zona){
        switch (zona){
            case 1:
                return 1.4;
            case 2:
                return 1.1;
            case 3:
                return 1.05;
            default:
                return 0;
        }
    }

    public abstract double racunajPorez();

    public abstract void stampaj();

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getPovrsina() {
        return povrsina;
    }

    public void setPovrsina(double povrsina) {
        this.povrsina = povrsina;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }
}
