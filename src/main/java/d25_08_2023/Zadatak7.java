package d25_08_2023;

//7.	Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3. U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
//
//Ako se proslede brojevi 4,6,1 u poziv metode, metoda vraca 1
//Ako se proslede brojevi 4,6,33 u poziv metode, metoda vraca 4

import java.util.Scanner;

public class Zadatak7 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite prvi broj:");
        int x = s.nextInt();

        System.out.println("Unesite drugi broj:");
        int y = s.nextInt();

        System.out.println("Unesite treci broj:");
        int z = s.nextInt();

        int minNumber = getMinNumber(x, y, z);

        System.out.println("Najmanji broj je: " + minNumber);

    }

    public static int getMinNumber(int x, int y, int z){
        if(x < y && x < z){
            return x;
        } else if (y < x && y < z) {
            return y;
        } else {
            return z;
        }
    }
}
