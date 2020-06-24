package Section6;

public class BankAccount {
    private long acctNum;
    private double balance;
    private String customerName;
    private String customerPhoneNumber;

    // creating Constructor #1
    public BankAccount () {
        this(123456, 2.50, "default name", "default phone"); // this has to be first line in constructor!
        System.out.println("Empty constructor called");
    }

    // creating Constructor #2
    public BankAccount (long acctNum, double balance, String customerName, String customerPhoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.acctNum = acctNum;
        this.balance = balance;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    // creating Constructor #3
    public BankAccount(String customerName, String customerPhoneNumber) {
        this (9999, 100.00, customerName, customerPhoneNumber); // called Constructor 2
    }

    // getters and setters for each field
    public void setAcctNum(long acctNum) {
        this.acctNum = acctNum;
    }
    public long getAcctNum () {
        return acctNum;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }
    public double getBalance () {
        return balance;
    }

    public void setCustomerName (String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    // additional methods
    public void deposit (double depositAmount) {
        System.out.println("Balance was $" + this.balance + ", after deposit it's $" + (this.balance + depositAmount));
        this.balance += depositAmount;
    }
    public void withdraw (double withdrawAmount) {
        if (this.balance - withdrawAmount < 0) {
            System.out.println("Insufficient funds on your account");
        } else {
            System.out.println("Your balance was $" + this.balance + ", after withdrawal it's $" + (this.balance - withdrawAmount));
            this.balance -= withdrawAmount;
        }
    }
}
