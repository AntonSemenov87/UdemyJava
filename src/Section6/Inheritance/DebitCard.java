package Section6.Inheritance;

public class DebitCard extends Card {
    private String type;

    public DebitCard(String fullName, String cardNumber, int expirationYear, int CVV, String billingAddress, String type) {
        super(fullName, cardNumber, expirationYear, CVV, billingAddress);
        this.type=type;
    }
}
