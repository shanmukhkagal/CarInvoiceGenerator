package com.invoice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RideRepositoryImpl implements  RideRepository {
    Ride ride = new Ride();
    List<Ride> rides;
    Map<String, List<Ride>> listMap = new HashMap<>();

    @Override
    public void addRide(List<Ride> rides) {
        listMap.put("ride",rides);
    }

    @Override
    public List<Ride> getRide(int userId) {
       return rides;
    }

}
