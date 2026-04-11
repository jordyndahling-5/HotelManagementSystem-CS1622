
import java.util.Random;

/**
 * room class for the hotel room info
 */
public class Room {
    private int roomNum;
    private int numBeds;

    //initial constructor
    public Room() {
        this.roomNum = 0;
        this.numBeds = 0;
    }

    /**
     * Room constructor that takes input
     * @param roomNum
     * @param numBeds
     */
    public Room(int roomNum, int numBeds) {
        this.roomNum = roomNum;
        this.numBeds = numBeds;
    }
    Random random = new Random();

    /**
     * returns value of attributes
     * @return
     */
    //Getters
    public int getRoomNum() { return roomNum; }
    public int getNumBeds() { return numBeds; }

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
     * toString functionDE3
     *
     * @return
     */
    @Override
    public String toString() {
        return "Room{" +
                "Room Number =" + roomNum +
                "Number of Beds =" + numBeds +
                '}';
    }
}
