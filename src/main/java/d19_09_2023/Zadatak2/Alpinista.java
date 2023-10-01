package d19_09_2023.Zadatak2;

public class Alpinista extends Planinar{

    private int brojPoena;

    public Alpinista(int id, String punoIme, int brojPoena) {
        super(id, punoIme);
        this.brojPoena = brojPoena;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        return (planina.getVisina() <= 4000);
    }

    @Override
    public int clanarina() {
        return 1500 - this.brojPoena * 50;
    }

    @Override
    public void stampaj() {
        System.out.println("Alpinista, id: " + this.id);
        System.out.println("Ime i prezime: " + this.punoIme);
        System.out.println("Broj poena: " + this.brojPoena);
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(int brojPoena) {
        this.brojPoena = brojPoena;
    }
}
