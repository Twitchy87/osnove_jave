package p15_09_2023;

public class Student extends Osoba {

    private String brojIndeksa;
    private double dugSkolarina;

    public Student() {
        super();
    }

    public Student(String punoIme, String jmbg, String brojIndeksa, double dugSkolarina) {
        super(punoIme, jmbg);
        this.brojIndeksa = brojIndeksa;
        this.dugSkolarina = dugSkolarina;
    }

    public void uplatiSkolarinu(double uplata){
        this.dugSkolarina -= uplata;
    }

    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Broj indeksa: " + this.brojIndeksa);
        System.out.println("Preostao dug za skolarinu: " + this.dugSkolarina);
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public double getDugSkolarina() {
        return dugSkolarina;
    }
}
