package AlexLee_youtube.extras;

public class FishBowl {
    public static void main(String[] args) {

        Fish f1 = new Fish();
        f1.setBreed("Clown").setAge(5).setName("Bob").setWeight(1.3);

        System.out.println("Fish name is " + f1.name + "\nFish breed is " + f1.breed + "\nFish age is " +
                f1.age + "\nFish weight is " + f1.weight);

    }
}
