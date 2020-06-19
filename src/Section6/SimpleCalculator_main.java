package Section6;

public class SimpleCalculator_main {
    public static void main(String[] args) {
        SimpleCalculator sc = new SimpleCalculator();
        sc.setFirstNumber(5.0);
        sc.setSecondNumber(4);
        System.out.println("add = " + sc.getAdditionResult());
        System.out.println("subtract = " + sc.getSubtractionResult());
        sc.setFirstNumber(5.25);
        sc.setSecondNumber(0);
        System.out.println("multiply = " + sc.getMultiplicationResult());
        System.out.println("divide = " + sc.getDivisionResult());
    }
}
