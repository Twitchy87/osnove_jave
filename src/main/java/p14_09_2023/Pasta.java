package p14_09_2023;

import java.util.ArrayList;

public class Pasta {

    private ArrayList<Sastojak> sastojci;

    public Pasta() {
        this.sastojci = new ArrayList<>();
    }

    public void dodajSastojak(Sastojak sastojak){
        this.sastojci.add(sastojak);
    }

    public double racunajCenu(){
        double cena = 0;
        for (int i = 0; i < this.sastojci.size(); i++) {
            cena += this.sastojci.get(i).getCena();
        }
        return  cena;
    }

    public void stampaj(){
        System.out.println("Pasta je sa sastojcima:");
        for (int i = 0; i < this.sastojci.size(); i++) {
            this.sastojci.get(i).stampaj();
        }
        System.out.println("Cena paste je " + this.racunajCenu() + " din.");
    }

    public void obrisiSastojak(String naziv){
        for (int i = 0; i < this.sastojci.size(); i++) {
            if (this.sastojci.get(i).getNaziv().equals(naziv)){
                this.sastojci.remove(i);
            }
        }
    }
}
