package us.jlp;

import java.time.LocalTime;
//Acts as the person/car
public class CarTicket {
    private LocalTime entryTime;
    private int idNum = 0;

    /**
     * Constructor for the CarTicket
     *
     * @param ident ID number of this ticket
     * @param timeCreated Time this ticket was created
     */
    public CarTicket(int ident, LocalTime timeCreated){
        idNum = ident;
        entryTime = timeCreated;
    }

    /**
     * Get the time the vehicle entered the garage
     * @return arrival time of vehicle
     */
    public LocalTime getTime(){
        return entryTime;
    }

    /**
     * Get the ID of the ticket
     *
     * @return the ticket ID
     */
    public int getIdNum(){
        return idNum;
    }

    /**
     * Return the difference between vehicle's arrival and time given
     *
     * @param outTime time to differ using
     * @return the difference between time given and arrival time
     */
    public int getDifference(LocalTime outTime){
        return outTime.getHour() - entryTime.getHour();
    }
}
