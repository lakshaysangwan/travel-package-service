package com.lakshay.travelpackageservice.models;

import lombok.Data;

import java.util.List;

@Data
public class Destination {
    private String name;
    private List<Activity> activities;

    public Destination(String name, List<Activity> activities) {
        this.name = name;
        this.activities = activities;
    }

}

