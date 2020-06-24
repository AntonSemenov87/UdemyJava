package Section6;

public class Car_main {
    public static void main(String[] args) {
        Car porsche = new Car();
        System.out.println("Porsche model is " + porsche.getModel()); // line before we set the model name
        porsche.setModel("Carrera");
        System.out.println("Porsche model is " + porsche.getModel());

        Car rollsRoyce = new Car();
        rollsRoyce.setModel("Cullinan");
        System.out.println(rollsRoyce.getModel());
    }
}
