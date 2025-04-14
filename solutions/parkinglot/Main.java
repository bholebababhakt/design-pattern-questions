package parkinglot;

import parkinglot.Vehicle.Car;
import parkinglot.Vehicle.Vehicle;
import parkinglot.parkingspot.CompactSpot;
import parkinglot.parkingspot.HandicappedSpot;
import parkinglot.parkingspot.LargeSpot;
import parkinglot.parkingspot.ParkingFloor;
import parkinglot.parkingspot.ParkingSpot;
import parkinglot.parkingstrategy.NearestToElevator;
import parkinglot.parkingstrategy.NearestToEntrance;

public class Main {
    public static void main(String[] args) {
        // Initialize ParkingLot (Singleton)
        ParkingLot parkingLot = ParkingLot.getInstance();

        // Add Parking Floors with Spots
        ParkingFloor floor1 = new ParkingFloor(1);
        floor1.addSpot(new CompactSpot(101, 10, 5));
        floor1.addSpot(new LargeSpot(102, 15, 3));
        floor1.addSpot(new HandicappedSpot(103, 5, 2));

        ParkingFloor floor2 = new ParkingFloor(2);
        floor2.addSpot(new CompactSpot(201, 8, 6));
        floor2.addSpot(new LargeSpot(202, 12, 2));
        floor2.addSpot(new HandicappedSpot(203, 7, 4));

        // Add floors to Parking Lot
        parkingLot.addFloor(floor1);
        parkingLot.addFloor(floor2);

        // Display initial parking availability
        System.out.println("🚘 Initial Parking Lot Status:");
        parkingLot.displayAllFloors();

        // Create Vehicle
        Vehicle car = new Car("MH-12-AB-1234");

        // Choose Parking Strategy
        NearestToElevator strategyElevator = new NearestToElevator();
        NearestToEntrance strategyEntrance = new NearestToEntrance();

        // Find and Park using Nearest to Elevator Strategy
        System.out.println("\n🚘 Finding a parking spot (Nearest to Elevator)...");
        ParkingSpot spot1 = parkingLot.findAvailableSpot(car, strategyElevator);
        if (spot1 != null) {
            spot1.assignVehicle(car);
        }

        // Display updated parking lot status
        System.out.println("\n🚘 Updated Parking Lot Status:");
        parkingLot.displayAllFloors();

        // Unpark the vehicle
        System.out.println("\n🚘 Removing Vehicle from Parking Spot...");
        spot1.removeVehicle();

        // Find and Park using Nearest to Entrance Strategy
        System.out.println("\n🚘 Finding a parking spot (Nearest to Entrance)...");
        ParkingSpot spot2 = parkingLot.findAvailableSpot(car, strategyEntrance);
        if (spot2 != null) {
            spot2.assignVehicle(car);
        }

        // Display final parking lot status
        System.out.println("\n🚘 Final Parking Lot Status:");
        parkingLot.displayAllFloors();
    }
}



