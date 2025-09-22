public class Bank {
    class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }
    private String accountHolder;
    private String accountNumber;
    private double balance;
    
    public Bank(String accountHolder, String accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountHilder(){
        return accountHolder;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }

    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public void deposit(double amount){
        try {
            
            if (amount <= 0){
                throw new InsufficientFundsException(accountHolder);
            }

        } catch (Exception e) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + balance);

    }
    public void withdraw(double amount){
        try {
            if  (amount <= 0){
                throw new InsufficientFundsException(accountHolder);
            }
        } catch (Exception e) {
            System.out.println("Withdraw amount must be positive.");
            return;
        }
        if(amount > balance){
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
            System.out.println("New Balance: " + balance);
        }
    }
    public static void main(String[] args) {
        Bank myAccount = new Bank("John Doe", "123456789", 1000.0);
        
        System.out.println("Account Holder: " + myAccount.getAccountHilder());
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Initial Balance: " + myAccount.getBalance());
        
        myAccount.deposit(500);
        myAccount.withdraw(200);
        myAccount.withdraw(2000); 
        myAccount.deposit(-100);
        myAccount.withdraw(-50); 
    }
}
