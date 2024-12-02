enum TrafficLight {
    RED("Dayan"), 
    YELLOW("Hazır ol"), 
    GREEN("Hərəkət et");

    private final String action; // Xüsusiyyət

    // Konstruktor
    TrafficLight(String action) {
        this.action = action;
    }

    // Getter metodu
    public String getAction() {
        return action;
    }
}