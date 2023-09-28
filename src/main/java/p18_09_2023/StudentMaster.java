package p18_09_2023;

public class StudentMaster extends Student{

    public StudentMaster(String punoIme, String brojIndeksa, int godinaStudija) {
        super(punoIme, brojIndeksa, godinaStudija);
    }

    @Override
    public int skolarina() {
        return 100000;
    }

    @Override
    public boolean naBudzetu() {
        if (this.godinaStudija < 2){
            return true;
        }
        return false;
    }

}
