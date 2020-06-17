package Section5;

public class While_DoWhile_loops {

    public static void main(String[] args) {

        // WHILE loop
        int count = 1;
        while (count != 5) {
            System.out.println("While loop - Count value is " + count);
            count++;
        }
        System.out.println();

        // FOR LOOP
        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop - Count value is " + i);
        }
        System.out.println();

        // While Loop
        count = 1;
        while (true) {
            if (count == 5) {
                break;
            }
            System.out.println("While loop #2 - count value is " + count);
            count++;
        }
        System.out.println();


        // Do While Loop
        count = 1;
        do {
            System.out.println("Do While loop - Count value was " + count);
            count++;
        } while (count < 10);
    }
}
