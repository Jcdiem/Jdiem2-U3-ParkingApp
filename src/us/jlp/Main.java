package us.jlp;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
//TODO: Make sure to parse for minor user mistakes that can be interp.

    public static void main(String[] args) {
        Garage garage = new Garage();
        boolean garageClosed = false;
        Scanner keyboard = new Scanner(System.in);
        String input;

        while (!garageClosed){
            //TODO: Move the garage outputs to their own functions
            //Inny
            garage.inCustomer();
            input = keyboard.next();
            switch(input){
                case("1"):
                    //Create a ticket
                    break;
                case("2"):
                    garageClosed = true;
                    garage.toDateInfo();
                    break;
                default:
                    //Error catching for when user is big dumb
                    break;

            }


            //Outty
            garage.outCustomer();
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
