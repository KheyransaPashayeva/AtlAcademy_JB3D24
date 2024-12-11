public class SuiteRoom extends Room{
    private boolean isMetbex;
    public SuiteRoom(int roomNumber, double price,RoomType roomType) {
        super(roomNumber, price,roomType);
        this.isMetbex=true;
    }


}
