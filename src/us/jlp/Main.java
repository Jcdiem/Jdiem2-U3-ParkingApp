package us.jlp;

import java.util.Scanner;

public class Main {
//TODO: Make sure to parse for minor user mistakes that can be interp.

    public static void main(String[] args) {
        Garage garage = new Garage();
        boolean garageClosed = false;
        Scanner keyboard = new Scanner(System.in);
        String input;
        int cID = -1;
        CarTicket curTicket = null;

        while (!garageClosed){
            //Inny
            garage.inCustomer();
            input = keyboard.next();
            switch(input){
                case("1"):
                    curTicket = new CarTicket(cID++, garage.getTime());
                    break;
                case("2"):
                    garageClosed = true;
                    garage.toDateInfo();
                    break;
                default:
                    System.out.println("Error please try again");
                    //TODO: Make condition for user being dumb
                    break;
            }


            //Outty
            if(!garageClosed){
                garage.outCustomer();
                input = keyboard.next();
                switch (input) {
                    case ("1"):
                        garage.processTicket(curTicket);
                        break;
                    case ("2"):
                        garage.lostTicketCustomer();
                        break;
                    default:
                        //Assume customer lost ticket
                        garage.lostTicketCustomer();
                        break;
                }
            }
        }
    }
}
