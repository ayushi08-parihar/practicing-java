/*import java.util.Scanner;

class BankAccount {
    double balance;
    String accountType;

    BankAccount(String accountType, double balance) {
        this.accountType = accountType;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    void withdraw(double amount) {
        if (accountType.equalsIgnoreCase("Savings")) {
            if (balance - amount < 100) {
                System.out.println("Withdrawal denied! Minimum balance ₹100 required.");
            } else {
                balance -= amount;
                System.out.println("Withdrawn: ₹" + amount);
            }
        } 
        else if (accountType.equalsIgnoreCase("Current")) {
            if (balance - amount < -5000) {
                System.out.println("Overdraft limit exceeded! Max overdraft ₹5000.");
            } else {
                balance -= amount;
                System.out.println("Withdrawn: ₹" + amount);
            }
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account type (Savings/Current): ");
        String type = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        BankAccount acc = new BankAccount(type, balance);

        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        acc.deposit(depositAmount);

        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = sc.nextDouble();
        acc.withdraw(withdrawAmount);

        acc.displayBalance();
    }
}
*/
import java.util.Scanner;

class BankAccount {
    double balance;
    String accountType;

    BankAccount(String accountType, double balance) {
        this.accountType = accountType;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: ₹" + amount);
    }

    void withdraw(double amount) {
        if (accountType.equalsIgnoreCase("Savings")) {
            if (balance - amount < 100) {
                System.out.println("Withdrawal denied! Minimum balance ₹100 required.");
            } else {
                balance -= amount;
                System.out.println("Amount Withdrawn: ₹" + amount);
            }
        } 
        else if (accountType.equalsIgnoreCase("Current")) {
            if (balance - amount < -5000) {
                System.out.println("Overdraft limit exceeded! Max overdraft ₹5000.");
            } else {
                balance -= amount;
                System.out.println("Amount Withdrawn: ₹" + amount);
            }
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Type (Savings/Current): ");
        String type = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount acc = new BankAccount(type, balance);

        int choice;

        do {
            System.out.println("\n----- BANK MENU -----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    acc.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double wd = sc.nextDouble();
                    acc.withdraw(wd);
                    break;

                case 3:
                    acc.displayBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using the bank system.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }
}