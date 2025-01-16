package pay_example_interfaces.pay_example;

public class BitcoinPayment implements PaymentMethod, BlockchainVerified {
    private String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Bitcoin payment of £" + amount + " from wallet " + walletAddress);
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding £" + amount + " to Bitcoin wallet " + walletAddress);
    }

    @Override
    public void verifyTransaction(String transactionId) {
        System.out.println("Verifying Bitcoin transaction with ID: " + transactionId + " on the blockchain.");
    }
}

