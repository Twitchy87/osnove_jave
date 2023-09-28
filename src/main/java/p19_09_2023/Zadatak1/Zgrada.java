package p19_09_2023.Zadatak1;

public class Zgrada extends Objekat{

    private int brojStanova;

    public Zgrada() {
        super();
    }

    public Zgrada(String adresa, double povrsina, int zona, int brojStanova) {
        super(adresa, povrsina, zona);
        this.brojStanova = brojStanova;
    }

    @Override
    public double racunajPorez(){
        return this.koeficijent(this.zona) * this.povrsina * this.brojStanova;
    }

    @Override
    public void stampaj(){
        System.out.println("Adresa: " + this.adresa + ", zona: " + this.zona);
        System.out.println("Povrsina: " + this.povrsina);
        System.out.println("Broj stanova: " + this.brojStanova);
        System.out.println("Porez: " + this.racunajPorez());
    }

    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }
}
