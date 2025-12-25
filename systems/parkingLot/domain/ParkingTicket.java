package parkingLot.domain;

import java.time.OffsetDateTime;
import java.util.UUID;

public class ParkingTicket {
    private String id;
    private String vehicleNumber;
    private UUID parkingSlotId;
    private OffsetDateTime entryTime;
    private boolean isActive;

    public ParkingTicket(String id, UUID parkingSlotId) {
        this.id = id;
        this.parkingSlotId = parkingSlotId;
        this.isActive = true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public UUID getParkingSlotId() {
        return parkingSlotId;
    }

    public void setParkingSlotId(UUID parkingSlotId) {
        this.parkingSlotId = parkingSlotId;
    }

    public OffsetDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(OffsetDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
