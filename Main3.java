package lab5;

abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount1 extends BankAccount {
    private double interestRate;

    public SavingsAccount1(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    @Override
    void deposit(double amount) {
        balance += amount;
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void addInterest() {
        balance += balance * interestRate;
    }
}

class CurrentAccount1 extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount1(double balance, double overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void deposit(double amount) {
        balance += amount;
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit!");
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        SavingsAccount1 savingsAccount = new SavingsAccount1(1000, 0.05);
        savingsAccount.deposit(500);
        System.out.println("Savings Account Balance after deposit: " + savingsAccount.balance);

        savingsAccount.withdraw(200);
        System.out.println("Savings Account Balance after withdrawal: " + savingsAccount.balance);

        savingsAccount.addInterest();
        System.out.println("Savings Account Balance after interest: " + savingsAccount.balance);

        System.out.println();

        CurrentAccount1 currentAccount = new CurrentAccount1(2000, 1000);
        currentAccount.deposit(300);
        System.out.println("Current Account Balance after deposit: " + currentAccount.balance);

        currentAccount.withdraw(2500);
        System.out.println("Current Account Balance after withdrawal: " + currentAccount.balance);
    }
}
