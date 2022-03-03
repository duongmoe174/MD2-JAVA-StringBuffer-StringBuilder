import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    public static final String PHONE_REGEX = "^[(]\\d{2,}[)][-][(][0]\\d{9,}[)]$";

    public ValidatePhone() {
    }

    public boolean validate(String inputPhone) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(inputPhone);
        return matcher.matches();
    }
}
