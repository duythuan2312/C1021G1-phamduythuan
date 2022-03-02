package ss19_StringandRegex.baitap.baitap2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PhoneNumber {

    public static final String REGEX = "^09[035][0-9]{7}";

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
