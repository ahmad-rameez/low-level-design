package designPatterns.behavioural.chainOfResponsibility;
public class TechnicalSupport extends SupportHandler{
    @Override
    public void handleRequest(String requestType) {
        if(requestType.equalsIgnoreCase("technical")) {
            System.out.println("Technical Support: Handling Technical Support");
        } else if(nextHandler != null) {
            nextHandler.handleRequest(requestType);
        }
    }
}

