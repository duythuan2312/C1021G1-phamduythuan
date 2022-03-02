package ss19_StringandRegex.thuchanh.thuchanh2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {

    public static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public AccountExample() {
    }

}
