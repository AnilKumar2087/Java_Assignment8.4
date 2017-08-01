package assignment8_4;

public class Reservation {
    public static void main(String [] args) throws InterruptedException{
        Bus someCompany = new Bus();

        Passenger p1 = new Passenger(someCompany,"Anil");
        Passenger p2 = new Passenger(someCompany, "Kumar");

        p1.start();
        p2.start();

    }
}