package us.jlp;

import java.time.LocalTime;

public class EventCheckout implements CheckoutStrategy {

    private final int BASECOST = 20;
    GarageEnum garage = GarageEnum.INSTANCE;

    /**
     * @param ticket  the ticket associated with the vehicle
     * @param outTime the time the vehicle left
     * @return Final cost of ticket, with additives
     */
    @Override
    public int reportTicket(CarTicket ticket, LocalTime outTime) {
        garage.addEventTicket(BASECOST);
        return(BASECOST);
    }

    /** Returns the base cost of an event ticket
     * @return the cost of without any additives such as days
     */
    @Override
    public int getBaseCost() {
        return BASECOST;
    }
}
