package d07_09_2023.Zadatak6;
// Zadatak 6: (za vezbanje ali topla prepuka svakom): Upravljanje Flotom Vozila - Rešite Poslovni Problem
//
//Pretvorite se u softverskog arhitektu koji će rešiti konkretan poslovni problem. Radite za kompaniju za dostavu koja se suočava sa sve većim izazovima u upravljanju svojom flotom vozila. Vaš zadatak je da razvijete softver za efikasno praćenje i upravljanje resursima kompanije.
//
//Kompanija ima vozila, vozače, rute za dostavu i potrebu da prati status svake dostave. Vaš cilj je da identifikujete potrebne klase za rešavanje ovog problema.
//
//**Scenario:**
//
//Kompanija poseduje različite vrste vozila, svako vozilo ima svoje karakteristike, uključujući marku, model, registarski broj i godinu proizvodnje. Vozači su takođe deo flote i svaki vozač ima svoje lične informacije, uključujući ime, prezime, JMBG, broj vozačke dozvole i datum isteka vozačke dozvole.
//
//Dostave se odvijaju duž različitih ruta, a svaka ruta ima svoju polaznu tačku, odredište, dužinu rute (u kilometrima) i očekivano vreme putovanja.
//Vaš zadatak je da definišete potrebne klase za praćenje i upravljanje ovim resursima kako biste pomogli kompaniji da optimizuje svoje poslovanje.
//
//Kroz analizu ovog scenarija, razmislite koje klase su potrebne da biste efikasno rešili problem upravljanja vozilima, vozačima, rutama i dostavama. Kreirajte klase sa odgovarajućim atributima kako biste omogućili upravljanje ovim resursima i u glavnom programu kreirajte objekte.

public class Zadatak6 {

    public static void main(String[] args) {

        Vozilo vozilo = new Vozilo();
        vozilo.id = 123;
        vozilo.marka = "Ford";
        vozilo.model = "Focus";
        vozilo.registracija = "NI 123-45";
        vozilo.godinaProizvodnje = 2008;

        System.out.println("ID vozila: " + vozilo.id);
        System.out.println(vozilo.marka + " " + vozilo.model + ", godina proizvodnje: " + vozilo.godinaProizvodnje);
        System.out.println("Registracija: " + vozilo.registracija);
        System.out.println();

        Vozac vozac = new Vozac();
        vozac.id = 456;
        vozac.ime = "Pera";
        vozac.prezime = "Peric";
        vozac.jmbg = "123456789";
        vozac.brojVozackeDozvole = 987654;
        vozac.datumIstekaDozvole = "04/2024";

        System.out.println("ID vozaca: " + vozac.id);
        System.out.println("Ime: " + vozac.ime + " " + vozac.prezime + ", jmbg: " + vozac.jmbg);
        System.out.println("Broj vozacke dozvole: " + vozac.brojVozackeDozvole + ", datum isteka: " + vozac.datumIstekaDozvole);
        System.out.println();

        Ruta ruta = new Ruta();
        ruta.id = 789;
        ruta.start = "Vozdova 25";
        ruta.odrediste = "Bulevar 12.februar bb";
        ruta.duzinaKm = 5;
        ruta.vremePutovanja = 15;

        System.out.println("ID rute: " + ruta.id);
        System.out.println("Polazna tacka: " + ruta.start + ", odrediste: " + ruta.odrediste);
        System.out.println("Duzina rute: " + ruta.duzinaKm + " km, ocekivano vreme putovanja: " + ruta.vremePutovanja + " min.");
        System.out.println();

        Dostava dostava = new Dostava();
        dostava.id = 147258;
        dostava.idVozilo = vozilo.id;
        dostava.idVozac = vozac.id;
        dostava.idRuta = ruta.id;

        System.out.println("ID dostave: " + dostava.id);
        System.out.println("Id vozila: " + vozilo.id);
        System.out.println("Id vozaca: " + vozac.id);
        System.out.println("Id rute: " + ruta.id);

    }
}
