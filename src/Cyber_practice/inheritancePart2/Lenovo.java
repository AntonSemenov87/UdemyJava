package Cyber_practice.inheritancePart2;

import Cyber_practice.inheritance.Dog;

public class Lenovo extends Laptop {

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println(this.model + " laptop turns on");
    }

    @Override
    public Dog getMyDog () {
        return null;
    }

}
