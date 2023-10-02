package d18_09_2023;

public class EmailValidator extends Validator{

    private String email;

    public EmailValidator() {
        super();
    }

    public EmailValidator(String email) {
        super();
        this.email = email;
    }

    @Override
    public ValidationResult validate(){
        ValidationResult validationResult = new ValidationResult();

        if (!(this.email.contains("@") && (this.email.endsWith(".com") || this.email.endsWith(".net")))){
            validationResult.addError("Email is invalid");
        }
            return validationResult;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
