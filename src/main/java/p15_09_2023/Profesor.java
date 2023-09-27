package p15_09_2023;

public class Profesor extends Osoba{

    private String predmet;
    private double plata;

    public Profesor() {
        super();
    }

    public Profesor(String punoIme, String jmbg, String predmet, double plata) {
        super(punoIme, jmbg);
        this.predmet = predmet;
        this.plata = plata;
    }

    public void povecajPlatu(int povisicaProcenat){
        this.plata += this.plata * povisicaProcenat / 100;
    }

    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Predaje: " + this.predmet);
        System.out.println("Plata: " + this.plata);
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }
}
