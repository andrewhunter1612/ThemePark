package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(14, 2.04, 40.0);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void checkPrices(){
        assertEquals(16.8, rollerCoaster.priceFor(visitor), 0.0);
        visitor = new Visitor(14, 1.94, 40.0);
        assertEquals(8.4, rollerCoaster.priceFor(visitor), 0.0);
        visitor = new Visitor(10, 1.94, 40.0);
        assertEquals(0.0, rollerCoaster.priceFor(visitor), 0.0);
    }
}
