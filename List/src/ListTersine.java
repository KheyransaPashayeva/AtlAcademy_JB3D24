import java.util.LinkedList;

public class ListTersine {
    public static void main(String[] args) {
        // LinkedList yaradılır və elementlər əlavə olunur
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Tərsinə çap etmək üçün dövr
        System.out.print("Tərsinə siyahı: ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
