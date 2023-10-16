package com.lakshay.travelpackageservice.models.passenger;

import com.lakshay.travelpackageservice.models.Activity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class GoldPassenger extends Passenger {
    private double balance;

    public GoldPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber);
        this.balance = balance;
    }

    @Override
    public boolean signupForActivity(Activity activity) {
        double discountedCost = activity.getCost() * 0.9;
        if (discountedCost <= balance && activity.hasSpace()) {
            balance -= discountedCost;
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

