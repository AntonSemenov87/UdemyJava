package Cyber_practice.ObjectsClasses;

public class TestMain {
    public static void main(String[] args) {
        String name = "James";

        Flag f1 = new Flag();
        f1.country = "USA";
        f1.color = "Red/white";
        f1.material = "wood";
        f1.size = 5;
        f1.info();

        Flag f2 = new Flag();
        f2.country = "Ukraine";
        f2.color = "Yellow/Blue";
        f2.info();

    }
}
