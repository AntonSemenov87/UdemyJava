package AlexLee_youtube.Abstract;

abstract class Dog {

    public void bark() {
        System.out.println("Bark!");
    }

    public abstract void eat();
}

class Chihuahua extends Dog {

    @Override
    public void eat() {
        System.out.println("Chihuahua is eating");
    }
}

public class AbstractTutorial {
    public static void main(String[] args) {

        Chihuahua c = new Chihuahua();
        c.bark();
        c.eat();




    }
}
