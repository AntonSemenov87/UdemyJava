package Section6.Inheritance;

public class DebitCard extends Card {
    private String type;


    public DebitCard(String firstName, String lastName, String cardNumber, int expirationYear, int CVV, String billingAddress, String type) {
        super(firstName, lastName, cardNumber, expirationYear, CVV, billingAddress);
    }
}
