// suite type room

public class SuiteRoom extends Room{
    private int suiteRoomRate;

    //initial constructor
    public SuiteRoom() {
        this.suiteRoomRate = 100;
    }

    public int getSuiteRoomRate() {return suiteRoomRate;}

    /**
     * overrides setRoomNum for more specific suite room
     * @param roomNum
     */
    @Override
    public void setRoomNum(int roomNum) {this.roomNum = random.nextInt(100, 200);}

    /**
     * calculates cost for suite room
     */
    @Override
    public void calcCost() {
        roomCost = numNights * numBeds * suiteRoomRate;
    }
}
