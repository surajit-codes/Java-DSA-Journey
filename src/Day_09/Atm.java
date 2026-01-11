package Day_09;

public class Atm implements Deposit,Withdraw{
    private int balance = 10000;

    public int getBalance(){
        return balance;
    }
    public void setBalance(int amount){
        this.balance = amount;
    }
    public void deposit(int amount) {
        balance += amount;
        System.out.println(balance);
    }
    public void withdraw(int amount){
        balance -= amount;
        System.out.println(balance);
    }
}
