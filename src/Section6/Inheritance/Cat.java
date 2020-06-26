package Section6.Inheritance;

public class Cat extends Animal {
    private String breed;

    public Cat(String name, int size, int weight, String breed) {
        super(name, 1, 1, size, weight);
        this.breed = breed;
    }
}
