package Cyber_practice.inheritancePart2;

public class Macbook extends Laptop {

    public Macbook(){
        super();
        System.out.println("MacBook constructor");
    }

    public void appleID(){
        super.memorySize = 45;
    }

    public static void main(String[] args) {

        Macbook macbook = new Macbook();
        macbook.color = "gray";

    }

}
