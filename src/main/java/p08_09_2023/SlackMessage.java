package p08_09_2023;

public class SlackMessage {
    public String text;
    public String ime;
    public String prezime;
    public String datumIVreme;
    public String vremeAzuriranjaTexta;

    public void printInfo(){
        System.out.println(this.ime + " " + this.prezime + " - " + this.datumIVreme);
        System.out.println(this.text);
    }

    public void azurirajText(String azuriranText, String vremeAzuriranjaTexta){
        this.text = azuriranText;
        this.vremeAzuriranjaTexta = vremeAzuriranjaTexta;
    }
}

