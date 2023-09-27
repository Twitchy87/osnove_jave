package p14_09_2023;
//5. Zadatak
//Kreirati klasu TestStep koja od privatnih atributa ima:
//●	opis
//●	actual vrednost
//●	expected vrednost
//●	errorMessage
//●	konstuktor koji postavlja sve atribute
//●	getere za sve elemente
//●	settere nemamo
//●	metodu validate koja proverava da li su actual i expected vrednosti jednake i ukoliko jesu metoda vraca true u suprotnom vraca false
//●	metodu za stampu koja stampa test step u formatu:
//|  Opis |
//| Status(failed ili passed) | Error message (ako je test step failovao)
//
//	Kreirati klasu TestCase koja od privatnih atributra ima:
//●	ID
//●	naziv
//●	niz test koraka
//●	metodu addTestStep koja dodaje test step u niz
//●	metodu koja vraca broj test stepova koji su failovali (oni kod kojih actual vrednost nije jednaka sa expected)
//●	metodu koja vraca stanje testcase-a. Ukoliko nema koraka koji su failovali metoda vraca “PASSED” u suprotnom “FAILED”
//●	metoda koja stampa status test case-a u formatu
//ID - Naziv
//|  Opis  |
//|  Status(failed ili passed) | Error message (ako je test step failovao)
//|  Opis  |
//|  Status(failed ili passed) | Error message (ako je test step failovao)
//|  Opis  |
//|  Status(failed ili passed) | Error message (ako je test step failovao)
//ukupan broj koraka / broj test stepova koji su faulovali
//Stanje test case-a (PASSED ILI FALED)
//
//PRIMER TEST CASE-a (Objasnjenja idu u zagradama):
//ID - Validate Login Form
//| Open app |
//| passed | (actual=””, expected=””)
//| Check if login link is visible |
//| passed |  (actual=”visible”, expected=”visible”)
//| Click on login link |
//| passed | (actual=””, expected=””)
//| Click on login link |
//| passed | (actual=””, expected=””)
//| Check if form is visible |
//| passed | (actual=”visible”, expected=”visible”)
//| Enter username |
//| passed |  (actual=””, expected=””)
//| Enter password |
//| passed |  (actual=””, expected=””)
//| Check if login button is visible |
//| failed | Login button is not visible  (actual=”visible”, expected=”invisible”)
//| Click on login button |
//| passed |  (actual=””, expected=””)
//| User should be logged |
//| failed | User is not logged|  (actual=”logged”, expected=”not logged”)
//| Page should be /home |
//| failed | User should be redirected to home page (actual=”/login”, expected=”/home”)
//11 / 3
//TEST CASE FAILED
public class Zadatak5 {

    public static void main(String[] args) {

        TestStep step1 = new TestStep("Open app", "", "", "App doesn't open");
        TestStep step2 = new TestStep("Check if login link is visible", "visible", "visible", "Login link is not visible");
        TestStep step3 = new TestStep("Click on login link", "", "", "Can't click on login link");
        TestStep step4 = new TestStep("Click on login link", "", "", "Can't click on login link");
        TestStep step5 = new TestStep("Check if form is visible", "visible", "visible", "Form isn't visible");
        TestStep step6 = new TestStep("Enter username", "", "", "Can't enter username");
        TestStep step7 = new TestStep("Enter password", "", "", "Can't enter password");
        TestStep step8 = new TestStep("Check if login button is visible", "visible", "invisible", "Login button is not visible");
        TestStep step9 = new TestStep("Click on login button", "", "", "Can't click on login button ");
        TestStep step10 = new TestStep("User should be logged", "logged", "not logged", "User is not logged");
        TestStep step11 = new TestStep("Page should be /home", "/login", "/home", "User should be redirected to home page");

        TestCase testCase = new TestCase("TC1", "Validate Login Form");

        testCase.addTestStep(step1);
        testCase.addTestStep(step2);
        testCase.addTestStep(step3);
        testCase.addTestStep(step4);
        testCase.addTestStep(step5);
        testCase.addTestStep(step6);
        testCase.addTestStep(step7);
        testCase.addTestStep(step8);
        testCase.addTestStep(step9);
        testCase.addTestStep(step10);
        testCase.addTestStep(step11);

        testCase.print();
    }
}
