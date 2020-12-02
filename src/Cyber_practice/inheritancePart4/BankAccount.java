package Cyber_practice.inheritancePart4;

public class BankAccount {

    public double balance;
    public int accountNumber;
    String name;

    public void info () {
        System.out.println("balance is: " + this.balance);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Customer name: " + this.name);
    }

    public void transfer(double amount){
        System.out.println("Money is transferred: " + amount);
        this.balance -= amount;
        this.balance -= amount * 0.1;
    }

    public void deposit (double amount) {
        System.out.println("Deposit is successful");
        this.balance += amount;
    }

    @Override
    public String toString (){
        String result = "Name: " + this.name + "\nAccount: " + this.accountNumber + "\nBalance: " + this.balance;
        return result;
    }
}
