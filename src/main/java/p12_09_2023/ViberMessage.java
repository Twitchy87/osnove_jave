package p12_09_2023;

public class ViberMessage {

    private String text;
    private String sentAt;
    private ViberUser sender;
    private ViberUser recipient;
    private ViberReaction reaction;

    public ViberMessage(String text, String sentAt, ViberUser sender, ViberUser recipient){
        this.text = text;
        this.sentAt = sentAt;
        this.sender = sender;
        this.recipient = recipient;
    }

    public void print(){
        System.out.print("From: " + this.sender.getFullName() + " * ");
        if (this.sender.getIsActive()){
            System.out.print("Active Now");
        } else {
            System.out.print("Not active");
        }
        System.out.println(" - at " + this.sentAt);

        System.out.println("To: " + this.recipient.getFullName());
        System.out.print(this.text);
        if (this.reaction != null){
            System.out.println(" : " + this.reaction.getEmoji() + " from " + this.reaction.getReacted().getFullName());
        }
    }

    public String getText(){
        return this.text;
    }
    public String getSentAt(){
        return this.sentAt;
    }
    public ViberUser getSender(){
        return this.sender;
    }
    public ViberUser getRecipient(){
        return this.recipient;
    }
    public ViberReaction getReaction(){
        return this.reaction;
    }
    public void setReaction(ViberReaction reaction){
        this.reaction = reaction;
    }
}
