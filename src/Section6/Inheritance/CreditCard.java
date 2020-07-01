package Section6.Inheritance;

public class CreditCard extends Card {
    private String type;
    private String brand;

    public CreditCard(String fullName, String cardNumber, int expirationYear, int CVV, String billingAddress, String type, String brand) {
        super(fullName, cardNumber, expirationYear, CVV, billingAddress);
        this.type = type;
        this.brand = brand;
    }
}
