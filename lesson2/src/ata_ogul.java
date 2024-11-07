import java.util.Scanner;

public class ata_ogul {
    public static void main(String[] args) {
        int ataAge=new Scanner(System.in).nextInt();
        System.out.println("ata yas: "+ ataAge);
        int ogulAge=new Scanner(System.in).nextInt();
        System.out.println("ogul yas "+ogulAge);
        int yasferqi=ataAge-ogulAge;
        System.out.println("Ata oguldan  "+yasferqi+" boyukdur.");

    }
}
