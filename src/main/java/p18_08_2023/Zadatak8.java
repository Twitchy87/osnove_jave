package p18_08_2023;

//8.	Napisati program koji ispisuje SAMO PARNE brojeve od 1 do 100

public class Zadatak8 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.print(i + ", ");
            }
        }

    }
}
