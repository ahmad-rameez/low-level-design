package designPatterns.structural.adaptor;

public class PayUGateway implements PaymentGateway{
    @Override
    public void pay(String orderId, double amount) {
        System.out.println("For orderId " + orderId + " Amount = " + amount + " is processed!");
    }
}
