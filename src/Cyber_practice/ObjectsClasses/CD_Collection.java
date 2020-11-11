package Cyber_practice.ObjectsClasses;

import java.util.Scanner;

public class CD_Collection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many CD's would you like to store?");
        int numOfCDs = scanner.nextInt();
        scanner.nextLine();

        CD [] cdCollection = new CD[numOfCDs];

        for (int i = 0; i < cdCollection.length; i++) {
            System.out.println("Please enter name of artist for CD #" + (i + 1));
            CD cd = new CD();
            cd.artist = scanner.nextLine();
            System.out.println("Now enter title of the album");
            cd.title = scanner.nextLine();
            System.out.println("What year was it released?");
            cd.year = scanner.nextInt();
            scanner.nextLine();
            System.out.println("And finally enter price you paid (doesn't have to be exact)");
            cd.price = scanner.nextDouble();
            scanner.nextLine();
            cdCollection[i] = cd;
        }

        System.out.println("Here is your CD collection:");

        for (CD disk: cdCollection) {
            disk.infoCD();
        }
    }
}
