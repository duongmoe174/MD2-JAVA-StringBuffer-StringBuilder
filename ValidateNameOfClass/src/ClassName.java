import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    public static final String CLASSNAME_REGEX = "^(C|A|P)[0-9]{4}(G|H|I|K|L|M)$";

    public ClassName() {
    }

    public boolean validate(String inputName) {
        Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
        Matcher matcher = pattern.matcher(inputName);
        return matcher.matches();
    }
}
