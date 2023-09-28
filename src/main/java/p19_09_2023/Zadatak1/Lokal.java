package p19_09_2023.Zadatak1;

public class Lokal extends Objekat{

    public Lokal() {
        super();
    }

    public Lokal(String adresa, double povrsina, int zona) {
        super(adresa, povrsina, zona);
    }

    @Override
    public double racunajPorez() {
        return this.koeficijent(this.zona) * this.povrsina * 1.3;
    }

    @Override
    public void stampaj() {
        System.out.println("Adresa: " + this.adresa + ", zona: " + this.zona);
        System.out.println("Povrsina: " + this.povrsina);
        System.out.println("Porez: " + this.racunajPorez());
    }
}
