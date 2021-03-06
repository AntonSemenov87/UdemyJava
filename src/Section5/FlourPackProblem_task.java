package Section5;

public class FlourPackProblem_task {
    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
        System.out.println(canPack(0,5,4));
    }

    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;

        int sum = 5 * bigCount + smallCount;
        if (sum < goal) {
            return false;
        } else if (sum == goal) {
            return true;
        } else {
            return (goal % 5 <= smallCount);
        }
    }
}
