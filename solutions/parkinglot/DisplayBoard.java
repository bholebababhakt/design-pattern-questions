package parkinglot;

import parkinglot.parkingspot.ParkingSpot;

import java.util.List;


public class DisplayBoard {
    private List<ParkingSpot> availableSpots;

    public void updateAvailableSpots(List<ParkingSpot> spots) {
        this.availableSpots = spots.stream().filter(ParkingSpot::isAvailable).toList();
    }

    public void showAvailableSpots() {
        for (ParkingSpot spot : availableSpots) {
            System.out.println("Spot ID: " + spot.getId() +
                    ", Distance to Elevator: " + spot.getDistanceToElevator());
        }
    }
}
