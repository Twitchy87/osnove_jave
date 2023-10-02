package d14_09_2023;

public class Ispit {

    private String predmet;
    private int ocena;
    private String profesor;

    public Ispit() {
    }

    public Ispit(String predmet, String profesor) {
        this.predmet = predmet;
        this.profesor = profesor;
    }

    public Ispit(String predmet, int ocena, String profesor) {
        this.predmet = predmet;
        this.ocena = ocena;
        this.profesor = profesor;
    }

    public boolean polozenIspit(){
        return (this.ocena > 5);
    }

    public void stampaj(){
        System.out.println("Predmet: " + this.predmet + ", profesor: " + this.profesor + ", ocena: " + this.ocena);
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
}
