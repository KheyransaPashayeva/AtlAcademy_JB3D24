// Base class for all room types
public abstract class Room {
    private int roomNumber;
    private double price;
    private boolean isBooked;

    public Room(int roomNumber, double price) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.isBooked = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void bookRoom() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Room " + roomNumber + " is now booked.");
        } else {
            System.out.println("Room " + roomNumber + " is already booked.");
        }
    }

    public void cancelBooking() {
        if (isBooked) {
            isBooked = false;
            System.out.println("Booking for room " + roomNumber + " is canceled.");
        } else {
            System.out.println("Room " + roomNumber + " is not booked.");
        }
    }

    public abstract void displayDetails();
}

// Standard Room class
class StandardRoom extends Room {
    private boolean isSingleBed;

    public StandardRoom(int roomNumber, double price, boolean isSingleBed) {
        super(roomNumber, price);
        this.isSingleBed = isSingleBed;
    }

    @Override
    public void displayDetails() {
        System.out.println("Standard Room - Room Number: " + getRoomNumber() +
                           ", Price: $" + getPrice() +
                           ", Single Bed: " + (isSingleBed ? "Yes" : "No") +
                           ", Booked: " + (isBooked() ? "Yes" : "No"));
    }
}

// Suite Room class
class SuiteRoom extends Room {
    private boolean hasKitchen;

    public SuiteRoom(int roomNumber, double price, boolean hasKitchen) {
        super(roomNumber, price);
        this.hasKitchen = hasKitchen;
    }

    @Override
    public void displayDetails() {
        System.out.println("Suite Room - Room Number: " + getRoomNumber() +
                           ", Price: $" + getPrice() +
                           ", Kitchen: " + (hasKitchen ? "Yes" : "No") +
                           ", Booked: " + (isBooked() ? "Yes" : "No"));
    }
}

// Deluxe Room class
class DeluxeRoom extends Room {
    private boolean hasBalcony;

    public DeluxeRoom(int roomNumber, double price, boolean hasBalcony) {
        super(roomNumber, price);
        this.hasBalcony = hasBalcony;
    }

    @Override
    public void displayDetails() {
        System.out.println("Deluxe Room - Room Number: " + getRoomNumber() +
                           ", Price: $" + getPrice() +
                           ", Balcony: " + (hasBalcony ? "Yes" : "No") +
                           ", Booked: " + (isBooked() ? "Yes" : "No"));
    }
}

