package p18_09_2023;

public class Pravougaonik extends Figura{

    private int a;
    private int b;

    public Pravougaonik() {
        super();
    }

    public Pravougaonik(int a, int b) {
        super();
        this.a = a;
        this.b = b;
    }

    @Override
    public double povrsina() {
        return a * b;
    }

    @Override
    public int obim() {
        return 2 * a + 2 * b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
