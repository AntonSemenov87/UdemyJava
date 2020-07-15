package Section8;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysChallenge {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int [] myIntegers = getIntegers(10);
        int [] sorted = sortIntegers(myIntegers);
        printArray(sorted);




    }

    public static int [] getIntegers (int capacity) {
        int [] arr = new int[capacity];
        System.out.println("Enter " + capacity + " integers.\r");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void printArray (int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index " + i + " is " + array[i]);
        }
    }

    public static int [] sortIntegers (int [] array) {
//        int [] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int [] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }


}
