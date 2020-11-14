package Cyber_practice.finalAndMemory;

public class Blue {

    final String name = "Jason";

    public static void main(String[] args) {
        final int k;
        System.out.println("Program");
        k = 23;
        System.out.println(k);
        Blue blue = new Blue();
        System.out.println(blue.name);
    }
}
