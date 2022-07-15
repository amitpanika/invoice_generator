package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;

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
    public int getNumberOfRides(Rides[] rides) {

        return rides.length;
    }
    public double getAvarageRideFare(Rides[] rides) {

        return calculateTotalFare(rides) / rides.length;
    }
    
    public Object generateInvoice(int i, HashMap<Integer, Rides[]> rideRepository) {

        for (Map.Entry<Integer, Rides[]> rideEntry : rideRepository.entrySet()) {
            if (rideEntry.getKey() == i)
                return calculateTotalFare(rideEntry.getValue());
        }

        return null;
    }
}
