package d19_09_2023.Zadatak1;

public class StaklenaAmbalaza extends Ambalaza{

    private int kaucija;
    private boolean placaSeKaucija;
    private double osnovnaCena;

    public StaklenaAmbalaza() {
        super();
    }

    public StaklenaAmbalaza(String barkod, String naziv, int netoTezina, int brutoTezina, int kaucija, boolean placaSeKaucija, double osnovnaCena) {
        super(barkod, naziv, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.placaSeKaucija = placaSeKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if (this.placaSeKaucija){
            return this.osnovnaCena * 1.2 + this.kaucija;
        }
        return this.osnovnaCena * 1.2;
    }

    @Override
    public void stampaj() {
        System.out.println("Naziv: " + this.naziv + ", barkod: " + this.barkod);
        System.out.println("Neto tezina: " + this.netoTezina + ", bruto tezina: " + this.brutoTezina);
        if (this.placaSeKaucija){
            System.out.println("Kaucija: " + this.kaucija);
        } else {
            System.out.println("Ne placa se kaucija.");
        }
        System.out.println("Osnovna cena: " + this.osnovnaCena);
        System.out.println("Cena artikla: " + this.cenaArtikla());
    }

    public int getKaucija() {
        return kaucija;
    }

    public void setKaucija(int kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isPlacaSeKaucija() {
        return placaSeKaucija;
    }

    public void setPlacaSeKaucija(boolean placaSeKaucija) {
        this.placaSeKaucija = placaSeKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }
}
