package Cyber_practice.StaticMembers;

public class Lexus {
    String model;
    int year;
    String color;
    int mileage;
    boolean isNew;
    double price;

    static int totalNumOfLexus;

    public Lexus(String model, int year) {
        this.model = model;
        this.year = year;
        totalNumOfLexus++;
    }

    static double mileToKm (double miles) {
        return miles * 1.6;
    }

    static void evaluateCar(Lexus car){
        int age = 2020 - car.year;
        if (car.mileage < 50000 && age < 3) {
            System.out.println("Best choice");
        } else if ((car.mileage >= 50000 && car.mileage < 100000) && age >= 3 && age < 7) {
            System.out.println("Fair choice");
        } else if (car.mileage >= 100000 && car.mileage < 200000) {
            System.out.println("You decide");
        } else {
            System.out.println("Not able to evaluate");
        }
    }
}
