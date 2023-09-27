package d12_09_2023;

public class Ugovor {
    private int godina;
    private int mesec;
    private int dan;
    private FizickoLice prodavac;
    private FizickoLice kupac;
    private double cenaNekretnine;
    private String adresaNekretnine;

    public Ugovor(int godina, int mesec, int dan, FizickoLice prodavac, FizickoLice kupac, double cenaNekretnine, String adresaNekretnine) {
        this.godina = godina;
        this.mesec = mesec;
        this.dan = dan;
        this.prodavac = prodavac;
        this.kupac = kupac;
        this.cenaNekretnine = cenaNekretnine;
        this.adresaNekretnine = adresaNekretnine;
    }

    public  double procenatZarade(){
        if (this.kupac.getKupioPrekoAgencije()){
            return 0.02;
        } else {
            return 0.03;
        }
    }

    public double zaradaAgencije(){
        return 1000 + this.cenaNekretnine * this.procenatZarade();
    }

    public void stampaj(){
        System.out.print("Dana " + this.dan + "." + this.mesec + "." + this.godina + ".god sklopljen je ugovor izmedju ");
        this.prodavac.stampaj();
        System.out.print(" i ");
        this.kupac.stampaj();
        System.out.println(" o kupovini nekretnine " + this.adresaNekretnine + " po ceni od " + this.cenaNekretnine + " pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od " + this.zaradaAgencije());
    }

    public int getGodina() {
        return godina;
    }

    public int getMesec() {
        return mesec;
    }

    public int getDan() {
        return dan;
    }

    public FizickoLice getProdavac() {
        return prodavac;
    }

    public FizickoLice getKupac() {
        return kupac;
    }

    public double getCenaNekretnine() {
        return cenaNekretnine;
    }

    public String getAdresaNekretnine() {
        return adresaNekretnine;
    }
}
