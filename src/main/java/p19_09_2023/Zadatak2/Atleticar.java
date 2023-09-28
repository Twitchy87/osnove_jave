package p19_09_2023.Zadatak2;

public abstract class Atleticar {

    private String punoIme;
    protected double rezultat;

    public Atleticar() {
    }

    public Atleticar(String punoIme, double rezultat) {
        this.punoIme = punoIme;
        this.rezultat = rezultat;
    }

    public abstract boolean uporediRezultat(Atleticar atleticar);

    public void stampaj(){
        System.out.println("Ime i prezime: " + this.punoIme + ", rezultat: " + this.rezultat);
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public double getRezultat() {
        return rezultat;
    }

    public void setRezultat(double rezultat) {
        this.rezultat = rezultat;
    }
}
