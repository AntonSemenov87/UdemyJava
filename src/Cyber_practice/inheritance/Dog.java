package Cyber_practice.inheritance;

public class Dog extends Animal {

    int age;
    String breed;
    String name;
    double weight;
    String color;

    public void makeNoise(){
        System.out.println("Woooof");
    }

    public void eat(){
        System.out.println("Dog is eating");
    }

    public void info(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Color: " + this.color);
        System.out.println("Weight: " + this.weight);
    }


}
