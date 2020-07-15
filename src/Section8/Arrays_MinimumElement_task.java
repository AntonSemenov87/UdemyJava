package Section8;

import java.util.Scanner;

public class Arrays_MinimumElement_task {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.nextLine();

        int [] myArray = readIntegers(count);
        int minElementFound = findMin(myArray);
        System.out.println(minElementFound);

    }
    public static int [] readIntegers (int count) {
        System.out.println("Enter " + count + " numbers.\r");
        int [] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin (int [] array) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
