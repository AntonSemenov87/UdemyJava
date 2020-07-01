package Section6.Inheritance;

public class Card {
    private String fullName;
    private String cardNumber;
    private int expirationYear;
    private int CVV;
    private String billingAddress;

    public Card(String fullName, String cardNumber, int expirationYear, int CVV, String billingAddress) {
        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.expirationYear = expirationYear;
        this.CVV = CVV;
        this.billingAddress = billingAddress;
    }
}
