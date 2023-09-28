package p18_09_2023;

public class StudentOsnovnih extends Student{

    public StudentOsnovnih(String punoIme, String brojIndeksa, int godinaStudija) {
        super(punoIme, brojIndeksa, godinaStudija);
    }

    @Override
    public int skolarina() {
        return 90000;
    }

    @Override
    public boolean naBudzetu() {
        if (this.godinaStudija < 5){
            return true;
        }
        return false;
    }


}
