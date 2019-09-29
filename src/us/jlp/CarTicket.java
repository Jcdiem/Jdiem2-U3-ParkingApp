package us.jlp;

import java.time.LocalTime;
//Acts as the person/car
public class CarTicket {
    private LocalTime entryTime;

    public CarTicket(LocalTime timeCreated){
        entryTime = timeCreated;
    }

    public LocalTime getTime(){
        return entryTime;
    }
}
