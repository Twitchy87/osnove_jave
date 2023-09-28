package p19_09_2023.Zadatak2;

public class Trkac extends Atleticar{

    public Trkac(String punoIme, double rezultat) {
        super(punoIme, rezultat);
    }

    @Override
    public boolean uporediRezultat(Atleticar atleticar) {
        if (this.rezultat < atleticar.rezultat){
            return true;
        }
        return false;
    }
}
