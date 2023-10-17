package com.lakshay.travelpackageservice.models.passenger;

import com.lakshay.travelpackageservice.models.Activity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class StandardPassengerTest {

    private Activity mockActivity;
    private StandardPassenger standardPassenger;

    @BeforeEach
    public void setup() {
        mockActivity = Mockito.mock(Activity.class);
        standardPassenger = new StandardPassenger("Lakshay Sangwan", 1, 200.0);
    }

    @Test
    public void testSignupForActivitySuccess() {
        Mockito.when(mockActivity.getCost()).thenReturn(100.0);
        Mockito.when(mockActivity.hasSpace()).thenReturn(true);
        boolean result = standardPassenger.signupForActivity(mockActivity);
        assertTrue(result);
        assertEquals(100.0, standardPassenger.getBalance());
    }

    @Test
    public void testSignupForActivityInsufficientBalance() {
        Mockito.when(mockActivity.getCost()).thenReturn(300.0);
        Mockito.when(mockActivity.hasSpace()).thenReturn(true);
        boolean result = standardPassenger.signupForActivity(mockActivity);
        assertFalse(result);
        assertEquals(200.0, standardPassenger.getBalance());
    }

    @Test
    public void testSignupForActivityNoSpace() {
        Mockito.when(mockActivity.getCost()).thenReturn(100.0);
        Mockito.when(mockActivity.hasSpace()).thenReturn(false);
        boolean result = standardPassenger.signupForActivity(mockActivity);
        assertFalse(result);
        assertEquals(200.0, standardPassenger.getBalance());
    }
}
