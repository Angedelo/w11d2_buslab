import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public String getDestination() {
        return this.destination;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getPassengers() {
        return this.passengers.size();
    }

    public void add(Person person) {
        if (capacity > passengers.size()) {
            passengers.add(person);
        }
    }

    public Person remove() {
        return passengers.remove(0);
    }

    public void pickUp(BusStop busStop) {
        Person bob = busStop.remove();
        passengers.add(bob);

    }
}
