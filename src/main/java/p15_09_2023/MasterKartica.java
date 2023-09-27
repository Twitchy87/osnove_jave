package p15_09_2023;

public class MasterKartica extends PlatnaKartica{

    public MasterKartica(double suma, String broj, int godina, int mesec) {
        super(suma, broj, godina, mesec);
    }

    @Override
    public void izvrsiTransakciju(double iznos){
        this.suma -= iznos + iznos * 1.5 / 100;
    }

    public void naplatiOdrzavanje(){
        this.suma -= 2;
    }

    public void stampaj(){
        System.out.println("Master Card: " + this.mesec + "/" + this.godina + ", " + this.broj + ", $" + this.suma);
    }
}
