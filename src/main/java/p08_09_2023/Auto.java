package p08_09_2023;

public class Auto {
    public String vozac;
    public String marka;
    public int brojVrata;
    public double potrosnja;
    public int trenutnaBrzina;
    public int godProizvodnje;
    public int mesecRegistracija;
    public int kubikaza;
    public String brojRegistracije;
    public boolean ukljucenaKlima;
    public int maxBrzina;

    public void stampajInfo(){
        System.out.println(this.vozac);
        System.out.println(this.marka + " - " + this.brojVrata + "-ro vrata");
        System.out.println("Sa potrosnjom od " + this.potrosnja + " l na 100 km");
        System.out.println(this.trenutnaBrzina + " km/h je trenutna brzina.");
    }

    public boolean daLiJePrekoracenje(int limit){
        if (this.trenutnaBrzina > limit){
            return true;
        }
        return false;
        //return this.trenutnaBrzina > limit; - II nacin
    }

    public int visinaKazne(int limit){
        // if(this.daLiJePrekoracenje(limit)) - II nacin
        if (this.trenutnaBrzina > limit){
            return (this.trenutnaBrzina - limit) * 1000;
        }
        return 0;
    }

    public boolean daLiJeOldtimer(){
        return this.godProizvodnje < 1950;
    }

    public boolean daLiVaziRegistracija(int mesec){
        return this.mesecRegistracija > mesec;
    }

    public double cenaRegistracije(){
//        double cena = this.kubikaza * 100;
//        if (this.kubikaza > 2000){
//            cena = cena * 1.3;
//        }
//        return cena;

        double cenaRegistracije = 0;
        if (this.kubikaza <= 2000){
            cenaRegistracije = this.kubikaza * 100;
        } else {
            cenaRegistracije = this.kubikaza * 100 * 1.3;
        }
        return cenaRegistracije;
    }

//  zasto gas i koci treba da budu void????
    public void dodajGas(){
        this.trenutnaBrzina += 10;
        if (this.trenutnaBrzina > this.maxBrzina){
            this.trenutnaBrzina = this.maxBrzina;
        }
    }

    public void koci(){
        this.trenutnaBrzina -= 10;
        if ( this.trenutnaBrzina < 0){
            this.trenutnaBrzina = 0;
        }
    }

//    boolean ukljucenaKlima
    public double trenutnaPotrosnja(){
        double faktorKlime = 0;
        if (this.ukljucenaKlima){
            faktorKlime = 1.2;
        } else {
            faktorKlime = 1;
        }
        return this.trenutnaBrzina / 100.0 * this.potrosnja * faktorKlime;
    }

    public void stampajTablu(){
        int crtice = this.trenutnaBrzina * 100 / this.maxBrzina;
        for (int i = 0; i < 100; i++) {
            if (i < crtice){
                System.out.print("|");
            } else {
                System.out.print(".");
            }
        }
        System.out.println(" " + this.trenutnaBrzina + " / " + this.maxBrzina + " km/h");
    }
}
