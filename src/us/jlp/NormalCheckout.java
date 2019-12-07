package us.jlp;

import java.time.LocalTime;

public class NormalCheckout implements CheckoutStrategy {
    private final int BASECOST = 5;
    GarageEnum garage = GarageEnum.INSTANCE;

    /**
     * @param ticket  the ticket associated with the vehicle
     * @param outTime the time the vehicle left
     * @return
     */
    @Override
    public int reportTicket(CarTicket ticket, LocalTime outTime) {
        int thisCost = BASECOST;
        thisCost += (ticket.getDifference(outTime))-1;
        garage.addNormalTicket(thisCost);
        return(thisCost);
    }

    /**
     * @return Base cost without any additives such as days
     */
    @Override
    public int getBaseCost() {
        return BASECOST;
    }
}
