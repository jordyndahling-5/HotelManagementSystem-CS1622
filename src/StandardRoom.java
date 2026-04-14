public class StandardRoom extends Room {
    private int standardRoomRate;

    public StandardRoom() {
        this.standardRoomRate = 50;
    }

    @Override
    public void setRoomNum(int roomNum) {this.roomNum = random.nextInt(100);}

    @Override
    public void calcCost() {
        roomCost = numNights * numBeds * standardRoomRate;
    }
}
