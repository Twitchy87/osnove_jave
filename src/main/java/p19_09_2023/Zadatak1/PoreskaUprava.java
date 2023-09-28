package p19_09_2023.Zadatak1;

import java.util.ArrayList;

public class PoreskaUprava {

    private String grad;
    private ArrayList<Objekat> objekti;

    public PoreskaUprava() {
        this.objekti = new ArrayList<>();
    }

    public PoreskaUprava(String grad) {
        this.grad = grad;
        this.objekti = new ArrayList<>();
    }

    public void dodajObjekat(Objekat objekat){
        this.objekti.add(objekat);
    }

    public Objekat najveciPorez(){
        double max = 0;
        int index = 0;
        for (int i = 0; i < this.objekti.size(); i++) {
            if (this.objekti.get(i).racunajPorez() > max) {
                max = this.objekti.get(i).racunajPorez();
                index = i;
            }
        }
        return this.objekti.get(index);
    }

    public Objekat najmanjiPorez(){
        double min = 0;
        int index = 0;
        for (int i = 0; i < this.objekti.size(); i++) {
            if (i == 0){
                min = this.objekti.get(i).racunajPorez();
            } else {
                if (this.objekti.get(i).racunajPorez() < min){
                    min = this.objekti.get(i).racunajPorez();
                    index = i;
                }
            }
        }
        return this.objekti.get(index);
    }

    public double ukupanPorez(){
        double suma = 0;

        for (int i = 0; i < this.objekti.size(); i++) {
            suma += this.objekti.get(i).racunajPorez();
        }

        return suma;
    }

    public void stampajObjekte(){
        for (int i = 0; i < this.objekti.size(); i++) {
            this.objekti.get(i).stampaj();
            System.out.println();
        }
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public ArrayList<Objekat> getObjekti() {
        return objekti;
    }
}
