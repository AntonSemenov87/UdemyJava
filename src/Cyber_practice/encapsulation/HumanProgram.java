package Cyber_practice.encapsulation;

import Cyber_practice.encapsulation.Human;

import java.util.Scanner;

public class HumanProgram {
    public static void main(String[] args) {

        Human human = new Human();
        //human.setAge(121);
        human.setGender('M');
        human.setName("Anton");
        human.setHeight(172);
        human.setWeight(55);

        System.out.println(human.getName());
        System.out.println(human.getGender());
        System.out.println(human.getAge());
        System.out.println(human.getHeight());
        System.out.println(human.getWeight());

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter age:");
            int age = scanner.nextInt();
            scanner.nextLine();
            if (age > 0 && age < 120) {
                human.setAge(age);
                break;
            }
            } while (true);

        System.out.println("Age: " + human.getAge());
        }
    }
