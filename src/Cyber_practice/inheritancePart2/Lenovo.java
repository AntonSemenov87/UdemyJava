package Cyber_practice.inheritancePart2;

public class Lenovo extends Laptop {

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println(this.model + " laptop turns on");
    }

}
