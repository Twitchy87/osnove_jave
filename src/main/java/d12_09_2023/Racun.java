package d12_09_2023;

public class Racun {

    private String broj;
    private String vlasnik;
    private double stanje;

    public Racun(String broj, String vlasnik) {
        this.broj = broj;
        this.vlasnik = vlasnik;
    }

    public Racun(String broj, String vlasnik, double stanje) {
        this.broj = broj;
        this.vlasnik = vlasnik;
        this.stanje = stanje;
    }

    public void uplatiNaRacun(double suma){
        this.stanje += suma;
    }

    public void skiniSaRacuna(double suma){
        this.stanje -= suma;
    }

    public void stampaj(){
        System.out.println(this.vlasnik + " - " + this.broj);
        System.out.println("Stanje na racunu je " + this.stanje + " rsd.");
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public String getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(String vlasnik) {
        this.vlasnik = vlasnik;
    }

    public double getStanje(){
        return stanje;
    }
}
