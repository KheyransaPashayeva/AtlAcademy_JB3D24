import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListMethods {
    public static void main(String[] args) {
        // LinkedList yaradılır
        LinkedList<String> list = new LinkedList<>();
        ArrayList<Integer> integers= new ArrayList<>();
        // Elementlərin əlavə edilməsi
        list.add("Salam");
        list.add("Dünyayuoi");
        list.add("Java");
        integers.add(2);
        System.out.println(list.get(0));
        integers.add(7);
        integers.add(89);
        integers.add(32);
        for (int i=0;i<100;i++){
            integers.add(i);
        }
        // Elementlərin çap edilməsi
        System.out.println("LinkedList elementləri: " + list);
        System.out.println("ArrayList elementleri:" + integers);
        System.out.println(list.size());
        // İlk və son elementə daxil olmaq
        System.out.println("Birinci element: " + list.getFirst());
        System.out.println("Sonuncu element: " + list.getLast());

        // Konkret indeksdəki elementə daxil olmaq
        System.out.println("İkinci element: " + list.get(1));

        // Elementin silinməsi
        list.remove(1);
        System.out.println("Element silindikdən sonra LinkedList: " + list);

        // Siyahının ölçüsü
        System.out.println("LinkedList ölçüsü: " + list.size());

        String max = list.get(0); // İlk elementi başlanğıc olaraq götürürük

        // Dövr vasitəsilə elementləri yoxlayırıq
        for (String s : list) {
            if (s.length() > max.length()) {
                max = s; // Əgər uzunluq böyükdürsə, yeni uzun string olur
            }
        }

        // Nəticəni çap etmək
        System.out.println("Ən uzun string: " + max);
    }

}
