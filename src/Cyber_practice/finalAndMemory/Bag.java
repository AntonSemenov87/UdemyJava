package Cyber_practice.finalAndMemory;

public class Bag {
    final String color;
    final static int totalBags;

    static {
        totalBags = 45;
    }

    // if we use constructor below to create an Object -- every purse will be red color
    public Bag() {
        this.color = "red";
    }

    // if we use this constructor - you can set color to any
    public Bag(String color) {
        this.color = color;
    }

}
