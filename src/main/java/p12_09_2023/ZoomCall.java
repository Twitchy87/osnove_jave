package p12_09_2023;

public class ZoomCall {

    private String url;
    private String password;
    private User host;
    private User guest;

    public ZoomCall(String url, String password, User host){
        this.url = url;
        this.password = password;
        this.host = host;
    }
    public ZoomCall(String url, String password, User host, User guest){
        this.url = url;
        this.password = password;
        this.host = host;
        this.guest = guest;
    }

    public void startCall(){
        System.out.println("Zoom call: " + this.url);
        System.out.println("Password: " + this.password);
        System.out.println("Host: " + this.host.getFullName());
        if (this.guest != null){
            System.out.println("Guest: " + this.guest.getFullName());
        }
        System.out.println("Max trajanje poziva: " + this.host.maxCallDuration() + " min.");
    }

    public String getUrl(){
        return this.url;
    }
    public String getPassword(){
        return this.password;
    }
    public User getHost(){
        return this.host;
    }
    public User getGuest(){
        return this.guest;
    }
    public void setGuest(User guest){
        this.guest = guest;
    }

}
