package Cyber_practice.inheritancePart3;

public class Goat extends Animal {

    public Goat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(this.name + " is eating");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println(this.name + " is sleeping");
    }

    @Override
    public void run() {
        super.run();
        System.out.println(this.name + " is running");
    }

    @Override
    public void see() {
        super.see();
        System.out.println(this.name + " can see");
    }
}
