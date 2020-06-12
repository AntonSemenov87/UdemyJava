package Section4;

public class PlayingCat_task {

    public static boolean isCatPlaying (boolean summer, int temperature) {
        if (summer) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            } else return false;
        } else {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            } else return false;
        }
    }
}
