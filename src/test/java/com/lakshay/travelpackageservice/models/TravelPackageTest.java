package com.lakshay.travelpackageservice.models;

import com.lakshay.travelpackageservice.models.passenger.Passenger;
import com.lakshay.travelpackageservice.models.passenger.StandardPassenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TravelPackageTest {

    private TravelPackage travelPackage;

    @BeforeEach
    void setUp() {
        List<Activity> activities = Arrays.asList(new Activity("Skiing", "Snow Skiing", 50.0, 10, null),
                new Activity("Swimming", "Ocean Swim", 20.0, 20, null));

        List<Destination> destinations = Arrays.asList(new Destination("Kashmir", activities),
                new Destination("Goa", activities));

        travelPackage = new TravelPackage("Winter Trip", 2, destinations);
    }

    @Test
    void addPassenger() {
        Passenger passenger1 = new StandardPassenger("Lakshay", 1, 500.0);
        assertTrue(travelPackage.addPassenger(passenger1));

        Passenger passenger2 = new StandardPassenger("Ayush", 2, 400.0);
        assertTrue(travelPackage.addPassenger(passenger2));

        Passenger passenger3 = new StandardPassenger("Ritik", 3, 300.0);
        assertFalse(travelPackage.addPassenger(passenger3)); // Should fail, as max capacity is 2.
    }

    @Test
    void printPassengerList() {
        Passenger passenger1 = new StandardPassenger("Kamlesh", 1, 500.0);
        travelPackage.addPassenger(passenger1);
        travelPackage.printPassengerList();
    }

    @Test
    void printItinerary() {
        travelPackage.printItinerary();
    }

    @Test
    void printAvailableActivities() {
        travelPackage.printAvailableActivities();
    }
}