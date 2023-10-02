package d14_09_2023;

import java.util.ArrayList;

public class Table {

    private TableHeader header;
    private ArrayList<TableRow> rows;
    private int rowsPerPage;


    public Table() {
        this.rows = new ArrayList<>();
    }

    public Table(TableHeader header, int rowsPerPage) {
        this.header = header;
        this.rowsPerPage = rowsPerPage;
        this.rows = new ArrayList<>();
    }

    public void addRow(TableRow tableRow){
        this.rows.add(tableRow);
    }

    public void print(int pageNumber){
        this.header.print();
//        for (int i = 0; i < this.rows.size(); i++) {
//            this.rows.get(i).print();
//        }
        int startIndex = (pageNumber - 1) * this.rowsPerPage;
        int endIndex = startIndex + rowsPerPage;

        if (endIndex > this.rows.size()){
            endIndex = this.rows.size();
        }

        for (int i = startIndex; i < endIndex; i++) {
            this.rows.get(i).print();
        }

        this.printPagination();
    }

    public void printHTML(){
        System.out.println("<table>");
        System.out.println("<thead>");
        this.header.printHTML();
        System.out.println("</thead>");
        System.out.println("<tbody>");
        for (int i = 0; i < this.rows.size(); i++) {
            this.rows.get(i).printHTML();
        }
        System.out.println("</tbody>");
        System.out.println("</table>");
    }

    public void filter(String text){
        this.header.print();
        for (int i = 0; i < this.rows.size(); i++) {
            if (this.rows.get(i).checkCells(text)){
                this.rows.get(i).print();
            }
        }
    }

    public void printPagination(){
        int numberOfPages = this.rows.size() / this.rowsPerPage;
        if (this.rows.size() % this.rowsPerPage != 0){
            numberOfPages++;
        }
        for (int i = 1; i <= numberOfPages; i++) {
            System.out.print("|" + i);
            if (i == numberOfPages){
                System.out.println("|");
            }
        }
    }

    public void setHeader(TableHeader header) {
        this.header = header;
    }

    public void setRowsPerPage(int rowsPerPage) {
        this.rowsPerPage = rowsPerPage;
    }
}
