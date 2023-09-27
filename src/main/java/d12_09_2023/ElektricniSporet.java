package d12_09_2023;

public class ElektricniSporet {

    private String marka;
    private int garancija;
    private int maxUkljuceneRingle;
    private Ringla goreLevo;
    private Ringla goreDesno;
    private Ringla doleLevo;
    private Ringla doleDesno;

    public ElektricniSporet(String marka, int garancija, int maxUkljuceneRingle, Ringla goreLevo, Ringla goreDesno, Ringla doleLevo, Ringla doleDesno) {
        this.marka = marka;
        this.garancija = garancija;
        this.maxUkljuceneRingle = maxUkljuceneRingle;
        this.goreLevo = goreLevo;
        this.goreDesno = goreDesno;
        this.doleLevo = doleLevo;
        this.doleDesno = doleDesno;
    }

    public void pojacaj(int pozicijaRingle){
        if (pozicijaRingle == 1){
            this.goreLevo.pojacajRinglu();
        } else if (pozicijaRingle == 2){
            this.goreDesno.pojacajRinglu();
        } else if (pozicijaRingle == 3){
            this.doleLevo.pojacajRinglu();
        } else if (pozicijaRingle == 4){
            this.doleDesno.pojacajRinglu();
        }

        int brojUkljucenihRingli = 0;

        if (this.goreLevo.ukljucenaRingla()){
            brojUkljucenihRingli++;
        }
        if (this.goreDesno.ukljucenaRingla()){
            brojUkljucenihRingli++;
        }
        if (this.doleLevo.ukljucenaRingla()){
            brojUkljucenihRingli++;
        }
        if (this.doleDesno.ukljucenaRingla()){
            brojUkljucenihRingli++;
        }

        if (brojUkljucenihRingli > this.maxUkljuceneRingle){
            if (pozicijaRingle == 1){
                this.iskljuciRinglu(2);
                this.iskljuciRinglu(3);
                this.iskljuciRinglu(4);
            } else if (pozicijaRingle == 2){
                this.iskljuciRinglu(1);
                this.iskljuciRinglu(3);
                this.iskljuciRinglu(4);
            } else if (pozicijaRingle == 3){
                this.iskljuciRinglu(1);
                this.iskljuciRinglu(2);
                this.iskljuciRinglu(4);
            } else if (pozicijaRingle == 4){
                this.iskljuciRinglu(1);
                this.iskljuciRinglu(2);
                this.iskljuciRinglu(3);
            }
        }
    }

    public void iskljuciRinglu(int pozicijaRingle) {
        if (pozicijaRingle == 1) {
            this.goreLevo.iskljuciRinglu();
        } else if (pozicijaRingle == 2) {
            this.goreDesno.iskljuciRinglu();
        } else if (pozicijaRingle == 3) {
            this.doleLevo.iskljuciRinglu();
        } else if (pozicijaRingle == 4) {
            this.doleDesno.iskljuciRinglu();
        }
    }

    public double ukupnaPotrosnja(double sat){
        return this.goreLevo.potrosnjaEnergije(sat) + this.goreDesno.potrosnjaEnergije(sat) + this.doleLevo.potrosnjaEnergije(sat) + this.doleDesno.potrosnjaEnergije(sat);
    }

    public void stampaj(){
        System.out.println("Marka sporeta: " + this.marka + " - " + this.garancija + " god. garancija");
        System.out.println("Ringle:");
        System.out.println("Gore levo:");
        this.goreLevo.stampaj();
        System.out.println("Gore desno:");
        this.goreDesno.stampaj();
        System.out.println("Dole levo:");
        this.doleLevo.stampaj();
        System.out.println("Dole desno:");
        this.doleDesno.stampaj();
    }

    public String getMarka() {
        return marka;
    }

    public int getGarancija() {
        return garancija;
    }

    public int getMaxUkljuceneRingle() {
        return maxUkljuceneRingle;
    }

    public Ringla getGoreLevo() {
        return goreLevo;
    }

    public Ringla getGoreDesno() {
        return goreDesno;
    }

    public Ringla getDoleLevo() {
        return doleLevo;
    }

    public Ringla getDoleDesno() {
        return doleDesno;
    }
}
