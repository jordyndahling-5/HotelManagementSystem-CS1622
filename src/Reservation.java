/**
 * class for the reservations made at the hotel
 */
public class Reservation {
    private String name;
    private String dateArrival;
    private int reservationTotalCost;
    private Room room;
    private Amenity amenity;


    //initial constructor
    public Reservation() {
        this.name = "";
        this.dateArrival = "";
        this.reservationTotalCost = 0;
    }

    /**
     * a reservation contructor that takes inputs
     * @param name
     * @param dateArrival
     * @param room
     * @param amenity
     */
    public Reservation(String name, String dateArrival, int reservationTotalCost, Room room,
                       Amenity amenity) {
        this.name = name;
        this.dateArrival = dateArrival;
        this.reservationTotalCost = reservationTotalCost;
        this.room = room;
        this.amenity = amenity;

    }

    /**
     * getters to return the value of attribute
     * @return
     */
    //Getters
    public String getName() { return name;}
    public String getDateArrival() {return dateArrival; }
    public int getReservationTotalCost() {return reservationTotalCost;}
    public Room getRoom() {return room;}
    public Amenity getamenity() {return amenity;}

    //Setters

    /**
     * sets name value
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * sets date of arrival value
     * @param dateArrival
     */
    public void setDateArrival(String dateArrival) {
        this.dateArrival = dateArrival;
    }



    /**
     * sets room values
     * @param room
     */
    public void setRoom (Room room) {
        this.room = room;
    }

    /**
     * sets amenity values
     * @param amenity
     */
    public void setAmenity (Amenity amenity) {
        this.amenity = amenity;
    }



    public void calcReservationTotalCost(int roomCost, int amenityCost) {
        reservationTotalCost = roomCost + amenityCost;

    }


    /**
     * toString function
     * @return
     */
    @Override
    public String toString() {
        return "Name{" +
                "Date of Arrival =" + dateArrival  +
                '}';
    }
}
