package p12_09_2023;

public class ViberUser {

    private String fullName;
    private String phoneNumber;
    private boolean isActive;

    public ViberUser(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public ViberUser(String fullName, String phoneNumber){
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName(){
        return this.fullName;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean getIsActive(){
        return this.isActive;
    }
    public void setIsActive(boolean isActive){
        this.isActive = isActive;
    }

}
