package designPatterns.behavioural.chainOfResponsibility;

public class Driver {

    public static void main(String[] args) {
        SupportHandler general = new GeneralSupport();
        SupportHandler billing = new BillingSupport();
        SupportHandler technical = new TechnicalSupport();

        general.setNextHandler(technical);
        technical.setNextHandler(billing);

        general.handleRequest("technical");
    }


}
