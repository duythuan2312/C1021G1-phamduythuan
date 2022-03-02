package ss19_StringandRegex.thuchanh.thuchanh2;

public class AccountExampleTest {
    public static AccountExample accountExample;
    public static final String[] validAccount = new String[] {"123456","_gfdhgjdf","-sgjsdh","43775483_"};
    public static final String[] invalidAccount = new String[] {"_6437573","-43284","23784732"};
    public static void main(String[] args) {
         accountExample = new AccountExample();
         for (String account : validAccount){
             boolean isvalid = accountExample.validate(account);
             System.out.println("Account is"+account+"is valid:"+isvalid);
         }
         for (String account : invalidAccount){
             boolean isvalid = accountExample.validate(account);
             System.out.println("Account is"+account+"is valid:"+isvalid);

         }

    }
}
