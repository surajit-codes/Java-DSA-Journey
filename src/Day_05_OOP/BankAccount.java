package Day_05_OOP;

public class BankAccount {

    private String accountHolder;
    private double balance;

    BankAccount(String accountHolder , double balance){
        this.accountHolder = accountHolder;
        this.balance= balance;
    }
    void deposit(double amount){
        balance += amount;
    }

    void withdraw(double amount ){
       if(amount>balance){
           System.out.println("Insufficient Amount , Try again 😊");
       } else if (amount<0){
           System.out.println("Money Amount Can't be Negative!!");
       } else {
           balance -= amount;
       }
    }
    String getAccountHolder(){
        return this.accountHolder;
    }
    double getBalance(){
        return this.balance;
    }

    @Override
    public String toString(){
       return accountHolder + "'s Current Bank Balance is ₹ " + balance;
    }
}
