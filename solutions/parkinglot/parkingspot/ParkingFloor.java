package parkinglot.parkingspot;

import parkinglot.DisplayBoard;
import parkinglot.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    private int floorNumber;
    private List<ParkingSpot> spots;
    private DisplayBoard displayBoard;



    public ParkingFloor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.spots = new ArrayList<>();
        this.displayBoard = new DisplayBoard();
    }

    public void addSpot(ParkingSpot spot) {
        spots.add(spot);
        displayBoard.updateAvailableSpots(spots);
    }
    public List<ParkingSpot> getAvailableSpots(Vehicle vehicle) {
        List<ParkingSpot> availableSpots = new ArrayList<>();
        for (ParkingSpot spot : spots) {
            if (spot.isAvailable() && spot.canFitVehicle(vehicle)) {
                availableSpots.add(spot);
            }
        }
        return availableSpots;
    }

    public void displayAvailableSpots() {
        System.out.println("Floor " + floorNumber + " Available Spots:");
        displayBoard.showAvailableSpots();
    }
}
