package us.jlp;

import java.time.LocalTime;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
//TODO: Make sure to parse for minor user mistakes that can be interp.

    public static void main(String[] args) {
        CheckoutFactory checkoutFactory = new CheckoutFactory();
        TimeHelper timeManage = new TimeHelper();
        OutputManager outty = new OutputManager();
        GarageEnum garage = GarageEnum.INSTANCE;
        CheckoutStrategy checkoutStyle;
        boolean garageClosed = false;
        boolean error;
        Scanner keyboard = new Scanner(System.in);
        String input;
        int cID = 0;
        CarTicket curTicket = new CarTicket(-5,LocalTime.of(23,59,59)); //Impossible ticket to check for errors and avoid nulls
        CheckoutStrategy[] checkoutStyleList = new CheckoutStrategy[]{checkoutFactory.createCheckout("Normal"), checkoutFactory.createCheckout("Lost"), checkoutFactory.createCheckout("Event")}; //Where the factory is used, so usefully

        while (!garageClosed){

            error = false;
            //Clear space to make prettier
            System.out.println();
            System.out.println();
            System.out.println();


            //Inny
            outty.inCustomer();
            input = keyboard.next().trim();
            switch(input){
                case("1"):
                    outty.inOptions();
                    input = keyboard.next().trim();
                    switch(input){
                        case("1"): //Normal ticket
                            curTicket = new CarTicket(cID++, timeManage.getTime());
                            break;
                        case("2"): //Event ticket
                            LocalTime simpleTime = timeManage.getTime(); //TODO: tidy up event ticket so that its not throwing times when not needed (SEE OVERUSE OF TIME IN STRATEGY)
                            curTicket = new CarTicket(cID++,simpleTime);
                            outty.eventReceipt(curTicket.getIdNum(),checkoutStyleList[parseInt(input)].reportTicket(curTicket,simpleTime));
                            error = true; //Using to skip leaving screen
                            break;
                        default:
                            System.out.println("ERROR please try again");
                            error = true;
                            break;
                    }
                    break;
                case("2"):
                    LocalTime outTime = LocalTime.of(23,0); //Same deal TODO: Find a better way to setup outTime
                    //Assume customer lost ticket if they show up without one (Press checkout without making a ticket first)
                    outty.lostTicketCustomer(curTicket.getIdNum(),checkoutStyleList[parseInt(input)-1].reportTicket(curTicket,outTime));
                    error = true; //Reset back to beginning TODO: either rename 'error' or make another boolean
                    break;
                case("3"):
                    garageClosed = true;
                    outty.toDateInfo(garage.getTotalCash(),garage.getLostCash(),garage.getNormalCash(),garage.getEventCash(),garage.getNormalTickets(),garage.getLostTickets(),garage.getEventTickets());
                    break;
                default:
                    System.out.println("Error please try again");
                    error = true;
                    break;
            }


            //Outty
            if(!garageClosed && !error && curTicket.getIdNum() != -5 ){
                LocalTime outTime = LocalTime.of(23,0); //For testing purposes, all vehicles leave at 11 (Can be changed to be time of departure
                outty.outCustomer();
                input = keyboard.next().trim();
                switch (input) {
                    case ("1"): //Submit ticket
                        outty.normalReceipt(
                                curTicket.getTime(), //LocalTime of the intime for the ticket
                                outTime, //LocalTime of the leaving time
                                curTicket.getIdNum(), //Tickets ID numbers
                                checkoutStyleList[parseInt(input)-1].reportTicket(curTicket,outTime) //Cost of the ticket
                        );
                        break;
                    case ("2"): //Lost ticket
                        outty.lostTicketCustomer(curTicket.getIdNum(),checkoutStyleList[parseInt(input)-1].reportTicket(curTicket,outTime));
                        break;
                    default:
                        //Assume customer lost ticket if they screw up :)
                        outty.lostTicketCustomer(curTicket.getIdNum(),checkoutStyleList[1].reportTicket(curTicket,outTime)); //TODO: fix the use of number '1'
                        break;
                }
            }
        }
    }
}
