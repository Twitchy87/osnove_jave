package p14_09_2023;

public class Reakcija {

    private String tip;
    private String reagovaoKorisnik;

    public Reakcija() {
    }

    public Reakcija(String tip, String reagovaoKorisnik) {
        this.tip = tip;
        this.reagovaoKorisnik = reagovaoKorisnik;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getReagovaoKorisnik() {
        return reagovaoKorisnik;
    }

    public void setReagovaoKorisnik(String reagovaoKorisnik) {
        this.reagovaoKorisnik = reagovaoKorisnik;
    }
}
