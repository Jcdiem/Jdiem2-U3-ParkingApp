package us.jlp;

import java.time.LocalTime;

public class EventCheckout implements CheckoutStrategy {

    private final int BASECOST = 20;
    GarageEnum garage = GarageEnum.INSTANCE;

    @Override
    public int reportTicket(CarTicket ticket, LocalTime outTime) {
        garage.addEventTicket(BASECOST);
        return(BASECOST);
    }
    @Override
    public int getBaseCost() {
        return BASECOST;
    }
}
