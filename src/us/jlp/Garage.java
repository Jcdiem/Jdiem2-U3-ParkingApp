package us.jlp;

import java.sql.SQLOutput;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

//Helper class to keep text outputs out of the way
public class Garage {
    static final int LOSTCOST = 25;
    static final int COSTCAP = 15;

    List<CarTicket> ticketList = new ArrayList<CarTicket>();
    //Can use an int for cash since we are not handling change
    int cashEarned = 0;
    int checkIns = 0;
    int ticketsLost = 0;

    public Garage (){
        System.out.println("Best value parking garage");
        System.out.println("=========================");
        System.out.println("    Activity to date     ");
        System.out.println();
        System.out.println("ACTIVITY HERE");
    }
    //Print parking screen
    public void inCustomer(){
        System.out.println("Best value parking garage");
        System.out.println("=========================");
        System.out.println("1 - Check/In");
        System.out.println("2 - Close garage");
    }
    //Print leaving screen
    public void outCustomer(){
        System.out.println("Best value parking garage");
        System.out.println("=========================");
        System.out.println("1 - Check/Out");
        System.out.println("2 - Lost Ticket");
    }
    //Print toDate output
    public void toDateInfo(){
        System.out.println("Best value parking garage");
        System.out.println("=========================");
        System.out.println("    Activity to date     ");
        System.out.println();
        //TODO:Add cost with collected checkins
        System.out.println("$XXX"+" was collected from "+checkIns+" Check Ins");
        System.out.println("$"+ticketsLost*LOSTCOST+" was collected from "+ticketsLost+" Lost Tickets");
        System.out.println();
        System.out.println("$"+cashEarned+" was collected overall");
    }
    //Add the ticket to the list
    public void addTicket(CarTicket t){
        ticketList.add(t);
    }
    //Clear list of ticket
    public void removeTicket(CarTicket t){
        for (CarTicket it: ticketList){
            if (it == t){
                ticketList.remove(it);
                return;
            }
        }
    }
    public void addCash(int cash){
        cashEarned += cash;
    }

    public LocalTime getTime(){
        int h = ThreadLocalRandom.current().nextInt(0,23); //Everyone has to be parked by 10 and out by 11:59
        int m = ThreadLocalRandom.current().nextInt(0,60);
        if (m >= 30 && h != 23){
            h++;
        }
        return LocalTime.of(h,0,0); //Going off of hour rounded to nearest minute
    }

    public int processTicket(CarTicket ticket){
        LocalTime inTime = ticket.getTime();
        LocalTime outTime = LocalTime.now();
        return 0;
        //TODO: return the cost to be paid
    }
}
