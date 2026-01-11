package designPatterns.creational.abstractFactory;

import java.util.Objects;

public class IndiaFactory implements RegionFactory{
    @Override
    public PaymentGateway createPaymentGateway(String gatewayType) {
        if(Objects.equals(gatewayType, "razorpay")) {
            return new RazorpayGateway();
        } else {
            return new PayUGateway();
        }
    }

    @Override
    public Invoice createInvoice() {
        return new GSTInvoice();
    }
}
