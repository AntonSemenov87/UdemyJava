package AlexLee_youtube.OOP_Tutorial;

public class Main {
    public static void main(String[] args) {

        Pen pen = new Pen();
        pen.click();
        System.out.println(pen.isClicked);

        System.out.println(pen.color);
        System.out.println(pen.point);
        System.out.println(pen.type);

        Headphones hp = new Headphones();
        System.out.println(hp.currentSong);
        hp.skip();
        System.out.println(hp.currentSong);

    }
}
