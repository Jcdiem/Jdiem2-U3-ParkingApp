package us.jlp.test;
//TODO: Fix IntelliJ thinking this directory is a package so I can stop adding 9001 imports
import org.junit.jupiter.api.Test;
import us.jlp.CarTicket;
import us.jlp.CheckoutStrategy;
import us.jlp.NormalCheckout;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NormalCheckoutTest {

    @Test
    void reportTicketThreeHour() {//TEST 1 - The first 3 hours
        CarTicket testTicket = new CarTicket(3,LocalTime.of(17,59,59));
        CheckoutStrategy checkoutTest = new NormalCheckout();

        int reportedPrice = checkoutTest.reportTicket(testTicket,LocalTime.of(20,59,59)); //3 hours, so price should be BASECOST according to formula
        int expectedPrice = checkoutTest.getBaseCost(); //For easier reading
        assertEquals(expectedPrice,reportedPrice,"first 3 hours are not BASECOST like they should be, got "+reportedPrice+" from  method call instead of "+checkoutTest.getBaseCost());
    }

    @Test
    void reportTicketThreePlusHour() { //TEST 2 - Adding time afterwards
        CarTicket testTicket = new CarTicket(3,LocalTime.of(17,59,59));
        CheckoutStrategy checkoutTest = new NormalCheckout();

        int reportedPrice = checkoutTest.reportTicket(testTicket,LocalTime.of(23,59,59));
        int expectedPrice = checkoutTest.getBaseCost()+3; //The expected price should be the BASECOST (first three hours gets you to 20) + 3 dollars for another 3 hours
        assertEquals(expectedPrice,reportedPrice,"Hours after first 3 did not calculate correctly, got "+reportedPrice+" from  method call instead of "+checkoutTest.getBaseCost());
    }

    //Not adding a test for getters of finals
}