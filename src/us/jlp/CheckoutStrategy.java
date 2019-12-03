package us.jlp;

import java.time.LocalTime;

public interface CheckoutStrategy {
    public int reportTicket(CarTicket ticket, LocalTime outTime); //TODO: Find a workaround for unneeded inputs
    public int getBaseCost();
}
