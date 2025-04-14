package parkinglot.parkingspot;

import parkinglot.Vehicle.Vehicle;

public abstract class ParkingSpot {
    protected int id;
    protected boolean isAvailable;
    protected Vehicle vehicle;
    protected int distanceToEntrance;
    protected int distanceToElevator;

    public ParkingSpot(int id, int distanceToEntrance, int distanceToElevator) {
        this.id = id;
        this.isAvailable = true;
        this.distanceToEntrance = distanceToEntrance;
        this.distanceToElevator = distanceToElevator; // 🆕 Initialize it
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public int getId() {
        return id;
    }

    public int getDistanceToEntrance() {
        return distanceToEntrance;
    }

    public int getDistanceToElevator() { // 🆕 Add this method
        return distanceToElevator;
    }




    public void assignVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        isAvailable = false;
        System.out.println("Parking spot assigned to "+vehicle.getLicensePlate());
    }

    public void removeVehicle(){
        this.vehicle = null;
        isAvailable = true;
        System.out.println("Parking spot got free");
    }
    public abstract boolean canFitVehicle(Vehicle vehicle);
}
