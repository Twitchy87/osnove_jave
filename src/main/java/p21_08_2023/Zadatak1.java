package p21_08_2023;

public class Zadatak1 {

    //Napisati program koji sumira parne brojeve od 1 do 50 i na kraju programa ispisuje sumu.

    public static void main(String[] args) {

        int number = 0;

        for (int i = 1; i <= 50; i++) {
            if(i % 2 == 0) {
                number = number + i;
            }
        }

        System.out.println("Suma: " + number);
    }
}
