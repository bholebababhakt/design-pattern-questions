package parkinglot.parkingspot;

import parkinglot.Vehicle.Vehicle;

public class HandicappedSpot extends ParkingSpot {
    public HandicappedSpot(int id, int distanceToEntrance, int distanceToElevator) {
        super(id, distanceToEntrance, distanceToElevator);
    }

    @Override
    public boolean canFitVehicle(Vehicle vehicle) {
        return true;
    }
}
