// Bike sinifi
class Bike implements Vehicle {
    @Override
    public void startEngine() {

        System.out.println("Velosipedin mühərriki işə düşdü.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Velosipedin mühərriki söndürüldü.");
    }

    @Override
    public String getFuelType() {
        return "fiziki guc";
    }
}

    // Main sinif



