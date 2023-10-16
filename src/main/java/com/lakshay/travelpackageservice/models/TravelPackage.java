package com.lakshay.travelpackageservice.models;

import com.lakshay.travelpackageservice.models.passenger.Passenger;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> itinerary;
    private List<Passenger> passengers;

    public TravelPackage(String name, int passengerCapacity, List<Destination> itinerary) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = itinerary;
        this.passengers = new ArrayList<>();
    }

    public boolean addPassenger(Passenger passenger) {
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
            return true;
        } else {
            return false;
        }
    }

    public void printPassengerList() {
        System.out.println("Package Name: " + name);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers Currently Enrolled: " + passengers.size());

        if (passengers.isEmpty()) {
            System.out.println("No passengers have enrolled yet.");
            return;
        }

        System.out.println("List of Passengers:");
        for (Passenger passenger : passengers) {
            System.out.println("  Name: " + passenger.getName());
            System.out.println("  Passenger Number: " + passenger.getPassengerNumber());
        }
    }

    public void printItinerary() {
        System.out.println("Travel Package Name: " + name);

        for (Destination destination : itinerary) {
            System.out.println("Destination: " + destination.getName());

            List<Activity> activities = destination.getActivities();
            if (activities.isEmpty()) {
                System.out.println("  No activities available.");
                continue;
            }

            for (Activity activity : activities) {
                System.out.println("  Activity: " + activity.getName());
                System.out.println("    Cost: " + activity.getCost());
                System.out.println("    Capacity: " + activity.getRemainingCapacity());
                System.out.println("    Description: " + activity.getDescription());
            }
        }
    }

    public void printAvailableActivities() {
        System.out.println("Activities with Spaces Available:");

        for (Destination destination : itinerary) {
            System.out.println("Destination: " + destination.getName());

            for (Activity activity : destination.getActivities()) {
                if (activity.hasSpace()) {
                    System.out.println("  Activity: " + activity.getName());
                    System.out.println("    Description: " + activity.getDescription());
                    System.out.println("    Cost: " + activity.getCost());
                    System.out.println("    Remaining Capacity: " + activity.getRemainingCapacity());
                }
            }
        }
    }
}

