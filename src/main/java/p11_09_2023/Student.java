package p11_09_2023;

public class Student {

    private String ime;
    private String prezime;
    private int brojIndeksa;
    private boolean daLiJeBudzet;

    public String getIme() {
        return this.ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return this.prezime;
    }
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrojIndeksa() {
        return this.brojIndeksa;
    }
    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public boolean getDaLiJeBudzet() {
        return this.daLiJeBudzet;
    }
    public void setDaLiJeBudzet(boolean daLiJeBudzet) {
        this.daLiJeBudzet = daLiJeBudzet;
    }

    public void stampaj(){
        System.out.println("Student: " + this.ime + " " + this.prezime);
        System.out.println("Broj indeksa: " + this.brojIndeksa);
        if (this.daLiJeBudzet){
            System.out.println("Na budzetu je.");
        } else {
            System.out.println("Nije na budzetu.");
        }
    }
}
