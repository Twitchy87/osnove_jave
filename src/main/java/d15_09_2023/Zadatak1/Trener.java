package d15_09_2023.Zadatak1;

public class Trener extends Osoba{

    private int godineIskustva;
    private String tip;

    public Trener() {
        super();
    }

    public Trener(String punoIme, String jmbg, int godinaRodjenja, int godineIskustva, String tip) {
        super(punoIme, jmbg, godinaRodjenja);
        this.godineIskustva = godineIskustva;
        this.tip = tip;
    }

    @Override
    public void stampaj(){
        System.out.println("Ime i prezime: " + this.punoIme + ", jmbg: " + this.jmbg + ", godina rodjenja: " + this.godinaRodjenja + ", tip trenera: " + this.tip + ", godine iskustva: " + this.godineIskustva);
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
