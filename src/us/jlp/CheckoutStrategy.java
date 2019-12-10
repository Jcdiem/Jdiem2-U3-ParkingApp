package us.jlp;

import java.time.LocalTime;

public interface CheckoutStrategy {
    /**
     * Standard method to force all strategies to have a reporting type that the main class can use
     *
     *
     * @param ticket the ticket associated with the vehicle
     * @param outTime the time the vehicle left
     * @return Returns an int, which is intended to be the cost of the ticket after all additives
     */
    int reportTicket(CarTicket ticket, LocalTime outTime); //Force all tickets to use OutTime so that it can be documented for later use by garage

    /**
     * Returns the base cost of a checkout type
     * @return the base cost of that checkout style
     */
    int getBaseCost();
}
