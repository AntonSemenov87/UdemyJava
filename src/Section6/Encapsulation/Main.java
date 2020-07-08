package Section6.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.fullName = "Anton";
        player.health = 20;
        player.weapon = "sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        if (player.healthRemaining() > 0) {
            System.out.println("Remaining health = " + player.healthRemaining());
        }
    }

}
