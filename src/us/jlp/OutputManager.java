package us.jlp;

public class OutputManager {

    //Print parking screen
    public void inCustomer(){
        System.out.println("Best value parking garage");
        System.out.println("=========================");
        System.out.println("1 - Check/In");
        System.out.println("2 - Check/Out");
        System.out.println("3 - Close garage");
    }
    public void inOptions(){
        System.out.println("Best value parking garage");
        System.out.println("Check/In");
        System.out.println("=========================");
        System.out.println("1 - Ticket");
        System.out.println("2 - Special Event");

    }
    //Print leaving screen
    public void outCustomer(){
        System.out.println("Best value parking garage");
        System.out.println("=========================");
        System.out.println("1 - Check/Out");
        System.out.println("2 - Lost Ticket");
    }
    //Print lost ticket screen
    public void lostTicketCustomer(int id, int lostCost){
        System.out.println("Best value parking garage");
        System.out.println("=========================");
        System.out.println("Receipt for vehicle id "+id);
        System.out.println();
        System.out.println();
        System.out.println("Lost ticket");
        System.out.println("$"+lostCost);
    }
    //Print toDate output
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
    public void normalReceipt(int inTimeH, int outTimeH, int id, int cost){
        int timeDif = outTimeH - inTimeH;
        String inTimeHS;
        String outTimeHS;
        if (inTimeH > 12){ //check if it is pm
            inTimeH -= 12;
            inTimeHS = inTimeH+"pm";
        }
        else inTimeHS = (inTimeH)+"am";
        if(outTimeH > 12){ //Check if it is pm
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
