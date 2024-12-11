import java.util.Arrays;

public class ArrSumAverage {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // Elementlərin cəmini tapırıq
        int sum = Arrays.stream(numbers).sum();

        // Orta qiymət
        double average = Arrays.stream(numbers).average().orElse(0);

        System.out.println("Cəm: " + sum);
        System.out.println("Orta qiymət: " + average);
    }
}
