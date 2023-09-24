package p12_09_2023;

public class User {

    private String fullName;
    private String licenseType = "basic";

    public User() {
    }
    public User(String fullName) {
        this.fullName = fullName;
    }

    public void subscribe(int payment){
        if (payment == 100){
            this.licenseType = "pro";
        } else if (payment == 150){
            this.licenseType = "premium";
        }
    }

    public void cancelSubscription(){
        this.licenseType = "basic";
    }

    public int maxCallDuration(){
       if (this.licenseType.equals("pro")) {
            return 240;
        } else if (this.licenseType.equals("premium")) {
            return 1440;
        } else {
           return 40;
       }
    }

    public void print(){
        System.out.println(this.fullName + ", " + this.licenseType + " user");
    }

    public String getFullName(){
        return this.fullName;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public String getLicenseType(){
        return this.licenseType;
    }
}
