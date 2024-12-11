import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Hüseyn", "12345", 500);
        BankCustomer bankCustomer = new BankCustomer(customer);

        try {
            System.out.println("Cari balans: " + bankCustomer.checkBalance());
            
            bankCustomer.deposit(200);
            System.out.println("Cari balans: " + bankCustomer.checkBalance());
            
            bankCustomer.pay(100);
            System.out.println("Cari balans: " + bankCustomer.checkBalance());
            
            bankCustomer.refund(50);
            System.out.println("Cari balans: " + bankCustomer.checkBalance());

            bankCustomer.pay(1000);  // Kifayət qədər balans yoxdur
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Xəta: " + e.getMessage());
        }

        try {
            bankCustomer.deposit(-50); // Səhv məbləğ daxil edilir
        } catch (InvalidAmountException e) {
            System.out.println("Xəta: " + e.getMessage());
        }


        LocalDate today = LocalDate.now();
        int year = today.getYear();        // Cari il
        int month = today.getMonthValue(); // Cari ay
        int day = today.getDayOfMonth();   // Cari gün
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = today.format(formatter);

        System.out.println("Formatlanmış tarix: " + formattedDate); // Məsələn: 02/12/2024
        System.out.println("İl: " + year + ", Ay: " + month + ", Gün: " + day);
    }
}
