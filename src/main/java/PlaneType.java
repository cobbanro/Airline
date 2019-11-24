public enum PlaneType {

    BOEING747(660,183500),
    BOEING787(330,118000),
    AIRBUS380(860,280000);


    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight) {

        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}


