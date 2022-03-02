package ss19_StringandRegex.baitap.baitap2;

public class Main {
    private static PhoneNumber phoneNumber;
    private static final String[] phone = new String[] {"0905346515","0702456789","0905981234"};
    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        for (String number : phone){
            boolean check = phoneNumber.validate(number);
            System.out.println(" Number "+number +" check " + check);
        }

    }
}
