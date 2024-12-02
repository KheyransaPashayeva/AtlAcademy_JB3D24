class ElectricCar implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Elektrik maşının mühərriki səssizcə işə düşdü.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Elektrik maşının mühərriki söndürüldü.");
    }

    @Override
    public String getFuelType() {
        return "Elektrik";
    }
}