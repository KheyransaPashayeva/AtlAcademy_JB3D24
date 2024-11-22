import java.util.Scanner;

public class DigitOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the digit to count: ");
        int digitToCount = scanner.nextInt();

        int count = 0;

        // While loop to count occurrences of the digit
        while (number > 0) {
            int digit = number % 10;
            if (digit == digitToCount) {
                count++;
            }
            number /= 10;
        }

        System.out.println("The digit " + digitToCount + " appears " + count + " times.");
    }
}
