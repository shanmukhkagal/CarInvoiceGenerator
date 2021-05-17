package com.invoice;

import java.util.List;

public class Ride {
    public  double distance;
    public  int time;
    public  int userId;

    public Ride(double distance, int time, int userId) {
        this.distance = distance;
        this.time = time;
        this.userId = userId;
    }
    List<Ride> rides;

    @Override
    public String toString() {
        return "Ride{" +
                "distance=" + distance +
                ", time=" + time +
                ", userId=" + userId +
                ", rides=" + rides +
                '}';
    }
     public Ride() {
    }
}