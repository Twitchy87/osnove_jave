package d14_09_2023;

import java.util.ArrayList;

public class Student {

    private String brojIndeksa;
    private String punoIme;
    private String tipStudija;
    private ArrayList<Ispit> ispiti;

    public Student() {
        this.ispiti = new ArrayList<>();
    }

    public Student(String brojIndeksa, String punoIme, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.punoIme = punoIme;
        this.tipStudija = tipStudija;
        this.ispiti = new ArrayList<>();
    }

    public void dodajIspit(Ispit ispit){
        this.ispiti.add(ispit);
    }

    public double racunajProsek(){
        int brojac = 0;
        int zbirOcena = 0;

        for (int i = 0; i < this.ispiti.size(); i++) {
            if (this.ispiti.get(i).polozenIspit()){
                zbirOcena += this.ispiti.get(i).getOcena();
                brojac++;
            }
        }

        return 1.0 * zbirOcena / brojac;
    }

    public void stampaj(){
        System.out.println("Br. indeksa: " + this.brojIndeksa + ", student: " + this.punoIme + ", " + this.tipStudija);
        System.out.println("Predmeti:");
        for (int i = 0; i < this.ispiti.size(); i++) {
            this.ispiti.get(i).stampaj();
        }
        System.out.println("Prosecna ocena: " + this.racunajProsek());
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }
}
