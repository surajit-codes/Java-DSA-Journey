package Day_06_OOP_Advanced;

public class Smartphone implements Camera , MusicPlayer {
    @Override
    public void clickPhoto() {
        System.out.println("You are now clicking the photo");
    }

    @Override
    public void playSong() {
        System.out.println("The song is now playing");
    }
}
