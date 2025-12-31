package Day_06_OOP_Advanced;

public class Current extends BankAccount{

    @Override
    void deposit ( double amount){
        System.out.println("Current Account: You deposited ₹ " + amount + " (No Interest)");
    }
}
