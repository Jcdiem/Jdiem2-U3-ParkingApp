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
    int cashTime = 0;

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
    //Print lost ticket screen
    public void lostTicketCustomer(){
        System.out.println("Best value parking garage");
        System.out.println("=========================");
        System.out.println("Receipt for vehicle id "+"NUMBER"); //TODO: work ticket/vehicle Id into all of the outputs
        ticketsLost++;
    }
    //Print toDate output
    public void toDateInfo(){
        cashEarned += ticketsLost*LOSTCOST;
        System.out.println("Best value parking garage");
        System.out.println("=========================");
        System.out.println("    Activity to date     ");
        System.out.println();
        //TODO:Add cost with collected checkins
        System.out.println(cashTime+" was collected from "+checkIns+" Check Ins");
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
        int h = ThreadLocalRandom.current().nextInt(0,23); //Everyone has to be parked by 10 and out by 11
        int m = ThreadLocalRandom.current().nextInt(0,60);
        if (m >= 30 && h != 23){
            h++;
        }
        System.out.println(h);
        return LocalTime.of(h,0,0); //Going off of hour rounded to nearest minute
    }

    public void processTicket(CarTicket ticket){
        LocalTime inTime = ticket.getTime();
        LocalTime outTime = LocalTime.of(23,0); //For testing purposes, all vehicles leave at 11
        //LocalTime outTime = LocalTime.now();
        String sOutput;
        String outTimeHS;
        String inTimeHS;
        int difference = outTime.getHour() - inTime.getHour();
        int inTimeH = inTime.getHour(); if (inTimeH > 12){ //check if it is pm
            inTimeH -= 12;
            inTimeHS = inTimeH+"pm";
        }
        else inTimeHS = Integer.toString(inTimeH);
        int outTimeH = outTime.getHour(); if(outTimeH > 12){ //Check if it is pm
            outTimeH -= 12;
            outTimeHS = outTimeH+"pm";
        }
        else outTimeHS = Integer.toString(outTimeH);
        sOutput = inTimeHS+" - "+outTimeHS;

        System.out.println("Best value parking garage");
        System.out.println("=========================");
        System.out.println("Receipt for vehicle id "+ticket.getIdNum());
        System.out.println();
        System.out.println();
        System.out.println(difference+" hours parked "+sOutput);
        //return 0;
        //TODO: return the cost to be paid
    }
}
