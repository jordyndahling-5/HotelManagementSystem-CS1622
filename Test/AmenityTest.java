import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AmenityTest {

    @Test
    void testFoodPlan() {
        Amenity amenity1 = new Amenity(2, "Buffet", 1, 40, 20);

        assertEquals("Buffet", amenity1.getFoodPlan());

    }

    @Test
    void testNumFridgeFood() {
        Amenity amenity1 = new Amenity(2, "Buffet", 1, 40, 20);

        assertEquals(1, amenity1.getNumFridgeFood());

    }

}