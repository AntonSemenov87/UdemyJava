package Section6;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    // 1st empty Constructor
    public VipCustomer () {
        this ("default name", 0.00, "default@address.com");
    }

    public VipCustomer (String name, double creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
    }
}
