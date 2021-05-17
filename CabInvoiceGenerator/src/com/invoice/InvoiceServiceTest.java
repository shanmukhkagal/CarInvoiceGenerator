package com.invoice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class InvoiceServiceTest {
    InvoiceGenerator invoiceGenrator = null;

    @Before
    public void setUp() throws Exception {
        invoiceGenrator = new InvoiceGenerator();
    }

    /**
     * calculate total fare ......
     */
    @Test
    public void givenDistanceAndTime_ShouldReturn_TotalFare() {
       int time = 5;
       double distance = 2.0;
      double fare  =  invoiceGenrator.totalFare(distance,time);
        Assert.assertEquals(25,fare,0.0);
    }

    /**
     * given less distance and time should return mimimum fare.....
     */
    @Test
    public void givenLessDistanceAndTime_ShouldReturnMinFare() {
        int time = 1;
        double distance = 0.1;
        double fare  =  invoiceGenrator.totalFare(distance,time);
        Assert.assertEquals(5,fare,0.0);
    }

    /**
     * invoice genrator should now take in multiple rides,and calculate aggregate total for all..
     */
    @Test
    public void givenMultipleRides_ShouldReturnTotalAggregate() {
        Ride[] rides = {new Ride(2.0, 5,1),
                                            new Ride(0.1,1,1)
        };
        double fare = invoiceGenrator.totalFare(rides);
        Assert.assertEquals(30,fare,0.0);
    }

    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummary() {
        Ride[] rides = {new Ride(2.0, 5,1),
                new Ride(0.1,1,1)
        };
        Summary  summary =  invoiceGenrator.totalFares(rides);
        Summary summary1 = new Summary(2, 30.0,1);
        Assert.assertEquals(summary1,summary);
    }

    @Test
    public void givenUserId_getsListOfRides_ShouldReturnInvoice() {
        Ride[] rides = {new Ride(2.0, 5,1),new Ride(4,6,2)
        };
       RideRepositoryImpl rideRepository = new RideRepositoryImpl();
        Summary  summary =  invoiceGenrator.totalFares(rides);
        Assert.assertEquals(71,summary.totalFare,0.0);
        Assert.assertEquals(1,summary.userId,0.0);
    }
    /**
     * premium rides and normal rides.
     */
    @Test
    public void normalRideAndPremiumRide_ReturnBonus() {
        double normalRide = invoiceGenrator.ridesType("NormalRide", 1, 6);
        Assert.assertEquals(5,normalRide,0.0);


    }
}
