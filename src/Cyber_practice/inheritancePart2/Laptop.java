package Cyber_practice.inheritancePart2;

public class Laptop {

//    public Laptop(){
//        super();
//        System.out.println("Laptop constructor");
//    }

    public Laptop(String model){
        this.model = model;
    }

    public Laptop () { //creating no-arg constructor since previous one is parameterized and Macbook class is complaining

    }


    String model;
    int memorySize;
    protected String color;
    static public int numOfLaptops;

    public void turnOn(){
        System.out.println("Laptop is turning on");
    }



}
