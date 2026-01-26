package designSystem.parkingLot.domain;

import java.util.UUID;

public class Vehicle {
    private UUID id;
    private String vehicleNumber;
    private VehicleType vehicleType;

    public Vehicle(String vehicleNumber, VehicleType vehicleType){
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public UUID getId() {
        return id;
    }

    public String getVehicleNumber(){
        return this.vehicleNumber;
    }

    public VehicleType getVehicleType(){
        return this.vehicleType;
    }
}
