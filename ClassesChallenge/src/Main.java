public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.setBalance(500);
        bankAccount.deposit(200);
        bankAccount.withdraw(300);
        bankAccount.setAccountNumber(1234);
        bankAccount.setEmail("test@test.com");
        bankAccount.setCustomerName("Augustin");

        bankAccount.printInfo();
    }
}