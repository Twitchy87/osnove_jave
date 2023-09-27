package d12_09_2023;

public class FizickoLice {

    private String punoIme;
    private String brojLicneKarte;
    private String jmbg;
    private boolean kupioPrekoAgencije;

    public FizickoLice(String punoIme, String brojLicneKarte, String jmbg){
        this.punoIme = punoIme;
        this.brojLicneKarte = brojLicneKarte;
        this.jmbg = jmbg;
    }
    public FizickoLice(String punoIme, String brojLicneKarte, String jmbg, boolean kupioPrekoAgencije){
        this.punoIme = punoIme;
        this.brojLicneKarte = brojLicneKarte;
        this.jmbg = jmbg;
        this.kupioPrekoAgencije = kupioPrekoAgencije;
    }

    public void stampaj(){
        System.out.print(this.punoIme + ", broj licne karte: " + this.brojLicneKarte);
    }

    public String getPunoIme(){
        return this.punoIme;
    }
    public void setPunoIme(String punoIme){
        this.punoIme = punoIme;
    }

    public String getBrojLicneKarte() {
        return brojLicneKarte;
    }

    public void setBrojLicneKarte(String brojLicneKarte) {
        this.brojLicneKarte = brojLicneKarte;
    }

    public boolean getKupioPrekoAgencije() {
        return kupioPrekoAgencije;
    }

    public void setKupioPrekoAgencije(boolean kupioPrekoAgencije) {
        this.kupioPrekoAgencije = kupioPrekoAgencije;
    }

    public String getJmbg() {
        return jmbg;
    }
}
