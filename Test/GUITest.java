import org.junit.jupiter.api.Test;
import java.awt.*;
import java.awt.event.*;

import static org.junit.jupiter.api.Assertions.*;

class GUITest {

    @Test
    void testNumBeds() {
        Room room1 = new Room();
        room1.setNumBeds(2);

        assertEquals(2, room1.numBeds);

    }

    @Test
    void testNumNights() {
        Room room1 = new Room();
        room1.setNumNights(3);

        assertEquals(3, room1.numNights);

    }


}