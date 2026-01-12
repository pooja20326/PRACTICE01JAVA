import java.util.Scanner;

//---------------- ABSTRACTION ----------------
abstract class BankAccount {
    protected String accountholder;
    protected double balance;

    BankAccount(String accountholder, double balance) {
        this.accountholder = accountholder;
        this.balance = balance;
    }

    // Encapsulation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: Rs " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: Rs " + amount);
        } else {
            System.out.println("Invalid or insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountholder);
        System.out.println("Balance: Rs " + balance);
    }

    abstract void calculateInterest();
}


//---------------- INHERITANCE ----------------
class SavingsAccount extends BankAccount {

    SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.04;
        balance += interest;
        System.out.println("Savings Account Interest Added: Rs " + interest);
    }
}

//---------------- INHERITANCE ----------------
class CurrentAccount extends BankAccount {

    CurrentAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    void calculateInterest() {
        System.out.println("No interest for Current Account");
    }
}

//---------------- MAIN CLASS ----------------
public class Bank {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Holder Name:");
        String name = sc.nextLine();

        System.out.println("Enter Initial Balance:");
        double bl = sc.nextDouble();

        System.out.println("Choose Account Type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        int choice = sc.nextInt();

        BankAccount account;

        if (choice == 1) {
            account = new SavingsAccount(name, bl);
        } else {
            account = new CurrentAccount(name, bl);
        }

        int option;
        do {
            System.out.println("\nMENU");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Calculate Interest");
            System.out.println("4. Display Balance");
            System.out.println("5. Exit");

            System.out.print("Choose option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    account.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    account.withdraw(sc.nextDouble());
                    break;

                case 3:
                    account.calculateInterest(); // Polymorphism
                    break;

                case 4:
                    account.displayBalance();
                    break;

                case 5:
                    System.out.println("Thank you for using the Bank System!");
                    break;

                default:
                    System.out.println("Invalid option");
            }

        } while (option != 5);

        sc.close();
    }
}
