abstract class Account {
    private String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void displayAccountInfo();
}
class SavingsAccount extends Account {
    private double interestRate = 0.03; 
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
        // this.interestRate = interestRate;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " to Savings Account.");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from Savings Account.");
        } else {
            System.out.println("Insufficient funds in Savings Account.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Savings Account Number: " + getAccountNumber());
        System.out.println("Balance: $" + balance);
    }
}

class CheckingAccount extends Account {
    private double overdraftLimit = 500.0;

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " to Checking Account.");
    }
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from Checking Account.");
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }
    public void displayAccountInfo() {
        System.out.println("Checking Account Number: " + getAccountNumber());
        System.out.println("Balance: $" + balance);
    }
}
public class task02 {
    public static void main(String[] args) {
        Account savings = new SavingsAccount("SAV123", 1000);
        Account checking = new CheckingAccount("CHK456", 500);

        savings.deposit(200);
        savings.withdraw(300);
        savings.displayAccountInfo();

        System.out.println();

        checking.deposit(150);
        checking.withdraw(800);
        checking.displayAccountInfo();
    }
}
