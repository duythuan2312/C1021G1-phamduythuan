package dethi1.Validate;

public class Regex {
    public static void main(String[] args) {
        String regexDayOfBirth = "(((0[1-9]|[12][0-9]|30)[-\\/](0[13-9]|1[012])|31[-\\/](0[13578]|1[02])|(0[1-9]|1[0-9]|2[0-8])[-\\/]02)" +
                "[-\\/](19[0-9]{2}|200[012])|29[-\\/]02[-\\/]" +
                "([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00))$";

        String regexPhone = "^0[97][0378][0-9]{7}$";
        String regexEmail = "[2-zA-Z][a-zA-Z0-9]+@gmail.com";
        String regexGender = "(Nam|Nữ|Khác)";
        String regexidentityCardNo = "2[0-9]{11}";
    }
}
