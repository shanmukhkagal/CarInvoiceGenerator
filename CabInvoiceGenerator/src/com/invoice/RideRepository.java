package com.invoice;

import java.util.List;

public interface RideRepository {
    public void addRide(List<Ride> rides);
    public List<Ride> getRide(int userId);
}
