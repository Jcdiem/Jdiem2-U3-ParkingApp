package us.jlp;

import java.time.LocalTime;

public class NormalCheckout implements CheckoutStrategy {
    private final int BASECOST = 5;
    private GarageEnum garage = GarageEnum.INSTANCE;

    /**
     * @param ticket  the ticket associated with the vehicle
     * @param outTime the time the vehicle left
     * @return final cost of ticket with additives
     */
    @Override
    public int reportTicket(CarTicket ticket, LocalTime outTime) {
        int thisCost = BASECOST;
        if(ticket.getDifference(outTime) >= 3) {
            thisCost += (ticket.getDifference(outTime)) - 3; //Subtract the free 3 hours when calculating cost
        }
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
