import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
//        double a = new Scanner(System.in).nextDouble();
//        double a2=new Scanner(System.in).nextDouble();
//        System.out.println("bolunmeden tam hisse:"+(a/a2)+"qaliq hisse:"+(a%a2));
////        System.out.println(a2)

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a year: ");
                int year = scanner.nextInt();

                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            System.out.println("The year is a leap year.");
                        } else {
                            System.out.println("The year is not a leap year.");
                        }
                    } else {
                        System.out.println("The year is a leap year.");
                    }
                } else {
                    System.out.println("The year is not a leap year.");
                }



    }

}
//iki eded daxil edin scanner vasitesi ile onlarin bolunmesinden alinan tam ve kesir hisse capa verin