package Cyber_practice.inheritance;

public class Dog {

    int age;
    String breed;
    String name;
    double weight;
    String color;

    public void bark(){
        System.out.println("Dog is barking");
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
