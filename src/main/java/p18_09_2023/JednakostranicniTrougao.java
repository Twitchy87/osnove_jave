package p18_09_2023;

public class JednakostranicniTrougao extends Figura{

    private int a;

    public JednakostranicniTrougao() {
        super();
    }

    public JednakostranicniTrougao(int a) {
        super();
        this.a = a;
    }

    @Override
    public double povrsina() {
        return a * a * 1.73205 / 4;
    }

    @Override
    public int obim() {
        return 3 * a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
