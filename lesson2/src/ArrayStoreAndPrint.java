
    import java.util.Scanner;

    public class ArrayStoreAndPrint {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] numbers = new int[5];

            // Input 5 numbers
            System.out.println("Enter 5 numbers:");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = scanner.nextInt();
            }

            // Print the numbers
            System.out.println("You entered:");
            for (int i=0;i<numbers.length;i++) {
                System.out.print(numbers[i] + " ");
            }
        }
    }


