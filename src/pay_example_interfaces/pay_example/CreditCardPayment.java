package pay_example_interfaces.pay_example;

public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of £" + amount + " for " + cardHolderName);
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding £" + amount + " to credit card of " + cardHolderName);
    }
}
