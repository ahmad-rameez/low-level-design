package designPatterns.structural.adaptor;

public class RazorPayAPI {
    public void makePayment(String orderId, double amount) {
        System.out.println("OrderId " + orderId + " amount=" + amount + " processed via RazorPayApi!");
    }
}
