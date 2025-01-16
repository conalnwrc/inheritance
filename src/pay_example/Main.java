package pay_example;

public class Main {
    public static void main(String[] args) {
        // Create instances of different payment methods
        PaymentMethod creditCard = new CreditCardPayment("1234-5678-9876-5432", "John Doe");
        PaymentMethod paypal = new PaypalPayment("john.doe@example.com");
        PaymentMethod bitcoinPayment = new BitcoinPayment("1A2B3C4D5E6F7G8H9I0J");

        // Process payments
        System.out.println("\n--- Processing Payments ---");
        processPayment(creditCard, 100.0);
        processPayment(paypal, 50.0);
        processPayment(bitcoinPayment, 200.0);

        // Process refunds
        System.out.println("\n--- Processing Refunds ---");
        processRefund(creditCard, 30.0);
        processRefund(paypal, 15.0);
        processRefund(bitcoinPayment, 50.0);

        // Verify Bitcoin transaction
        System.out.println("\n--- Verifying Bitcoin Transaction ---");
        BlockchainVerified blockchainPayment = (BlockchainVerified) bitcoinPayment;
        blockchainPayment.verifyTransaction("TX1234567890");
    }

    public static void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.processPayment(amount);
    }

    public static void processRefund(PaymentMethod paymentMethod, double amount) {
        paymentMethod.refundPayment(amount);
    }
}
