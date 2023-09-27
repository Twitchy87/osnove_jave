package d12_09_2023;

public class Transakcija {
    private int id;
    private Racun posiljalac;
    private Racun primalac;

    public Transakcija(int id, Racun posiljalac, Racun primalac) {
        this.id = id;
        this.posiljalac = posiljalac;
        this.primalac = primalac;
    }

    public double racunajProviziju(double suma){
        if (suma > 4500){
            return suma * 0.01;
        }
        return 45;
    }

    public boolean izvrsiTransakciju(double suma){
        double iznos = suma + this.racunajProviziju(suma);
        if(this.posiljalac.getStanje() >= iznos){
            this.posiljalac.skiniSaRacuna(iznos);
            this.primalac.uplatiNaRacun(suma);
            return true;
        }
        return false;
    }

    public void stampaj(){
            System.out.println("ID: " + this.id);
            System.out.print("Racun sa: ");
            this.posiljalac.stampaj();
            System.out.print("Racun na: ");
            this.primalac.stampaj();
    }

    public int getId() {
        return id;
    }

    public Racun getPosiljalac() {
        return posiljalac;
    }

    public Racun getPrimalac() {
        return primalac;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPosiljalac(Racun posiljalac) {
        this.posiljalac = posiljalac;
    }

    public void setPrimalac(Racun primalac) {
        this.primalac = primalac;
    }
}
