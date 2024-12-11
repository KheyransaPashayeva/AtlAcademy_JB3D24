import java.util.ArrayList;

public class listSilme {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");

        System.out.println("İlk siyahı: " + list);

        // Üçüncü və beşinci elementləri silirik
        list.remove(2); // "C"
        list.remove(3); // "E"

        System.out.println("Yeni siyahı: " + list);
    }
}
