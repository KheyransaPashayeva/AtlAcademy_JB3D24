//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Car obyektini yaradıb metodlarını çağırırıq
        Vehicle car = new Car();
        car.startEngine();
        car.stopEngine();

        // Bike obyektini yaradıb metodlarını çağırırıq
        Vehicle bike = new Bike();
        bike.startEngine();
        bike.stopEngine();
    }
}