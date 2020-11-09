package Cyber_practice.Mutable_vs_Immutable;

public class Task_isPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
    }

    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String result = sb.toString();
        if(result.equals(str)) {
            return true;
        } else {
            return false;
        }
    }
}
