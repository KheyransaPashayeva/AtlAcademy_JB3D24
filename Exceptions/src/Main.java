import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mətni daxil edin: ");

        int input = 5; // İstifadəçi daxil etdiyi mətn
int b=0;
        try {
            // Boş və ya yalnız boşluqlardan ibarət olarsa, istisna atılır
            System.out.println(input/b);
               System.out.println("Daxil edilmiş mətn: " + input);

        } catch (RuntimeException e) {
            System.out.println("Xəta: " + e.getMessage());
        }
    }
}
