package us.jlp;

import java.time.LocalTime;
import java.util.concurrent.ThreadLocalRandom;

public class TimeHelper {
    public LocalTime getTime(){
        int h = ThreadLocalRandom.current().nextInt(1,22); //Everyone has to be parked by 10:59 and out by 11
        int m = ThreadLocalRandom.current().nextInt(0,60);
        if (m > 0){
            h++;
        }
        //System.out.println(h);
        return LocalTime.of(h,0,0); //Going off of hour rounded to nearest minute
    }
}
