package pay_example_interfaces.pay_example;

public interface PaymentMethod {
    void processPayment(double amount);
    void refundPayment(double amount);
}
