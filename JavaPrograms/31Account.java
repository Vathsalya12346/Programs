// 31. Create an insufficientBalanceException Class with the message "Insufficient Balance X for withdrawal of Y".


class InsufficientBalanceException extends Exception {
    // Constructor accepting current balance and attempted withdrawal amount
    public InsufficientBalanceException(double balance, double withdrawalAmount) {
        super("Insufficient Balance " + balance + " for withdrawal of " + withdrawalAmount);
    }
}

/
class Account {
    private double balance;

   
    public Account(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    
    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount cannot be negative.");
        }
        balance += amount;
    }

    
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("Withdrawal amount cannot be negative.");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount); // Throw custom exception
        }
        balance -= amount;
    }

    
    public double getBalance() {
        return balance;
    }

    
    public static void main(String[] args) {
        Account account = new Account(500);

        try {
            account.withdraw(600); 
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        account.deposit(200); 

        try {
            account.withdraw(300); 
            System.out.println("Withdrawal successful. Remaining balance: " + account.getBalance());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}