package com.lakshay.travelpackageservice.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DestinationTest {

    private Destination destination;
    private List<Activity> activities;

    @BeforeEach
    void setUp() {
        activities = new ArrayList<>(Arrays.asList(
                new Activity("Cycling", "Cycling on beautiful roads", 100.0, 10, null),
                new Activity("Swimming", "Swimming in the sea", 50.0, 20, null)
        ));
        destination = new Destination("Goa", activities);
        activities.forEach(activity -> activity.setDestination(destination));
    }

    @Test
    void testGetName() {
        assertEquals("Goa", destination.getName());
    }

    @Test
    void testGetActivities() {
        assertEquals(activities, destination.getActivities());
    }

    @Test
    void testActivityModification() {
        Activity newActivity = new Activity("Trek", "Mountain Hiking", 30.0, 15, destination);
        assertEquals(2, destination.getActivities().size());
        activities.add(newActivity);
        assertEquals(3, destination.getActivities().size());
    }
}
