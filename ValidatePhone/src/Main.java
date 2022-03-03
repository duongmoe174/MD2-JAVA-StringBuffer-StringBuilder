public class Main {
    public static ValidatePhone validatePhone;
    public static final String[] phoneValid = new String[] {"(84)-(0978489648)"};
    public static final String[] phoneInvalid = new String[] {"(a8)-(22222222)"};

    public static void main(String[] args) {
        validatePhone = new ValidatePhone();
        for (String phone: phoneValid
             ) {
            boolean isValid = validatePhone.validate(phone);
            System.out.println("phone: " + phone +  " = " + isValid);
        }
        for (String phone: phoneInvalid
             ) {
            boolean isInvalid = validatePhone.validate(phone);
            System.out.println("phone:" + phone + " = " + isInvalid);
        }
    }
}
