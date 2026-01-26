package designSystem.atm.domain;

public class Card {
    private String id;
    private String cardNumber;
    private String expiry;
    private int pinRetries;

    public Card(String id, String cardNumber, String expiry, int pinRetries) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.expiry = expiry;
        this.pinRetries = pinRetries;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public int getPinRetries() {
        return pinRetries;
    }

    public void setPinRetries(int pinRetries) {
        this.pinRetries = pinRetries;
    }
}
