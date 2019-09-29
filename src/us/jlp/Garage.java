package us.jlp;

//Helper class to keep text outputs out of the way
public class Garage {
    public Garage (){
        System.out.println("Best value parking garage");
        System.out.println("=========================");
        System.out.println("    Activity to date     ");
        System.out.println();
        System.out.println("ACTIVITY HERE");
    }
    //Print parking screen
    public void inCustomer(){
        System.out.println("Best value parking garage");
        System.out.println("=========================");
        System.out.println("1 - Check/In");
        System.out.println("2 - Close garage");
    }
    //Print leaving screen
    public void outCustomer(){
        System.out.println("Best value parking garage");
        System.out.println("=========================");
        System.out.println("1 - Check/Out");
        System.out.println("2 - Lost Ticket");
    }
    //Print toDate output
    public void toDateInfo(){
        System.out.println("Best value parking garage");
        System.out.println("=========================");
        System.out.println("    Activity to date     ");
        System.out.println();
        System.out.println("ACTIVITY HERE");
    }
}
