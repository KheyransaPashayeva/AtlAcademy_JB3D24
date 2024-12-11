import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        // Bir HashMap yaradırıq
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Davud");
        map.put(2, "Leyla");
        map.put(3, "Aydın");

        // entrySet() ilə bütün açar-dəyər cütlərini əldə edirik
        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        // Set üzərində iterasiya
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("Açar: " + entry.getKey() + ", Dəyər: " + entry.getValue());
        }
    }
}
