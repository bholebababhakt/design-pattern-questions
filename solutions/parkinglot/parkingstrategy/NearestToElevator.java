package parkinglot.parkingstrategy;

import parkinglot.ParkingLot;
import parkinglot.Vehicle.Vehicle;
import parkinglot.parkingspot.ParkingFloor;
import parkinglot.parkingspot.ParkingSpot;

public class NearestToElevator implements ParkingStrategy{
    public ParkingSpot findSpot(ParkingLot lot, Vehicle vehicle) {
        ParkingSpot nearestSpot = null;
        int minDistance = Integer.MAX_VALUE;

        for (ParkingFloor floor : lot.getFloors()) {
            for (ParkingSpot spot : floor.getAvailableSpots(vehicle)) {
                if (spot.isAvailable() && spot.getDistanceToElevator() < minDistance) {
                    nearestSpot = spot;
                    minDistance = spot.getDistanceToElevator();
                }
            }
        }
        return nearestSpot;
    }
}
