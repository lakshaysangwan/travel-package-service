package com.lakshay.travelpackageservice.models.passenger;

import com.lakshay.travelpackageservice.models.Activity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PremiumPassenger extends Passenger {

    public PremiumPassenger(String name, int passengerNumber) {
        super(name, passengerNumber);
    }

    @Override
    public boolean signupForActivity(Activity activity) {
        if (activity.hasSpace()) {
            activity.signup();
            this.addActivity(activity);
            return true;
        }
        return false;
    }

    @Override
    public double getBalance() {
        return 0;  // Premium passengers can sign up for free, so balance is not applicable.
    }
}

