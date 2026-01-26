package designSystem.atm.domain;

public class Session {
    private String id;
    private String atmId;
    private String cardId;
    private String accountId;
    private long startTime;
    private long endTime;
    private boolean isActive;
    private String currentTransactionId;
    private TransactionType transactionType;
    private long amount;

    public Session(long startTime, String accountId, String cardId, String atmId, String id) {
        this.startTime = startTime;
        this.accountId = accountId;
        this.cardId = cardId;
        this.atmId = atmId;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAtmId() {
        return atmId;
    }

    public void setAtmId(String atmId) {
        this.atmId = atmId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getCurrentTransactionId() {
        return currentTransactionId;
    }

    public void setCurrentTransactionId(String currentTransactionId) {
        this.currentTransactionId = currentTransactionId;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
