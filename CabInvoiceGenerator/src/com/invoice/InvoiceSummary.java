package com.invoice;

import java.util.Objects;

public class InvoiceSummary {
    public final int noOfRides;
    public final double totalFare;
    public final int userId;
    public final double averageFare;

    public InvoiceSummary(int noOfRides, double totalFare, int userId) {
        this.noOfRides = noOfRides;
        this.totalFare = totalFare;
        this.userId = userId;
        this.averageFare = this.totalFare/this.noOfRides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary summary = (InvoiceSummary) o;
        return noOfRides == summary.noOfRides && Double.compare(summary.totalFare, totalFare) == 0 && userId == summary.userId && Double.compare(summary.averageFare, averageFare) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(noOfRides, totalFare, userId, averageFare);
    }

    @Override
    public String toString() {
        return "Summary{" +
                "noOfRides=" + noOfRides +
                ", totalFare=" + totalFare +
                ", userId=" + userId +
                ", averageFare=" + averageFare +
                '}';
    }
}
