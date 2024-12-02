public class Customer {
    private String name;
    private String customerId;
    private double balance;

    public Customer(String name, String customerId, double balance) {
        this.name = name;
        this.customerId = customerId;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public double getBalance() {
        return balance;
    }

    public void updateBalance(double amount) {
        this.balance += amount;
    }
}
