package Section4;

public class AreaCalculator_task {
    private static final double INVALID_INPUT_VALUE = -1.0;

    public static double area (double radius) {
        if (radius < 0)
            return INVALID_INPUT_VALUE;
        return radius * radius * Math.PI;
    }

    public static double area (double x, double y) {
        if (x < 0 || y < 0) {
            return INVALID_INPUT_VALUE;
        }
        return x * y;

    }
}
