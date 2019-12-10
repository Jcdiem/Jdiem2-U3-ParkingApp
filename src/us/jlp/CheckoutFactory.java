package us.jlp;

import java.time.LocalTime;

public class CheckoutFactory { //Really only have this because it's required


    /**
     *
     * @param type The type of checkout you want - not case sensitive
     * @return a checkout based upon the type given
     */
    public static CheckoutStrategy getCheckoutType(String type){
        if(type.equalsIgnoreCase("normal")) return new NormalCheckout();
        if(type.equalsIgnoreCase("event")) return new EventCheckout();
        if(type.equalsIgnoreCase("lost")) return new LostCheckout();

        return null;
    }
}
