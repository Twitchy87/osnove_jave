package d19_09_2023.Zadatak2;

import java.util.ArrayList;

public class PlaninarskiDom {

    private String naziv;
    private int godinaOsnivanja;
    private ArrayList<Planinar> planinari;

    public PlaninarskiDom() {
        this.planinari = new ArrayList<>();
    }

    public PlaninarskiDom(String naziv, int godinaOsnivanja) {
        this.naziv = naziv;
        this.godinaOsnivanja = godinaOsnivanja;
        this.planinari = new ArrayList<>();
    }

    public void uclaniPlaninara(Planinar planinar){
        this.planinari.add(planinar);
    }

    public int brojUspesnihPlaninara(Planina planina){
        int uspesniPlaninari = 0;

        for (int i = 0; i < this.planinari.size(); i++) {
            if(this.planinari.get(i).uspesanUspon(planina)){
                uspesniPlaninari++;
            }
        }

        return uspesniPlaninari;
    }

    public void izbaciPlaninara(int id){
        for (int i = 0; i < this.planinari.size(); i++) {
            if (this.planinari.get(i).getId() == id){
                this.planinari.remove(i);
                break;
            }
        }
    }

    public void stampaj(){
        System.out.println("Planinarski dom: " + this.naziv + ", osnovan: " + this.godinaOsnivanja + ".god.");
        System.out.println();
        for (int i = 0; i < this.planinari.size(); i++) {
            this.planinari.get(i).stampaj();
            System.out.println();
        }
    }

    public int mesecniPrihod(){
        int mesecnaClanarina = 0;

        for (int i = 0; i < this.planinari.size(); i++) {
            mesecnaClanarina += this.planinari.get(i).clanarina();
        }

        return mesecnaClanarina;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaOsnivanja() {
        return godinaOsnivanja;
    }

    public void setGodinaOsnivanja(int godinaOsnivanja) {
        this.godinaOsnivanja = godinaOsnivanja;
    }

    public ArrayList<Planinar> getPlaninari() {
        return planinari;
    }
}
