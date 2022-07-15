package com.bridgelabz;

public class InvoiceGenerator {
    public static void main(String[] args) {
        System.out.println("Welcome to cab invoice generator");
    }
    public double generateInvoice(Rides ride) {
        double fare = 10 * ride.distance + ride.time;

        return fare > 5 ? fare : 5;
    }
    public double calculateTotalFare(Rides[] rides) {
        double totalFare = 0;
        for (Rides ride : rides) {
            totalFare += this.generateInvoice(ride);
        }
        return totalFare;
    }
}
