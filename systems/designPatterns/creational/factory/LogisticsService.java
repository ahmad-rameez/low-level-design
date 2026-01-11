package designPatterns.creational.factory;

// Payment Gateway
// Notification Service
public class LogisticsService {
    public void send(String mode){
        ILogistics logistics = LogisticsFactory.getLogistics(mode);
        logistics.send();
    }
}
