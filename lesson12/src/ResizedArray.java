import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ResizedArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Birinci array uzunlugu: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Ikinci array uzunlugu: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        if(size2 > size) {
            for(int i = 0; i < size; i++) {
                arr2[i] = arr[i];
            }
            System.out.print("Yeni elementleri daxil edin: ");
            // example: i = 5-3+1; i < 5; i++
            for(int i = (size2 - size) + 1; i < size2; i++) {
                arr2[i] = sc.nextInt();
            }
        }
        else {
            for(int i = 0; i < size2; i++) {
                arr2[i] = arr[i];
            }
        }

        for(int i = 0; i < size2; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
