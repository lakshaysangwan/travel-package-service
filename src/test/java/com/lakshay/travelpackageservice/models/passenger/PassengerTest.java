package com.lakshay.travelpackageservice.models.passenger;

import com.lakshay.travelpackageservice.models.Activity;
import com.lakshay.travelpackageservice.models.Destination;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

class PassengerTest {

    private Activity activity;
    private MockPassenger passenger;

    @BeforeEach
    void setUp() {
        Destination destination = Mockito.mock(Destination.class);
        activity = Mockito.mock(Activity.class);
        when(activity.getDestination()).thenReturn(destination);
        when(activity.getName()).thenReturn("Swimming");
        when(activity.getCost()).thenReturn(50.0);

        passenger = new MockPassenger("John", 1);
    }

    @Test
    void signupForActivityTest() {
        assertTrue(passenger.signupForActivity(activity));
        List<Activity> signedUpActivities = passenger.getSignedUpActivities();
        assertTrue(signedUpActivities.contains(activity));
    }

    @Test
    void getBalanceTest() {
        assertEquals(0.0, passenger.getBalance(), 0.001);
    }

    @Test
    void addActivityTest() {
        passenger.addActivity(activity);
        List<Activity> signedUpActivities = passenger.getSignedUpActivities();
        assertTrue(signedUpActivities.contains(activity));
    }

    // Mock concrete implementation for testing abstract class
    private static class MockPassenger extends Passenger {

        public MockPassenger(String name, int passengerNumber) {
            super(name, passengerNumber);
        }

        @Override
        public boolean signupForActivity(Activity activity) {
            addActivity(activity);
            return true;
        }

        @Override
        public double getBalance() {
            return 0.0;
        }
    }
}