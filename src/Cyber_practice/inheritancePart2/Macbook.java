package Cyber_practice.inheritancePart2;

public class Macbook extends Laptop {

   // static int numOfLaptops;

//    public Macbook(){
//        super();
//        System.out.println("MacBook constructor");
//    }

    public void appleID(){
        super.memorySize = 45;
    }

    public static void main(String[] args) {

        Macbook macbook = new Macbook();
        macbook.color = "gray";
        Macbook.numOfLaptops = 23;
        System.out.println(Macbook.numOfLaptops); //23
        System.out.println(Laptop.numOfLaptops); //23, after creating static int numOfLaptops in this class - Laptop.numOfLaptops = 0

    }

}
