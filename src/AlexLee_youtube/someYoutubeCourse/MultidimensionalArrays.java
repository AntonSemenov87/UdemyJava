package AlexLee_youtube.someYoutubeCourse;

import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {

        int [][] numbers = new int[2][3];
        numbers[0][0] = 1;
        System.out.println(Arrays.toString(numbers)); // [[I@66d33a, [I@7cf10a6f]
        System.out.println(Arrays.deepToString(numbers)); //[[1, 0, 0], [0, 0, 0]]

        int [][] nums = { {1, 2, 3}, {4, 5, 6} };
        System.out.println(Arrays.deepToString(nums)); // [[1, 2, 3], [4, 5, 6]]


    }
}
