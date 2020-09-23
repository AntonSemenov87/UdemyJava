package AlexLee_youtube.Interfaces;

interface WaterBottleInterface {
    String color = "Blue";
    void fillUp ();
    void pourOut();
}

public class InterfaceExample implements WaterBottleInterface{
    public static void main(String[] args) {

        System.out.println(color);
        InterfaceExample x = new InterfaceExample();
        x.fillUp();
        x.pourOut();

    }

    @Override
    public void fillUp() {
        System.out.println("It is filled");
    }

    @Override
    public void pourOut() {
        System.out.println("Now it's being poured out");
    }
}
