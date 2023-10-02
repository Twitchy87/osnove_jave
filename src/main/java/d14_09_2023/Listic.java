package d14_09_2023;

import java.util.ArrayList;
import java.util.Collections;

public class Listic {

    private ArrayList<Kombinacija> kombinacije;

    public Listic() {
        this.kombinacije = new ArrayList<>();
    }

    public void dodajKombinaciju(Kombinacija kombinacija){
        this.kombinacije.add(kombinacija);
    }

    public boolean dobitna(Kombinacija dobitnaKombinacija){
        for (int i = 0; i < this.kombinacije.size(); i++) {
            if (this.kombinacije.get(i).daLiJeIstaKombinacija(dobitnaKombinacija)){
                return true;
            }
        }
        return false;
    }
    
    public void stampaj(){
        for (int i = 0; i < this.kombinacije.size(); i++) {
            if (i == this.kombinacije.size() - 1) {
                this.kombinacije.get(i).stampaj();
            } else {
                this.kombinacije.get(i).stampaj();
                System.out.println();
            }
        }
    }

    public void stampajDobitnuKombinaciju(Kombinacija dobitnaKombinacija){
        int brojac = 0;

        for (int i = 0; i < this.kombinacije.size(); i++) {
            if (this.kombinacije.get(i).daLiJeIstaKombinacija(dobitnaKombinacija)){
                System.out.println("Dobitna kombinacija: ");
                this.kombinacije.get(i).stampaj();
                brojac++;
            }
        }
        if (brojac == 0){
            System.out.println("Nema dobitne kombinacije.");
        }
    }
}
