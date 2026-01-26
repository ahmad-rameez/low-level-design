package designSystem.atm.domain;

public class Admin {
    private String id;
    private String name;
    private String pinHash;
    private boolean isActive;

    public Admin(String id, String name, String pinHash, boolean isActive) {
        this.id = id;
        this.name = name;
        this.pinHash = pinHash;
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

    public String getPinHash() {
        return pinHash;
    }

    public void setPinHash(String pinHash) {
        this.pinHash = pinHash;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
