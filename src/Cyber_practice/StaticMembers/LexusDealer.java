package Cyber_practice.StaticMembers;

public class LexusDealer {
    public static void main(String[] args) {

        Lexus carOne = new Lexus("rx350", 2018);
        carOne.mileage = 5340;

        Lexus.evaluateCar(carOne);

    }
}
