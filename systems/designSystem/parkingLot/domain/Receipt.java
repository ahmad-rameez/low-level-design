package designSystem.parkingLot.domain;

import java.time.OffsetDateTime;

public class Receipt {
    private String id;
    private String parkingTicketId;
    private OffsetDateTime exitTime;
    private Double fee;
    private PaymentStatus paymentStatus;

    public Receipt(String id, String parkingTicketId, OffsetDateTime exitTime, Double fee, PaymentStatus paymentStatus) {
        this.id = id;
        this.parkingTicketId = parkingTicketId;
        this.exitTime = exitTime;
        this.fee = fee;
        this.paymentStatus = paymentStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParkingTicketId() {
        return parkingTicketId;
    }

    public void setParkingTicketId(String parkingTicketId) {
        this.parkingTicketId = parkingTicketId;
    }

    public OffsetDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(OffsetDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
