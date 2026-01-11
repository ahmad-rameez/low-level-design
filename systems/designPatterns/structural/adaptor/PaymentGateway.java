package designPatterns.structural.adaptor;

public interface PaymentGateway {
    void pay(String orderId, double amount);
}
