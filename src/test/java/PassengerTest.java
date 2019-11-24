import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Flight flight1;
    private Passenger passenger1;
    private Plane plane1;

    @Before
    public void before(){

        plane1 = new Plane(PlaneType.BOEING747);
        passenger1 = new Passenger("Pierce Clarke", 1, plane1);
        flight1 = new Flight(plane1, "SQ233", "Paris", "Singapore", "15:00");
        flight1.bookPassenger(flight1, passenger1);
    }

    @Test
    public void checkPassengerOnFlight(){
        assertEquals(true, passenger1.onFlight(flight1, passenger1));
    } //Why null pointer exception

    @Test
    public void getSeatNumber(){
        assertEquals(0, passenger1.getSeatNumber());
    }


}
