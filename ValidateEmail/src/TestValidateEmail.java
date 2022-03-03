public class TestValidateEmail {
    private  static EmailExample emailExample;
    public static final String[] validEmail = new String[] {"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[] {"@gmail.com" , "ab@mail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email: validEmail
             ) {
                boolean isVaild = emailExample.validate(email);
            System.out.println("Email is " + email + "is valid: " + isVaild);
        }
        for (String email: invalidEmail
             ) {
            boolean isInvalid = emailExample.validate(email);
            System.out.println("Email is " + email + "is Invalid: " + isInvalid);
        }
    }
}
