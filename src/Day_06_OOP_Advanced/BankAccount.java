package Day_06_OOP_Advanced;

public abstract class BankAccount {
    abstract void deposit ( double amount );
    void message(){
        System.out.println("Welcome to Bank");
    }
}
