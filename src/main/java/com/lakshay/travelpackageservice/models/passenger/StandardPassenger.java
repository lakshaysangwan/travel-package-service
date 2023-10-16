package com.lakshay.travelpackageservice.models.passenger;

import com.lakshay.travelpackageservice.models.Activity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class StandardPassenger extends Passenger {
    private double balance;

    public StandardPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber);
        this.balance = balance;
    }

    @Override
    public boolean signupForActivity(Activity activity) {
        if (activity.getCost() <= balance && activity.hasSpace()) {
            balance -= activity.getCost();
            activity.signup();
            this.addActivity(activity);
            return true;
        }
        return false;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

