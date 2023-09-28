package p19_09_2023.Zadatak1;

public class Kuca extends Objekat{

    private int brojClanova;

    public Kuca() {
        super();
    }

    public Kuca(String adresa, double povrsina, int zona, int brojClanova) {
        super(adresa, povrsina, zona);
        this.brojClanova = brojClanova;
    }

    @Override
    public double racunajPorez() {
        return this.koeficijent(this.zona) * this.povrsina;
    }

    @Override
    public void stampaj() {
        System.out.println("Adresa: " + this.adresa + ", zona: " + this.zona);
        System.out.println("Povrsina: " + this.povrsina);
        System.out.println("Broj clanova domacinstva: " + this.brojClanova);
        System.out.println("Porez: " + this.racunajPorez());
    }

    public int getBrojClanova() {
        return brojClanova;
    }

    public void setBrojClanova(int brojClanova) {
        this.brojClanova = brojClanova;
    }
}
