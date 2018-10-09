import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;

    @Before
    public void before(){
        bus = new Bus("London", 5);
        person = new Person();
    }

    @Test
    public void hasDestination(){
        assertEquals("London", bus.getDestination());
    }

    @Test
    public void hasCapacity(){
        assertEquals(5, bus.getCapacity());
    }

    @Test
    public void hasPassengers(){
        assertEquals(0, bus.getPassengers());
    }

    @Test
    public void canAddPassengersIfBelowCapacity(){
        bus.add(person);
        assertEquals(1, bus.getPassengers());
    }

    @Test
    public void cannotAddPassengersIfAboveCapacity(){
        bus.add(person);
        bus.add(person);
        bus.add(person);
        bus.add(person);
        bus.add(person);
        bus.add(person);
        assertEquals(5, bus.getPassengers());
    }

    @Test
    public void canRemovePassenger(){
        bus.add(person);
        bus.add(person);
        bus.add(person);
        bus.add(person);
        assertEquals(4, bus.getPassengers());
        bus.remove();
        assertEquals(3, bus.getPassengers());
    }

}
