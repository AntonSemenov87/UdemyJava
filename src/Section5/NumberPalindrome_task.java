package Section5;

public class NumberPalindrome_task {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
    }

    private static boolean isPalindrome (int number) { // 121
        int num = Math.abs(number);
        int reverse = 0;
        while(num > 0){
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }

        return reverse == Math.abs(number);
    }
}
