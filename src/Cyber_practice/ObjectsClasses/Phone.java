package Cyber_practice.ObjectsClasses;

public class Phone {
    boolean isTouchscreen;
    String model;
    int memory;
    String color;
    String phoneNumber;


    public Phone(String model, String color){
        this.model = model;
        this.color = color;
    }

    public Phone (String model, int memory, String color, String phoneNumber) {
        this.model = model;
        if (memory < 0) {
            System.err.println("Invalid memory");
        } else {
            this.memory = memory;
        }
        this.color = color;
        this.phoneNumber = phoneNumber;
    }

    public void info () {
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Phone numer: " + this.phoneNumber);
        System.out.println("Memory: " + this.memory);
    }


    public static void main(String[] args) {
        Phone ph = new Phone("Nokia", -25, "white", "4546789");
        ph.info();
    }
}
