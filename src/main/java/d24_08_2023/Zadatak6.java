package d24_08_2023;

//6.	Napisati program koji vrsi proveru linkova sa stranice. Program cuva 3 niza:
//●	niz linkova
//●	niz ocekivanih status kodova za linkove iz prvog niza (expected status codes)
//●	niz status kodova koje vracaju linkovi iz prvog niza (actual status codes)
//
//	Nizovi potrebni za ovaj primer:
//●	linkovi
//○	https://cms.demo.katalon.com/cart/
//○	https://cms.demo.katalon.com/shop/
//○	https://cms.demo.katalon.com/account/
//○	https://cms.demo.katalon.com/cart/
//○	https://cms.demo.katalon.com/test/
//●	expected status codes
//○	200
//○	200
//○	404
//○	204
//○	200
//●	actual status codes
//○	200
//○	200
//○	400
//○	200
//○	404
//Program za svaki link vrsi proveru ocekivane i dobijene vrednosti za status kod. Ukoliko se actual i expected vrednosti ne poklapaju ispisati gresku u formatu:
//Assertion Error: Link <link> expected status code <expected code> but got <actual code>
//Primer izvrsenja:
//Assertion Error: https://cms.demo.katalon.com/account/ expected 404 but got 400
//Assertion Error: https://cms.demo.katalon.com/cart/ expected 204 but got 200
//Assertion Error: https://cms.demo.katalon.com/test/ expected 200 but got 404

import java.util.ArrayList;

public class Zadatak6 {

    public static void main(String[] args) {

        ArrayList<String> links = new ArrayList<>();

        links.add("https://cms.demo.katalon.com/cart/");
        links.add("https://cms.demo.katalon.com/shop/");
        links.add("https://cms.demo.katalon.com/account/");
        links.add("https://cms.demo.katalon.com/cart/");
        links.add("https://cms.demo.katalon.com/test/");

        ArrayList<Integer> expectedStatusCodes = new ArrayList<>();

        expectedStatusCodes.add(200);
        expectedStatusCodes.add(200);
        expectedStatusCodes.add(404);
        expectedStatusCodes.add(204);
        expectedStatusCodes.add(200);

        ArrayList<Integer> actualStatusCodes = new ArrayList<>();

        actualStatusCodes.add(200);
        actualStatusCodes.add(200);
        actualStatusCodes.add(400);
        actualStatusCodes.add(200);
        actualStatusCodes.add(404);

        for (int i = 0; i < links.size(); i++) {
            if (!expectedStatusCodes.get(i).equals(actualStatusCodes.get(i))){
                System.out.println("Assertion Error: Link " + links.get(i) + " expected status code " + expectedStatusCodes.get(i) + " but got " + actualStatusCodes.get(i));
            }
        }
    }
}
