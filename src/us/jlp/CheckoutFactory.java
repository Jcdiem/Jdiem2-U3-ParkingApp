package us.jlp;

public class CheckoutFactory { //Really only have this because it's required by project rubric


    /**
     * Creates a checkout based upon the supplied type, non case sensitive
     * currently supported types are normal, event, and lost
     *
     * @param type The type of checkout you want - not case sensitive
     * @return a checkout based upon the type given
     */
    public static CheckoutStrategy createCheckout(String type){
        if(type.equalsIgnoreCase("normal")) return new NormalCheckout();
        if(type.equalsIgnoreCase("event")) return new EventCheckout();
        if(type.equalsIgnoreCase("lost")) return new LostCheckout();

        return null;
    }
}
