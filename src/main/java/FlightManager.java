public class FlightManager {

    private int totalPassengers;
    private int totalWeight;
    private int capacity;

    public FlightManager(Flight flight, Plane plane){
        this.totalPassengers = flight.getBookedPassengers().size();
        this.totalWeight = plane.getWeight();
        this.capacity = plane.getCapacity();
    }

    public int weightPerPassenger(FlightManager flightManager) {

        if (flightManager.totalPassengers != 0) {
            if (flightManager.totalPassengers < flightManager.capacity) {
                return (flightManager.totalWeight - (62 * flightManager.totalPassengers)) / flightManager.capacity;
            }
            return 404; //How to return a string when an int is required as an int value?
        }
        return 404;
    }

    public int totalWeightBooked(FlightManager flightManager){
        return flightManager.weightPerPassenger(flightManager) * flightManager.totalPassengers;
    } // Assuming they book all available weight


    public int remainingWeight(FlightManager flightManager) {
        return flightManager.totalWeight - (62 * flightManager.totalPassengers) - totalWeightBooked(flightManager);
    }
}
