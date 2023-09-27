package p14_09_2023;

import java.util.ArrayList;

public class InstagramPost {

    private ArrayList<InstagramImage> images;
    private String description;

    public InstagramPost() {
        this.images = new ArrayList<>();
    }

    public InstagramPost(String description) {
        this.description = description;
        this.images = new ArrayList<>();
    }

    public void addImage(InstagramImage image){
        this.images.add(image);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<InstagramImage> getImages() {
        return images;
    }
}
