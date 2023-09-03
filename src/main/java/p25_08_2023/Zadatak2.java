package p25_08_2023;

//Napisati dve metode, jedna metoda sluzi za stampanje imena a druga sluzi za stampanje prezimena. U glavnom programu pozvati metode na izvrsenje tako da se 5 puta ispise ime i prezime u istom redu.
//Primer izvrsenja:
//Milan Jovanovic
//Milan Jovanovic
//Milan Jovanovic
//Milan Jovanovic
//Milan Jovanovic

public class Zadatak2 {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            firstName();
            System.out.print(" ");
            lastName();
        }
    }

    public static void firstName(){
        System.out.print("Ana");
    }

    public static void lastName(){
        System.out.println("Cvetkovic");
    }
}
