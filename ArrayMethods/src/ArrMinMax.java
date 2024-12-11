import java.util.Arrays;

public class ArrMinMax {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 23, 56, 3};

        // Ən kiçik və ən böyük elementləri tapırıq
        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();

        System.out.println("Ən kiçik element: " + min);
        System.out.println("Ən böyük element: " + max);
    }
}
