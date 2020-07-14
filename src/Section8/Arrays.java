package Section8;

public class Arrays {
    public static void main(String[] args) {
      // 1st way to initialize array
        int [] arr1 = new int[10];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 5;
        arr1[5] = 6;
        System.out.println("Method 1 - arr1 [2] = " + arr1[2]);

        // 2nd way to initialize array
        int [] arr2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Method 2 - arr2 [7] = " + arr2[7]);

        // 3rd way to initialize array
        int [] arr3 = new int[25];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = i+1;
            System.out.println("element " + i + ", value is " + arr3[i]);
        }


    }
}
