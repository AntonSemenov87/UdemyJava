package Section6.Inheritance;

public class CreditCard extends Card {
    private String type;
    private String brand;


    public CreditCard(String firstName, String lastName, String cardNumber, int expirationYear, int CVV, String billingAddress, String type, String brand) {
        super(firstName, lastName, cardNumber, expirationYear, CVV, billingAddress);
    }
}
