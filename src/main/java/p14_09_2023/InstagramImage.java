package p14_09_2023;

import java.util.ArrayList;

public class InstagramImage {

    private ArrayList<InstagramTag> tags;
    private int length;
    private int width;
    private String path;

    public InstagramImage(int length, int width, String path) {
        this.length = length;
        this.width = width;
        this.path = path;
        this.tags = new ArrayList<>();
    }

    public void addTag(InstagramTag tag){
        this.tags.add(tag);
    }

    public ArrayList<InstagramTag> getTags() {
        return tags;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getPath() {
        return path;
    }
}
