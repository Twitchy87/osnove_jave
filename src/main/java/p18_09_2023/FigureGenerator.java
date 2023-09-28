package p18_09_2023;

import java.util.ArrayList;

public class FigureGenerator{

    public Figura generisiFiguru(String tip){
        Figura figura = null;
        if (tip.equals("trougao")){
            figura = new JednakostranicniTrougao(5);
        } else if (tip.equals("pravougaonik")){
            figura = new Pravougaonik(5, 10);
        }
        return figura;
    }

    public ArrayList<JednakostranicniTrougao> nizTrouglova(int n){
        ArrayList<JednakostranicniTrougao> trouglovi = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            trouglovi.add(new JednakostranicniTrougao(5));
        }
        return trouglovi;
    }

    public ArrayList<Pravougaonik> nizPravougaonika(int n){
        ArrayList<Pravougaonik> pravougaonici = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            pravougaonici.add(new Pravougaonik(5, 10));
        }
        return pravougaonici;
    }

    public ArrayList<Figura> nizFigura(int n){
        ArrayList<Figura> figure = new ArrayList<>();

        ArrayList<JednakostranicniTrougao> trouglovi = this.nizTrouglova(n);

        for (int i = 0; i < trouglovi.size(); i++) {
            figure.add(trouglovi.get(i));
        }

        ArrayList<Pravougaonik> pravougaonici = this.nizPravougaonika(n);

        for (int i = 0; i < pravougaonici.size(); i++) {
            figure.add(pravougaonici.get(i));
        }

        return figure;
    }
}
