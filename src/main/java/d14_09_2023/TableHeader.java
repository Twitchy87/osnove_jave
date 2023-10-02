package d14_09_2023;

import java.util.ArrayList;

public class TableHeader {

    private ArrayList<String> cells;

    public TableHeader() {
        this.cells = new ArrayList<>();
    }

    public void addHeaderCell(String cell){
        this.cells.add(cell);
    }

    public void print(){
        for (int i = 0; i < this.cells.size(); i++) {
            if (i == 0){
                System.out.print(this.cells.get(i) + "\t\t|");
            } else {
                System.out.print("\t\t" + this.cells.get(i) + "\t\t|");
            }
        }
        System.out.println();
    }

    public void printHTML(){
        System.out.print("<tr>");
        for (int i = 0; i < this.cells.size(); i++) {
            System.out.print("<th>" + this.cells.get(i) + "</th>");
        }
        System.out.println("</tr>");
    }

    public ArrayList<String> getCells() {
        return cells;
    }
}
