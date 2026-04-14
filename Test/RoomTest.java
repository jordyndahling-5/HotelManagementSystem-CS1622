import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    void testNumBeds() {
        Room room1 = new Room();
        room1.setNumBeds(4);

        assertEquals(4, room1.numBeds);

    }

    @Test
    void testNumNights() {
        Room room1 = new Room();
        room1.setNumNights(1);

        assertEquals(1, room1.numNights);

    }

}