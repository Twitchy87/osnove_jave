package p18_09_2023;

public abstract class Student {

    protected String punoIme;
    protected String brojIndeksa;
    protected int godinaStudija;

    public Student() {
    }

    public Student(String punoIme, String brojIndeksa, int godinaStudija) {
        this.punoIme = punoIme;
        this.brojIndeksa = brojIndeksa;
        this.godinaStudija = godinaStudija;
    }

    public abstract int skolarina();

    public abstract boolean naBudzetu();

    public void stampaj(){
        System.out.println("Student: " + this.punoIme + ", br. indeksa: " + this.brojIndeksa + ", god. studija: " + this.godinaStudija);
        System.out.print("Finansiranje: ");

        if (this.naBudzetu()){
            System.out.println("budzet");
        } else {
            System.out.println("samofinansirajuci");
        }

        System.out.println("Cena skolarine: " + this.skolarina());
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }
}
