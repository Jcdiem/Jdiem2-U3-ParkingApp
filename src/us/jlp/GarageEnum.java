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
    public int getTotalCash() {
        return totalCash;
    }

    public int getLostCash() {
        return lostCash;
    }

    public int getLostTickets() {
        return lostTickets;
    }

    public int getNormalCash() {
        return normalCash;
    }

    public int getNormalTickets() {
        return normalTickets;
    }

    public int getEventCash() {
        return eventCash;
    }

    public int getEventTickets() {
        return eventTickets;
    }


    //Setters
    public void addLostTicket(int price){
        totalCash+=price;
        lostCash+=price;
        lostTickets++;
    }
    public void addNormalTicket(int price){
        totalCash+=price;
        normalCash+=price;
        normalTickets++;
    }
    public void addEventTicket(int price){
        totalCash+=price;
        eventCash+=price;
        eventTickets++;
    }

}
