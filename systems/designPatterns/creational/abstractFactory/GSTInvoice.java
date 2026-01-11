package designPatterns.creational.abstractFactory;

public class GSTInvoice implements Invoice{
    @Override
    public void generateInvoice() {
        System.out.println("GST Invoice generated");
    }
}
