package AlexLee_youtube;

public class ReturnStatement {
    public static void main(String[] args) {

        printMessage();

        int sum = add(5, 4);
        System.out.println(sum);

        String word = caps("istqb");
        System.out.println(word);

        int [] awesomeArray = gimmeArrayFromInts(3,5,7);
        System.out.println(awesomeArray[0]);
        System.out.println(awesomeArray[1]);
        System.out.println(awesomeArray[2]);



    }

    public static void printMessage () {
        System.out.println("This is out first method");
    }

    public static int add (int a, int b) {
        return a + b;
    }

    public static String caps (String str) {
        return str.toUpperCase();

    }

    public static int [] gimmeArrayFromInts (int a, int b, int c) {
        int [] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        return arr;
    }



}
