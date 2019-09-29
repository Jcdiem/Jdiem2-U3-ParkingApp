package us.jlp;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
//TODO: Make sure to parse for minor user mistakes that can be interp.

    public static void main(String[] args) {
        boolean garageClosed = false;
        Scanner keyboard = new Scanner(System.in);
        String input;

        while (!garageClosed){
            //TODO: Move the garage outputs to their own functions
            //Inny
            System.out.println("Best value parking garage");
            System.out.println("=========================");
            System.out.println("1 - Check/In");
            System.out.println("2 - Close garage");
            input = keyboard.next();
            switch(input){
                case("1"):
                    //Create a ticket
                    break;
                case("2"):
                    garageClosed = true;
                    System.out.println("Best value parking garage");
                    System.out.println("=========================");
                    System.out.println("    Activity to date     ");
                    System.out.println("");
                    System.out.println("ACTIVITY HERE");
                    break;
                default:
                    //Error catching for when user is big dumb
                    break;

            }


            //Outty
            System.out.println("Best value parking garage");
            System.out.println("=========================");
            System.out.println("1 - Check/Out");
            System.out.println("2 - Lost Ticket");
            input = keyboard.next();
            switch(input){
                case("1"):
                    //Tally up the total
                    break;
                case("2"):
                    //Inact Lost ticket fee
                    break;
                default:
                    //Repeat list with notification of error
                    break;
            }


        }
    }
}
