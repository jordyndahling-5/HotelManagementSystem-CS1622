import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {

    @Test
    void testGetName() {
        String name;
        Reservation r1 = new Reservation("Jordyn", "March 8", 80, new Room(), new Amenity());

        assertEquals("Jordyn", r1.getName());
    }

    @Test
    void testDateArrival() {
        String name;
        Reservation r1 = new Reservation("Jordyn", "March 8", 80, new Room(), new Amenity());

        assertEquals("March 8", r1.getDateArrival());
    }

}