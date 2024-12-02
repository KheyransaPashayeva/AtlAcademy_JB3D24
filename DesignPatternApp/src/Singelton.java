
class Logger {
    // Singleton obyekt üçün private static sahə
    private static Logger instance;

    // Private konstruktor - birbaşa obyekt yaradılmasının qarşısını alır
    private Logger() {
    }

    // Singleton obyektə giriş üçün public metod
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Log metodu
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}

// Main sinifi

