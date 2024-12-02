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
    }
}
