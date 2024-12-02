//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("AZ123456789", 500.0);
        BankAccount account1 = new BankAccount("AZ123456789", 500.0);

        // Hesab məlumatlarını göstəririk
        System.out.println("Hesab nömrəsi: " + account.getAccountNumber());
        System.out.println("Balans: " + account.getBalance());

        // Hesaba pul yatırırıq
        account.deposit(25);

        // Hesabdan pul çıxarırıq
        account.withdraw(10);

        // Mənfi balans təyin etməyə çalışırıq
        account.setBalance(-50.0);

        // Balansı aşan miqdarda pul çıxarmağa çalışırıq
        account.withdraw(600.0);

        // Hesab nömrəsini dəyişirik
        account.setAccountNumber("AZ987654321");
        System.out.println("Yeni hesab nömrəsi: " + account.getAccountNumber());

        account1.withdraw(78);
    }
}