package d18_08_2023;

//4.	Napisati program koji stampa 25 _ (donjih crta), pritom na svaku 5. iteraciju odstampa i novi red. Zadatak resiti pomocu FOR petlje.
//Primer izvrsenja:
//_ _ _ _ _
//_ _ _ _ _
//_ _ _ _ _
//_ _ _ _ _
//_ _ _ _ _

public class Zadatak4 {

    public static void main(String[] args) {

        for (int i = 1; i <= 25 ; i++) {

            if(i % 5 == 0){
                System.out.println("_");
            } else {
                System.out.print("_");
            }
        }
    }
}
