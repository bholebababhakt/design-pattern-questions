package parkinglot;

import parkinglot.Vehicle.Vehicle;
import parkinglot.parkingspot.ParkingFloor;
import parkinglot.parkingspot.ParkingSpot;
import parkinglot.parkingstrategy.ParkingStrategy;
import parkinglot.ticket.Ticket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {
    private static ParkingLot instance;
    private List<ParkingFloor> floors;
    private Map<String, Ticket> activeTickets;

    private ParkingLot() { // No arguments
        this.floors = new ArrayList<>();
        this.activeTickets = new HashMap<>();
    }

    public static synchronized ParkingLot getInstance() {
        if (instance == null) {
            instance = new ParkingLot();
        }
        return instance;
    }

    public Ticket getTicket(String ticketId) {
        return activeTickets.get(ticketId);
    }

    public void addFloor(ParkingFloor floor) {
        floors.add(floor);
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public ParkingSpot findAvailableSpot(Vehicle vehicle, ParkingStrategy strategy) {
        return strategy.findSpot(this, vehicle);
    }

    public void displayAllFloors() {
        for (ParkingFloor floor : floors) {
            floor.displayAvailableSpots();
        }
    }

    public void removeTicket(String ticketId) {
        activeTickets.remove(ticketId);
    }

    public void storeTicket(Ticket ticket) {
        activeTickets.put(ticket.getTicketId(), ticket);
    }
}
