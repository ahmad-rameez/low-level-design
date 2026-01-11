package designPatterns.creational.abstractFactory;

public class RazorpayGateway implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment Processed via Razorpay");
    }
}
