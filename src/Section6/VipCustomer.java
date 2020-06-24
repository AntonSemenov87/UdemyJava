package Section6;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    // 1st empty Constructor
    public VipCustomer () {
        this ("default name", 0.00, "default@address.com");
    }

    // 2nd Constructor
    public VipCustomer (String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    // 3rd Constructor
    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
