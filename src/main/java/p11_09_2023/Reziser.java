package p11_09_2023;

public class Reziser {

    private String punoIme;
    private int starost;

    public Reziser(){
    }
    public Reziser(String punoIme, int starost){
        this.punoIme = punoIme;
        this.starost = starost;
    }

    public void stampajRezisera(){
        System.out.println(this.punoIme + ", " + this.starost + " god.");
    }

    public String getPunoIme(){
        return this.punoIme;
    }
    public void setPunoIme(String punoIme){
        this.punoIme = punoIme;
    }

    public int getStarost(){
        return this.starost;
    }
    public void setStarost(int starost){
        this.starost = starost;
    }
}
