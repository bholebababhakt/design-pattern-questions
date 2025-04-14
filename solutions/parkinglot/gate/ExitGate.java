package parkinglot.gate;

import parkinglot.ParkingLot;
import parkinglot.payment.PaymentStrategy;
import parkinglot.ticket.Ticket;


public class ExitGate {
    private ParkingLot parkingLot;

    public ExitGate(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public void processExit(String ticketId, PaymentStrategy paymentStrategy) {
        Ticket ticket = parkingLot.getTicket(ticketId);

        if (ticket == null) {
            System.out.println("Invalid ticket! Please check again.");
            return;
        }

        double amount = paymentStrategy.calculateFee(ticket);
        System.out.println("Payment of $" + amount + " received for Ticket ID: " + ticketId);

        ticket.getParkingSpot().removeVehicle();
        parkingLot.removeTicket(ticketId);
        System.out.println("Exit complete. Have a great day!");
    }
}
