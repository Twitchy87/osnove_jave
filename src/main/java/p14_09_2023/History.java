package p14_09_2023;

import java.util.ArrayList;

public class History {
    private ArrayList<HistoryPage> pages;

    public History(){
        this.pages = new ArrayList<>();
    }

    public void openPage(HistoryPage page){
        this.pages.add(page);
    }

    public void deletePage(String url){
        for (int i = 0; i < this.pages.size(); i++) {
            if (this.pages.get(i).getUrl().equals(url)){
                this.pages.remove(this.pages.get(i));
            }
        }
    }

    public void deleteCookies(String url){
        for (int i = 0; i < this.pages.size(); i++) {
            if (this.pages.get(i).getUrl().equals(url)) {
                this.pages.get(i).deleteCookies();
            }
        }
    }

    public void deleteHistory(){
        this.pages.clear();
    }

    public void saveCredentials(String name, String username, String password){
        for (int i = 0; i < this.pages.size(); i++) {
            if (this.pages.get(i).getName().equals(name)) {
                this.pages.get(i).saveCredentials(username, password);
            }
        }
    }

    public void print(){
        if (this.pages.size() == 0){
            System.out.println("No pages in history.");
        }
        for (int i = 0; i < this.pages.size(); i++){
            this.pages.get(i).print();
        }
    }

    public void deleteAllCookies(){
        for (int i = 0; i < this.pages.size(); i++){
            this.pages.get(i).deleteCookies();
        }
    }

    public void deleteAllCookiesLastHour(int currentHour, int currentMinute){
        int currentTime = currentHour * 60 + currentMinute;

        for (int i = 0; i < this.pages.size(); i++){
            int hour = this.pages.get(i).getAccessedAtHour() * 60;
            int minute = this.pages.get(i).getAccessedAtMinute();
            int time = hour + minute;

            if (time <= currentTime && time >= currentTime - 60){
                this.pages.get(i).deleteCookies();
            }
        }
    }
}
