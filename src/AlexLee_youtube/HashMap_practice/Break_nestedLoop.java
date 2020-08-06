package AlexLee_youtube.HashMap_practice;

public class Break_nestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(i + ", " + j);
                break;
            }
        }
    }
}
