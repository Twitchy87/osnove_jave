package d08_09_2023;

public class SmartAirConditioning {
    public String marka;
    public int potrosnjaHladjenje;
    public int potrosnjaGrejanje;
    public int temperatura;
    public boolean modGrejanje;

    public void stampaj(){
        if (this.modGrejanje){
            System.out.println(this.marka + " - greje - " + this.temperatura);
        } else {
            System.out.println(this.marka + " - hladi - " + this.temperatura);
        }
    }

    public int mesecnaPotrosnja(){
        if (this.modGrejanje){
            return 30 * 15 * potrosnjaGrejanje;
        } else {
            return  30 * 15 * potrosnjaHladjenje;
        }
    }

    public int mesecniRacun(){
        return  350 * 6 + (this.mesecnaPotrosnja() - 350) * 9;
    }
}
