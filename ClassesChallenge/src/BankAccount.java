public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(){
        this(9876,200.00,"Stelina","Stelina@gmail.com",698980987);
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, int phoneNumber){

        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }
    public void withdraw(int amount) {
        if(balance >= amount) {
            this.balance -= amount;
        }else{
            System.out.println("Insufficient balance");
        }
    }
    public void printInfo(){
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Customer name: " + customerName);
        System.out.println("Email: " + email);
        System.out.println("Phone number: " + phoneNumber);

    }
}
