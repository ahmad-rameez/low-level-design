package designPatterns.structural.adaptor;

public class RazorPayAdaptor implements PaymentGateway{
    private RazorPayAPI razorPayAPI;

    public RazorPayAdaptor() {
        this.razorPayAPI = new RazorPayAPI();
    }

    @Override
    public void pay(String orderId, double amount) {
        razorPayAPI.makePayment(orderId, amount);
    }
}
