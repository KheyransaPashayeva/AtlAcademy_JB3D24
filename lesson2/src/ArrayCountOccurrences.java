import java.util.Scanner;

public class ArrayCountOccurrences {//array icinde nece tekrarlanan eded say
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Input the number to count
        System.out.print("Enter a number to count: ");
        int target = scanner.nextInt();
        int count = 0;

        // Count occurrences
        for (int num : numbers) {
            if (num == target) count++;
        }

        System.out.println("The number " + target + " appears " + count + " times.");
    }
}
