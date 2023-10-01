package d19_09_2023.Zadatak1;

import java.util.ArrayList;

public class Korpa {

    private ArrayList<Ambalaza> ambalaze;

    public Korpa() {
        this.ambalaze = new ArrayList<>();
    }

    public void dodajAmbalazu(Ambalaza ambalaza){
        this.ambalaze.add(ambalaza);
    }

    public void izbaciAmbalazu(String barkod){
        for (int i = 0; i < this.ambalaze.size(); i++) {
            if (this.ambalaze.get(i).getBarkod().equals(barkod)){
                this.ambalaze.remove(i);
            }
        }
    }

    private double cenaSvihAmbalaza(int popust){
        double suma = 0;

        for (int i = 0; i < this.ambalaze.size(); i++) {
            suma += this.ambalaze.get(i).cenaArtikla();
        }

        return suma - popust;
    }

    public double ukupnaCenaKorpe(SuperKartica superKartica){
//        int suma = 0;

//        for (int i = 0; i < this.ambalaze.size(); i++) {
//            if (this.ambalaze.get(i) instanceof Tetrapak){
//                suma += this.ambalaze.get(i).cenaArtikla();
//            }
//        }
//
//        for (int i = 0; i < this.ambalaze.size(); i++) {
//            if (this.ambalaze.get(i) instanceof StaklenaAmbalaza){
//                suma += this.ambalaze.get(i).cenaArtikla();
//            }
//        }
//        return suma - superKartica.getPopust();

        return this.cenaSvihAmbalaza(superKartica.getPopust());
    }

    public void stampaj(){
        for (int i = 0; i < this.ambalaze.size(); i++) {
            this.ambalaze.get(i).stampaj();
        }
    }

    public ArrayList<Ambalaza> getAmbalaze() {
        return ambalaze;
    }
}
