package d15_09_2023.Zadatak1;

public class Igrac extends Osoba{

    private int broj;
    private String pozicija;

    private boolean daLiJeKapiten;

    public Igrac() {
        super();
    }

    public Igrac(String punoIme, String jmbg, int godinaRodjenja, int broj, String pozicija, boolean daLiJeKapiten) {
        super(punoIme, jmbg, godinaRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.daLiJeKapiten = daLiJeKapiten;
    }

    @Override
    public void stampaj(){
        System.out.print("Ime i prezime: " + this.punoIme + ", jmbg: " + this.jmbg + ", godina rodjenja: " + this.godinaRodjenja + ", igra na poziciji: " + this.pozicija + ", broj dresa: " + this.broj + ", ");
        if (daLiJeKapiten){
            System.out.println("kapiten tima");
        } else {
            System.out.println("nije kapiten tima");
        }
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
