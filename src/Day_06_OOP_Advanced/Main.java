package Day_06_OOP_Advanced;

public class Main {
    public static void main(String[] args){
        Savings mySaving = new Savings();
        mySaving.message();
        mySaving.deposit(6500);
        Current myCurrent = new Current();
        myCurrent.deposit(3600);

        Smartphone smartphone = new Smartphone();
        smartphone.clickPhoto();
        smartphone.playSong();

    }
}
