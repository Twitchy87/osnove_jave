package p14_09_2023;

public class InstagramTag {

    private int x;
    private int y;
    private InstagramUser taggedUser;

    public InstagramTag(int x, int y, InstagramUser taggedUser) {
        this.x = x;
        this.y = y;
        this.taggedUser = taggedUser;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public InstagramUser getTaggedUser() {
        return taggedUser;
    }

    public void setTaggedUser(InstagramUser taggedUser) {
        this.taggedUser = taggedUser;
    }
}
