package d11_09_2023;

public class Video {

    private String id;
    private String title;
    private int length;
    private int numberOfLikes;
    private int numberOfDislikes;
    private int numberOfViews;

    public Video(String id, String title, int length){
        this.id = id;
        this.title = title;
        this.length = length;
    }

    public Video(String id, String title, int length, int numberOfLikes, int numberOfDislikes, int numberOfViews){
        this.id = id;
        this.title = title;
        this.length = length;
        this.numberOfLikes = numberOfLikes;
        this.numberOfDislikes = numberOfDislikes;
        this.numberOfViews = numberOfViews;
    }

    public void like(){
        this.numberOfLikes++;
    }

    public void dislike(){
        this.numberOfDislikes++;
    }

    public void view(){
        this.numberOfViews++;
    }

    public String getId(){
        return this.id;
    }

    public String getTitle(){
        return this.title;
    }

    public int getLength(){
        return this.length;
    }

    public int getNumberOfLikes(){
        return this.numberOfLikes;
    }

    public int getNumberOfDislikes(){
        return this.numberOfDislikes;
    }

    public int getNumberOfViews(){
        return this.numberOfViews;
    }
}
