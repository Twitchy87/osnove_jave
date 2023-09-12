package d08_09_2023;

public class Proizvod {

    public String naziv;
    public double cena;
    public double tezina;

    public void stampaj(){
        System.out.println(this.naziv + ", " + this.cena + " din, " + this.tezina + " gr");
    }

    public void povecajCenu(double povecanje){
        this.cena += povecanje;
    }

    public double vratiCenuSaPopustom(int popust){
        return this.cena - this.cena * popust / 100;
    }

    public int racunajPostarinu(){
        if (this.tezina <= 100){
            return  200;
        } else if (this.tezina <= 500) {
            return  400;
        } else {
           return  1000;
        }
    }
}
