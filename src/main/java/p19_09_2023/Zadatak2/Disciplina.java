package p19_09_2023.Zadatak2;

import java.util.ArrayList;

public class Disciplina {

    private String ime;
    private String tip;
    private ArrayList<Atleticar> atleticari;

    public Disciplina() {
        this.atleticari = new ArrayList<>();
    }

    public Disciplina(String ime, String tip) {
        this.ime = ime;
        this.tip = tip;
        this.atleticari = new ArrayList<>();
    }

    public void dodajAtleticara(Atleticar atleticar){
        this.atleticari.add(atleticar);
    }

    public void diskvalifikujAtleticara(String punoIme){
        for (int i = 0; i < this.atleticari.size(); i++) {
            if (this.atleticari.get(i).getPunoIme().equals(punoIme)){
//                this.atleticari.get(i).setRezultat(0);  - jer ce trkac da pobedi u tom slucaju
                this.atleticari.remove(i);
                break;
            }
        }
    }

    private Atleticar najboljiAtleticar() {
        Atleticar najboljiAtleticar = null;
        for (int i = 0; i < this.atleticari.size(); i++) {
            if (i == 0){
                najboljiAtleticar = this.atleticari.get(i);
            }
            if (this.atleticari.get(i).uporediRezultat(najboljiAtleticar)) {
                najboljiAtleticar = this.atleticari.get(i);
            }
        }

        return najboljiAtleticar;
    }


//    private Atleticar najboljiAtleticar(String tip){
//        Atleticar najboljiAtleticar = null;
//        if (tip.equals("trkanje")){
//            for (int i = 0; i < this.atleticari.size(); i++) {
//                if (this.atleticari.get(i) instanceof Trkac){
//                    if (this.atleticari.get(i).uporediRezultat(najboljiAtleticar)){
//                        najboljiAtleticar = this.atleticari.get(i);
//                    }
//                }
//            }
//        }
//
//        if (tip.equals("skakanje")){
//            for (int i = 0; i < this.atleticari.size(); i++) {
//                if (this.atleticari.get(i) instanceof Skakac){
//                    if (this.atleticari.get(i).uporediRezultat(najboljiAtleticar)){
//                        najboljiAtleticar = this.atleticari.get(i);
//                    }
//                }
//            }
//        }
//
//        return najboljiAtleticar;
//    }

    public void stampajNajboljiAtleticar(){
        this.najboljiAtleticar().stampaj();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public ArrayList<Atleticar> getAtleticari() {
        return atleticari;
    }
}
