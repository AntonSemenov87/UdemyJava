package AlexLee_youtube.someYoutubeCourse;

import java.util.Arrays;

public class Arrays_practice {
    public static void main(String[] args) {

        int [] nums = new int[5];
        nums[0] = 1;
        nums[1] = 2;
        System.out.println(nums);

        System.out.println(Arrays.toString(nums));

        int [] numbers = {2, 3, 5, 9, 1};
        System.out.println(numbers.length);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int [] numbers2 = new int[numbers.length];
        numbers2 = numbers.clone();
        System.out.println(Arrays.toString(numbers2));


    }
}
