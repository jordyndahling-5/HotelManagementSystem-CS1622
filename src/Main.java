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



        Room room1 = new StandardRoom();
        room1.setRoomNum(random.nextInt(100));
        room1.setNumBeds(2);
        room1.setNumNights(3);
        room1.calcCost();

        Amenity amenity1 = new Amenity();
        amenity1.setNumExcursions(2);
        amenity1.setFoodPlan("Buffet");
        amenity1.setNumFridgeFood(4);
        amenity1.calcCost();

        Reservation person1 = new Reservation();
        person1.setName("Jordyn");
        person1.setDateArrival("March 8");
        person1.calcReservationTotalCost(room1.roomCost, amenity1.getAmenityCost());
        person1.setRoom(room1);
        person1.setAmenity(amenity1);



        /**
         * setting info for person #2
         */


        Room room2 = new SuiteRoom();
        room2.setRoomNum(random.nextInt(100, 200));
        room2.setNumBeds(1);
        room2.setNumNights(4);
        room2.calcCost();

        Amenity amenity2 = new Amenity();
        amenity2.setNumExcursions(4);
        amenity2.setFoodPlan("Buffet");
        amenity2.setNumFridgeFood(1);
        amenity2.calcCost();

        Reservation person2 = new Reservation();
        person2.setName("Madi");
        person2.setDateArrival("March 15");
        person2.calcReservationTotalCost(room2.roomCost, amenity2.getAmenityCost());
        person2.setRoom(room2);
        person2.setAmenity(amenity2);



        /**
         * printing out info for both people
         */
        System.out.println("-----North Shore Hotel Stay Summary-----");
        System.out.println("Reservation Name: " + person1.getName());
        System.out.println("Date of Arrival: " + person1.getDateArrival());
        System.out.println("Room Number: " + room1.getRoomNum());
        System.out.println("Food Plan: " + amenity1.getFoodPlan());
        System.out.println("Bill: ");
        System.out.println("Cost of Room: $" + room1.roomCost);
        System.out.println("Amenity Costs: $" + amenity1.getAmenityCost());
        System.out.println("Total Cost: $" + person1.getReservationTotalCost());

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");


        System.out.println("-----North Shore Hotel Stay Summary-----");
        System.out.println("Reservation Name: " + person2.getName());
        System.out.println("Date of Arrival: " + person2.getDateArrival());
        System.out.println("Room Number: " + room2.getRoomNum());
        System.out.println("Food Plan: " + amenity2.getFoodPlan());
        System.out.println("Bill: ");
        System.out.println("Cost of Room: $" + room2.roomCost);
        System.out.println("Amenity Costs: $" + amenity2.getAmenityCost());
        System.out.println("Total Cost: $" + person2.getReservationTotalCost());




    }
}
