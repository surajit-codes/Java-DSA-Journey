package Day_05_OOP;

public class BankMain {
    public static void main(String[] args){

        BankAccount bankAccount = new BankAccount("Surajit Mondal" , 1000);
        System.out.println(bankAccount);
        bankAccount.deposit(90000);
        System.out.println(bankAccount);
        bankAccount.withdraw(10000);
        bankAccount.deposit(5000);
        System.out.println(bankAccount);
    }
}
