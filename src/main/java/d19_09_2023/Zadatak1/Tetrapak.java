package d19_09_2023.Zadatak1;

public class Tetrapak extends Ambalaza{

    private boolean zaReciklazu;
    private double osnovnaCena;

    public Tetrapak() {
        super();
    }

    public Tetrapak(String barkod, String naziv, int netoTezina, int brutoTezina, boolean zaReciklazu, double osnovnaCena) {
        super(barkod, naziv, netoTezina, brutoTezina);
        this.zaReciklazu = zaReciklazu;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if (this.zaReciklazu){
            return this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
        }
        return this.osnovnaCena;
    }

    @Override
    public void stampaj() {
        System.out.println("Naziv: " + this.naziv + ", barkod: " + this.barkod);
        System.out.println("Neto tezina: " + this.netoTezina + ", bruto tezina: " + this.brutoTezina);
        if (this.zaReciklazu){
            System.out.println("Ambalaza moze da se reciklira.");
        } else {
            System.out.println("Ambalaza ne moze da se reciklira.");
        }
        System.out.println("Osnovna cena: " + this.osnovnaCena);
        System.out.println("Cena artikla: " + this.cenaArtikla());
    }

    public boolean isZaReciklazu() {
        return zaReciklazu;
    }

    public void setZaReciklazu(boolean zaReciklazu) {
        this.zaReciklazu = zaReciklazu;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }
}
