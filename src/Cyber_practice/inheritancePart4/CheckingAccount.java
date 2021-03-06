package Cyber_practice.inheritancePart4;

public class CheckingAccount extends BankAccount {

    @Override
    public void transfer(double amount) {
        double total = amount + (amount * 0.05);
        if (this.balance >= total) {
            System.out.println("Transfer is successful");
            this.balance -= total;
        } else {
            System.out.println("Not sufficient funds. Transfer FAILED");
        }
    }
}
