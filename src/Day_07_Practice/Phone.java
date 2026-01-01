package Day_07_Practice;

public class Phone{

    Battery battery = new Battery();
    void playGame() {
        battery.power -= 10;
        System.out.println("Playing...... Battery sttus : " + battery.power + "%");
    }
}
