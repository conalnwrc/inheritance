package pay_example;

public class PaypalPayment implements PaymentMethod {
    private String paypalEmail;

    public PaypalPayment(String paypalEmail) {
        this.paypalEmail = paypalEmail;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of £" + amount + " for email: " + paypalEmail);
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding £" + amount + " to PayPal account: " + paypalEmail);
    }
}

