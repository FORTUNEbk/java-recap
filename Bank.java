
import java.util.Scanner;

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

    public void SelectAction(){
        System.out.println("Select Action: 1. Deposit 2. Withdraw");
        Scanner scanner = new Scanner(System.in);
        int action = scanner.nextInt();
        System.out.println("Enter amount:");
        double amount = scanner.nextDouble();
        if (action == 1){
            deposit(amount);
        } else if (action == 2){
            withdraw(amount);
        } else {
            System.out.println("Invalid action selected.");
        }
    }
    public static void main(String[] args) {
    Bank bank = new Bank("John Doe", "123456789", 1000.0);
        bank.SelectAction();
        
    
}
}