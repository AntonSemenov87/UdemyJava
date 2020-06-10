package Section3;

public class AbbreviatingOperators {
    public static void main(String[] args) {

        int result = 5;
        result++; // same as result = result + 1
        System.out.println(result);

        result--;
        System.out.println(result); // 6 - 1 = 5

        // result = result + 2
        result += 2;
        System.out.println(result); // 5 + 2 = 7

        // result = result * 10;
        result *= 10; // 7 * 10 = 70
        System.out.println(result);

        // result = result / 3
        result /= 7; // 70 / 7 = 10
        System.out.println(result);

        // result = result - 2
        result -= 2; // 10 - 2 = 8
        System.out.println(result);


    }
}
