package parkinglot.ticket;

import parkinglot.Vehicle.Vehicle;
import parkinglot.parkingspot.ParkingSpot;

import java.util.UUID;

public class Ticket {
    private String ticketId;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private long entryTime;

    public Ticket(Vehicle vehicle, ParkingSpot spot) {
        this.ticketId = UUID.randomUUID().toString();
        this.vehicle = vehicle;
        this.parkingSpot = spot;
        this.entryTime = System.currentTimeMillis();
    }

    public String getTicketId() {
        return ticketId;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
    public int getHoursParked(){
        return (int)(System.currentTimeMillis()- entryTime)/(60*60*1000);
    }
}
