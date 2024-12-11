// Base class for Tour
public class Tour {
    private int tourId;
    private String tourName;
    private double price;
    private boolean isReserved;
    private TourPackage tourPackage;

    public Tour(int tourId, String tourName, double price, TourPackage tourPackage) {
        this.tourId = tourId;
        this.tourName = tourName;
        this.price = price;
        this.tourPackage = tourPackage;
        this.isReserved = false;
    }

    public int getTourId() {
        return tourId;
    }

    public String getTourName() {
        return tourName;
    }

    public double getPrice() {
        return price;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public TourPackage getTourPackage() {
        return tourPackage;
    }

    public void reserveTour() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Tour " + tourName + " has been reserved.");
        } else {
            System.out.println("Tour " + tourName + " is already reserved.");
        }
    }

    public void cancelReservation() {
        if (isReserved) {
            isReserved = false;
            System.out.println("Reservation for tour " + tourName + " is canceled.");
        } else {
            System.out.println("Tour " + tourName + " is not reserved.");
        }
    }

    public void displayDetails() {
        System.out.println("Tour ID: " + tourId +
                           ", Tour Name: " + tourName +
                           ", Price: $" + price +
                           ", Tour Package: " + tourPackage +
                           ", Reserved: " + (isReserved ? "Yes" : "No"));
    }
}

