package FirstSteps;

public class ByteShortLong {
    public static void main(String[] args) {

        // Integers --> occupies 32 bits

        int myValue = 10_000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer min value is: " + myMinIntValue);
        System.out.println("Integer max value is: " + myMaxIntValue);
        // int myMaxIntTest = 2147483648; --> integer number too large
        int myMaxIntNum = 2_147_483_647;


        // Byte --> occupies 8 bits
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Min byte value is: " + myMinByteValue);
        System.out.println("Max byte value is: " + myMaxByteValue);

        // Short --> occupies 16 bits
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Min short value is: " + myMinShortValue);
        System.out.println("Max short value is: " + myMaxShortValue);


        // Long --> occupies 64 bits
        long myLongValue = 100;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Min Long value is: " + myMinLongValue);
        System.out.println("Max Long value is: " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;


        // Task
        byte age = 10;
        short year= 20;
        int one = 50;
        long total = 50_000 + (10 * (age + year + one));
        System.out.println(total);

        short shortTotal = (short) (1000 + 10 * (age + year + one));




    }
}
