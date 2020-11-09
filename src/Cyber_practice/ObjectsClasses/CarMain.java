package Cyber_practice.ObjectsClasses;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.mileage = 20000;
        car1.make = "Lexus";
        car1.sportEdition = false;
        car1.year = 2010;

        car1.drive();
        car1.drive(300);
        car1.drive("Johanson");
        System.out.println(car1.mileage);
    }
}
