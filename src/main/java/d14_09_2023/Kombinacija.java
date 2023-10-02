package d14_09_2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Kombinacija {

    private String id;
    private ArrayList<Integer> brojevi;

    public Kombinacija() {
        this.brojevi = new ArrayList<>();
    }

    public Kombinacija(String id) {
        this.id = id;
        this.brojevi = new ArrayList<>();
        while (this.brojevi.size() < 7){
            Random random = new Random();
            int x = random.nextInt(40);
            if (x != 0) {
                if (this.brojevi.size() == 0) {
                    this.brojevi.add(x);
                } else {
                    int brojac = 0;
                    for (int i = 0; i < this.brojevi.size(); i++) {
                        if (this.brojevi.get(i) == x) {
                            brojac++;
                        }
                    }
                    if (brojac == 0) {
                        this.brojevi.add(x);
                    }
                }
            }
        }
    }

    public boolean daLiJeIstaKombinacija(Kombinacija k){

        for (int i = 0; i < this.brojevi.size(); i++) {
            if (this.brojevi.get(i) != k.brojevi.get(i)){
                return false;
            }
        }
            return true;
    }

    public void stampaj(){
        System.out.println("ID: " + this.id);
        System.out.print("Brojevi: ");
        Collections.sort(this.brojevi);
        for (int i = 0; i < this.brojevi.size(); i++) {
            if (i == this.brojevi.size() - 1) {
                System.out.println(this.brojevi.get(i));
            } else {
                System.out.print(this.brojevi.get(i) + ", ");
            }
        }
    }

    public void dodajbroj(int x){
        this.brojevi.add(x);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Integer> getBrojevi() {
        return brojevi;
    }


}
