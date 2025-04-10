package OOP_Section7;

public class Customer {

    private String name;
    private int creditLimit;
    private String emailAddress;

    public Customer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }


    public Customer(String emailAddress, String name) {
        this(name, 1000, emailAddress);
    }
    public Customer() {
        this("augustin",  "augustin@gmail.com");
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
