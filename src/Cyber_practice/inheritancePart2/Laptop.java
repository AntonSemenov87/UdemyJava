package Cyber_practice.inheritancePart2;

public class Laptop {

    public Laptop(){
        super();
        System.out.println("Laptop constructor");
    }

    String model;
    int memorySize;
    protected String color;

    public void turnOn(){
        System.out.println("Laptop is turning on");
    }



}
