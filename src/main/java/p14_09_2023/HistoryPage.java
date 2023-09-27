package p14_09_2023;

public class HistoryPage {

    private String name;
    private String url;
    private int accessedAtHour;
    private int accessedAtMinute;
    private String username;
    private String password;

    public HistoryPage(String name, String url, int accessedAtHour, int accessedAtMinute) {
        this.name = name;
        this.url = url;
        this.accessedAtHour = accessedAtHour;
        this.accessedAtMinute = accessedAtMinute;
    }

    public HistoryPage(String name, String url, int accessedAtHour, int accessedAtMinute, String username, String password) {
        this.name = name;
        this.url = url;
        this.accessedAtHour = accessedAtHour;
        this.accessedAtMinute = accessedAtMinute;
        this.username = username;
        this.password = password;
    }

    public void saveCredentials(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void deleteCookies(){
        this.username = null;
        this.password = null;
    }

    public void print(){
        System.out.print(this.accessedAtHour + ":" + this.accessedAtMinute + " " + this.name + " " + this.url);
        if (this.username != null && this.password != null){
            System.out.println(" *");
        } else {
            System.out.println();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getAccessedAtHour() {
        return accessedAtHour;
    }

    public void setAccessedAtHour(int accessedAtHour) {
        this.accessedAtHour = accessedAtHour;
    }

    public int getAccessedAtMinute() {
        return accessedAtMinute;
    }

    public void setAccessedAtMinute(int accessedAtMinute) {
        this.accessedAtMinute = accessedAtMinute;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
