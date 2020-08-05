package RandomStuff;

public class Break_example {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Hi");
            break;
        }

        int i = 0;
        while (i < 3) {
            System.out.println("Hello");
            i++;
            break;
        }

        int [] numbers = {10, 20, 30, 40, 50};
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] == 30) break;
            System.out.println(numbers[j]);
        }

        int z = 0;
        switch(z) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            default:
                System.out.println("wrong");
                break;
        }

    }
}
