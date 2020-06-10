package Section3;

public class FloatDouble {
    public static void main(String[] args) {
        float myFloatMinValue = Float.MIN_VALUE;
        float myFloatMaxValue = Float.MAX_VALUE;

        System.out.println("Float min value = " + myFloatMinValue);
        System.out.println("Float max value = " + myFloatMaxValue);

        double myDoubleMinValue = Double.MIN_VALUE;
        double myDoubleMaxValue = Double.MAX_VALUE;

        System.out.println("Double min value = " + myDoubleMinValue);
        System.out.println("Double max value = " + myDoubleMaxValue);


        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        //Task - convert pounds into kilograms
        double pounds = 176.3;
        double kg = pounds * 0.453592;
        System.out.println(pounds + " converted into kilograms is " + kg);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);















    }
}
