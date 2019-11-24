import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

        private FlightManager flightManager;
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
            flight1.bookPassenger(flight1, passenger1);
            flight1.bookPassenger(flight1, passenger2);
            flightManager = new FlightManager(flight1, plane1);
        }

        @Test
        public void getAllowedWeight(){
            assertEquals(277, flightManager.weightPerPassenger(flightManager));
        }

        @Test
        public void totalWeightBooked(){
            assertEquals(432, flightManager.totalWeightBooked(flightManager));
        }

        @Test
        public void remainingWeight(){
            assertEquals(182822, flightManager.remainingWeight(flightManager));
        }
}
