package designPatterns.creational.prototype;

public class WelcomeEmail implements EmailTemplate{
    private String content;
    private final String subject;

    public WelcomeEmail() {
        this.subject = "Welcome to MyService!";
        this.content = "Hi there, Thanks for joining us!";
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void send(String to) {
        System.out.println("Sending to " + to + ": [" + subject + "] " + content);
    }

    @Override
    public WelcomeEmail clone(){
        try {
            return (WelcomeEmail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone Failed", e);
        }
    }
}
