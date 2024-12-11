//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TravelAgency agency = new TravelAgency("Dream Tours");

        // Create tour objects
        Tour tour1 = new Tour(1, "Sunny Beach Holiday", 200.0, TourPackage.BEACH_HOLIDAY);
        Tour tour2 = new Tour(2, "Urban City Adventure", 150.0, TourPackage.CITY_TOUR);
        Tour tour3 = new Tour(3, "Mountain Trekking", 300.0, TourPackage.MOUNTAIN_ADVENTURE);

        // Add tours to the agency
        agency.addTour(tour1);
        agency.addTour(tour2);
        agency.addTour(tour3);

        // Display all tours
        agency.displayTour();

        // Reserve and cancel reservations
        tour1.reserveTour();
        tour1.cancelReservation();
        tour2.reserveTour();
    }
}