package p14_09_2023;

import java.util.ArrayList;

public class TestCase {

    private String id;
    private String name;
    private ArrayList<TestStep> testSteps;

    public TestCase(String id, String name) {
        this.id = id;
        this.name = name;
        this.testSteps = new ArrayList<>();
    }

    public void addTestStep(TestStep testStep){
        this.testSteps.add(testStep);
    }

    public int failedTestSteps(){
        int counter = 0;

        for (int i = 0; i < this.testSteps.size(); i++) {
            if(!this.testSteps.get(i).validate()){
                counter++;
            }
        }
        return counter;
    }

    public String status(){
        if (this.failedTestSteps() == 0){
            return "PASSED";
        }
        return "FAILED";
    }

    public void print(){
        System.out.println(this.id + " - " + this.name);
        for (int i = 0; i < this.testSteps.size(); i++) {
            this.testSteps.get(i).print();
        }
        System.out.println(this.testSteps.size() + " / " + this.failedTestSteps());
        System.out.println("TEST CASE " + this.status());
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<TestStep> getTestSteps() {
        return testSteps;
    }
}
