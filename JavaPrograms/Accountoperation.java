
interface AccountOperation {
    
    void deposit(double amount);

    
    double getBalance();
}


class Account implements AccountOperation {
    private double balance;

    
    public Account(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    @Override
    public double getBalance() {
        return balance;
    }

    
    public static void main(String[] args) {
        
        Account myAccount = new Account(1000);

       
        System.out.println("Current Balance: " + myAccount.getBalance());

        
        myAccount.deposit(500);
        System.out.println("Balance After Deposit: " + myAccount.getBalance());

      
        myAccount.deposit(-100); // Invalid deposit
    }
}