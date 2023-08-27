package d21_08_2023;

//4.	Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija. Korisnik unosi N rekacija zatim se prikazuje evidencija:
//Program podrzava sledece reakcije:
//●	like
//●	smile
//●	heart
//
//	Primer izvrsenja:
//Unesite N: 7
//	Reaguj: like
//	Reaguj: heart
//	Reaguj: smile
//	Reaguj: lol
//	Reaguj: smile
//	Reaguj: like
//	Reaguj: like
//Summary: like 3 | smile 2 | heart 1
//
//Napomena: Ako se unese reakcija koju program ne podrzava, ona ne utice na evidenciju.
//
//POMOC: Svaka promenljiva nosi jednu informaciju, to znaci evidenciju za like cuva promelniva sa imenom npr likeCounter, evidenciju za smile cuva smileCounter i za heart cuva promenljiva heartCounter

import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Koliko reakcija zelite da unesete?");
        int numberOfReactions = s.nextInt();

        int likeCounter = 0;
        int smileCounter = 0;
        int heartCounter = 0;

        for (int i = 0; i < numberOfReactions; i++) {
            System.out.println("Unesite reakciju:");
            String reaction = s.next();

            if (reaction.equals("like")){
                likeCounter++;
            } else if (reaction.equals("smile")) {
                smileCounter++;
            } else if(reaction.equals("heart")){
                heartCounter++;
            }
        }

        System.out.println("Suma unetih reakcija: like " + likeCounter + " | smile " + smileCounter + " | heart " + heartCounter);
    }
}
