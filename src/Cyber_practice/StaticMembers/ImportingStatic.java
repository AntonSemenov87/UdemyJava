package Cyber_practice.StaticMembers;

import java.util.Arrays;
import java.util.Random;

public class ImportingStatic {
    public static void main(String[] args) {
        int [] a = {10,8,3,1,5};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        Random random = new Random();
        System.out.println(random.nextInt(50));

    }
}
