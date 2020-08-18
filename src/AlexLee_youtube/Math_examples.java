package AlexLee_youtube;

public class Math_examples {
    public static void main(String[] args) {

        System.out.println(Math.class);
        System.out.println(Math.E);
        System.out.println(Math.PI);
        System.out.println(Math.abs(-12));
        System.out.println(Math.acos(.54)); // between 0 and 1 --> 1.000359....
        System.out.println(Math.acos(1.1)); // NaN --> not a number
        System.out.println(Math.addExact(3, 4));
        System.out.println(Math.floorDiv(5, 2)); // 5/2=2.5 --> 2
        System.out.println(Math.floorMod(5, 2)); // EQUAL TO MODULUS 5%2 --> remainder is 1
        System.out.println(Math.incrementExact(8)); // returns 9 (8 + 1)

        System.out.println(Math.max(4, 35)); // 35 --> returns max of two values
        System.out.println(Math.multiplyExact(2, 3)); // multiplying --> 2 x 3 = 6
        System.out.println(Math.pow(3, 4)); // calculates exponents
        System.out.println(Math.random()); // random number between 0 and 1
        System.out.println(Math.rint(4.5)); // rounds to 4 from double to int


    }
}
