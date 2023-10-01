package d19_09_2023.Zadatak2;

public abstract class Planinar {

    protected int id;
    protected String punoIme;

    public Planinar(int id, String punoIme) {
        this.id = id;
        this.punoIme = punoIme;
    }

    public abstract void stampaj();

    public abstract int clanarina();

    public abstract boolean uspesanUspon(Planina planina);

    public int getId() {
        return id;
    }

    public String getPunoIme() {
        return punoIme;
    }
}
