package us.jlp;

import java.time.LocalTime;
import java.util.concurrent.ThreadLocalRandom;

public class TimeHelper {
    /**
     * Placeholder for retuning the current time. Currently generates a random time and returns that
     *
     * @return a randomly generated time placeholding the current time
     */
    public LocalTime getTime(){
        int h = ThreadLocalRandom.current().nextInt(1,22); //Everyone has to be parked by 10:59 and out by 11
        int m = ThreadLocalRandom.current().nextInt(0,60);
        if (m > 0){
            h++;
        }
        //System.out.println(h);
        return LocalTime.of(h,0,0); //Going off of hour rounded to nearest minute
    }

    /**
     * Convert a LocalTime to a String formatted to look like a digital clock in 12 hour format
     * example: 1:45 PM from LocalTime.of(13,45)
     *
     *
     * @param t the LocalTime to be turned into a String
     *          Only values of LocalTime used are Hour and Minute
     * @return a string containing the twelve hour format of the time
     *           First two chars in returned String should always be the hours so that it can be tested
     */
    public String timeToString(LocalTime t){//TODO: Fix time so that if chosen to be represented minutes won't be 'MM0'
        int tHour = t.getHour();
        if (tHour > 12 && tHour != 24){ //check if incoming time is pm
            tHour -= 12;
            if (tHour < 10) {//Return an extra 0 to enforce the first two chars being the hour
                return ("0"+tHour+":"+t.getMinute()+"0 PM"); // HH:MM PM
            }
            else{
                return (tHour+":"+t.getMinute()+"0 PM"); // HH:MM PM
            }
        }
        else if (tHour == 12){ //Check if noon
            return (tHour+":"+t.getMinute()+"0 PM"); // 12:MM PM
        }
        else if (tHour == 24 || tHour == 0){ //Check if midnight

            //USE ADDITION/SUBTRACTION SO THAT ERRORS CAN BE MORE EASILY FOUND
            if(tHour ==24){ //If the 24 hour version is 24 (should be impossible, according to LocalTime)
                tHour -= 12; //Subtract 12 to make 12
            }
            else{ //If the 24 hour version is 00
                tHour += 12; //Add 12 to make 12
            }

            return (tHour+":"+t.getMinute()+"0 AM"); // 12:MM AM
        }
        else{//If time is AM
            if (tHour < 10) {//Return an extra 0 to enforce the first two chars being the hour
                return ("0"+tHour+":"+t.getMinute()+"0 AM"); // HH:MM AM
            }
            else{
                return (tHour+":"+t.getMinute()+"0 AM"); // HH:MM AM
            }
        }
    }
}
