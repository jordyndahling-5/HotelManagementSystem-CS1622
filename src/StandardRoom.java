//standard type rooom

public class StandardRoom extends Room {
    private int standardRoomRate;

    //initial constructor
    public StandardRoom() {
        this.standardRoomRate = 50;
    }

    public int getStandardRoomRate() {
        return standardRoomRate;
    }

    /**
     * overrides previous setRoomNum for specific standard room one
     * @param roomNum
     */
    @Override
    public void setRoomNum(int roomNum) {this.roomNum = random.nextInt(100);}

    /**
     * calculates the cost of a standard room
     */
    @Override
    public void calcCost() {
        roomCost = numNights * numBeds * standardRoomRate;
    }
}
