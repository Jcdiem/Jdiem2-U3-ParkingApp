package us.jlp;

public class OutputManager {

    //Print parking screen

    /**
     * Outputs the screen for when the customer first arrives
     */
    public void inCustomer(){
        System.out.println("Best value parking garage");
        System.out.println("=========================");
        System.out.println("1 - Check/In");
        System.out.println("2 - Check/Out");
        System.out.println("3 - Close garage");
    }

    /**
     * Outputs the checking in options after the user has chosen to do so after entering
     */
    public void inOptions(){
        System.out.println("Best value parking garage");
        System.out.println("Check/In");
        System.out.println("=========================");
        System.out.println("1 - Ticket");
        System.out.println("2 - Special Event");

    }

    /**
     * Give the options for a user leaving the garage
     */
    public void outCustomer(){
        System.out.println("Best value parking garage");
        System.out.println("=========================");
        System.out.println("1 - Check/Out");
        System.out.println("2 - Lost Ticket");
    }

    /**
     * Present the customer with information on their lost ticket
     *
     * @param id the vehicle's ticket id they lost
     * @param lostCost the cost of a lost ticket
     */
    public void lostTicketCustomer(int id, int lostCost){
        System.out.println("Best value parking garage");
        System.out.println("=========================");
        System.out.println("Receipt for vehicle id "+id);
        System.out.println();
        System.out.println();
        System.out.println("Lost ticket");
        System.out.println("$"+lostCost);
    }

    /**
     * Print out a complete summary of all activity for the garage that day
     *
     *
     * @param cashEarned Total cash earned in the day
     * @param lostCash Total money earned from lost tickets
     * @param normalCash Total money earned from normal tickets
     * @param eventCash Total money earned from event tickets
     * @param checkIns Amount of normal checkins
     * @param ticketsLost Amount of tickets lost
     * @param ticketsEvent Amount of event tickets sold
     */
    public void toDateInfo(int cashEarned, int lostCash, int normalCash, int eventCash, int checkIns, int ticketsLost, int ticketsEvent){
        System.out.println("Best value parking garage");
        System.out.println("=========================");
        System.out.println("    Activity to date     ");
        System.out.println();
        System.out.println("$"+normalCash+" was collected from "+checkIns+" Check Ins");
        System.out.println("$"+lostCash+" was collected from "+ticketsLost+" Lost Tickets");
        System.out.println("$"+eventCash+" was collected from "+ticketsEvent+" Special Events");
        System.out.println();
        System.out.println("$"+cashEarned+" was collected overall");
    }

    /**
     * Print out the receipt for a normal ticket
     *
     * @param inTimeH The time the vehicle entered
     * @param outTimeH The time the vehicle left
     * @param id ID of the vehicle's ticket
     * @param cost Cost of the vehicles stay
     */
    public void normalReceipt(int inTimeH, int outTimeH, int id, int cost){
        int timeDif = outTimeH - inTimeH;
        String inTimeHS;
        String outTimeHS;
        if (inTimeH > 12){ //check if incoming time is pm
            inTimeH -= 12;
            inTimeHS = inTimeH+"pm";
        }
        else inTimeHS = (inTimeH)+"am";
        if(outTimeH > 12){ //Check if outgoing time is pm
            outTimeH -= 12;
            outTimeHS = outTimeH+"pm";
        }
        else outTimeHS = (outTimeH)+"am";
        String sOutput = inTimeHS+" - "+outTimeHS;

        //Pretty text out
        System.out.println("Best value parking garage");
        System.out.println("=========================");
        System.out.println("Receipt for vehicle id "+id);
        System.out.println();
        System.out.println();
        System.out.println(timeDif+" hours parked "+sOutput);
        System.out.println("$"+cost);
    }

    /**
     * Receipt for an event ticket
     *
     * @param id ticket id of the vehicle
     * @param cost how much the vehicle's stay will cost
     */
    public void eventReceipt(int id, int cost){
        //Pretty text out
        System.out.println("Best value parking garage");
        System.out.println("=========================");
        System.out.println("Receipt for vehicle id "+id);
        System.out.println();
        System.out.println();
        System.out.println("Special Event");
        System.out.println("$"+cost);
    }

    /**
     * Outputs a lost ticket with extra info letting the user know their stupidity cost them money
     *
     * currently unused
     *
     * @param lostCost cost of a lost ticket
     */
    public void noTicketCustomer(int lostCost){//TODO: Let the user know why they're randomly getting a lost ticket receipt
        System.out.println("Best value parking garage");
        System.out.println("=========================");
        System.out.println("ERROR: No ticket entered");
        System.out.println("Assuming ticket is lost");
        System.out.println();
        System.out.println("Lost ticket");
        System.out.println("$"+lostCost);
        System.out.println("Enjoy your day.");
    }
}
