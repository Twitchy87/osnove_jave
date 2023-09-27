package d15_09_2023.Zadatak2;

import java.util.ArrayList;

public class Igrac extends Osoba{

    private int broj;
    private String pozicija;
    private ArrayList<Karton> kartoni;
    private boolean daLiJeKapiten;

    public Igrac() {
        super();
        this.kartoni = new ArrayList<>();
    }

    public Igrac(String punoIme, String jmbg, int godinaRodjenja, int broj, String pozicija, boolean daLiJeKapiten) {
        super(punoIme, jmbg, godinaRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.daLiJeKapiten = daLiJeKapiten;
        this.kartoni = new ArrayList<>();
    }

    public void dodajKarton(Karton karton){
        this.kartoni.add(karton);
    }

    public int zutiKartoni(){
        int brojac = 0;
        for (int i = 0; i < this.kartoni.size(); i++) {
            if (this.kartoni.get(i).getTip().equals("zuti")){
                brojac++;
            }
        }
        return brojac;
    }

    public int crveniKartoni(){
        int brojac = 0;
        for (int i = 0; i < this.kartoni.size(); i++) {
            if (this.kartoni.get(i).getTip().equals("crveni")){
                brojac++;
            }
        }
        return brojac;
    }

    @Override
    public void stampaj(){
        System.out.print("Ime i prezime: " + this.punoIme + ", jmbg: " + this.jmbg + ", godina rodjenja: " + this.godinaRodjenja + ", igra na poziciji: " + this.pozicija + ", broj dresa: " + this.broj + ", ");
        if (daLiJeKapiten){
            System.out.println("kapiten tima");
        } else {
            System.out.println("nije kapiten tima");
        }
        System.out.println("Broj zutih kartona: " + this.zutiKartoni());
        System.out.println("Broj crvenih kartona: " + this.crveniKartoni());
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean getDaLiJeKapiten() {
        return daLiJeKapiten;
    }

    public void setDaLiJeKapiten(boolean daLiJeKapiten) {
        this.daLiJeKapiten = daLiJeKapiten;
    }
}
