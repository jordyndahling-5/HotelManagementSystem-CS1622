import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StandardRoomTest {

    @Test
    void testStandardRoomRate() {
        int standardRoomRate = 50;
        StandardRoom stan1 = new StandardRoom();

        assertEquals(50, stan1.getStandardRoomRate());
    }

    @Test
    void testCalcCost() {
        int numNights = 3;
        int numBeds = 2;
        int standardRoomRate = 50;
        int roomCost = numNights * numBeds * standardRoomRate;


        assertEquals(300, roomCost);
    }

}