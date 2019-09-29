package us.jlp;

import java.util.Scanner;

public class Main {
//TODO: Make sure to parse for minor user mistakes that can be interp.

    public static void main(String[] args) {
        Garage garage = new Garage();
        boolean garageClosed = false;
        boolean error = false;
        Scanner keyboard = new Scanner(System.in);
        String input;
        int cID = 0;
        CarTicket curTicket = null;

        while (!garageClosed){
            error = false;
            //Clear space to make prettier
            System.out.println();
            System.out.println();
            System.out.println();
            //Inny
            garage.inCustomer();
            input = keyboard.next().trim();
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
                    error = true;
                    break;
            }


            //Outty
            if(!garageClosed && !error){
                garage.outCustomer();
                input = keyboard.next().trim();
                switch (input) {
                    case ("1"):
                        garage.processTicket(curTicket);
                        break;
                    case ("2"):
                        garage.lostTicketCustomer(curTicket);
                        break;
                    default:
                        //Assume customer lost ticket
                        garage.lostTicketCustomer(curTicket);
                        break;
                }
            }
        }
    }
}
