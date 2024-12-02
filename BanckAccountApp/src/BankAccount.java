
public class BankAccount {
    // Private sahələr (encapsulation tətbiqi)
    private String accountNumber;
    private double balance;

    // Constructor (obyekt yaradılarkən sahələri təyin etmək üçün)
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter metodları
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Setter metodları
    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balans mənfi ola bilməz!");
        }
    }

    // Pul yatırmaq üçün metod
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " manat hesaba yatırıldı. Yeni balans: " + balance);
        } else {
            System.out.println("Pul yatırmaq üçün miqdar müsbət olmalıdır.");
        }
    }

    // Pul çıxarmaq üçün metod
    public void withdraw(double amount) {
        if ( balance>=amount) {
            balance -= amount;
            System.out.println(amount + " manat hesaba çıxarıldı. Yeni balans: " + balance);
        } else if (amount > balance) {
            System.out.println("Balans kifayət etmir!");
        } else {
            System.out.println("Pul çıxarmaq üçün miqdar müsbət olmalıdır.");
        }
    }
}


