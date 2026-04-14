public class SuiteRoom extends Room{
    private int suiteRoomRate;

    public SuiteRoom() {
        this.suiteRoomRate = 100;
    }


    @Override
    public void setRoomNum(int roomNum) {this.roomNum = random.nextInt(100, 200);}

    @Override
    public void calcCost() {
        roomCost = numNights * numBeds * suiteRoomRate;
    }
}
