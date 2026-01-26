package designSystem.atm.domain;

public class Account {
    private String id;
    private String name;
    private long balance;
    private boolean isActive;

    public Account(String id, String name, long balance, boolean isActive) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.isActive = isActive;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
