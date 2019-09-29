package us.jlp;

import java.time.LocalTime;
//Acts as the person/car
public class CarTicket {
    private LocalTime entryTime;
    private int idNum = 0;

    public CarTicket(int ident, LocalTime timeCreated){
        idNum = ident;
        entryTime = timeCreated;
    }

    public LocalTime getTime(){
        return entryTime;
    }
}
