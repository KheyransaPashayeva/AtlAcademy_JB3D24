import java.util.Arrays;

public class ArrSort {
    public static void main(String[] args) {
        String[] names = {"hüseyn", "aydın", "tural", "zeynəb", "leyla"};

        // Array-i sıralayırıq
        Arrays.sort(names);

        System.out.println("Sıralanmış array:");
        System.out.println(Arrays.toString(names));
    }
}
