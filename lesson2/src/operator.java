import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        double a = new Scanner(System.in).nextDouble();
        double a2=new Scanner(System.in).nextDouble();
        System.out.println("bolunmeden tam hisse:"+(a/a2)+"qaliq hisse:"+(a%a2));
//        System.out.println(a2);
    }

}
//iki eded daxil edin scanner vasitesi ile onlarin bolunmesinden alinan tam ve kesir hisse capa verin