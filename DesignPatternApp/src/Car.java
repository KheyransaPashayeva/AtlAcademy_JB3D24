// Car sinifi
class Car {
    // Field-lər
    private String brand;
    private String model;
    private String color;
    private int year;
    private boolean isElectric;

    // Private konstruktor - yalnız Builder vasitəsilə obyekt yaradılır
    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.color = builder.color;
        this.year = builder.year;
        this.isElectric = builder.isElectric;
    }

    // toString metodu - obyekt haqqında məlumat qaytarır
    @Override
    public String toString() {
        return "Car { " +
                "Brand='" + brand + '\'' +
                ", Model='" + model + '\'' +
                ", Color='" + color + '\'' +
                ", Year=" + year +
                ", IsElectric=" + isElectric +
                " }";
    }

    // Builder sinifi
    public static class CarBuilder {//inner class
        private String brand;
        private String model;
        private String color;
        private int year;
        private boolean isElectric;

        // Hər field üçün setter metodu
        public CarBuilder setBrand(String brand) {
            this.brand = brand;
            return this; // Method chaining üçün
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder setIsElectric(boolean isElectric) {
            this.isElectric = isElectric;
            return this;
        }

        // Car obyektini qaytaran metod
        public Car build() {
            return new Car(this);
        }
    }
}
