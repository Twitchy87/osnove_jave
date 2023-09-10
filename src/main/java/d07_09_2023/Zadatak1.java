package d07_09_2023;
//Zadatak 1: Kreiranje klase "Student"
//Napišite klasu "Student" koja ima sledeće atribute: ime (String), brojIndeksa (int) i fakultet (String). Kreirajte 2-3 objekta ove klase u glavnoj metodi i postavite im vrednosti. Ispisati informacije o studentima.

public class Zadatak1 {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.ime = "Pera Peric";
        student1.brojIndeksa = 14578;
        student1.fakultet = "Prirodno - Matematicki Fakultet";

        Student student2 = new Student();

        student2.ime = "Mika Mikic";
        student2.brojIndeksa = 23569;
        student2.fakultet = "Pravni Fakultet";

        Student student3 = new Student();

        student3.ime = "Laza Lazic";
        student3.brojIndeksa = 18257;
        student3.fakultet = "Filozofski Fakultet";

        System.out.println("Student: " + student1.ime);
        System.out.println("Broj indeksa: " + student1.brojIndeksa);
        System.out.println("Fakultet: " + student1.fakultet);
        System.out.println();

        System.out.println("Student: " + student2.ime);
        System.out.println("Broj indeksa: " + student2.brojIndeksa);
        System.out.println("Fakultet: " + student2.fakultet);
        System.out.println();

        System.out.println("Student: " + student3.ime);
        System.out.println("Broj indeksa: " + student3.brojIndeksa);
        System.out.println("Fakultet: " + student3.fakultet);
    }
}
