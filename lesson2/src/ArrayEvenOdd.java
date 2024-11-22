import java.util.Scanner;

public class ArrayEvenOdd {//arr de elementin tek ya cut capa vermek
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Separate even and odd
        System.out.println("Even numbers:");
        for (int num : numbers) {
            if (num % 2 == 0) System.out.print(num + " ");
        }

        System.out.println("\nOdd numbers:");
        for (int num : numbers) {
            if (num % 2 != 0) System.out.print(num + " ");
        }
    }
}
