package p12_09_2023;

public class ViberReaction {

    private String emoji;
    private ViberUser reacted;

    public ViberReaction(String emoji, ViberUser reacted){
        this.emoji = emoji;
        this.reacted = reacted;
    }

    public String getEmoji(){
        return this.emoji;
    }
    public void setEmoji(String emoji){
        this.emoji = emoji;
    }

    public ViberUser getReacted(){
        return this.reacted;
    }
    public void setReacted(ViberUser reacted){
        this.reacted = reacted;
    }
}
