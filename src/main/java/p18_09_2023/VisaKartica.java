package p18_09_2023;

public class VisaKartica extends PlatnaKartica{

    private String ovlascenoLice;

    public VisaKartica(double suma, String broj, int godina, int mesec, String ovlascenoLice) {
        super(suma, broj, godina, mesec);
        this.ovlascenoLice = ovlascenoLice;
    }

    @Override
    public void izvrsiTransakciju(double iznos) {
        double provizija = iznos * 1.8 / 100;
        if (provizija < 4){
            provizija = 4;
        }
        this.suma = this.suma - iznos - provizija;
    }

    @Override
    public void stampaj() {
        System.out.println("Visa Card: " + this.broj + ", " + this.mesec + "/" + this.godina + ", $" + this.suma);
    }

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }
}
