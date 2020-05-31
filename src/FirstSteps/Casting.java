package FirstSteps;

public class Casting {
    public static void main(String[] args) {

        int myMinIntValue = Integer.MIN_VALUE;
        int myTotal =  (myMinIntValue / 2);

        byte myMinByteValue = Byte.MIN_VALUE;

        // Casting : division would make it an int
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myMinShortValue = Short.MIN_VALUE;
        short myNewShortValue = (short) (myMinShortValue / 2);


        // Task
        byte age = 10;
        short year= 20;
        int one = 50;
        long total = 50_000 + (10 * (age + year + one));
        System.out.println(total);

        short shortTotal = (short) (1000 + 10 * (age + year + one));

    }
}
