package com.lakshay.travelpackageservice.models.passenger;

import com.lakshay.travelpackageservice.models.Activity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class PremiumPassengerTest {

    private Activity mockActivity;
    private PremiumPassenger premiumPassenger;

    @BeforeEach
    public void setup() {
        mockActivity = Mockito.mock(Activity.class);

        // Set initial passenger state
        premiumPassenger = new PremiumPassenger("Lakshay Sangwan", 2);
    }

    @Test
    public void testSignupForActivitySuccess() {
        Mockito.when(mockActivity.hasSpace()).thenReturn(true);
        boolean result = premiumPassenger.signupForActivity(mockActivity);
        assertTrue(result);
        assertEquals(0.0, premiumPassenger.getBalance());
    }

    @Test
    public void testSignupForActivityNoSpace() {
        Mockito.when(mockActivity.hasSpace()).thenReturn(false);
        boolean result = premiumPassenger.signupForActivity(mockActivity);
        assertFalse(result);
    }
}