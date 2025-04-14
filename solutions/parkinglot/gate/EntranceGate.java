package parkinglot.gate;

import parkinglot.ParkingLot;
import parkinglot.Vehicle.Vehicle;
import parkinglot.parkingspot.ParkingSpot;
import parkinglot.parkingstrategy.ParkingStrategy;
import parkinglot.ticket.Ticket;

import java.util.UUID;

public class EntranceGate {
    private ParkingLot parkingLot;

    public EntranceGate(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public Ticket issueTicket(Vehicle vehicle, ParkingSpot spot) {
        if (spot == null) {
            System.out.println("No available spots for your vehicle.");
            return null;
        }

        spot.assignVehicle(vehicle);
        Ticket ticket = new Ticket(vehicle, spot);
        parkingLot.storeTicket(ticket);
        System.out.println("Ticket Issued: " + ticket.getTicketId());
        return ticket;
    }
}
