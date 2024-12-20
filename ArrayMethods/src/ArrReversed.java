import java.util.Arrays;

public class ArrReversed {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Array-i tərsinə çeviririk
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        System.out.println("Tərsinə çevrilmiş array:");
        System.out.println(Arrays.toString(numbers));
    }
}
