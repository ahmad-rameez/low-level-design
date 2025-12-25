package parkingLot.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Floor {
    private UUID id;
    private int floorNumber;
    List<ParkingSlot> parkingSlots;

    public Floor(int floorNumber) {
        this.id = UUID.randomUUID();
        this.floorNumber = floorNumber;
        this.parkingSlots = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public void addParkingSot(ParkingSlot slot){
        this.parkingSlots.add(slot);
        System.out.println("Parking Slot: " + slot.getId() + " Added.");
    }
}
