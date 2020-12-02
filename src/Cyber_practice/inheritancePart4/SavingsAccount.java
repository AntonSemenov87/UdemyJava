package Cyber_practice.inheritancePart4;

public class SavingsAccount extends BankAccount {

    public double interestIncome;

    @Override
    public void transfer(double amount) {
        this.balance -= amount;
        this.balance -= (amount * 0.2);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Interest income: " + interestIncome);
    }

    public void calculateAnnualInterestIncome(){
        interestIncome += this.balance * 0.03;
    }


}
