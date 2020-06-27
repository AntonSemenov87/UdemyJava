package Section6.Inheritance;

public class Fish extends Animal{
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.fins = fins;
        this.gills = gills;
    }

    private void rest () {

    }
    private void moveMuscles () {

    }
    private void moveBackFin() {

    }
    private void swim (int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }


}
