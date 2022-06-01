public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(200);
        account.setOwnerName("iulian");
        account.setLocked(true);
        account.getBalance();
        account.getOwnerName();
        account.isLocked();
        System.out.println(account.getBalance());
        System.out.println(account.getOwnerName());
        System.out.println(account.isLocked());

    }
}