package d18_09_2023;

public class PasswordValidator extends Validator{

    private String password;

    public PasswordValidator() {
        super();
    }

    public PasswordValidator(String password) {
        super();
        this.password = password;
    }

    @Override
    public ValidationResult validate(){
        ValidationResult validationResult = new ValidationResult();

        if(!(this.password.contains("@") || this.password.contains("#") || this.password.contains("/") || this.password.contains("*"))){
            validationResult.addError("Password must contain at least one special character @, #, / or *");
        }

        if (this.password.length() < 8){
            validationResult.addError("Password must be minimum 8 characters");
        }

        int upperCaseLetter = 0;
        for (int i = 0; i < this.password.length(); i++) {
            if (Character.isUpperCase(this.password.charAt(i))){
                upperCaseLetter++;
                break;
            }
        }
        if(upperCaseLetter == 0){
            validationResult.addError("Password must contain at least one uppercase letter");
        }

        int lowerCaseLetter = 0;
        for (int i = 0; i < this.password.length(); i++) {
            if (Character.isLowerCase(this.password.charAt(i))){
                lowerCaseLetter++;
                break;
            }
        }
        if(lowerCaseLetter == 0){
            validationResult.addError("Password must contain at least one lowercase letter");
        }

        int hasDigit = 0;
        for (int i = 0; i < this.password.length(); i++) {
            if (Character.isDigit(this.password.charAt(i))){
                hasDigit++;
                break;
            }
        }
        if(hasDigit == 0){
            validationResult.addError("Password must contain at least one digit");
        }

        return validationResult;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
