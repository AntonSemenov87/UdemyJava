package Section6.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Anton";
        player.health = 20;
        player.weapon = "sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
    }

}
