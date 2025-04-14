package parkinglot.parkingstrategy;

import parkinglot.ParkingLot;
import parkinglot.Vehicle.Vehicle;
import parkinglot.parkingspot.ParkingSpot;

public interface ParkingStrategy {
    ParkingSpot findSpot(ParkingLot lot, Vehicle vehicle);
}
