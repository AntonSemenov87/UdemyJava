package AlexLee_youtube.subClass_and_SuperClass;

public class RunningShoe extends Shoe{
    public final double weight;
    RunningShoe(double weight, String brand, double size) {
        super(brand, size);
        this.weight = weight;
    }
}
