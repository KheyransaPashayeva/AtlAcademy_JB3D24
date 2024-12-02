enum Season {
    SPRING(10, 20, "Təbiətin canlanma dövrü"),
    SUMMER(25, 35, "İsti və günəşli günlər"),
    AUTUMN(10, 18, "Xəzan və sərin hava"),
    WINTER(-5, 5, "Soyuq və qarlı günlər");

    private final int minTemp;    // Minimum temperatur
    private final int maxTemp;    // Maksimum temperatur
    private final String description; // Fəsil haqqında məlumat

    // Konstruktor
    Season(int minTemp, int maxTemp, String description) {
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.description = description;
    }

    // Getter metodları
    public int getMinTemp() {
        return minTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public String getDescription() {
        return description;
    }

    // Fəsil haqqında formatlı məlumat qaytaran metod
    public String getFormattedInfo() {
        return String.format("%s: %d°C - %d°C (%s)", 
                              this.name(), minTemp, maxTemp, description);
    }
}
