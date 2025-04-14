package parkinglot.parkingstrategy;

import parkinglot.ParkingLot;
import parkinglot.Vehicle.Vehicle;
import parkinglot.parkingspot.ParkingFloor;
import parkinglot.parkingspot.ParkingSpot;

public class NearestToEntrance implements ParkingStrategy{
    @Override
    public ParkingSpot findSpot(ParkingLot lot, Vehicle vehicle) {
        ParkingSpot nearestSpot = null;
        int minDistance = Integer.MAX_VALUE;

        for (ParkingFloor floor : lot.getFloors()) {
            for (ParkingSpot spot : floor.getAvailableSpots(vehicle)) {
                if (spot.isAvailable() && spot.getDistanceToEntrance() < minDistance) {
                    nearestSpot = spot;
                    minDistance = spot.getDistanceToEntrance();
                }
            }
        }
        return nearestSpot;
    }
}
