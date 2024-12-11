import java.util.ArrayList;
import java.util.List;

// Travel Agency class to manage tours
public class TravelAgency {
   private String agencyName;
   private List<Tour> tours;
   private List<Customer > customers;

    public TravelAgency(String agencyName) {
        this.agencyName = agencyName;
        this.tours = new ArrayList<>();
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public List<Tour> getTours() {
        return tours;
    }

    public void setTours(List<Tour> tours) {
        this.tours = tours;
    }
    public  void addTour(Tour tour){
        tours.add(tour);
        System.out.println("Tour"+ tour.getTourName()+" is add tour agency");
    }
    public void displayTour(){
        System.out.println("Tours offered by "+agencyName+ ":");
        for(Tour tour:tours){
            tour.displayDetails();
        }
    }
}
