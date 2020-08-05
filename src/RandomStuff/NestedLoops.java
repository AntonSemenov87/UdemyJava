package RandomStuff;

public class NestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("It's so cold");
        }

        String [] colors = {"Red", "Blue", "Green"};
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        System.out.println("-------------------------");

        // NESTED FORLOOP
        String [][] fancyColors = {{"Red", "Green", "Blue"}, {"Light", "Dark", "Vivid"}};

        for (int row = 0; row < fancyColors.length; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.println(fancyColors[row][column]);
            }
        }

        System.out.println("-------------------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i:" + i + ", j:" + j);
            }
        }

    }
}
