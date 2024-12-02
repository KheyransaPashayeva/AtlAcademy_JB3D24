// Main sinif
public class Main {
    public static void main(String[] args) {
        // Builder Pattern vasitəsilə Car obyektinin yaradılması
        Car car = new Car.CarBuilder()
                .setBrand("Tesla")
                .setModel("Model S")
                .setColor("White")
                .setYear(2023)
                .setIsElectric(true)
                .build();

        System.out.println(car);

        // İkinci maşın obyektinin yaradılması
        Car anotherCar = new Car.CarBuilder()
                .setBrand("Toyota")
                .setModel("Corolla")
                .setColor("Black")
                .setYear(2020)
                .setIsElectric(false)
                .build();

        System.out.println(anotherCar);
    }
}
