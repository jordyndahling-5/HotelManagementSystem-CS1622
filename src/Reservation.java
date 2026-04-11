/**
 * class for the reservations made at the hotel
 */
public class Reservation {
    private String name;
    private String dateArrival;
    private int numNights;
    private Room room;
    private Amenity amenity;
    private Bill bill;

    //initial constructor
    public Reservation() {
        this.name = "";
        this.dateArrival = "";
        this.numNights = 0;
    }

    /**
     * a reservation contructor that takes inputs
     * @param name
     * @param dateArrival
     * @param numNights
     * @param room
     * @param amenity
     */
    public Reservation(String name, String dateArrival, int numNights, Room room,
                       Amenity amenity) {
        this.name = name;
        this.dateArrival = dateArrival;
        this.numNights = numNights;
        this.room = room;
        this.amenity = amenity;
        this.bill = bill;
    }

    /**
     * getters to return the value of attribute
     * @return
     */
    //Getters
    public String getName() { return name;}
    public String getDateArrival() {return dateArrival; }
    public int getNumNights() {return numNights;}
    public Room getRoom() {return room;}
    public Amenity getamenity() {return amenity;}
    public Bill bill() {return bill; }

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
     * sets number of nights value
     * @param numNights
     */
    public void setNumNights(int numNights) {
        this.numNights = numNights;
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

    /**
     * sets bill values
     * @param bill
     */
    public void setBill (Bill bill) {
        this.bill = bill;
    }

    /**
     * toString function
     * @return
     */
    @Override
    public String toString() {
        return "Name{" +
                "Date of Arrival =" + dateArrival  +
                ", Number of Nights =" + numNights +
                '}';
    }
}
