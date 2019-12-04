package us.jlp;

import java.time.LocalTime;

public class LostCheckout implements CheckoutStrategy {


    private final int BASECOST = 25;
    GarageEnum garage = GarageEnum.INSTANCE;

    @Override
    public int reportTicket(CarTicket ticket, LocalTime outTime) {
        garage.addLostTicket(BASECOST);
        return(BASECOST);
    }
    @Override
    public int getBaseCost() {
        return BASECOST;
    }
}
