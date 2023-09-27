package p14_09_2023;

public class TestStep {

    private String description;
    private String actualResult;
    private String expectedResult;
    private String errorMessage;

    public TestStep(String description, String actualResult, String expectedResult, String errorMessage) {
        this.description = description;
        this.actualResult = actualResult;
        this.expectedResult = expectedResult;
        this.errorMessage = errorMessage;
    }

    public boolean validate(){
        if (this.actualResult == this.expectedResult){
            return true;
        }
        return false;
    }

    public void print(){
        System.out.println("| " + this.description + " |");
        System.out.print("| ");
        if (this.validate()){
            System.out.println("passed |");
        } else {
            System.out.println("failed | " + this.errorMessage);
        }
    }

    public String getDescription() {
        return description;
    }

    public String getActualResult() {
        return actualResult;
    }

    public String getExpectedResult() {
        return expectedResult;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
