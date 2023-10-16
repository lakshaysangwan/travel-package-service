package com.lakshay.travelpackageservice.models.passenger;

import com.lakshay.travelpackageservice.models.Activity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
public abstract class Passenger {
    protected String name;
    protected int passengerNumber;
    protected List<Activity> signedUpActivities = new ArrayList<>(); // Added field to store signed up activities

    public Passenger(String name, int passengerNumber) {
        this.name = name;
        this.passengerNumber = passengerNumber;
    }

    public abstract boolean signupForActivity(Activity activity);

    public abstract double getBalance();

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Passenger Number: " + passengerNumber);

        // Print balance if applicable
        if (this instanceof StandardPassenger || this instanceof GoldPassenger) {
            System.out.println("Balance: " + getBalance());
        }

        if (signedUpActivities.isEmpty()) {
            System.out.println("No activities signed up.");
            return;
        }

        System.out.println("Activities Signed Up:");
        for (Activity activity : signedUpActivities) {
            System.out.println("  Activity: " + activity.getName());
            System.out.println("    Destination: " + activity.getDestination().getName());
            System.out.println("    Price Paid: " + activity.getCost()); // Modify as needed if price varies by passenger type
        }
    }

    // Added method to add activity to signedUpActivities
    public void addActivity(Activity activity) {
        signedUpActivities.add(activity);
    }
}

