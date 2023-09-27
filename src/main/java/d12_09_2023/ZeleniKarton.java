package d12_09_2023;

public class ZeleniKarton {

    private String student;
    private String brojIndeksa;
    private String predmet;
    private String profesor;
    private int ocena;

    public ZeleniKarton(String student, String brojIndeksa, String predmet, String profesor) {
        this.student = student;
        this.brojIndeksa = brojIndeksa;
        this.predmet = predmet;
        this.profesor = profesor;
    }

    public ZeleniKarton(String student, String brojIndeksa, String predmet, String profesor, int ocena) {
        this.student = student;
        this.brojIndeksa = brojIndeksa;
        this.predmet = predmet;
        this.profesor = profesor;
        this.ocena = ocena;
    }

    public boolean polozenIspit(){
        if (this.ocena > 5){
            return true;
        }
        return false;
    }

    public void stampaj(){
        System.out.print("Predmet: " + this.predmet + ", ocena: " + this.ocena + " / ");
        if (polozenIspit()){
            System.out.println("Polozio je ispit.");
        } else {
            System.out.println("Nije polozio ispit.");
        }
        System.out.println("Student: " + this.student + ", broj indeksa: " + this.brojIndeksa);
        System.out.println("Profesor: " + this.profesor);
    }
    public String getStudent() {
        return student;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public String getPredmet() {
        return predmet;
    }

    public String getProfesor() {
        return profesor;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
}
