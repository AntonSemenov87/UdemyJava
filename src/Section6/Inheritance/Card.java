package Section6.Inheritance;

public class Card {
    private String firstName;
    private String lastName;
    private String cardNumber;
    private int expirationYear;
    private int CVV;
    private String billingAddress;

    public Card(String firstName, String lastName, String cardNumber, int expirationYear, int CVV, String billingAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.expirationYear = expirationYear;
        this.CVV = CVV;
        this.billingAddress = billingAddress;
    }
}
