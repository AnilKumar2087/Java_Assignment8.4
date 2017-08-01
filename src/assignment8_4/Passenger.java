package assignment8_4;



public class Passenger extends Thread{

    Bus bus;
    String passengerName;

    public Passenger(Bus bus, String passengerName){
        this.bus=bus;
        this.passengerName=passengerName;
}
}