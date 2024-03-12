package lab5;

import java.util.ArrayList;
import java.util.List;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double viewBalance();
}

class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public double viewBalance() {
        return balance;
    }

    public void applyInterest() {
        balance += calculateInterest();
    }
}

class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Exceeds overdraft limit");
        }
    }

    @Override
    public double calculateInterest() {
        return 0; // Current accounts usually don't have interest
    }

    @Override
    public double viewBalance() {
        return balance;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}

class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }
}

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount savingsAccount = new SavingsAccount(5000, 0.07);
        CurrentAccount currentAccount = new CurrentAccount(900, 400);

        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        savingsAccount.deposit(300);
        currentAccount.deposit(200);

        savingsAccount.applyInterest();

        System.out.println("Savings Account Balance: " + savingsAccount.viewBalance());
        System.out.println("Current Account Balance: " + currentAccount.viewBalance());

        savingsAccount.withdraw(1200);
        currentAccount.withdraw(800);

        System.out.println("Savings Account Balance: " + savingsAccount.viewBalance());
        System.out.println("Current Account Balance: " + currentAccount.viewBalance());
    }
}
