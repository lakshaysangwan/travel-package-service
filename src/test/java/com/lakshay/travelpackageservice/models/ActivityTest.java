package com.lakshay.travelpackageservice.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActivityTest {

    private Activity activity;
    private Destination destination;

    @BeforeEach
    void setUp() {
        destination = new Destination("Beach", null);
        activity = new Activity("Swimming", "Swim in the sea", 50.0, 5, destination);
    }

    @Test
    void hasSpaceTest() {
        assertTrue(activity.hasSpace());
        activity.setCurrentSignupCount(5);
        assertFalse(activity.hasSpace());
    }

    @Test
    void signupTest() {
        assertTrue(activity.signup());
        activity.setCurrentSignupCount(4);
        assertTrue(activity.signup());
        assertFalse(activity.signup());
    }

    @Test
    void getRemainingCapacityTest() {
        assertEquals(5, activity.getRemainingCapacity());
        activity.setCurrentSignupCount(2);
        assertEquals(3, activity.getRemainingCapacity());
    }

    @Test
    void testGetters() {
        assertEquals("Swimming", activity.getName());
        assertEquals("Swim in the sea", activity.getDescription());
        assertEquals(50.0, activity.getCost());
        assertEquals(5, activity.getCapacity());
        assertEquals(destination, activity.getDestination());
    }
}