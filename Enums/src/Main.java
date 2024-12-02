public class Main {
    public static void main(String[] args) {
        Day today = Day.FRIDAY; // Enum-dan bir dəyər istifadə edirik

        // Həmin dəyəri yazdırırıq
        System.out.println("Bugün: " + today);

        // Switch istifadə edirik
        switch (today) {
            case MONDAY -> System.out.println("Həftənin ilk iş günü.");
            case FRIDAY -> System.out.println("Həftənin son iş günü.");
            case SATURDAY, SUNDAY -> System.out.println("İstirahət günüdür.");
            default -> System.out.println("Normal iş günü.");
        }
        for (TrafficLight light : TrafficLight.values()) {
            System.out.println(light + ": " + light.getAction());
        }

        System.out.println("Fəsillər və onların məlumatları:\n");

        // Enum dəyərlərini dövrə salaraq məlumatları yazdırırıq
        for (Season season : Season.values()) {
            System.out.println(season.getFormattedInfo());
        }
    }
}
