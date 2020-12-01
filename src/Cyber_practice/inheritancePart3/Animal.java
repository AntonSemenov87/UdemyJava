package Cyber_practice.inheritancePart3;

public class Animal {

    String name;

    public Animal (String name) {
        this.name = name;
    }


    public void eat () {
        System.out.println("Animal is eating");
    }

    public void sleep (){
        System.out.println("Animal is sleeping");
    }

    public void run (){
        System.out.println("Animal is running");
    }

    public void see () {
        System.out.println("Animal sees");
    }

}
