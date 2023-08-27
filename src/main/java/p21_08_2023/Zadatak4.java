package p21_08_2023;

    //Napisati program koji pronalazi 7 stepen broja 2. Koristeci FOR petlju
    //Izvrsenje:  2 na stepen 7 je 128    //
    //Podsetnik: 2 na 7 moze da se predstavi kao  2 * 2 * 2 * 2 * 2 * 2 * 2
public class Zadatak4 {

        public static void main(String[] args) {

            int number = 1;

            for(int i = 1; i <= 7; i++){
                number = number * 2;
            }

            System.out.println(number);
        }
}
