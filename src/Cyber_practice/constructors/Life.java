package Cyber_practice.constructors;

import java.util.Scanner;

public class Life {
    public static void main(String[] args) {

        House myHouse = new House();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter house type");
        myHouse.type = scanner.nextLine();
        System.out.println("Enter address");
        myHouse.address = scanner.nextLine();
        System.out.println("Enter number of rooms");
        myHouse.numRooms = scanner.nextInt();

        myHouse.info();
    }
}
