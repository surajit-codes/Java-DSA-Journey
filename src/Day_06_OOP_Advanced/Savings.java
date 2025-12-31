package Day_06_OOP_Advanced;

public class Savings extends BankAccount{

    @Override
    void deposit ( double amount){
        System.out.println("Saving Account : You deposited ₹ " + amount);
    }
}
