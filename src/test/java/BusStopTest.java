import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("London", 5);
        person = new Person();
        busStop = new BusStop("Leith");
    }

    @Test
    public void hasName() {
        assertEquals("Leith", busStop.getName());
    }

    @Test
    public void addPersonToQueue() {
        busStop.add(person);
        assertEquals(1, busStop.queueCount());
    }

    @Test
    public void removePersonFromQueue() {
        busStop.add(person);
        busStop.add(person);
        busStop.add(person);
        assertEquals(3, busStop.queueCount());

        busStop.remove();
        assertEquals(2, busStop.queueCount());
    }

}
