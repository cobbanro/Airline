import java.lang.Math;

public class Passenger {

    private String name;
    private int bagNumber;
    private boolean onFlight;
    private double seatNumber;
    private int capacity;

    public Passenger(String name, int bagNumber, Plane capacity){

        this.name = name;
        this.bagNumber = bagNumber;
        this.onFlight = false;
        this.capacity = capacity.getCapacity();
        this.seatNumber = (int)Math.random()*((this.capacity)+1);
    }

    public Boolean getOnFlight(){
        return this.onFlight;
    }

    public boolean onFlight(Flight flight, Passenger passenger){
        for(Passenger passengers : flight.getBookedPassengers()){
            if(passengers == passenger){
                passenger.onFlight = true;
            }
        }
        return passenger.getOnFlight();
    }

    public double getSeatNumber(){
        return this.seatNumber;
    }
}
