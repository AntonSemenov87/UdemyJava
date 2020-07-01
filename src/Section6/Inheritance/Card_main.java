package Section6.Inheritance;

public class Card_main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("Anton", "Semenov", "123456", 2021, 345, "Chicago",
                "credit", "Visa");

        DebitCard card2 = new DebitCard("Vita Bezruchko","12123232", "13132454", 2023, 323,
                "Chicago", "MC");


    }
}
