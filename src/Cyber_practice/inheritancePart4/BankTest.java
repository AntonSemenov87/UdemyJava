package Cyber_practice.inheritancePart4;

public class BankTest {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        ba.balance = 300;
        ba.name = "J Lo";
        ba.accountNumber = 435434;
        System.out.println(ba); // prints address of Object, I used toString method Override and now it prints all info
        ba.info();

    }
}
