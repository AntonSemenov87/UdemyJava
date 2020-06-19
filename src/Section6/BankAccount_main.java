package Section6;

public class BankAccount_main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setCustomerName("Anton Semenov");
        ba.setAcctNum(4125423454325675L);
        ba.setCustomerPhoneNumber(7739692111L);
        ba.setBalance(100.00);

        System.out.println("Hey, " + ba.getCustomerName() + "!" +
                "\nYour original balance was $" + ba.getBalance());
        ba.deposit(50.99);
        ba.withdraw(151.00);


    }
}
