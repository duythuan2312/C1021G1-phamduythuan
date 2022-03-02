package ss19_StringandRegex.baitap.baitap1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

    public static final String REGEX = "^[CAP][0-9]{4}[GHIKLM]$";

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
