package designPatterns.behavioural.chainOfResponsibility;

public class GeneralSupport extends SupportHandler{
    @Override
    public void handleRequest(String requestType) {
        if(requestType.equalsIgnoreCase("general")) {
            System.out.println("General Support: Handling General Support");
        } else if(nextHandler != null) {
            nextHandler.handleRequest(requestType);
        }
    }
}
