package Cyber_practice.ObjectsClasses;

public class Card {
    String type;
    int accountNumber;
    double balance;
    String holderName;

    public void deposit (double depositAmount) {
        System.out.println(depositAmount + " is deposited to your account");
        this.balance += depositAmount;
    }

    public void transfer(double transferAmount) {
        if (this.balance >= transferAmount) {
            System.out.println(transferAmount + " is transferred from your account");
            this.balance -= transferAmount;
        } else {
            System.out.println("Funds are not sufficient");
        }
    }

    public void info () {
        System.out.println("Name: " + this.holderName);
        System.out.println("Balance: " + this.balance);
        System.out.println("Type: " + this.type);
        System.out.println("Account Number: " + this.accountNumber);
    }
}
