package parkinglot.payment;

import parkinglot.ticket.Ticket;

public interface PaymentStrategy {
    double calculateFee(Ticket ticket);
}
