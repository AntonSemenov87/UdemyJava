package Cyber_practice.ObjectsClasses;

public class CardMain {
    public static void main(String[] args) {

        Card visa = new Card();
        visa.holderName = "Bob Sinclair";
        visa.accountNumber = 434567657;
        visa.type = "Visa";
        visa.balance = 10000;

        visa.deposit(1000);
        visa.info();

        visa.transfer(6000);
        visa.info();

    }
}
