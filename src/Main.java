import java.util.Random;

/**
 * main function for calculating costs and outputing summary and bill
 */
public class Main {
    /**
     * made separate reservations, rooms, bills, and amenities
     */
    public static void main() {
        Random random = new Random();

        /**
         * setting info for person #1
         */

        Bill bill1 = new Bill();

        Room room1 = new Room();
        room1.setRoomNum(random.nextInt(100));
        room1.setNumBeds(2);

        Amenity amenity1 = new Amenity();
        amenity1.setNumExcursions(2);
        amenity1.setFoodPlan("Breakfast Buffet");
        amenity1.setNumFridgeFood(4);

        Reservation person1 = new Reservation();
        person1.setName("Jordyn");
        person1.setDateArrival("March 8");
        person1.setNumNights(3);
        person1.setRoom(room1);
        person1.setAmenity(amenity1);
        person1.setBill(bill1);

        bill1.setCostRoom(person1.getNumNights() * room1.getNumBeds() * 50);
        bill1.setCostFoodPlan(person1.getNumNights() * 10);
        bill1.setCostExcursions(amenity1.getNumExcursions() * 20);
        bill1.setCostFridgeFood(amenity1.getNumFridgeFood() * 5);
        bill1.setTotalCost(bill1.getCostRoom() + bill1.getCostFoodPlan() +
                bill1.getCostExcursions() + bill1.getCostFridgeFood());


        /**
         * setting info for person #2
         */

        Bill bill2 = new Bill();

        Room room2 = new Room();
        room2.setRoomNum(random.nextInt(100));
        room2.setNumBeds(1);

        Amenity amenity2 = new Amenity();
        amenity2.setNumExcursions(4);
        amenity2.setFoodPlan("Breakfast Biffet");
        amenity2.setNumFridgeFood(1);

        Reservation person2 = new Reservation();
        person2.setName("Madi");
        person2.setDateArrival("March 15");
        person2.setNumNights(4);
        person2.setRoom(room2);
        person2.setAmenity(amenity2);

        bill2.setCostRoom(person2.getNumNights() * room2.getNumBeds() * 50);
        bill2.setCostFoodPlan(person2.getNumNights() * 10);
        bill2.setCostExcursions(amenity2.getNumExcursions() * 20);
        bill2.setCostFridgeFood(amenity2.getNumFridgeFood() * 5);
        bill2.setTotalCost(bill2.getCostRoom() + bill2.getCostFoodPlan() +
                bill2.getCostExcursions() + bill2.getCostFridgeFood());


        /**
         * printing out info for both people
         */
        System.out.println("-----North Shore Hotel Stay Summary-----");
        System.out.println("Reservation Name: " + person1.getName());
        System.out.println("Date of Arrival: " + person1.getDateArrival());
        System.out.println("Room Number: " + room1.getRoomNum());
        System.out.println("Food Plan: " + amenity1.getFoodPlan());
        System.out.println("Bill: ");
        System.out.println("Cost of Room: $" + bill1.getCostRoom());
        System.out.println("Food Plan Cost: $" + bill1.getCostFoodPlan());
        System.out.println("Fridge Food Cost: $" + bill1.getCostFridgeFood());
        System.out.println("Excursions Cost: $" + bill1.getCostExcursions());
        System.out.println("Total Cost: $" + bill1.getTotalCost());

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("-----North Shore Hotel Stay Summary-----");
        System.out.println("Reservation Name: " + person2.getName());
        System.out.println("Date of Arrival: " + person2.getDateArrival());
        System.out.println("Room Number: " + room2.getRoomNum());
        System.out.println("Food Plan: " + amenity2.getFoodPlan());
        System.out.println("Bill: ");
        System.out.println("Cost of Room: $" + bill2.getCostRoom());
        System.out.println("Food Plan Cost: $" + bill2.getCostFoodPlan());
        System.out.println("Fridge Food Cost: $" + bill2.getCostFridgeFood());
        System.out.println("Excursions Cost: $" + bill2.getCostExcursions());
        System.out.println("Total Cost: $" + bill2.getTotalCost());




    }
}
