package Section6;

public class BankAccount {
    private long acctNum;
    private double balance;
    private String customerName;
    private long customerPhoneNumber;


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

    public void setCustomerPhoneNumber(long customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
    public long getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    // additional methods
    public void deposit (double depositAmount) {
        System.out.println("Balance was $" + balance + ", after deposit it's $" + (balance + depositAmount));
        balance = balance + depositAmount;
    }
    public void withdraw (double withdrawAmount) {
        if (balance - withdrawAmount < 0) {
            System.out.println("Insufficient funds on your account");
        } else {
            System.out.println("Your balance was $" + balance + ", after withdrawal it's $" + (balance - withdrawAmount));
            balance = balance - withdrawAmount;
        }
    }
}
