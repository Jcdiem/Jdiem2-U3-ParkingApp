package us.jlp;

public enum GarageEnum { //Everyone needs a singleton in their life.

    INSTANCE;
    //Can use an int for cash since we are not handling change
    private int totalCash; //total earned
    private int lostCash; //Number of tickets lost
    private int lostTickets; //Number of tickets lost
    private int normalCash; //Cash from time parked
    private int normalTickets; // Number of checkins
    private int eventCash; //Cash from events
    private int eventTickets; //Number of tickets from events

    private GarageEnum(){
        totalCash = 0;
        lostCash = 0;
        lostTickets = 0;
        normalCash = 0;
        normalTickets = 0;
        eventCash = 0;
        eventTickets = 0;
    }

    //GETTERS
    /**
     * Getter for the total money earned from all ticket types
     * @return totaled income
     */
    public int getTotalCash() {
        return totalCash;
    }
    /**
     * Getter for the total money earned from lost tickets
     * @return income form lost tickets
     */
    public int getLostCash() {
        return lostCash;
    }
    /**
     * Getter for the number of tickets lost
     * @return number of lost ticket penalties
     */
    public int getLostTickets() {
        return lostTickets;
    }
    /**
     * Getter for the total money earned from normal tickets
     * @return income form normal tickets
     */
    public int getNormalCash() {
        return normalCash;
    }
    /**
     * Getter for the number of normal tickets
     * @return number of normal tickets sold
     */
    public int getNormalTickets() {
        return normalTickets;
    }
    /**
     * Getter for the total money earned from event tickets
     * @return income form event tickets
     */
    public int getEventCash() {
        return eventCash;
    }

    /**
     * Getter for the number of event tickets
     * @return number of event tickets sold
     */
    public int getEventTickets() {
        return eventTickets;
    }


    //Setters
    /**
     * Adds the cost of a lost ticket to the total money earned as well as amount of that ticket type
     *
     * @param price Cost of an event ticket
     */
    public void addLostTicket(int price){
        totalCash+=price;
        lostCash+=price;
        lostTickets++;
    }
    /**
     * Adds the cost of a normal ticket to the total money earned as well as amount of that ticket type
     *
     * @param price Cost of an event ticket
     */
    public void addNormalTicket(int price){
        totalCash+=price;
        normalCash+=price;
        normalTickets++;
    }

    /**
     * Adds the cost of an event ticket to the total money earned as well as amount of that ticket type
     *
     * @param price Cost of an event ticket
     */
    public void addEventTicket(int price){
        totalCash+=price;
        eventCash+=price;
        eventTickets++;
    }

}
