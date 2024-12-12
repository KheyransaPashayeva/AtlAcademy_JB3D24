import java.util.ArrayList;
import java.util.List;
public class TravelAgency {
   private String agencyName;
   private List<Tour> tours;
   private List<Customer> customers;

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public TravelAgency(String agencyName) {
        this.agencyName = agencyName;
        this.tours = new ArrayList<>();
        this.customers= new ArrayList<>();
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
     public void addTour(Tour tour){
            tours.add(tour);
         System.out.println("Tour"+ tour.getTourName()+" liste elave edildi");
     }
     public  void addCustomer(Customer customer){
        customers.add(customer);
         System.out.println("Tour "+customer.getName()+"customer elave edildi");
     }
     public void displayTour(){
        for(Tour tour:tours){
            tour.displayDetails();
        }
     }
     public void displayCustomer(){
        for(Customer customer:customers){
            customer.displayDetails();
//            System.out.println(customer);
        }
     }
}
