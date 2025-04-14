package parkinglot.payment;

import parkinglot.ticket.Ticket;

public class FlatRate implements PaymentStrategy {
    private static final double FLAT_RATE = 10.0; // $10 if < 1 hour
    private static final double HOURLY_RATE = 5.0; // $5 per hour if > 1 hour

    @Override
    public double calculateFee(Ticket ticket) {
        int hours = ticket.getHoursParked();
        return (hours < 1) ? FLAT_RATE : hours * HOURLY_RATE;
    }
}
