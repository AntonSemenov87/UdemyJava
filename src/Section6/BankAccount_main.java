package Section6;

public class BankAccount_main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setCustomerName("Anton Semenov");
        ba.setAcctNum(4125423454325675L);
        ba.setCustomerPhoneNumber("7739692111");
        ba.setBalance(100.00);

        System.out.println("Hey, " + ba.getCustomerName() + "!" +
                "\nYour original balance was $" + ba.getBalance());
        ba.deposit(50.99);
        ba.withdraw(151.00);

        BankAccount myAcct = new BankAccount(1324567, 100.00, "Anton", "7732324567");
        System.out.println(myAcct.getCustomerName());
        System.out.println(myAcct.getBalance());
        System.out.println(myAcct.getAcctNum());
        System.out.println(myAcct.getCustomerPhoneNumber());



    }
}
