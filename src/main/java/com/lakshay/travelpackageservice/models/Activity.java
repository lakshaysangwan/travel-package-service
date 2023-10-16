package com.lakshay.travelpackageservice.models;

import lombok.Data;

@Data
public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private int currentSignupCount;
    private Destination destination;

    public Activity(String name, String description, double cost, int capacity, Destination destination) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.currentSignupCount = 0;
        this.destination = destination; // Initialize the destination field
    }

    public boolean hasSpace() {
        return currentSignupCount < capacity;
    }

    public boolean signup() {
        if (hasSpace()) {
            currentSignupCount++;
            return true;
        }
        return false;
    }

    public int getRemainingCapacity() {
        return capacity - currentSignupCount;
    }
}

