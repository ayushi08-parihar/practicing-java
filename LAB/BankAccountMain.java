// Base class
class BankAccount {
    protected double balance;

    // Constructor
    BankAccount(double balance) {
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Display balance
    void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
        System.out.println("---------------------------");
    }
}

// SavingsAccount subclass
class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    // Override withdraw method
    //@Override
    void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied! Minimum balance of ₹100 must be maintained.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        }
    }
}

// CurrentAccount subclass
class CurrentAccount extends BankAccount {

    private final double overdraftLimit = 5000;

    CurrentAccount(double balance) {
        super(balance);
    }

    // Override withdraw method
    //@Override
    void withdraw(double amount) {
        if (balance - amount < -overdraftLimit) {
            System.out.println("Withdrawal denied! Overdraft limit of ₹5000 exceeded.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        }
    }
}

// Main class
public class BankAccountMain {
    public static void main(String[] args) {

        // Savings Account
        SavingsAccount savings = new SavingsAccount(1500);
        savings.deposit(500);
        savings.withdraw(1300);   // Allowed
        savings.withdraw(200);    // Denied (below ₹100)
        savings.displayBalance();

        // Current Account
        CurrentAccount current = new CurrentAccount(1900);
        current.deposit(1000);
        current.withdraw(6000);   // Allowed (within overdraft)
        current.withdraw(2000);   // Denied (exceeds overdraft)
        current.displayBalance();
    }
}