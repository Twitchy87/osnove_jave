package p14_09_2023;

import java.util.ArrayList;

public class FacebookPost {

    private String objavioKorisnik;
    private String text;
    private ArrayList<Reakcija> reakcije;

    public FacebookPost(String objavioKorisnik, String text) {
        this.objavioKorisnik = objavioKorisnik;
        this.text = text;
        this.reakcije = new ArrayList<>();
    }

    public void reaguj(Reakcija reakcija){
        if (this.reakcije.size() > 0){
            for (int i = 0; i < this.reakcije.size(); i++) {
                if (this.reakcije.get(i).getReagovaoKorisnik().equals(reakcija.getReagovaoKorisnik())){
                    this.reakcije.remove(i);
                }
            }
            this.reakcije.add(reakcija);
        } else {
            this.reakcije.add(reakcija);
        }
    }

    private int brojReakcija(String reakcijaTip){
        int brojReakcija = 0;

        for (int i = 0; i < this.reakcije.size(); i++) {
            if (this.reakcije.get(i).getTip().equals(reakcijaTip)){
                brojReakcija++;
            }
        }
        return brojReakcija;
    }

    public void stampaj(){
        System.out.println(this.objavioKorisnik);
        System.out.println(this.text);
        System.out.println("Smajli " + this.brojReakcija("smajli") + " | Like " + this.brojReakcija("like") + " | Srce " + this.brojReakcija("srce"));
        System.out.println("------------");
        for (int i = 0; i < this.reakcije.size(); i++) {
            System.out.println(this.reakcije.get(i).getTip() + " " + this.reakcije.get(i).getReagovaoKorisnik());
        }

    }

    public String getObjavioKorisnik() {
        return objavioKorisnik;
    }

    public String getText() {
        return text;
    }

    public ArrayList<Reakcija> getReakcije() {
        return reakcije;
    }
}
