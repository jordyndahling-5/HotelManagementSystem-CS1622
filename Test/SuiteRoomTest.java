import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuiteRoomTest {

    @Test
    void testSuiteRoomRate() {
        int suiteRoomRate = 100;
        SuiteRoom suite1 = new SuiteRoom();

        assertEquals(100, suite1.getSuiteRoomRate());
    }

    @Test
    void testCalcCost() {
        int numNights = 3;
        int numBeds = 2;
        int suiteRoomRate = 100;
        int roomCost = numNights * numBeds * suiteRoomRate;


        assertEquals(600, roomCost);
    }

}