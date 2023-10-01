package d19_09_2023.Zadatak2;

public class RekreativniPlaninar extends Planinar{

    private int tezinaOpreme;
    private String okrug;
    private int maxUsponBezOpreme;

    public RekreativniPlaninar(int id, String punoIme, int tezinaOpreme, String okrug, int maxUsponBezOpreme) {
        super(id, punoIme);
        this.tezinaOpreme = tezinaOpreme;
        this.okrug = okrug;
        this.maxUsponBezOpreme = maxUsponBezOpreme;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        int maxUspon = this.maxUsponBezOpreme - this.tezinaOpreme * 50;
        return (maxUspon >= planina.getVisina());
    }

    @Override
    public int clanarina() {
        return 1000;
    }

    @Override
    public void stampaj() {
        System.out.println("Rekreativac, id: " + this.id);
        System.out.println("Ime i prezime: " + this.punoIme);
        System.out.println("Okrug: " + this.okrug);
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public String getOkrug() {
        return okrug;
    }

    public int getMaxUsponBezOpreme() {
        return maxUsponBezOpreme;
    }
}
