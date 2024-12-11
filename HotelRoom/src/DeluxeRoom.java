public class DeluxeRoom extends Room{
    private boolean isBalkon;
    public DeluxeRoom(int roomNumber, double price,RoomType roomType) {
        super(roomNumber, price,roomType);
        this.isBalkon=true;

    }


}
