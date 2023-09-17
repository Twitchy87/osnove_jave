package d11_09_2023;

public class FacebookPost {

    private String description;
    private User user;

    public FacebookPost(String description, User user){
        this.description = description;
        this.user = user;
    }

    public void print(){
        this.user.print();
        System.out.println(description);
    }
}
