package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
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
    public void hasTicketPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.2);
    }

    @Test
    public void giantsHasToPayDouble(){
        Visitor visitor = new Visitor(18, 202, 20);
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.2);
    }

    @Test
    public void everyCriteriaPassed(){
        Visitor visitor = new Visitor(16, 160, 20);
        assertTrue(rollerCoaster.isAllowedTo(visitor));
    }
    @Test
    public void notEveryCriteriaPassed(){
        Visitor visitor = new Visitor(10, 160, 20);
        assertFalse(rollerCoaster.isAllowedTo(visitor));
    }
}
