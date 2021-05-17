package com.invoice;


public class InvoiceGenerator {

    private static final double MINIMUM_COST_PER_KM = 10.0;
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_FARE = 5.0;
    private static final double MINIMUM_COST_PER_KM_PREMIUM = 15.0;
    private static final int COST_PER_TIME_PREMIUM = 2;
    private static final double MINIMUM_FARE_PREMIUM = 20.0;


    public double totalFare(double distance, int time) {
        double totalFare = distance * MINIMUM_COST_PER_KM + time * COST_PER_TIME;
        if (totalFare < MINIMUM_FARE) {
            return MINIMUM_FARE;
        } else {
            return totalFare;
        }
    }

    public double totalFare(Ride[] rides) {
        double totalFares = 0;
        for (Ride ride : rides) {
            totalFares += this.totalFare(ride.distance, ride.time);
        }
        return totalFares;

    }

    public InvoiceSummary totalFares(Ride[] rides) {
        double totalFares = 0;
        for (Ride ride : rides) {
            totalFares += this.totalFare(ride.distance, ride.time);
        }
        return new InvoiceSummary(rides.length, totalFares, 1);
    }

    public void addingRide() {

    }

    public double ridesType(String ride_type, int distance, int time) {
        if (ride_type.equals("NormalRide")) {
            double totalFare = distance * MINIMUM_COST_PER_KM + time * COST_PER_TIME;
            if (totalFare < MINIMUM_FARE) {
                return totalFare;
            } else if (ride_type.equals("PremiumRide")) {
                double totalfare = distance * MINIMUM_COST_PER_KM_PREMIUM + time * COST_PER_TIME_PREMIUM;
                if (totalfare < MINIMUM_FARE_PREMIUM) {

                }
                return totalfare;
            }
        }
		return time;
    }
}
