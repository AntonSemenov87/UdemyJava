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
        this(model, color);
        if (memory < 0) {
            System.err.println("Invalid memory");
        } else {
            this.memory = memory;
        }
        this.phoneNumber = phoneNumber;
    }

    public void info () {
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Phone numer: " + this.phoneNumber);
        System.out.println("Memory: " + this.memory);
    }

    public boolean text(long phoneNumber, String message) {
        String number = phoneNumber + "";
        if (!message.isEmpty() && number.length() == 10) {
            System.out.println("'" + message + "' was sent to " + phoneNumber);
            return true;
        } else {
            System.out.println("invalid text number or text body");
            return  false;
        }
    }




    public static void main(String[] args) {

        Phone nokia = new Phone("Nokia", -25, "white", "4546789");
        nokia.info();

        // using first constructor AND adding more additional stuff
        Phone samsung = new Phone ("Samsung", "brown");
        samsung.memory = 256;
        samsung.isTouchscreen = true;
        System.out.println("--------------------------------");

        samsung.text(1234567890, "Hello this is me");
        boolean result = nokia.text(12121212, "This is Sparta");
        System.out.println(result);

    }
}
