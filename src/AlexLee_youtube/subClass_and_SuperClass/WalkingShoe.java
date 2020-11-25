package AlexLee_youtube.subClass_and_SuperClass;

public class WalkingShoe extends Shoe {
    boolean goreTex;

    WalkingShoe(boolean goreTex, String brand, double size) {
        super(brand, size);
        this.goreTex = goreTex;
    }
}
