package us.jlp;

import java.time.LocalTime;

public class NormalCheckout implements CheckoutStrategy {
    private final int BASECOST = 5;
    GarageEnum garage = GarageEnum.INSTANCE;

    @Override
    public int reportTicket(CarTicket ticket, LocalTime outTime) {
        int thisCost = BASECOST;
        thisCost += (ticket.getDifference(outTime))-1;
        garage.addNormalTicket(thisCost);
        return(thisCost);
    }

    @Override
    public int getBaseCost() {
        return BASECOST;
    }
}
