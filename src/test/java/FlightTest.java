import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight1;
    private Passenger passenger1;
    private Passenger passenger2;
    private Plane plane1;

    @Before
    public void before(){
        plane1 = new Plane(PlaneType.BOEING747);
        flight1 = new Flight(plane1, "SQ233", "Paris", "Singapore", "15:00");
        passenger1 = new Passenger("Pierce Clarke", 1, plane1);
        passenger2 = new Passenger("Lan Zhu Hui", 2, plane1);

    }

    @Test
    public void getBookedPassengers(){
        assertEquals(0, flight1.getBookedPassengers().size());
    }

    @Test
    public void getCapacity(){
        assertEquals(660, flight1.getFlightCapacity());
    }

    @Test
    public void getAvailableSeats(){
        assertEquals(660, flight1.availableSeats(flight1));
    }

    @Test
    public void addPerson(){
        flight1.bookPassenger(flight1, passenger1);
        flight1.bookPassenger(flight1, passenger2);
        assertEquals(658, flight1.availableSeats(flight1));
    }


}
