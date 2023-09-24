package p12_09_2023;

public class Proizvod {

    private String naziv;
    private Kupac kupac;
    private int cenaIzrade;

    public Proizvod(){
    }
    public Proizvod(String naziv, Kupac kupac, int cenaIzrade){
        this.naziv = naziv;
        this.kupac = kupac;
        this.cenaIzrade = cenaIzrade;
    }

    public double racunajCenu(){
        return this.cenaIzrade * 1.9 * (100 - this.kupac.getClanskaKarta().getPopust()) / 100;
    }

    public void stampaj(){
        System.out.println(this.naziv + " - " + this.racunajCenu());
        this.kupac.stampaj();
    }

    public String getNaziv(){
        return this.naziv;
    }
    public void setNaziv(String naziv){
        this.naziv = naziv;
    }

    public Kupac getKupac(){
        return this.kupac;
    }
    public void setKupac(Kupac kupac){
        this.kupac = kupac;
    }

    public int getCenaIzrade(){
        return this.cenaIzrade;
    }
    public void setCenaIzrade(int cenaIzrade){
        this.cenaIzrade = cenaIzrade;
    }
}
