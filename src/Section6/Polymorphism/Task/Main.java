package Section6.Polymorphism.Task;

class Car {
    // fields
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    // constructor
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }
    // getters:
    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    // additional methods
    public String startEngine () {
        return "Car -> startEngine()";
    }
    public String accelerate () {
        return "Car -> accelerate()";
    }
    public String brake () {
       return "Car -> brake()";
    }

}

public class Main {
}
