import attractions.Attraction;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Visitor visitor;
    Attraction attraction;

    @Before
    public void before() {
        themePark = new ThemePark();
        visitor = new Visitor(20, 1.85, 70);
        attraction = new RollerCoaster("Rocket Coaster", 3);
    }

    @Test
    public void visitorVistedAttraction(){
        themePark.visit(visitor, attraction);
        assertEquals(1, attraction.getVisitCount());
        assertEquals(1, visitor.getVisitedAttractions().size());
    }
}
