package Section6.Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Petty", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
        dog.walk();
        dog.run();

        System.out.println();
        Cat cat = new Cat("Dymok", 6,12, "Persian");
        cat.eat();

    }


    }

