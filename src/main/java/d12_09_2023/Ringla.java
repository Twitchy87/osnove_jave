package d12_09_2023;

public class Ringla {

    private String tip;
    private int jacinaRingle;
    private double jacinaGrejaca;

    public Ringla(String tip, double jacinaGrejaca) {
        this.tip = tip;
        this.jacinaGrejaca = jacinaGrejaca;
    }

    private int maxBrojPojacavanja(){
        if (this.tip.equals("obicna")){
            return 3;
        } else if (this.tip.equals("ekspres")){
            return 12;
        }
        return 0;
    }

    public void pojacajRinglu(){
        this.jacinaRingle++;
        if(this.jacinaRingle > maxBrojPojacavanja()){
            this.jacinaRingle = maxBrojPojacavanja();
        }
    }

    public void iskljuciRinglu(){
        this.jacinaRingle = 0;
    }

    public boolean ukljucenaRingla(){
        if (this.jacinaRingle != 0){
            return true;
        }
        return false;
    }

    public double potrosnjaEnergije(double sat){
        return 100 / this.maxBrojPojacavanja() * this.jacinaRingle * this.jacinaGrejaca * sat;
    }

    public void stampaj(){
        System.out.print("Ringla je ");
        if (this.ukljucenaRingla()){
            System.out.println("ukljucena");
        } else {
            System.out.println("iskljucena");
        }
        System.out.println("Tip ringle: " + this.tip);
        System.out.println("Jacina: " + this.jacinaRingle);
        System.out.println("Grejac: " + this.jacinaGrejaca + "kW");
    }

    public int getJacinaRingle() {
        return jacinaRingle;
    }

    public double getJacinaGrejaca() {
        return jacinaGrejaca;
    }
}
