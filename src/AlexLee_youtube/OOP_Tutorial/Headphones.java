package AlexLee_youtube.OOP_Tutorial;

import java.util.Random;

public class Headphones {

    String charge = "microUSB";
    String [] controls = {"power", "volume", "skip", "pause"};
    String color = "Red/black";
    int volume = 0;
    String [] songsList = {"You", "Me", "Us", "We", "Who", "When", "This", "Song", "Last", "Day"};
    Random random = new Random();
    int n = random.nextInt(8);
    String currentSong = songsList[n];

    boolean isPowered = false;

    void powerOn (){
        isPowered = true;
    }

    void powerOff () {
        isPowered = false;
    }

    void volumeUp () {
        volume++;
    }

    void volumeDown () {
        volume--;
    }

    void skip () {
        n++;
        currentSong = songsList[n];
    }

}
