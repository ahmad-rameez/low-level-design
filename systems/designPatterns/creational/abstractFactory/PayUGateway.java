package designPatterns.creational.abstractFactory;

public class PayUGateway implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment processed via PayU");
    }
}
