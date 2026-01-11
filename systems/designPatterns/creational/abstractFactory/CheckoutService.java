package designPatterns.creational.abstractFactory;

public class CheckoutService {
    private PaymentGateway paymentGateway;
    private Invoice invoice;

    public CheckoutService(String paymentGatewayType, RegionFactory regionFactory) {
        this.paymentGateway = regionFactory.createPaymentGateway(paymentGatewayType);
        this.invoice = regionFactory.createInvoice();
    }

    public void checkOut(double amount){
        paymentGateway.processPayment(amount);
        invoice.generateInvoice();
    }
}
