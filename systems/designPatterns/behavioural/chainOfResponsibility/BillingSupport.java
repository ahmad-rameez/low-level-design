package designPatterns.behavioural.chainOfResponsibility;

public class BillingSupport extends SupportHandler{
    @Override
    public void handleRequest(String requestType) {
        if(requestType.equalsIgnoreCase("billing")) {
            System.out.println("Billing Support: Handling Billing Support");
        } else if(nextHandler != null) {
            nextHandler.handleRequest(requestType);
        }
    }
}

