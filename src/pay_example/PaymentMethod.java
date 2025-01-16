package pay_example;

public interface PaymentMethod {
    void processPayment(double amount);
    void refundPayment(double amount);
}
