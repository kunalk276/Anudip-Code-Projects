package inheritance;

class BankAccount12 {
    protected double balance;

    public BankAccount12(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount1 extends BankAccount {
    private static final double WITHDRAWAL_LIMIT = 500;

    public SavingsAccount1(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance && amount <= WITHDRAWAL_LIMIT) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Withdrawal limit exceeded or insufficient funds");
        }
    }
}

class CheckingAccount1 extends BankAccount {
    private static final double OVERDRAFT_FEE = 25;

    public CheckingAccount1(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            balance -= OVERDRAFT_FEE;
            System.out.println("Withdrawn with overdraft fee: $" + (amount + OVERDRAFT_FEE));
        }
    }
}

public class BankAccount1 {
    public static void main(String[] args) {
        SavingsAccount1 savingsAccount = new SavingsAccount1(0);
        CheckingAccount1 checkingAccount = new CheckingAccount1(2000);

        savingsAccount.deposit(500);
        savingsAccount.withdraw(300);
        savingsAccount.withdraw(700);

        checkingAccount.deposit(1000);
        checkingAccount.withdraw(1500);
        checkingAccount.withdraw(500);
    }
}
