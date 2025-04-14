package parkinglot.parkingspot;

import parkinglot.Vehicle.Car;
import parkinglot.Vehicle.Vehicle;

public class LargeSpot extends ParkingSpot {

    public LargeSpot(int id, int distanceToEntrance, int distanceToElevator) {
        super(id, distanceToEntrance, distanceToElevator);
    }

    @Override
    public boolean canFitVehicle(Vehicle vehicle) {
        return vehicle instanceof Car;
    }
}
