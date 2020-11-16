package Cyber_practice.inheritance;

public class PetSmart {
    public static void main(String[] args) {
        Husky husky = new Husky();
        husky.name = "Rex";
        husky.age = 3;
        husky.color = "black/white";
        husky.weight = 101.01;
        husky.makeNoise();
        husky.eat();
        husky.info();
        System.out.println("---------------***---------------");

        husky.furType = "Special fur";
        husky.liveInCold();

        LabradorHusky lh = new LabradorHusky();
        System.out.println(lh.breed);
        lh.labradorHusky();
    }
}
