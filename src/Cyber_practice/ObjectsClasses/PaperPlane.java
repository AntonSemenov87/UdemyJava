package Cyber_practice.ObjectsClasses;

public class PaperPlane {
    public static void main(String[] args) {
        Flag f1 = new Flag();
        Flag f2 = new Flag();

        f1.color = "white";
        f1.country = "USA";
        f1.material = "Metal";
        f1.size = 4;

        f2.material = f1.material;
        f2.size = f1.size;
        f2.country = f1.country;
        f2.color = f1.color;

        f1.color = "a";
        f1.country = "a";
        f1.size = 0;
        f1.material = "a";

        f1.info();
        f2.info();
        f1.upgrade(4, "gold");
        f1.info();
    }
}
