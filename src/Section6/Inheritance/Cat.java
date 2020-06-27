package Section6.Inheritance;

public class Cat extends Animal {
    private String breed;

    public Cat(String name, int size, int weight, String breed) {
        super(name, 1, 1, size, weight);
        this.breed = breed;
    }
    private void chew () {
        System.out.println("Cat can chew");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Next libe is from private chew()");
        chew();
    }
}
