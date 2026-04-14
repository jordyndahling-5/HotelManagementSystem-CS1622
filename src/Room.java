
import java.util.Random;

/**
 * room class for the hotel room info
 */
public class Room implements Chargeable {
    protected int roomNum;
    protected int numBeds;
    protected int numNights;
    public int roomCost;


    //initial constructor
    public Room() {
        this.roomNum = 0;
        this.numBeds = 0;
        this.numNights = 0;

    }

    /**
     * Room constructor that takes input
     * @param roomNum
     * @param numBeds
     * @param numNights
     * @param roomCost
     */
    public Room(int roomNum, int numBeds, int numNights, int roomCost) {
        this.roomNum = roomNum;
        this.numBeds = numBeds;
        this.numNights = numNights;
        this.roomCost = roomCost;
    }
    Random random = new Random();

    /**
     * returns value of attributes
     * @return
     */
    //Getters
    public int getRoomNum() { return roomNum; }
    public int getNumBeds() { return numBeds; }
    public int getNumNights() {return numNights;}
    public int getRoomCost() {return roomCost;}

    //Setters

    /**
     * sets room number value to a random number 1-100
     * @param roomNum
     */
    public void setRoomNum(int roomNum) {
        this.roomNum = random.nextInt(100);
    }

    /**
     * sets number of beds value
     * @param numBeds
     */
    public void setNumBeds(int numBeds) {
        this.numBeds = numBeds;
    }

    /**
     * sets number of nights value
     * @param numNights
     */
    public void setNumNights(int numNights) {
        this.numNights = numNights;
    }

    /**
     * calculates the room cost
     */
    @Override
    public void calcCost() {
        roomCost = numBeds * numNights;
    }

    /**
     * toString functionDE3
     *
     * @return
     */
    @Override
    public String toString() {
        return "Room{" +
                "Room Number =" + roomNum +
                "Number of Beds =" + numBeds +
                "Number of Nights =" + numNights +
                '}';
    }

}
