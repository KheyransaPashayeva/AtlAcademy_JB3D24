import java.util.List;

public class Customer {
private int customerId;
private String name;
private List<Tour> reserveTours;

    public Customer(int customerId, List<Tour> reserveTours,String name) {
        this.customerId = customerId;
        this.reserveTours = reserveTours;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public List<Tour> getTours() {
        return reserveTours;
    }

    public void setTours(List<Tour> tours) {
        this.reserveTours = tours;
    }
    public void reserveTour(Tour tour){
        if (!tour.isReserved()){
            tour.reserveTour();
            reserveTours.add(tour);
            System.out.println("Tour"+tour.getTourName()+" paket sizin siyahiya elave edildi");
        }
        else {
            System.out.println("Tour paketi artiq reserve olunub");
        }
    }

    public void canselReserve(Tour tour){
        if (reserveTours.contains(tour)){
            tour.cancelReservation();
            reserveTours.remove(tour);
            System.out.println("Tour "+tour.getTourName()+"siyahinizdan silindi");
        }
        else {
            System.out.println("Artiq reserve legv olunub");
        }
    }
    public void displayDetails() {
        System.out.println("CustomerID: " + customerId +
                ",  Name: " + name +
                ", Reserved tour: " + reserveTours);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", reserveTours=" + reserveTours +
                '}';
    }
}
