import java.util.ArrayList;
import java.util.Date;

public class Flight {

    private ArrayList<Passenger> bookedPassengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime){

        this.bookedPassengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public ArrayList<Passenger> getBookedPassengers(){
        return this.bookedPassengers;
    }

    public int getFlightCapacity(){
        return this.plane.getCapacity();
    }

    public int availableSeats(Flight flight){
        return flight.getFlightCapacity() - this.getBookedPassengers().size();
    }

    public void bookPassenger(Flight flight, Passenger person){
        if (flight.availableSeats(flight) > 0){
            this.bookedPassengers.add(person); //Something wrong here? Surely I don't need to pass flight to itself?
        }
    }



}
