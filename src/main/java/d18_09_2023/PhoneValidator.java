package d18_09_2023;

public class PhoneValidator extends Validator{

    private String number;

    public PhoneValidator() {
        super();
    }

    public PhoneValidator(String number) {
        super();
        this.number = number;
    }

    @Override
    public ValidationResult validate() {
        ValidationResult validationResult = new ValidationResult();

        if (!this.number.startsWith("+")){
            validationResult.addError("Phone number must start with +");
        }

        if (this.number.contains(" ")){
            validationResult.addError("Phone number cannot contain spaces");
        }

        int hasDigit = 0;
        for (int i = 0; i < this.number.length(); i++) {
            if (Character.isDigit(this.number.charAt(i))){
                hasDigit++;
            }
        }
        if(hasDigit != this.number.length() - 1){
            validationResult.addError("Phone number can only contain numbers");
        }
        return validationResult;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
