public class Main {
    private static AccountExample accountExample;
    public static final String [] validAccount = new String[] {"123abc_", "_abc123", "______", "123456", "abcdef"};
    public static final String[] inValidAccount = new String[] {".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account: validAccount
             ) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isValid);
        }
        for (String account: inValidAccount
             ) {
            boolean isInvalidAccount = accountExample.validate(account);
            System.out.println("Account is " + account + " is invalid: " + isInvalidAccount);
        }
    }
}
