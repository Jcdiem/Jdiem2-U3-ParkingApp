package us.jlp.test;

import org.junit.jupiter.api.Test;
import us.jlp.CarTicket;
import us.jlp.CheckoutStrategy;
import us.jlp.LostCheckout;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class LostCheckoutTest {

    @Test
    void reportTicket() {
        CarTicket testTicket = new CarTicket(3, LocalTime.of(17,59,59));
        CheckoutStrategy checkoutTest = new LostCheckout();

        int reportedCost = checkoutTest.reportTicket(testTicket,LocalTime.now()); //Flat rate, so out time doesn't matter aside from documentation, which isn't tested here
        int expectedCost = checkoutTest.getBaseCost();
        assertEquals(expectedCost,reportedCost,"Flat rate failed, should be "+expectedCost+" according to BASECOST, but got "+reportedCost);
    }

    //Not adding a test for getters of finals
}