import java.util.Scanner;

public class duzbucaqSahePerimetr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int en = sc.nextInt();
        int uzunluq = new Scanner(System.in).nextInt();
        int Sahe=en*uzunluq;
        int Perimetr=2*(en+uzunluq);
        System.out.println("Duzbucaqlinin eni:"+en+" "+uzunluq+"cm uzunlugu:"+uzunluq+"cm Sahesi="+Sahe+" perimetri="+Perimetr+"cm");
    }
}
