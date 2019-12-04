package us.jlp;

import java.time.LocalTime;

public interface CheckoutStrategy {
    /**
     * Standard method to force all strategies to have a reporting type that the main class can use
     *
     *
     * @param ticket the ticket associated with the vehicle
     * @param outTime the time the vehicle left
     * @return
     */
    public int reportTicket(CarTicket ticket, LocalTime outTime); //TODO: Find a workaround for unneeded inputs

    /**
     * Returns the base cost of a checkout type
     * @return the base cost of that checkout style
     */
    public int getBaseCost();
}
