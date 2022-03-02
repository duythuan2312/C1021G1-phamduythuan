package ss19_StringandRegex.baitap.baitap1;

public class Main {
    private static Validate validates;
    private static final String[] validAccount = new String[]{"C0318G","M0318G","P0323A"};

    public static void main(String[] args) {
        validates = new Validate();
        for (String acount : validAccount){
          boolean check = validates.validate(acount);
            System.out.println("Account is " + acount + " is valit " + check);
        }
    }
}
