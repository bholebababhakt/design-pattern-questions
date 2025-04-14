package parkinglot.parkingspot;

import parkinglot.Vehicle.Bike;
import parkinglot.Vehicle.Vehicle;

public class CompactSpot extends ParkingSpot {

    public CompactSpot(int id, int distanceToEntrance, int distanceToElevator) {
        super(id, distanceToEntrance, distanceToElevator);
    }

    @Override
    public boolean canFitVehicle(Vehicle vehicle) {
        return vehicle instanceof Bike;
    }
}
