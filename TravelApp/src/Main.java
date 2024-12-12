import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        TravelAgency agency = new TravelAgency("Dream Tours");

        Tour tour1 = new Tour(1, "Sunny Beach Holiday", 200.0, TourPackage.BEACH_HOLIDAY);
        Tour tour2 = new Tour(2, "Urban City Adventure", 150.0, TourPackage.CITY_TOUR);
        Tour tour3 = new Tour(3, "Mountain Trekking", 300.0, TourPackage.MOUNTAIN_ADVENTURE);
        Tour tour =new Tour(45,"Seyahet",567,TourPackage.CITY_TOUR);

        agency.addTour(tour1);
        agency.addTour(tour2);
        agency.addTour(tour3);

        agency.displayTour();
        agency.addCustomer(new Customer(2, Arrays.asList(tour1,tour2),"Yusif"));
        Customer customer=new Customer(1, List.of(tour3,tour2),"Semed");
        agency.addCustomer(customer);
        customer.displayDetails();
        agency.displayCustomer();
        tour1.reserveTour();
        tour1.cancelReservation();
        tour2.reserveTour();
    }
}